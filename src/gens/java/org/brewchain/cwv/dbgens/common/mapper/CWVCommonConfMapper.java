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
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConf;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConfExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonConfKey;

public interface CWVCommonConfMapper extends StaticTableDaoSupport<CWVCommonConf, CWVCommonConfExample, CWVCommonConfKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @SelectProvider(type=CWVCommonConfSqlProvider.class, method="countByExample")
    int countByExample(CWVCommonConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @DeleteProvider(type=CWVCommonConfSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVCommonConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @Delete({
        "delete from cwv_common_conf",
        "where conf_id = #{confId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVCommonConfKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @Insert({
        "insert into cwv_common_conf (conf_id, parent, ",
        "name, host, description, ",
        "status)",
        "values (#{confId,jdbcType=INTEGER}, #{parent,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{host,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT})"
    })
    int insert(CWVCommonConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @InsertProvider(type=CWVCommonConfSqlProvider.class, method="insertSelective")
    int insertSelective(CWVCommonConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @SelectProvider(type=CWVCommonConfSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="conf_id", property="confId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="parent", property="parent", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<CWVCommonConf> selectByExample(CWVCommonConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @Select({
        "select",
        "conf_id, parent, name, host, description, status",
        "from cwv_common_conf",
        "where conf_id = #{confId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="conf_id", property="confId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="parent", property="parent", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="host", property="host", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    CWVCommonConf selectByPrimaryKey(CWVCommonConfKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @UpdateProvider(type=CWVCommonConfSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVCommonConf record, @Param("example") CWVCommonConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @UpdateProvider(type=CWVCommonConfSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVCommonConf record, @Param("example") CWVCommonConfExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @UpdateProvider(type=CWVCommonConfSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVCommonConf record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Mon May 28 12:42:45 CST 2018
     */
    @Update({
        "update cwv_common_conf",
        "set parent = #{parent,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "host = #{host,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT}",
        "where conf_id = #{confId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVCommonConf record);
}