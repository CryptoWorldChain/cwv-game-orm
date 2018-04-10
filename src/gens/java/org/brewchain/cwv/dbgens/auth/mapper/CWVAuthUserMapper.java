package org.brewchain.cwv.dbgens.auth.mapper;

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
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUser;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUserExample;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthUserKey;

public interface CWVAuthUserMapper extends StaticTableDaoSupport<CWVAuthUser, CWVAuthUserExample, CWVAuthUserKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @SelectProvider(type=CWVAuthUserSqlProvider.class, method="countByExample")
    int countByExample(CWVAuthUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @DeleteProvider(type=CWVAuthUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVAuthUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @Delete({
        "delete from cwv_auth_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVAuthUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @Insert({
        "insert into cwv_auth_user (user_id, user_name, ",
        "nick_name, password, ",
        "salt, phone, email, ",
        "image_url, validate_phone, ",
        "validate_email, status, ",
        "created_time, country_id, ",
        "country_code)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{nickName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{salt,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{imageUrl,jdbcType=VARCHAR}, #{validatePhone,jdbcType=VARCHAR}, ",
        "#{validateEmail,jdbcType=VARCHAR}, #{status,jdbcType=VARCHAR}, ",
        "#{createdTime,jdbcType=TIMESTAMP}, #{countryId,jdbcType=INTEGER}, ",
        "#{countryCode,jdbcType=VARCHAR})"
    })
    int insert(CWVAuthUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @InsertProvider(type=CWVAuthUserSqlProvider.class, method="insertSelective")
    int insertSelective(CWVAuthUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @SelectProvider(type=CWVAuthUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="validate_phone", property="validatePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="validate_email", property="validateEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="country_code", property="countryCode", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVAuthUser> selectByExample(CWVAuthUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @Select({
        "select",
        "user_id, user_name, nick_name, password, salt, phone, email, image_url, validate_phone, ",
        "validate_email, status, created_time, country_id, country_code",
        "from cwv_auth_user",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="validate_phone", property="validatePhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="validate_email", property="validateEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_time", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="country_code", property="countryCode", jdbcType=JdbcType.VARCHAR)
    })
    CWVAuthUser selectByPrimaryKey(CWVAuthUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @UpdateProvider(type=CWVAuthUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVAuthUser record, @Param("example") CWVAuthUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @UpdateProvider(type=CWVAuthUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVAuthUser record, @Param("example") CWVAuthUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @UpdateProvider(type=CWVAuthUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVAuthUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Tue Apr 10 11:08:39 CST 2018
     */
    @Update({
        "update cwv_auth_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "salt = #{salt,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "image_url = #{imageUrl,jdbcType=VARCHAR},",
          "validate_phone = #{validatePhone,jdbcType=VARCHAR},",
          "validate_email = #{validateEmail,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "created_time = #{createdTime,jdbcType=TIMESTAMP},",
          "country_id = #{countryId,jdbcType=INTEGER},",
          "country_code = #{countryCode,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVAuthUser record);
}