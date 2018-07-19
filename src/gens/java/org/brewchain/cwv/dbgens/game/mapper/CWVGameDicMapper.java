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
import org.brewchain.cwv.dbgens.game.entity.CWVGameDic;
import org.brewchain.cwv.dbgens.game.entity.CWVGameDicExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameDicKey;

public interface CWVGameDicMapper extends StaticTableDaoSupport<CWVGameDic, CWVGameDicExample, CWVGameDicKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @SelectProvider(type=CWVGameDicSqlProvider.class, method="countByExample")
    int countByExample(CWVGameDicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @DeleteProvider(type=CWVGameDicSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameDicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @Delete({
        "delete from cwv_game_dic",
        "where dic_id = #{dicId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameDicKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @Insert({
        "insert into cwv_game_dic (dic_id, dic_key, ",
        "dic_value, parent_key, ",
        "parent_value, seq)",
        "values (#{dicId,jdbcType=INTEGER}, #{dicKey,jdbcType=VARCHAR}, ",
        "#{dicValue,jdbcType=VARCHAR}, #{parentKey,jdbcType=VARCHAR}, ",
        "#{parentValue,jdbcType=VARCHAR}, #{seq,jdbcType=SMALLINT})"
    })
    int insert(CWVGameDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @InsertProvider(type=CWVGameDicSqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @SelectProvider(type=CWVGameDicSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="dic_id", property="dicId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dic_key", property="dicKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="dic_value", property="dicValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_key", property="parentKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_value", property="parentValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="seq", property="seq", jdbcType=JdbcType.SMALLINT)
    })
    List<CWVGameDic> selectByExample(CWVGameDicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @Select({
        "select",
        "dic_id, dic_key, dic_value, parent_key, parent_value, seq",
        "from cwv_game_dic",
        "where dic_id = #{dicId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="dic_id", property="dicId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="dic_key", property="dicKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="dic_value", property="dicValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_key", property="parentKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_value", property="parentValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="seq", property="seq", jdbcType=JdbcType.SMALLINT)
    })
    CWVGameDic selectByPrimaryKey(CWVGameDicKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @UpdateProvider(type=CWVGameDicSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameDic record, @Param("example") CWVGameDicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @UpdateProvider(type=CWVGameDicSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameDic record, @Param("example") CWVGameDicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @UpdateProvider(type=CWVGameDicSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameDic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Thu Jul 19 22:56:15 CST 2018
     */
    @Update({
        "update cwv_game_dic",
        "set dic_key = #{dicKey,jdbcType=VARCHAR},",
          "dic_value = #{dicValue,jdbcType=VARCHAR},",
          "parent_key = #{parentKey,jdbcType=VARCHAR},",
          "parent_value = #{parentValue,jdbcType=VARCHAR},",
          "seq = #{seq,jdbcType=SMALLINT}",
        "where dic_id = #{dicId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameDic record);
}