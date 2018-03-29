package org.fc.hzq.orcl.scalaimpl

import org.fc.zippo.ordbutils.pbgens.Ordb.PRetTransactions
import org.fc.zippo.ordbutils.pbgens.Ordb.PSTransactions

import onight.oapi.scala.commons.LService
import onight.oapi.scala.commons.PBUtils
import onight.oapi.scala.commons.SessionModules
import onight.oapi.scala.traits.OLog
import onight.osgi.annotation.NActorProvider
import onight.tfw.async.CompleteHandler
import onight.tfw.otransio.api.beans.FramePacket
import onight.tfw.otransio.api.PackHeader
import org.fc.zippo.ordbutils.pbgens.Ordb.PCommand
import org.fc.zippo.ordbutils.pbgens.Ordb.PModule
import lombok.extern.slf4j.Slf4j
import scala.collection.JavaConversions._
import lombok.Getter
import lombok.Setter
import onight.tfw.ntrans.api.annotation.ActorRequire
import org.fc.hzq.orcl.impl.HZQOrclStoreProvider
import scala.beans.BeanProperty
import onight.tfw.ojpa.api.DomainDaoSupport
import org.fc.hzq.orcl.entity.NamedDomainDao
import onight.tfw.otransio.api.PacketHelper
import onight.tfw.ojpa.ordb.ExtendDaoSupper
import onight.tfw.ojpa.ordb.StaticTableDaoSupport
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.fc.zippo.ordbutils.pbgens.Ordb.PRetTransactions.PMResult
import org.fc.hzq.orcl.entity.TXRequest
import org.fc.hzq.orcl.entity.TXResponse
import onight.tfw.ojpa.api.annotations.StoreDAO
import onight.tfw.ojpa.api.OJpaDAO
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUser
import onight.tfw.ojpa.api.TransactionExecutor
import org.apache.commons.lang3.StringUtils
import java.sql.SQLException

@NActorProvider
object PSTranx extends SessionModules[PSTransactions] {
  override def service = PSTranxService
  override def getModule: String = PModule.DBC.name();

  @ActorRequire
  @BeanProperty
  var sqlprovider: HZQOrclStoreProvider = null;

  @BeanProperty
  @StoreDAO
  var sysdao: OJpaDAO[CWVAuthUser] = null;

}

@Slf4j
object PSTranxService extends OLog with PBUtils with LService[PSTransactions] {

  override def cmd: String = PCommand.TXS.name();

  def onPBPacket(pack: FramePacket, pbo: PSTransactions, handler: CompleteHandler) = {
    //    log.debug("guava==" + VMDaos.guCache.getIfPresent(pbo.getLogid()));      val ret = PBActRet.newBuilder();
    val ret = PRetTransactions.newBuilder();
    log.debug("get from IP" + pack.getExtStrProp(PackHeader.PEER_IP) + "")
   val results=  PSTranx.sysdao.doInTransaction(new TransactionExecutor {
      def doInTransaction: Object = {
        val results = pbo.getSetsList.map { x =>
          log.debug("dopath:==" + x.getPath());
          val (req, res) = (
            new TXRequest(pack.getExtProp(PackHeader.EXT_IGNORE_HTTP_REQUEST), x.getParams, x.getPath()),
            new TXResponse(pack.getExtProp(PackHeader.EXT_IGNORE_HTTP_RESPONSE)));

          val ctrl = PSTranx.sqlprovider.tryPath(x.getPath());
          val vstr = x.getMethod.toLowerCase() match {
            case "get" =>
              ctrl.get(PSTranx.sqlprovider.getSafePath(x.getPath.substring(1)), req, res)
            case "post" =>
              val bytes = x.getBody.getBytes("UTF-8");
              ctrl.post(bytes, req, res);
            case "put" =>
              val bytes = x.getBody.getBytes("UTF-8");
              ctrl.put(PSTranx.sqlprovider.getSafePath(x.getPath.substring(1)), bytes, req, res);
            case "delete" =>
              val bytes = x.getBody.getBytes("UTF-8");
              ctrl.delete(PSTranx.sqlprovider.getSafePath(x.getPath.substring(1)), bytes, req, res);
            case _ =>
              null
          }
          log.debug("result:for txid:" + x.getTxid + "-->" + vstr);
          val oneret = PMResult.newBuilder().setTxid(x.getTxid).setResult(vstr);
          ret.addResults(oneret);
          if(!StringUtils.contains(vstr, "\"success\":true")||StringUtils.contains(vstr, "Failed:ORA")){
            throw new SQLException("Tx Failed!");
          }
          oneret;
        }
        results
      }

    })

    log.debug("results==" + results);

    handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
  }
}