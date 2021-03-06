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
import org.brewchain.cwv.dbgens.game.entity.CWVGameCity;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCityExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameCityKey;

public interface CWVGameCityMapper extends StaticTableDaoSupport<CWVGameCity, CWVGameCityExample, CWVGameCityKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @SelectProvider(type=CWVGameCitySqlProvider.class, method="countByExample")
    int countByExample(CWVGameCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @DeleteProvider(type=CWVGameCitySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Delete({
        "delete from cwv_game_city",
        "where city_id = #{cityId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameCityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Insert({
        "insert into cwv_game_city (city_id, city_name, ",
        "city_name_cn, map_num, ",
        "game_country_id, status, ",
        "is_display, created_time)",
        "values (#{cityId,jdbcType=INTEGER}, #{cityName,jdbcType=VARCHAR}, ",
        "#{cityNameCn,jdbcType=VARCHAR}, #{mapNum,jdbcType=INTEGER}, ",
        "#{gameCountryId,jdbcType=INTEGER}, #{status,jdbcType=VARCHAR}, ",
        "#{isDisplay,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVGameCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @InsertProvider(type=CWVGameCitySqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @SelectProvider(type=CWVGameCitySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_name_cn", property="cityNameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="map_num", property="mapNum", jdbcType=JdbcType.INTEGER),
        @Result(column="game_country_id", property="gameCountryId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVGameCity> selectByExample(CWVGameCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Select({
        "select",
        "city_id, city_name, city_name_cn, map_num, game_country_id, status, is_display, ",
        "created_time",
        "from cwv_game_city",
        "where city_id = #{cityId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_name_cn", property="cityNameCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="map_num", property="mapNum", jdbcType=JdbcType.INTEGER),
        @Result(column="game_country_id", property="gameCountryId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVGameCity selectByPrimaryKey(CWVGameCityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameCitySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameCity record, @Param("example") CWVGameCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameCitySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameCity record, @Param("example") CWVGameCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @UpdateProvider(type=CWVGameCitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Aug 23 16:16:44 CST 2018
     */
    @Update({
        "update cwv_game_city",
        "set city_name = #{cityName,jdbcType=VARCHAR},",
          "city_name_cn = #{cityNameCn,jdbcType=VARCHAR},",
          "map_num = #{mapNum,jdbcType=INTEGER},",
          "game_country_id = #{gameCountryId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=VARCHAR},",
          "is_display = #{isDisplay,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP}",
        "where city_id = #{cityId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameCity record);
}