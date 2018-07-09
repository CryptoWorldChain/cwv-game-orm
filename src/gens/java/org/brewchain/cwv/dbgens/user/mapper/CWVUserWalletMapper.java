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
import org.brewchain.cwv.dbgens.user.entity.CWVUserWallet;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserWalletKey;

public interface CWVUserWalletMapper extends StaticTableDaoSupport<CWVUserWallet, CWVUserWalletExample, CWVUserWalletKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @SelectProvider(type=CWVUserWalletSqlProvider.class, method="countByExample")
    int countByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @DeleteProvider(type=CWVUserWalletSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Delete({
        "delete from cwv_user_wallet",
        "where wallet_id = #{walletId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserWalletKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Insert({
        "insert into cwv_user_wallet (wallet_id, user_id, ",
        "coin_type, account, ",
        "balance, topup_balance, ",
        "draw_count, draw_count_history, ",
        "draw_count_record, income_ordinary, ",
        "income_typical, income_functional, ",
        "update_time, create_time, ",
        "coin_icon)",
        "values (#{walletId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{coinType,jdbcType=TINYINT}, #{account,jdbcType=VARCHAR}, ",
        "#{balance,jdbcType=DECIMAL}, #{topupBalance,jdbcType=DECIMAL}, ",
        "#{drawCount,jdbcType=INTEGER}, #{drawCountHistory,jdbcType=INTEGER}, ",
        "#{drawCountRecord,jdbcType=INTEGER}, #{incomeOrdinary,jdbcType=DECIMAL}, ",
        "#{incomeTypical,jdbcType=DECIMAL}, #{incomeFunctional,jdbcType=DECIMAL}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{coinIcon,jdbcType=VARCHAR})"
    })
    int insert(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @InsertProvider(type=CWVUserWalletSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @SelectProvider(type=CWVUserWalletSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="wallet_id", property="walletId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="topup_balance", property="topupBalance", jdbcType=JdbcType.DECIMAL),
        @Result(column="draw_count", property="drawCount", jdbcType=JdbcType.INTEGER),
        @Result(column="draw_count_history", property="drawCountHistory", jdbcType=JdbcType.INTEGER),
        @Result(column="draw_count_record", property="drawCountRecord", jdbcType=JdbcType.INTEGER),
        @Result(column="income_ordinary", property="incomeOrdinary", jdbcType=JdbcType.DECIMAL),
        @Result(column="income_typical", property="incomeTypical", jdbcType=JdbcType.DECIMAL),
        @Result(column="income_functional", property="incomeFunctional", jdbcType=JdbcType.DECIMAL),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coin_icon", property="coinIcon", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVUserWallet> selectByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Select({
        "select",
        "wallet_id, user_id, coin_type, account, balance, topup_balance, draw_count, ",
        "draw_count_history, draw_count_record, income_ordinary, income_typical, income_functional, ",
        "update_time, create_time, coin_icon",
        "from cwv_user_wallet",
        "where wallet_id = #{walletId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="wallet_id", property="walletId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="topup_balance", property="topupBalance", jdbcType=JdbcType.DECIMAL),
        @Result(column="draw_count", property="drawCount", jdbcType=JdbcType.INTEGER),
        @Result(column="draw_count_history", property="drawCountHistory", jdbcType=JdbcType.INTEGER),
        @Result(column="draw_count_record", property="drawCountRecord", jdbcType=JdbcType.INTEGER),
        @Result(column="income_ordinary", property="incomeOrdinary", jdbcType=JdbcType.DECIMAL),
        @Result(column="income_typical", property="incomeTypical", jdbcType=JdbcType.DECIMAL),
        @Result(column="income_functional", property="incomeFunctional", jdbcType=JdbcType.DECIMAL),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="coin_icon", property="coinIcon", jdbcType=JdbcType.VARCHAR)
    })
    CWVUserWallet selectByPrimaryKey(CWVUserWalletKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserWallet record, @Param("example") CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserWallet record, @Param("example") CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Update({
        "update cwv_user_wallet",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "coin_type = #{coinType,jdbcType=TINYINT},",
          "account = #{account,jdbcType=VARCHAR},",
          "balance = #{balance,jdbcType=DECIMAL},",
          "topup_balance = #{topupBalance,jdbcType=DECIMAL},",
          "draw_count = #{drawCount,jdbcType=INTEGER},",
          "draw_count_history = #{drawCountHistory,jdbcType=INTEGER},",
          "draw_count_record = #{drawCountRecord,jdbcType=INTEGER},",
          "income_ordinary = #{incomeOrdinary,jdbcType=DECIMAL},",
          "income_typical = #{incomeTypical,jdbcType=DECIMAL},",
          "income_functional = #{incomeFunctional,jdbcType=DECIMAL},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "coin_icon = #{coinIcon,jdbcType=VARCHAR}",
        "where wallet_id = #{walletId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserWallet record);
}