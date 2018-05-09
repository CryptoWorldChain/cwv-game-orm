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
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopup;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopupExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletTopupKey;

public interface CWVUserWalletTopupMapper extends StaticTableDaoSupport<CWVUserWalletTopup, CWVUserWalletTopupExample, CWVUserWalletTopupKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @SelectProvider(type=CWVUserWalletTopupSqlProvider.class, method="countByExample")
    int countByExample(CWVUserWalletTopupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @DeleteProvider(type=CWVUserWalletTopupSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserWalletTopupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @Delete({
        "delete from cwv_user_wallet_topup",
        "where topup_id = #{topupId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserWalletTopupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @Insert({
        "insert into cwv_user_wallet_topup (topup_id, user_id, ",
        "coin_type, address, ",
        "amount, status, ",
        "create_time)",
        "values (#{topupId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{coinType,jdbcType=TINYINT}, #{address,jdbcType=VARCHAR}, ",
        "#{amount,jdbcType=DECIMAL}, #{status,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVUserWalletTopup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @InsertProvider(type=CWVUserWalletTopupSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserWalletTopup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @SelectProvider(type=CWVUserWalletTopupSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="topup_id", property="topupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVUserWalletTopup> selectByExample(CWVUserWalletTopupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @Select({
        "select",
        "topup_id, user_id, coin_type, address, amount, status, create_time",
        "from cwv_user_wallet_topup",
        "where topup_id = #{topupId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="topup_id", property="topupId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVUserWalletTopup selectByPrimaryKey(CWVUserWalletTopupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletTopupSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserWalletTopup record, @Param("example") CWVUserWalletTopupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletTopupSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserWalletTopup record, @Param("example") CWVUserWalletTopupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletTopupSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserWalletTopup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Wed May 09 12:48:32 CST 2018
     */
    @Update({
        "update cwv_user_wallet_topup",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "coin_type = #{coinType,jdbcType=TINYINT},",
          "address = #{address,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where topup_id = #{topupId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserWalletTopup record);
}