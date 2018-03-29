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
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountry;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryExample;
import org.brewchain.cwv.dbgens.common.entity.CWVCommonCountryKey;

public interface CWVCommonCountryMapper extends StaticTableDaoSupport<CWVCommonCountry, CWVCommonCountryExample, CWVCommonCountryKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @SelectProvider(type=CWVCommonCountrySqlProvider.class, method="countByExample")
    int countByExample(CWVCommonCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @DeleteProvider(type=CWVCommonCountrySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVCommonCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Delete({
        "delete from cwv_common_country",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVCommonCountryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Insert({
        "insert into cwv_common_country (country_id, domain_code, ",
        "region_code, short_name, ",
        "full_name, phone_code, ",
        "sort)",
        "values (#{countryId,jdbcType=INTEGER}, #{domainCode,jdbcType=VARCHAR}, ",
        "#{regionCode,jdbcType=VARCHAR}, #{shortName,jdbcType=VARCHAR}, ",
        "#{fullName,jdbcType=VARCHAR}, #{phoneCode,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=VARCHAR})"
    })
    int insert(CWVCommonCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @InsertProvider(type=CWVCommonCountrySqlProvider.class, method="insertSelective")
    int insertSelective(CWVCommonCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @SelectProvider(type=CWVCommonCountrySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="domain_code", property="domainCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="region_code", property="regionCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_name", property="shortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_code", property="phoneCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVCommonCountry> selectByExample(CWVCommonCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Select({
        "select",
        "country_id, domain_code, region_code, short_name, full_name, phone_code, sort",
        "from cwv_common_country",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="domain_code", property="domainCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="region_code", property="regionCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="short_name", property="shortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_name", property="fullName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_code", property="phoneCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.VARCHAR)
    })
    CWVCommonCountry selectByPrimaryKey(CWVCommonCountryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonCountrySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVCommonCountry record, @Param("example") CWVCommonCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonCountrySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVCommonCountry record, @Param("example") CWVCommonCountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @UpdateProvider(type=CWVCommonCountrySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVCommonCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Mar 29 23:06:19 CST 2018
     */
    @Update({
        "update cwv_common_country",
        "set domain_code = #{domainCode,jdbcType=VARCHAR},",
          "region_code = #{regionCode,jdbcType=VARCHAR},",
          "short_name = #{shortName,jdbcType=VARCHAR},",
          "full_name = #{fullName,jdbcType=VARCHAR},",
          "phone_code = #{phoneCode,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=VARCHAR}",
        "where country_id = #{countryId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVCommonCountry record);
}