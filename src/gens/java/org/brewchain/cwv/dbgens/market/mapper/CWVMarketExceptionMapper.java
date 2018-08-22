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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketException;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExceptionExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExceptionKey;

public interface CWVMarketExceptionMapper extends StaticTableDaoSupport<CWVMarketException, CWVMarketExceptionExample, CWVMarketExceptionKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @SelectProvider(type=CWVMarketExceptionSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketExceptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @DeleteProvider(type=CWVMarketExceptionSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketExceptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @Delete({
        "delete from cwv_market_exception",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketExceptionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @Insert({
        "insert into cwv_market_exception (id, log_type, ",
        "log_method, type, ",
        "market_id, description, ",
        "remark, status, ",
        "create_time, update_time, ",
        "update_user)",
        "values (#{id,jdbcType=INTEGER}, #{logType,jdbcType=INTEGER}, ",
        "#{logMethod,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, ",
        "#{marketId,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{updateUser,jdbcType=INTEGER})"
    })
    int insert(CWVMarketException record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @InsertProvider(type=CWVMarketExceptionSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketException record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @SelectProvider(type=CWVMarketExceptionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="log_type", property="logType", jdbcType=JdbcType.INTEGER),
        @Result(column="log_method", property="logMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_id", property="marketId", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER)
    })
    List<CWVMarketException> selectByExample(CWVMarketExceptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @Select({
        "select",
        "id, log_type, log_method, type, market_id, description, remark, status, create_time, ",
        "update_time, update_user",
        "from cwv_market_exception",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="log_type", property="logType", jdbcType=JdbcType.INTEGER),
        @Result(column="log_method", property="logMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="market_id", property="marketId", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_user", property="updateUser", jdbcType=JdbcType.INTEGER)
    })
    CWVMarketException selectByPrimaryKey(CWVMarketExceptionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @UpdateProvider(type=CWVMarketExceptionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketException record, @Param("example") CWVMarketExceptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @UpdateProvider(type=CWVMarketExceptionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketException record, @Param("example") CWVMarketExceptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @UpdateProvider(type=CWVMarketExceptionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketException record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exception
     *
     * @mbggenerated Wed Aug 22 14:07:29 CST 2018
     */
    @Update({
        "update cwv_market_exception",
        "set log_type = #{logType,jdbcType=INTEGER},",
          "log_method = #{logMethod,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "market_id = #{marketId,jdbcType=INTEGER},",
          "description = #{description,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "update_user = #{updateUser,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketException record);
}