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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopyExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeCopyKey;

public interface CWVMarketExchangeCopyMapper extends StaticTableDaoSupport<CWVMarketExchangeCopy, CWVMarketExchangeCopyExample, CWVMarketExchangeCopyKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @SelectProvider(type=CWVMarketExchangeCopySqlProvider.class, method="countByExample")
    int countByExample(CWVMarketExchangeCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @DeleteProvider(type=CWVMarketExchangeCopySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketExchangeCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @Delete({
        "delete from cwv_market_exchange_copy",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketExchangeCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @Insert({
        "insert into cwv_market_exchange_copy (exchange_id, property_id, ",
        "user_id, sell_price, ",
        "tax, status, update_time, ",
        "create_time, create_user)",
        "values (#{exchangeId,jdbcType=INTEGER}, #{propertyId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{sellPrice,jdbcType=DECIMAL}, ",
        "#{tax,jdbcType=DECIMAL}, #{status,jdbcType=TINYINT}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=INTEGER})"
    })
    int insert(CWVMarketExchangeCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @InsertProvider(type=CWVMarketExchangeCopySqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketExchangeCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @SelectProvider(type=CWVMarketExchangeCopySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="exchange_id", property="exchangeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="sell_price", property="sellPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="tax", property="tax", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER)
    })
    List<CWVMarketExchangeCopy> selectByExample(CWVMarketExchangeCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @Select({
        "select",
        "exchange_id, property_id, user_id, sell_price, tax, status, update_time, create_time, ",
        "create_user",
        "from cwv_market_exchange_copy",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="exchange_id", property="exchangeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="sell_price", property="sellPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="tax", property="tax", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER)
    })
    CWVMarketExchangeCopy selectByPrimaryKey(CWVMarketExchangeCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeCopySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketExchangeCopy record, @Param("example") CWVMarketExchangeCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeCopySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketExchangeCopy record, @Param("example") CWVMarketExchangeCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeCopySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketExchangeCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Fri Jun 01 15:48:47 CST 2018
     */
    @Update({
        "update cwv_market_exchange_copy",
        "set property_id = #{propertyId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "sell_price = #{sellPrice,jdbcType=DECIMAL},",
          "tax = #{tax,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=INTEGER}",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketExchangeCopy record);
}