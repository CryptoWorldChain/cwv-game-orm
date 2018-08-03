package org.brewchain.cwv.dbgens.user.mapper;

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
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwd;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwdExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradePwdKey;

public interface CWVUserTradePwdMapper extends StaticTableDaoSupport<CWVUserTradePwd, CWVUserTradePwdExample, CWVUserTradePwdKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @SelectProvider(type=CWVUserTradePwdSqlProvider.class, method="countByExample")
    int countByExample(CWVUserTradePwdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @DeleteProvider(type=CWVUserTradePwdSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserTradePwdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @Delete({
        "delete from cwv_user_trade_pwd",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserTradePwdKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @Insert({
        "insert into cwv_user_trade_pwd (trade_id, user_id, ",
        "trade_password, created_time)",
        "values (#{tradeId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{tradePassword,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVUserTradePwd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @InsertProvider(type=CWVUserTradePwdSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserTradePwd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @SelectProvider(type=CWVUserTradePwdSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="trade_id", property="tradeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="trade_password", property="tradePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVUserTradePwd> selectByExample(CWVUserTradePwdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @Select({
        "select",
        "trade_id, user_id, trade_password, created_time",
        "from cwv_user_trade_pwd",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="trade_id", property="tradeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="trade_password", property="tradePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVUserTradePwd selectByPrimaryKey(CWVUserTradePwdKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @UpdateProvider(type=CWVUserTradePwdSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserTradePwd record, @Param("example") CWVUserTradePwdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @UpdateProvider(type=CWVUserTradePwdSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserTradePwd record, @Param("example") CWVUserTradePwdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @UpdateProvider(type=CWVUserTradePwdSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserTradePwd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Fri Aug 03 16:45:13 CST 2018
     */
    @Update({
        "update cwv_user_trade_pwd",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "trade_password = #{tradePassword,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP}",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserTradePwd record);
}