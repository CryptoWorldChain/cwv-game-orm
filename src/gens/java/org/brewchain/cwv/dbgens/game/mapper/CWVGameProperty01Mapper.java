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
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01;
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01Example;
import org.brewchain.cwv.dbgens.game.entity.CWVGameProperty01Key;

public interface CWVGameProperty01Mapper extends StaticTableDaoSupport<CWVGameProperty01, CWVGameProperty01Example, CWVGameProperty01Key> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @SelectProvider(type=CWVGameProperty01SqlProvider.class, method="countByExample")
    int countByExample(CWVGameProperty01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @DeleteProvider(type=CWVGameProperty01SqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameProperty01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Delete({
        "delete from cwv_game_property_01",
        "where property_id = #{propertyId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameProperty01Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Insert({
        "insert into cwv_game_property_01 (property_id, game_map_id, ",
        "user_id, property_name, ",
        "property_type, property_sub_type, ",
        "property_market_type, property_status, ",
        "last_price, last_price_time, ",
        "image_url, income, ",
        "is_display, created_time, ",
        "property_template_id, property_template, ",
        "longitude, latitude)",
        "values (#{propertyId,jdbcType=INTEGER}, #{gameMapId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{propertyName,jdbcType=VARCHAR}, ",
        "#{propertyType,jdbcType=VARCHAR}, #{propertySubType,jdbcType=TINYINT}, ",
        "#{propertyMarketType,jdbcType=TINYINT}, #{propertyStatus,jdbcType=VARCHAR}, ",
        "#{lastPrice,jdbcType=DECIMAL}, #{lastPriceTime,jdbcType=TIMESTAMP}, ",
        "#{imageUrl,jdbcType=VARCHAR}, #{income,jdbcType=DECIMAL}, ",
        "#{isDisplay,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{propertyTemplateId,jdbcType=VARCHAR}, #{propertyTemplate,jdbcType=VARCHAR}, ",
        "#{longitude,jdbcType=VARCHAR}, #{latitude,jdbcType=VARCHAR})"
    })
    int insert(CWVGameProperty01 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @InsertProvider(type=CWVGameProperty01SqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameProperty01 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @SelectProvider(type=CWVGameProperty01SqlProvider.class, method="selectByExample")
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
        @Result(column="last_price_time", property="lastPriceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVGameProperty01> selectByExample(CWVGameProperty01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Select({
        "select",
        "property_id, game_map_id, user_id, property_name, property_type, property_sub_type, ",
        "property_market_type, property_status, last_price, last_price_time, image_url, ",
        "income, is_display, created_time, property_template_id, property_template, longitude, ",
        "latitude",
        "from cwv_game_property_01",
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
        @Result(column="last_price_time", property="lastPriceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="longitude", property="longitude", jdbcType=JdbcType.VARCHAR),
        @Result(column="latitude", property="latitude", jdbcType=JdbcType.VARCHAR)
    })
    CWVGameProperty01 selectByPrimaryKey(CWVGameProperty01Key key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @UpdateProvider(type=CWVGameProperty01SqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameProperty01 record, @Param("example") CWVGameProperty01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @UpdateProvider(type=CWVGameProperty01SqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameProperty01 record, @Param("example") CWVGameProperty01Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @UpdateProvider(type=CWVGameProperty01SqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameProperty01 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Update({
        "update cwv_game_property_01",
        "set game_map_id = #{gameMapId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "property_name = #{propertyName,jdbcType=VARCHAR},",
          "property_type = #{propertyType,jdbcType=VARCHAR},",
          "property_sub_type = #{propertySubType,jdbcType=TINYINT},",
          "property_market_type = #{propertyMarketType,jdbcType=TINYINT},",
          "property_status = #{propertyStatus,jdbcType=VARCHAR},",
          "last_price = #{lastPrice,jdbcType=DECIMAL},",
          "last_price_time = #{lastPriceTime,jdbcType=TIMESTAMP},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "income = #{income,jdbcType=DECIMAL},",
          "is_display = #{isDisplay,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "property_template_id = #{propertyTemplateId,jdbcType=VARCHAR},",
          "property_template = #{propertyTemplate,jdbcType=VARCHAR},",
          "longitude = #{longitude,jdbcType=VARCHAR},",
          "latitude = #{latitude,jdbcType=VARCHAR}",
        "where property_id = #{propertyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameProperty01 record);
}