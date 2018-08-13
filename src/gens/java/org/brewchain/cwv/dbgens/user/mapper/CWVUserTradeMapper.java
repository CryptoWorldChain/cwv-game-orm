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
import org.brewchain.cwv.dbgens.user.entity.CWVUserTrade;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradeExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTradeKey;

public interface CWVUserTradeMapper extends StaticTableDaoSupport<CWVUserTrade, CWVUserTradeExample, CWVUserTradeKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @SelectProvider(type=CWVUserTradeSqlProvider.class, method="countByExample")
    int countByExample(CWVUserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @DeleteProvider(type=CWVUserTradeSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @Delete({
        "delete from cwv_user_trade",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserTradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @Insert({
        "insert into cwv_user_trade (trade_id, user_id, ",
        "trade_password, created_time)",
        "values (#{tradeId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{tradePassword,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVUserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @InsertProvider(type=CWVUserTradeSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @SelectProvider(type=CWVUserTradeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="trade_id", property="tradeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="trade_password", property="tradePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVUserTrade> selectByExample(CWVUserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @Select({
        "select",
        "trade_id, user_id, trade_password, created_time",
        "from cwv_user_trade",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="trade_id", property="tradeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="trade_password", property="tradePassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVUserTrade selectByPrimaryKey(CWVUserTradeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @UpdateProvider(type=CWVUserTradeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserTrade record, @Param("example") CWVUserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @UpdateProvider(type=CWVUserTradeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserTrade record, @Param("example") CWVUserTradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @UpdateProvider(type=CWVUserTradeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserTrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade
     *
     * @mbggenerated Mon Aug 13 13:38:28 CST 2018
     */
    @Update({
        "update cwv_user_trade",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "trade_password = #{tradePassword,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP}",
        "where trade_id = #{tradeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserTrade record);
}