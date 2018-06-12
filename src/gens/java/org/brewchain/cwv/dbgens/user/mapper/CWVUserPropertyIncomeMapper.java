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
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncome;
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncomeExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserPropertyIncomeKey;

public interface CWVUserPropertyIncomeMapper extends StaticTableDaoSupport<CWVUserPropertyIncome, CWVUserPropertyIncomeExample, CWVUserPropertyIncomeKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @SelectProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="countByExample")
    int countByExample(CWVUserPropertyIncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @DeleteProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserPropertyIncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @Delete({
        "delete from cwv_user_property_income",
        "where income_id = #{incomeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserPropertyIncomeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @Insert({
        "insert into cwv_user_property_income (income_id, user_id, ",
        "type, property_id, ",
        "amount, status, ",
        "start_time, end_time)",
        "values (#{incomeId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{type,jdbcType=TINYINT}, #{propertyId,jdbcType=INTEGER}, ",
        "#{amount,jdbcType=DECIMAL}, #{status,jdbcType=TINYINT}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVUserPropertyIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @InsertProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserPropertyIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @SelectProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="income_id", property="incomeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVUserPropertyIncome> selectByExample(CWVUserPropertyIncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @Select({
        "select",
        "income_id, user_id, type, property_id, amount, status, start_time, end_time",
        "from cwv_user_property_income",
        "where income_id = #{incomeId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="income_id", property="incomeId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVUserPropertyIncome selectByPrimaryKey(CWVUserPropertyIncomeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @UpdateProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserPropertyIncome record, @Param("example") CWVUserPropertyIncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @UpdateProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserPropertyIncome record, @Param("example") CWVUserPropertyIncomeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @UpdateProvider(type=CWVUserPropertyIncomeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserPropertyIncome record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Tue Jun 12 17:26:25 CST 2018
     */
    @Update({
        "update cwv_user_property_income",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=TINYINT},",
          "property_id = #{propertyId,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP}",
        "where income_id = #{incomeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserPropertyIncome record);
}