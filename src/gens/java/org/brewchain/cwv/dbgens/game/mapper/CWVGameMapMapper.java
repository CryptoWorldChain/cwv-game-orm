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
import org.brewchain.cwv.dbgens.game.entity.CWVGameMap;
import org.brewchain.cwv.dbgens.game.entity.CWVGameMapExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameMapKey;

public interface CWVGameMapMapper extends StaticTableDaoSupport<CWVGameMap, CWVGameMapExample, CWVGameMapKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @SelectProvider(type=CWVGameMapSqlProvider.class, method="countByExample")
    int countByExample(CWVGameMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @DeleteProvider(type=CWVGameMapSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Delete({
        "delete from cwv_game_map",
        "where map_id = #{mapId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameMapKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Insert({
        "insert into cwv_game_map (map_id, map_name, ",
        "map_name_zh, game_city_id, ",
        "template, image_url, ",
        "created_time, status, ",
        "total_count, is_display)",
        "values (#{mapId,jdbcType=INTEGER}, #{mapName,jdbcType=VARCHAR}, ",
        "#{mapNameZh,jdbcType=VARCHAR}, #{gameCityId,jdbcType=INTEGER}, ",
        "#{template,jdbcType=INTEGER}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{status,jdbcType=VARCHAR}, ",
        "#{totalCount,jdbcType=INTEGER}, #{isDisplay,jdbcType=VARCHAR})"
    })
    int insert(CWVGameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @InsertProvider(type=CWVGameMapSqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @SelectProvider(type=CWVGameMapSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="map_name", property="mapName", jdbcType=JdbcType.VARCHAR),
        @Result(column="map_name_zh", property="mapNameZh", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_city_id", property="gameCityId", jdbcType=JdbcType.INTEGER),
        @Result(column="template", property="template", jdbcType=JdbcType.INTEGER),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_count", property="totalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVGameMap> selectByExample(CWVGameMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Select({
        "select",
        "map_id, map_name, map_name_zh, game_city_id, template, image_url, created_time, ",
        "status, total_count, is_display",
        "from cwv_game_map",
        "where map_id = #{mapId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="map_name", property="mapName", jdbcType=JdbcType.VARCHAR),
        @Result(column="map_name_zh", property="mapNameZh", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_city_id", property="gameCityId", jdbcType=JdbcType.INTEGER),
        @Result(column="template", property="template", jdbcType=JdbcType.INTEGER),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_count", property="totalCount", jdbcType=JdbcType.INTEGER),
        @Result(column="is_display", property="isDisplay", jdbcType=JdbcType.VARCHAR)
    })
    CWVGameMap selectByPrimaryKey(CWVGameMapKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGameMapSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameMap record, @Param("example") CWVGameMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGameMapSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameMap record, @Param("example") CWVGameMapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @UpdateProvider(type=CWVGameMapSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameMap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Update({
        "update cwv_game_map",
        "set map_name = #{mapName,jdbcType=VARCHAR},",
          "map_name_zh = #{mapNameZh,jdbcType=VARCHAR},",
          "game_city_id = #{gameCityId,jdbcType=INTEGER},",
          "template = #{template,jdbcType=INTEGER},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=VARCHAR},",
          "total_count = #{totalCount,jdbcType=INTEGER},",
          "is_display = #{isDisplay,jdbcType=VARCHAR}",
        "where map_id = #{mapId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameMap record);
}