//package org.fc.hzq.orcl.utils;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.felix.ipojo.annotations.Provides;
//import org.fc.hzq.orcl.impl.HZQOrclStoreProvider;
////import org.fc.hzq.ordbgens.sys.entity.GASSysParameter;
//
//import lombok.extern.slf4j.Slf4j;
//import onight.osgi.annotation.iPojoBean;
//import onight.tfw.ntrans.api.ActorService;
//import onight.tfw.ntrans.api.annotation.ActorRequire;
//import onight.tfw.ojpa.ordb.StaticTableDaoSupport;
//
//@iPojoBean
//@Provides(specifications = { ActorService.class }, strategy = "SINGLETON")
//@Slf4j
//
//public class ParamHelper implements ActorService {
//
//	@ActorRequire
//	HZQOrclStoreProvider sqlprovider;
//
////	HashMap<String, GASSysParameter> paramMap = null;
//
//	public HZQOrclStoreProvider getSqlprovider() {
//		return sqlprovider;
//	}
//
//	public void setSqlprovider(HZQOrclStoreProvider sqlprovider) {
//		this.sqlprovider = sqlprovider;
//	}
//
//	long lastUpdateTime;
//
////	public synchronized HashMap<String, GASSysParameter> ensureParamMap() {
////		if (paramMap == null) {
////			paramMap = new HashMap<>();
////		}
////		if (System.currentTimeMillis() - lastUpdateTime > 10 * 1000 || paramMap.size() <= 0) {
////			StaticTableDaoSupport paramDao = sqlprovider.getStaticDao("gassysparameter");
////			if (paramDao == null) {
////				throw new RuntimeException("gassysparameterDAO not Ready");
////			}
////			List<GASSysParameter> list = paramDao.findAll(null);
////			for (GASSysParameter p : list) {
////				if (StringUtils.equals("1", p.getStatus())) {
////					paramMap.put(p.getParameterCode(), p);
////				}
////			}
////			lastUpdateTime = System.currentTimeMillis();
////		}
////		return paramMap;
////	}
//
////	public GASSysParameter getParam(String code) {
////		return ensureParamMap().get(code);
////	}
////
////	public String getStrParam(String code, String defaultv) {
////		GASSysParameter p = ensureParamMap().get(code);
////		if (p == null) {
////			return defaultv;
////		}
////		return StringUtils.trim(p.getParameterValue());
////	}
////
////	public double getDoubleParam(String code, double defaultv) {
////		GASSysParameter p = ensureParamMap().get(code);
////		if (p == null) {
////			return defaultv;
////		}
////		try {
////			return Double.parseDouble(p.getParameterValue());
////		} catch (NumberFormatException e) {
////			e.printStackTrace();
////		}
////		return defaultv;
////	}
////
////	public Date getDateParam(String code, Date defaultv, String format) {
////		GASSysParameter p = ensureParamMap().get(code);
////		if (p == null) {
////			return defaultv;
////		}
////		try {
////			return new SimpleDateFormat(format).parse(StringUtils.trim(p.getParameterValue()));
////		} catch (ParseException e) {
////			e.printStackTrace();
////		}
////		return defaultv;
////
////	}
//
//}
