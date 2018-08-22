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
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddress;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserRechargeAddressKey;

public interface CWVUserRechargeAddressMapper extends StaticTableDaoSupport<CWVUserRechargeAddress, CWVUserRechargeAddressExample, CWVUserRechargeAddressKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @SelectProvider(type=CWVUserRechargeAddressSqlProvider.class, method="countByExample")
    int countByExample(CWVUserRechargeAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @DeleteProvider(type=CWVUserRechargeAddressSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserRechargeAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @Delete({
        "delete from cwv_user_recharge_address",
        "where recharge_address_id = #{rechargeAddressId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserRechargeAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @Insert({
        "insert into cwv_user_recharge_address (recharge_address_id, recharge_address, ",
        "coin_type)",
        "values (#{rechargeAddressId,jdbcType=INTEGER}, #{rechargeAddress,jdbcType=VARCHAR}, ",
        "#{coinType,jdbcType=VARCHAR})"
    })
    int insert(CWVUserRechargeAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @InsertProvider(type=CWVUserRechargeAddressSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserRechargeAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @SelectProvider(type=CWVUserRechargeAddressSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="recharge_address_id", property="rechargeAddressId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="recharge_address", property="rechargeAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVUserRechargeAddress> selectByExample(CWVUserRechargeAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @Select({
        "select",
        "recharge_address_id, recharge_address, coin_type",
        "from cwv_user_recharge_address",
        "where recharge_address_id = #{rechargeAddressId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="recharge_address_id", property="rechargeAddressId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="recharge_address", property="rechargeAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.VARCHAR)
    })
    CWVUserRechargeAddress selectByPrimaryKey(CWVUserRechargeAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @UpdateProvider(type=CWVUserRechargeAddressSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserRechargeAddress record, @Param("example") CWVUserRechargeAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @UpdateProvider(type=CWVUserRechargeAddressSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserRechargeAddress record, @Param("example") CWVUserRechargeAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @UpdateProvider(type=CWVUserRechargeAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserRechargeAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Wed Aug 22 14:07:27 CST 2018
     */
    @Update({
        "update cwv_user_recharge_address",
        "set recharge_address = #{rechargeAddress,jdbcType=VARCHAR},",
          "coin_type = #{coinType,jdbcType=VARCHAR}",
        "where recharge_address_id = #{rechargeAddressId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserRechargeAddress record);
}