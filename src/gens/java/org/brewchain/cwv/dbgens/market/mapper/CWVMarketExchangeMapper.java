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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchange;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketExchangeKey;

public interface CWVMarketExchangeMapper extends StaticTableDaoSupport<CWVMarketExchange, CWVMarketExchangeExample, CWVMarketExchangeKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @SelectProvider(type=CWVMarketExchangeSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketExchangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @DeleteProvider(type=CWVMarketExchangeSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketExchangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @Delete({
        "delete from cwv_market_exchange",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketExchangeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @Insert({
        "insert into cwv_market_exchange (exchange_id, property_id, ",
        "user_id, sell_price, ",
        "tax, status, chain_status, ",
        "chain_trans_hash, chain_contract, ",
        "update_time, create_time, ",
        "create_user, country_id, ",
        "city_id, map_id, property_template_id, ",
        "property_template, nick_name, ",
        "property_name, property_type, ",
        "property_status, income_remark, ",
        "income, last_price, ",
        "image_url)",
        "values (#{exchangeId,jdbcType=INTEGER}, #{propertyId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{sellPrice,jdbcType=DECIMAL}, ",
        "#{tax,jdbcType=DECIMAL}, #{status,jdbcType=TINYINT}, #{chainStatus,jdbcType=TINYINT}, ",
        "#{chainTransHash,jdbcType=VARCHAR}, #{chainContract,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=INTEGER}, #{countryId,jdbcType=INTEGER}, ",
        "#{cityId,jdbcType=INTEGER}, #{mapId,jdbcType=INTEGER}, #{propertyTemplateId,jdbcType=VARCHAR}, ",
        "#{propertyTemplate,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{propertyName,jdbcType=VARCHAR}, #{propertyType,jdbcType=VARCHAR}, ",
        "#{propertyStatus,jdbcType=VARCHAR}, #{incomeRemark,jdbcType=VARCHAR}, ",
        "#{income,jdbcType=DECIMAL}, #{lastPrice,jdbcType=DECIMAL}, ",
        "#{imageUrl,jdbcType=VARCHAR})"
    })
    int insert(CWVMarketExchange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @InsertProvider(type=CWVMarketExchangeSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketExchange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @SelectProvider(type=CWVMarketExchangeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="exchange_id", property="exchangeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="sell_price", property="sellPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="tax", property="tax", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="income_remark", property="incomeRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVMarketExchange> selectByExample(CWVMarketExchangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @Select({
        "select",
        "exchange_id, property_id, user_id, sell_price, tax, status, chain_status, chain_trans_hash, ",
        "chain_contract, update_time, create_time, create_user, country_id, city_id, ",
        "map_id, property_template_id, property_template, nick_name, property_name, property_type, ",
        "property_status, income_remark, income, last_price, image_url",
        "from cwv_market_exchange",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="exchange_id", property="exchangeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="sell_price", property="sellPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="tax", property="tax", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="income_remark", property="incomeRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR)
    })
    CWVMarketExchange selectByPrimaryKey(CWVMarketExchangeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketExchange record, @Param("example") CWVMarketExchangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketExchange record, @Param("example") CWVMarketExchangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @UpdateProvider(type=CWVMarketExchangeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketExchange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Mon Jul 09 14:56:26 CST 2018
     */
    @Update({
        "update cwv_market_exchange",
        "set property_id = #{propertyId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "sell_price = #{sellPrice,jdbcType=DECIMAL},",
          "tax = #{tax,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "chain_status = #{chainStatus,jdbcType=TINYINT},",
          "chain_trans_hash = #{chainTransHash,jdbcType=VARCHAR},",
          "chain_contract = #{chainContract,jdbcType=VARCHAR},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "country_id = #{countryId,jdbcType=INTEGER},",
          "city_id = #{cityId,jdbcType=INTEGER},",
          "map_id = #{mapId,jdbcType=INTEGER},",
          "property_template_id = #{propertyTemplateId,jdbcType=VARCHAR},",
          "property_template = #{propertyTemplate,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "property_name = #{propertyName,jdbcType=VARCHAR},",
          "property_type = #{propertyType,jdbcType=VARCHAR},",
          "property_status = #{propertyStatus,jdbcType=VARCHAR},",
          "income_remark = #{incomeRemark,jdbcType=VARCHAR},",
          "income = #{income,jdbcType=DECIMAL},",
          "last_price = #{lastPrice,jdbcType=DECIMAL},",
          "image_url = #{imageUrl,jdbcType=VARCHAR}",
        "where exchange_id = #{exchangeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketExchange record);
}