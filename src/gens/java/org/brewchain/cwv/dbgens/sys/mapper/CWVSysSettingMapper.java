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
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSetting;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSettingExample;
import org.brewchain.cwv.dbgens.sys.entity.CWVSysSettingKey;

public interface CWVSysSettingMapper extends StaticTableDaoSupport<CWVSysSetting, CWVSysSettingExample, CWVSysSettingKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @SelectProvider(type=CWVSysSettingSqlProvider.class, method="countByExample")
    int countByExample(CWVSysSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @DeleteProvider(type=CWVSysSettingSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVSysSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @Delete({
        "delete from cwv_sys_setting",
        "where setting_id = #{settingId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVSysSettingKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @Insert({
        "insert into cwv_sys_setting (setting_id, name, ",
        "value, description)",
        "values (#{settingId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{value,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR})"
    })
    int insert(CWVSysSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @InsertProvider(type=CWVSysSettingSqlProvider.class, method="insertSelective")
    int insertSelective(CWVSysSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @SelectProvider(type=CWVSysSettingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="setting_id", property="settingId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVSysSetting> selectByExample(CWVSysSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @Select({
        "select",
        "setting_id, name, value, description",
        "from cwv_sys_setting",
        "where setting_id = #{settingId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="setting_id", property="settingId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR)
    })
    CWVSysSetting selectByPrimaryKey(CWVSysSettingKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @UpdateProvider(type=CWVSysSettingSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVSysSetting record, @Param("example") CWVSysSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @UpdateProvider(type=CWVSysSettingSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVSysSetting record, @Param("example") CWVSysSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @UpdateProvider(type=CWVSysSettingSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVSysSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Mon Jun 04 22:59:17 CST 2018
     */
    @Update({
        "update cwv_sys_setting",
        "set name = #{name,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR}",
        "where setting_id = #{settingId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVSysSetting record);
}