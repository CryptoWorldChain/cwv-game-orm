package org.brewchain.cwv.dbgens.sys.mapper;

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
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResource;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceExample;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysUrlResourceKey;

public interface CWVSysUrlResourceMapper extends StaticTableDaoSupport<CWVSysUrlResource, CWVSysUrlResourceExample, CWVSysUrlResourceKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @SelectProvider(type=CWVSysUrlResourceSqlProvider.class, method="countByExample")
    int countByExample(CWVSysUrlResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @DeleteProvider(type=CWVSysUrlResourceSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVSysUrlResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @Delete({
        "delete from cwv_sys_url_resource",
        "where URL_RESOURCE_ID = #{urlResourceId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(CWVSysUrlResourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @Insert({
        "insert into cwv_sys_url_resource (URL_RESOURCE_ID, URL_RESOURCE_NAME, ",
        "URL_RESOURCE_PATH, URL_RESOURCE_TYPE, ",
        "URL_LOG_OUT, RESOURCE, ",
        "user_day_limit, interval_time, ",
        "STATUS, CREATED_TIME, CREATED_BY, ",
        "MODIFIED_TIME, MODIFIED_BY, ",
        "RESERVED_FIELD1, RESERVED_FIELD2)",
        "values (#{urlResourceId,jdbcType=VARCHAR}, #{urlResourceName,jdbcType=VARCHAR}, ",
        "#{urlResourcePath,jdbcType=VARCHAR}, #{urlResourceType,jdbcType=INTEGER}, ",
        "#{urlLogOut,jdbcType=CHAR}, #{resource,jdbcType=VARCHAR}, ",
        "#{userDayLimit,jdbcType=INTEGER}, #{intervalTime,jdbcType=INTEGER}, ",
        "#{status,jdbcType=CHAR}, #{createdTime,jdbcType=DATE}, #{createdBy,jdbcType=VARCHAR}, ",
        "#{modifiedTime,jdbcType=DATE}, #{modifiedBy,jdbcType=VARCHAR}, ",
        "#{reservedField1,jdbcType=VARCHAR}, #{reservedField2,jdbcType=VARCHAR})"
    })
    int insert(CWVSysUrlResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @InsertProvider(type=CWVSysUrlResourceSqlProvider.class, method="insertSelective")
    int insertSelective(CWVSysUrlResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @SelectProvider(type=CWVSysUrlResourceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="URL_RESOURCE_ID", property="urlResourceId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="URL_RESOURCE_NAME", property="urlResourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL_RESOURCE_PATH", property="urlResourcePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL_RESOURCE_TYPE", property="urlResourceType", jdbcType=JdbcType.INTEGER),
        @Result(column="URL_LOG_OUT", property="urlLogOut", jdbcType=JdbcType.CHAR),
        @Result(column="RESOURCE", property="resource", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_day_limit", property="userDayLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="interval_time", property="intervalTime", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.DATE),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIED_TIME", property="modifiedTime", jdbcType=JdbcType.DATE),
        @Result(column="MODIFIED_BY", property="modifiedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED_FIELD1", property="reservedField1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED_FIELD2", property="reservedField2", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVSysUrlResource> selectByExample(CWVSysUrlResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @Select({
        "select",
        "URL_RESOURCE_ID, URL_RESOURCE_NAME, URL_RESOURCE_PATH, URL_RESOURCE_TYPE, URL_LOG_OUT, ",
        "RESOURCE, user_day_limit, interval_time, STATUS, CREATED_TIME, CREATED_BY, MODIFIED_TIME, ",
        "MODIFIED_BY, RESERVED_FIELD1, RESERVED_FIELD2",
        "from cwv_sys_url_resource",
        "where URL_RESOURCE_ID = #{urlResourceId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="URL_RESOURCE_ID", property="urlResourceId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="URL_RESOURCE_NAME", property="urlResourceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL_RESOURCE_PATH", property="urlResourcePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="URL_RESOURCE_TYPE", property="urlResourceType", jdbcType=JdbcType.INTEGER),
        @Result(column="URL_LOG_OUT", property="urlLogOut", jdbcType=JdbcType.CHAR),
        @Result(column="RESOURCE", property="resource", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_day_limit", property="userDayLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="interval_time", property="intervalTime", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.DATE),
        @Result(column="CREATED_BY", property="createdBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIED_TIME", property="modifiedTime", jdbcType=JdbcType.DATE),
        @Result(column="MODIFIED_BY", property="modifiedBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED_FIELD1", property="reservedField1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED_FIELD2", property="reservedField2", jdbcType=JdbcType.VARCHAR)
    })
    CWVSysUrlResource selectByPrimaryKey(CWVSysUrlResourceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @UpdateProvider(type=CWVSysUrlResourceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVSysUrlResource record, @Param("example") CWVSysUrlResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @UpdateProvider(type=CWVSysUrlResourceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVSysUrlResource record, @Param("example") CWVSysUrlResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @UpdateProvider(type=CWVSysUrlResourceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVSysUrlResource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Thu Aug 23 16:16:53 CST 2018
     */
    @Update({
        "update cwv_sys_url_resource",
        "set URL_RESOURCE_NAME = #{urlResourceName,jdbcType=VARCHAR},",
          "URL_RESOURCE_PATH = #{urlResourcePath,jdbcType=VARCHAR},",
          "URL_RESOURCE_TYPE = #{urlResourceType,jdbcType=INTEGER},",
          "URL_LOG_OUT = #{urlLogOut,jdbcType=CHAR},",
          "RESOURCE = #{resource,jdbcType=VARCHAR},",
          "user_day_limit = #{userDayLimit,jdbcType=INTEGER},",
          "interval_time = #{intervalTime,jdbcType=INTEGER},",
          "STATUS = #{status,jdbcType=CHAR},",
          "CREATED_TIME = #{createdTime,jdbcType=DATE},",
          "CREATED_BY = #{createdBy,jdbcType=VARCHAR},",
          "MODIFIED_TIME = #{modifiedTime,jdbcType=DATE},",
          "MODIFIED_BY = #{modifiedBy,jdbcType=VARCHAR},",
          "RESERVED_FIELD1 = #{reservedField1,jdbcType=VARCHAR},",
          "RESERVED_FIELD2 = #{reservedField2,jdbcType=VARCHAR}",
        "where URL_RESOURCE_ID = #{urlResourceId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CWVSysUrlResource record);
}