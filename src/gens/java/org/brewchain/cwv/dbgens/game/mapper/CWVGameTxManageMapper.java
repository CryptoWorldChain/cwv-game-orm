package org.brewchain.cwv.dbgens.game.mapper;

import java.util.List;
import onight.tfw.ojpa.ordb.StaticTableDaoSupport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManage;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManageExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameTxManageKey;

public interface CWVGameTxManageMapper extends StaticTableDaoSupport<CWVGameTxManage, CWVGameTxManageExample, CWVGameTxManageKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @SelectProvider(type=CWVGameTxManageSqlProvider.class, method="countByExample")
    int countByExample(CWVGameTxManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @DeleteProvider(type=CWVGameTxManageSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameTxManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Delete({
        "delete from cwv_game_tx_manage",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameTxManageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Insert({
        "insert into cwv_game_tx_manage (id, type, ",
        "tx_hash, description, ",
        "chain_status, status)",
        "values (#{id,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{txHash,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{chainStatus,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})"
    })
    int insert(CWVGameTxManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @InsertProvider(type=CWVGameTxManageSqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameTxManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @SelectProvider(type=CWVGameTxManageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="tx_hash", property="txHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<CWVGameTxManage> selectByExample(CWVGameTxManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Select({
        "select",
        "id, type, tx_hash, description, chain_status, status",
        "from cwv_game_tx_manage",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="tx_hash", property="txHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    CWVGameTxManage selectByPrimaryKey(CWVGameTxManageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameTxManageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameTxManage record, @Param("example") CWVGameTxManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameTxManageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameTxManage record, @Param("example") CWVGameTxManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameTxManageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameTxManage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Update({
        "update cwv_game_tx_manage",
        "set type = #{type,jdbcType=VARCHAR},",
          "tx_hash = #{txHash,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "chain_status = #{chainStatus,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameTxManage record);
}