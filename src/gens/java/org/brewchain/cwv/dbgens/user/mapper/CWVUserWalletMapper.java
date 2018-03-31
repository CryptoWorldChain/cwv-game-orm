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
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @SelectProvider(type=CWVUserWalletSqlProvider.class, method="countByExample")
    int countByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @DeleteProvider(type=CWVUserWalletSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
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
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @Insert({
        "insert into cwv_user_wallet (wallet_id, user_id, ",
        "balance, topup_balance, ",
        "draw_count, last_update_time)",
        "values (#{walletId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{balance,jdbcType=DECIMAL}, #{topupBalance,jdbcType=DECIMAL}, ",
        "#{drawCount,jdbcType=INTEGER}, #{lastUpdateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @InsertProvider(type=CWVUserWalletSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @SelectProvider(type=CWVUserWalletSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="wallet_id", property="walletId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="topup_balance", property="topupBalance", jdbcType=JdbcType.DECIMAL),
        @Result(column="draw_count", property="drawCount", jdbcType=JdbcType.INTEGER),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVUserWallet> selectByExample(CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @Select({
        "select",
        "wallet_id, user_id, balance, topup_balance, draw_count, last_update_time",
        "from cwv_user_wallet",
        "where wallet_id = #{walletId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="wallet_id", property="walletId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="topup_balance", property="topupBalance", jdbcType=JdbcType.DECIMAL),
        @Result(column="draw_count", property="drawCount", jdbcType=JdbcType.INTEGER),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVUserWallet selectByPrimaryKey(CWVUserWalletKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserWallet record, @Param("example") CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserWallet record, @Param("example") CWVUserWalletExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @UpdateProvider(type=CWVUserWalletSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserWallet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Sat Mar 31 12:21:21 CST 2018
     */
    @Update({
        "update cwv_user_wallet",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "balance = #{balance,jdbcType=DECIMAL},",
          "topup_balance = #{topupBalance,jdbcType=DECIMAL},",
          "draw_count = #{drawCount,jdbcType=INTEGER},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP}",
        "where wallet_id = #{walletId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserWallet record);
}