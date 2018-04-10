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
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountry;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountryExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCountryKey;

public interface CWVGameCountryMapper extends StaticTableDaoSupport<CWVGameCountry, CWVGameCountryExample, CWVGameCountryKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @SelectProvider(type=CWVGameCountrySqlProvider.class, method="countByExample")
    int countByExample(CWVGameCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @DeleteProvider(type=CWVGameCountrySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Delete({
        "delete from cwv_game_country",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameCountryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Insert({
        "insert into cwv_game_country (country_id, country_name, ",
        "image_url, status, ",
        "is_display, created_time, ",
        "map_num)",
        "values (#{countryId,jdbcType=INTEGER}, #{countryName,jdbcType=VARCHAR}, ",
        "#{imageUrl,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{isDisplay,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{mapNum,jdbcType=INTEGER})"
    })
    int insert(CWVGameCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @InsertProvider(type=CWVGameCountrySqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @SelectProvider(type=CWVGameCountrySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country_name", property="countryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="map_num", property="mapNum", jdbcType=JdbcType.INTEGER)
    })
    List<CWVGameCountry> selectByExample(CWVGameCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Select({
        "select",
        "country_id, country_name, image_url, status, is_display, created_time, map_num",
        "from cwv_game_country",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country_name", property="countryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="map_num", property="mapNum", jdbcType=JdbcType.INTEGER)
    })
    CWVGameCountry selectByPrimaryKey(CWVGameCountryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @UpdateProvider(type=CWVGameCountrySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameCountry record, @Param("example") CWVGameCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @UpdateProvider(type=CWVGameCountrySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameCountry record, @Param("example") CWVGameCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @UpdateProvider(type=CWVGameCountrySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Update({
        "update cwv_game_country",
        "set country_name = #{countryName,jdbcType=VARCHAR},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "is_display = #{isDisplay,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "map_num = #{mapNum,jdbcType=INTEGER}",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameCountry record);
}