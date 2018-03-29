package org.brewchain.cwv.dbgens.common.mapper;

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
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerify;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonSmsVerifyKey;

public interface CWVCommonSmsVerifyMapper extends StaticTableDaoSupport<CWVCommonSmsVerify, CWVCommonSmsVerifyExample, CWVCommonSmsVerifyKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @SelectProvider(type=CWVCommonSmsVerifySqlProvider.class, method="countByExample")
    int countByExample(CWVCommonSmsVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @DeleteProvider(type=CWVCommonSmsVerifySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVCommonSmsVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Delete({
        "delete from cwv_common_sms_verify",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVCommonSmsVerifyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Insert({
        "insert into cwv_common_sms_verify (verify_id, phone, ",
        "phone_code, verify_code, ",
        "verify_type, is_verify, ",
        "expires)",
        "values (#{verifyId,jdbcType=INTEGER}, #{phone,jdbcType=VARCHAR}, ",
        "#{phoneCode,jdbcType=VARCHAR}, #{verifyCode,jdbcType=VARCHAR}, ",
        "#{verifyType,jdbcType=VARCHAR}, #{isVerify,jdbcType=VARCHAR}, ",
        "#{expires,jdbcType=TIMESTAMP})"
    })
    int insert(CWVCommonSmsVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @InsertProvider(type=CWVCommonSmsVerifySqlProvider.class, method="insertSelective")
    int insertSelective(CWVCommonSmsVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @SelectProvider(type=CWVCommonSmsVerifySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="verify_id", property="verifyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_code", property="phoneCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="verify_code", property="verifyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="verify_type", property="verifyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_verify", property="isVerify", jdbcType=JdbcType.VARCHAR),
        @Result(column="expires", property="expires", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVCommonSmsVerify> selectByExample(CWVCommonSmsVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Select({
        "select",
        "verify_id, phone, phone_code, verify_code, verify_type, is_verify, expires",
        "from cwv_common_sms_verify",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="verify_id", property="verifyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_code", property="phoneCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="verify_code", property="verifyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="verify_type", property="verifyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_verify", property="isVerify", jdbcType=JdbcType.VARCHAR),
        @Result(column="expires", property="expires", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVCommonSmsVerify selectByPrimaryKey(CWVCommonSmsVerifyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonSmsVerifySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVCommonSmsVerify record, @Param("example") CWVCommonSmsVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonSmsVerifySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVCommonSmsVerify record, @Param("example") CWVCommonSmsVerifyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonSmsVerifySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVCommonSmsVerify record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Update({
        "update cwv_common_sms_verify",
        "set phone = #{phone,jdbcType=VARCHAR},",
          "phone_code = #{phoneCode,jdbcType=VARCHAR},",
          "verify_code = #{verifyCode,jdbcType=VARCHAR},",
          "verify_type = #{verifyType,jdbcType=VARCHAR},",
          "is_verify = #{isVerify,jdbcType=VARCHAR},",
          "expires = #{expires,jdbcType=TIMESTAMP}",
        "where verify_id = #{verifyId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVCommonSmsVerify record);
}