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
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecord;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecordExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserTransactionRecordKey;

public interface CWVUserTransactionRecordMapper extends StaticTableDaoSupport<CWVUserTransactionRecord, CWVUserTransactionRecordExample, CWVUserTransactionRecordKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @SelectProvider(type=CWVUserTransactionRecordSqlProvider.class, method="countByExample")
    int countByExample(CWVUserTransactionRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @DeleteProvider(type=CWVUserTransactionRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserTransactionRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @Delete({
        "delete from cwv_user_transaction_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserTransactionRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @Insert({
        "insert into cwv_user_transaction_record (record_id, user_id, ",
        "market_id, type, ",
        "detail, gain_cost, ",
        "create_time, create_user, ",
        "status)",
        "values (#{recordId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{marketId,jdbcType=INTEGER}, #{type,jdbcType=TINYINT}, ",
        "#{detail,jdbcType=VARCHAR}, #{gainCost,jdbcType=DECIMAL}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=INTEGER}, ",
        "#{status,jdbcType=TINYINT})"
    })
    int insert(CWVUserTransactionRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @InsertProvider(type=CWVUserTransactionRecordSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserTransactionRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @SelectProvider(type=CWVUserTransactionRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="market_id", property="marketId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
        @Result(column="gain_cost", property="gainCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<CWVUserTransactionRecord> selectByExample(CWVUserTransactionRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @Select({
        "select",
        "record_id, user_id, market_id, type, detail, gain_cost, create_time, create_user, ",
        "status",
        "from cwv_user_transaction_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="market_id", property="marketId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.TINYINT),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
        @Result(column="gain_cost", property="gainCost", jdbcType=JdbcType.DECIMAL),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    CWVUserTransactionRecord selectByPrimaryKey(CWVUserTransactionRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @UpdateProvider(type=CWVUserTransactionRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserTransactionRecord record, @Param("example") CWVUserTransactionRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @UpdateProvider(type=CWVUserTransactionRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserTransactionRecord record, @Param("example") CWVUserTransactionRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @UpdateProvider(type=CWVUserTransactionRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserTransactionRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Sat Jul 07 13:30:56 CST 2018
     */
    @Update({
        "update cwv_user_transaction_record",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "market_id = #{marketId,jdbcType=INTEGER},",
          "type = #{type,jdbcType=TINYINT},",
          "detail = #{detail,jdbcType=VARCHAR},",
          "gain_cost = #{gainCost,jdbcType=DECIMAL},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT}",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserTransactionRecord record);
}