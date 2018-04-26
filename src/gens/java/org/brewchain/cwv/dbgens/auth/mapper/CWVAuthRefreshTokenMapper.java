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
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshToken;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenExample;
import org.brewchain.cwv.dbgens.auth.entity.CWVAuthRefreshTokenKey;

public interface CWVAuthRefreshTokenMapper extends StaticTableDaoSupport<CWVAuthRefreshToken, CWVAuthRefreshTokenExample, CWVAuthRefreshTokenKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @SelectProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="countByExample")
    int countByExample(CWVAuthRefreshTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @DeleteProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVAuthRefreshTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @Delete({
        "delete from cwv_auth_refresh_token",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVAuthRefreshTokenKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @Insert({
        "insert into cwv_auth_refresh_token (id, refresh_token, ",
        "expires, client_id, ",
        "user_id)",
        "values (#{id,jdbcType=INTEGER}, #{refreshToken,jdbcType=VARCHAR}, ",
        "#{expires,jdbcType=TIMESTAMP}, #{clientId,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER})"
    })
    int insert(CWVAuthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @InsertProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="insertSelective")
    int insertSelective(CWVAuthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @SelectProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="refresh_token", property="refreshToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="expires", property="expires", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER)
    })
    List<CWVAuthRefreshToken> selectByExample(CWVAuthRefreshTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @Select({
        "select",
        "id, refresh_token, expires, client_id, user_id",
        "from cwv_auth_refresh_token",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="refresh_token", property="refreshToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="expires", property="expires", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="client_id", property="clientId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER)
    })
    CWVAuthRefreshToken selectByPrimaryKey(CWVAuthRefreshTokenKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @UpdateProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVAuthRefreshToken record, @Param("example") CWVAuthRefreshTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @UpdateProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVAuthRefreshToken record, @Param("example") CWVAuthRefreshTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @UpdateProvider(type=CWVAuthRefreshTokenSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVAuthRefreshToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Thu Apr 26 16:31:54 CST 2018
     */
    @Update({
        "update cwv_auth_refresh_token",
        "set refresh_token = #{refreshToken,jdbcType=VARCHAR},",
          "expires = #{expires,jdbcType=TIMESTAMP},",
          "client_id = #{clientId,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVAuthRefreshToken record);
}