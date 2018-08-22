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
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGame;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGamePropertyGameKey;

public interface CWVGamePropertyGameMapper extends StaticTableDaoSupport<CWVGamePropertyGame, CWVGamePropertyGameExample, CWVGamePropertyGameKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @SelectProvider(type=CWVGamePropertyGameSqlProvider.class, method="countByExample")
    int countByExample(CWVGamePropertyGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @DeleteProvider(type=CWVGamePropertyGameSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGamePropertyGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @Delete({
        "delete from cwv_game_property_game",
        "where game_id = #{gameId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGamePropertyGameKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @Insert({
        "insert into cwv_game_property_game (game_id, property_id, ",
        "name, type, game_type, ",
        "game_url, game_status, ",
        "icon, invoke_game, ",
        "players_count, developers_count, ",
        "instructions, images, ",
        "status, income)",
        "values (#{gameId,jdbcType=INTEGER}, #{propertyId,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{type,jdbcType=SMALLINT}, #{gameType,jdbcType=VARCHAR}, ",
        "#{gameUrl,jdbcType=VARCHAR}, #{gameStatus,jdbcType=VARCHAR}, ",
        "#{icon,jdbcType=VARCHAR}, #{invokeGame,jdbcType=VARCHAR}, ",
        "#{playersCount,jdbcType=INTEGER}, #{developersCount,jdbcType=INTEGER}, ",
        "#{instructions,jdbcType=VARCHAR}, #{images,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{income,jdbcType=DECIMAL})"
    })
    int insert(CWVGamePropertyGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @InsertProvider(type=CWVGamePropertyGameSqlProvider.class, method="insertSelective")
    int insertSelective(CWVGamePropertyGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @SelectProvider(type=CWVGamePropertyGameSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="game_id", property="gameId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="game_type", property="gameType", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_url", property="gameUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_status", property="gameStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="invoke_game", property="invokeGame", jdbcType=JdbcType.VARCHAR),
        @Result(column="players_count", property="playersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="developers_count", property="developersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="instructions", property="instructions", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL)
    })
    List<CWVGamePropertyGame> selectByExample(CWVGamePropertyGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @Select({
        "select",
        "game_id, property_id, name, type, game_type, game_url, game_status, icon, invoke_game, ",
        "players_count, developers_count, instructions, images, status, income",
        "from cwv_game_property_game",
        "where game_id = #{gameId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="game_id", property="gameId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="game_type", property="gameType", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_url", property="gameUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_status", property="gameStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="invoke_game", property="invokeGame", jdbcType=JdbcType.VARCHAR),
        @Result(column="players_count", property="playersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="developers_count", property="developersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="instructions", property="instructions", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL)
    })
    CWVGamePropertyGame selectByPrimaryKey(CWVGamePropertyGameKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertyGameSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGamePropertyGame record, @Param("example") CWVGamePropertyGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertyGameSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGamePropertyGame record, @Param("example") CWVGamePropertyGameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @UpdateProvider(type=CWVGamePropertyGameSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGamePropertyGame record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game
     *
     * @mbggenerated Wed Aug 22 14:07:23 CST 2018
     */
    @Update({
        "update cwv_game_property_game",
        "set property_id = #{propertyId,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=SMALLINT},",
          "game_type = #{gameType,jdbcType=VARCHAR},",
          "game_url = #{gameUrl,jdbcType=VARCHAR},",
          "game_status = #{gameStatus,jdbcType=VARCHAR},",
          "icon = #{icon,jdbcType=VARCHAR},",
          "invoke_game = #{invokeGame,jdbcType=VARCHAR},",
          "players_count = #{playersCount,jdbcType=INTEGER},",
          "developers_count = #{developersCount,jdbcType=INTEGER},",
          "instructions = #{instructions,jdbcType=VARCHAR},",
          "images = #{images,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "income = #{income,jdbcType=DECIMAL}",
        "where game_id = #{gameId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGamePropertyGame record);
}