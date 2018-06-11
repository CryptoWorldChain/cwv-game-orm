package org.brewchain.cwv.dbgens.market.mapper;

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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDraw;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDrawExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketDrawKey;

public interface CWVMarketDrawMapper extends StaticTableDaoSupport<CWVMarketDraw, CWVMarketDrawExample, CWVMarketDrawKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @SelectProvider(type=CWVMarketDrawSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketDrawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @DeleteProvider(type=CWVMarketDrawSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketDrawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Delete({
        "delete from cwv_market_draw",
        "where draw_id = #{drawId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketDrawKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Insert({
        "insert into cwv_market_draw (draw_id, property_id, ",
        "user_id, create_time, ",
        "chain_status, chain_trans_hash, ",
        "chain_contract)",
        "values (#{drawId,jdbcType=INTEGER}, #{propertyId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{chainStatus,jdbcType=TINYINT}, #{chainTransHash,jdbcType=VARCHAR}, ",
        "#{chainContract,jdbcType=VARCHAR})"
    })
    int insert(CWVMarketDraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @InsertProvider(type=CWVMarketDrawSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketDraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @SelectProvider(type=CWVMarketDrawSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="draw_id", property="drawId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVMarketDraw> selectByExample(CWVMarketDrawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Select({
        "select",
        "draw_id, property_id, user_id, create_time, chain_status, chain_trans_hash, ",
        "chain_contract",
        "from cwv_market_draw",
        "where draw_id = #{drawId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="draw_id", property="drawId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR)
    })
    CWVMarketDraw selectByPrimaryKey(CWVMarketDrawKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @UpdateProvider(type=CWVMarketDrawSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketDraw record, @Param("example") CWVMarketDrawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @UpdateProvider(type=CWVMarketDrawSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketDraw record, @Param("example") CWVMarketDrawExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @UpdateProvider(type=CWVMarketDrawSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketDraw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Update({
        "update cwv_market_draw",
        "set property_id = #{propertyId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "chain_status = #{chainStatus,jdbcType=TINYINT},",
          "chain_trans_hash = #{chainTransHash,jdbcType=VARCHAR},",
          "chain_contract = #{chainContract,jdbcType=VARCHAR}",
        "where draw_id = #{drawId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketDraw record);
}