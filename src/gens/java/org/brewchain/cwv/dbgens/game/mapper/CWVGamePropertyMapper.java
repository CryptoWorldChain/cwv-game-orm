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
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyKey;

public interface CWVGamePropertyMapper extends StaticTableDaoSupport<CWVGameProperty, CWVGamePropertyExample, CWVGamePropertyKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @SelectProvider(type=CWVGamePropertySqlProvider.class, method="countByExample")
    int countByExample(CWVGamePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @DeleteProvider(type=CWVGamePropertySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGamePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Delete({
        "delete from cwv_game_property",
        "where property_id = #{propertyId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGamePropertyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Insert({
        "insert into cwv_game_property (property_id, game_map_id, ",
        "user_id, property_name, ",
        "property_type, property_sub_type, ",
        "property_market_type, property_status, ",
        "last_price, price_increase, ",
        "last_price_time, image_url, ",
        "income, is_display, ",
        "created_time, property_template_id, ",
        "property_template, longitude, ",
        "latitude, crypto_token, ",
        "chain_status, chain_trans_hash)",
        "values (#{propertyId,jdbcType=INTEGER}, #{gameMapId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{propertyName,jdbcType=VARCHAR}, ",
        "#{propertyType,jdbcType=VARCHAR}, #{propertySubType,jdbcType=TINYINT}, ",
        "#{propertyMarketType,jdbcType=TINYINT}, #{propertyStatus,jdbcType=VARCHAR}, ",
        "#{lastPrice,jdbcType=DECIMAL}, #{priceIncrease,jdbcType=DECIMAL}, ",
        "#{lastPriceTime,jdbcType=TIMESTAMP}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{income,jdbcType=DECIMAL}, #{isDisplay,jdbcType=VARCHAR}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{propertyTemplateId,jdbcType=VARCHAR}, ",
        "#{propertyTemplate,jdbcType=VARCHAR}, #{longitude,jdbcType=VARCHAR}, ",
        "#{latitude,jdbcType=VARCHAR}, #{cryptoToken,jdbcType=VARCHAR}, ",
        "#{chainStatus,jdbcType=TINYINT}, #{chainTransHash,jdbcType=VARCHAR})"
    })
    int insert(CWVGameProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @InsertProvider(type=CWVGamePropertySqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @SelectProvider(type=CWVGamePropertySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="game_map_id", property="gameMapId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_sub_type", property="propertySubType", jdbcType=JdbcType.TINYINT),
        @Result(column="property_market_type", property="propertyMarketType", jdbcType=JdbcType.TINYINT),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="price_increase", property="priceIncrease", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_price_time", property="lastPriceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="crypto_token", property="cryptoToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVGameProperty> selectByExample(CWVGamePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Select({
        "select",
        "property_id, game_map_id, user_id, property_name, property_type, property_sub_type, ",
        "property_market_type, property_status, last_price, price_increase, last_price_time, ",
        "image_url, income, is_display, created_time, property_template_id, property_template, ",
        "longitude, latitude, crypto_token, chain_status, chain_trans_hash",
        "from cwv_game_property",
        "where property_id = #{propertyId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="game_map_id", property="gameMapId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_sub_type", property="propertySubType", jdbcType=JdbcType.TINYINT),
        @Result(column="property_market_type", property="propertyMarketType", jdbcType=JdbcType.TINYINT),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="price_increase", property="priceIncrease", jdbcType=JdbcType.DECIMAL),
        @Result(column="last_price_time", property="lastPriceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="crypto_token", property="cryptoToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR)
    })
    CWVGameProperty selectByPrimaryKey(CWVGamePropertyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameProperty record, @Param("example") CWVGamePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameProperty record, @Param("example") CWVGamePropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Update({
        "update cwv_game_property",
        "set game_map_id = #{gameMapId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "property_name = #{propertyName,jdbcType=VARCHAR},",
          "property_type = #{propertyType,jdbcType=VARCHAR},",
          "property_sub_type = #{propertySubType,jdbcType=TINYINT},",
          "property_market_type = #{propertyMarketType,jdbcType=TINYINT},",
          "property_status = #{propertyStatus,jdbcType=VARCHAR},",
          "last_price = #{lastPrice,jdbcType=DECIMAL},",
          "price_increase = #{priceIncrease,jdbcType=DECIMAL},",
          "last_price_time = #{lastPriceTime,jdbcType=TIMESTAMP},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "income = #{income,jdbcType=DECIMAL},",
          "is_display = #{isDisplay,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "property_template_id = #{propertyTemplateId,jdbcType=VARCHAR},",
          "property_template = #{propertyTemplate,jdbcType=VARCHAR},",
          "longitude = #{longitude,jdbcType=VARCHAR},",
          "latitude = #{latitude,jdbcType=VARCHAR},",
          "crypto_token = #{cryptoToken,jdbcType=VARCHAR},",
          "chain_status = #{chainStatus,jdbcType=TINYINT},",
          "chain_trans_hash = #{chainTransHash,jdbcType=VARCHAR}",
        "where property_id = #{propertyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameProperty record);
}