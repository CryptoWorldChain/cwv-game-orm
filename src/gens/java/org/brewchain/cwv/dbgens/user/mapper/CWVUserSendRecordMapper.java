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
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecord;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordExample;
import org.brewchain.cwv.dbgens.user.entity.CWVUserSendRecordKey;

public interface CWVUserSendRecordMapper extends StaticTableDaoSupport<CWVUserSendRecord, CWVUserSendRecordExample, CWVUserSendRecordKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @SelectProvider(type=CWVUserSendRecordSqlProvider.class, method="countByExample")
    int countByExample(CWVUserSendRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @DeleteProvider(type=CWVUserSendRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVUserSendRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Delete({
        "delete from cwv_user_send_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVUserSendRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Insert({
        "insert into cwv_user_send_record (record_id, user_id, ",
        "coin_type, input_address, ",
        "out_address, amount, ",
        "status, create_time, ",
        "tx_hash)",
        "values (#{recordId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{coinType,jdbcType=TINYINT}, #{inputAddress,jdbcType=VARCHAR}, ",
        "#{outAddress,jdbcType=VARCHAR}, #{amount,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{txHash,jdbcType=VARCHAR})"
    })
    int insert(CWVUserSendRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @InsertProvider(type=CWVUserSendRecordSqlProvider.class, method="insertSelective")
    int insertSelective(CWVUserSendRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @SelectProvider(type=CWVUserSendRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="input_address", property="inputAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_address", property="outAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tx_hash", property="txHash", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVUserSendRecord> selectByExample(CWVUserSendRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Select({
        "select",
        "record_id, user_id, coin_type, input_address, out_address, amount, status, create_time, ",
        "tx_hash",
        "from cwv_user_send_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="coin_type", property="coinType", jdbcType=JdbcType.TINYINT),
        @Result(column="input_address", property="inputAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="out_address", property="outAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="tx_hash", property="txHash", jdbcType=JdbcType.VARCHAR)
    })
    CWVUserSendRecord selectByPrimaryKey(CWVUserSendRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @UpdateProvider(type=CWVUserSendRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVUserSendRecord record, @Param("example") CWVUserSendRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @UpdateProvider(type=CWVUserSendRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVUserSendRecord record, @Param("example") CWVUserSendRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @UpdateProvider(type=CWVUserSendRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVUserSendRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Update({
        "update cwv_user_send_record",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "coin_type = #{coinType,jdbcType=TINYINT},",
          "input_address = #{inputAddress,jdbcType=VARCHAR},",
          "out_address = #{outAddress,jdbcType=VARCHAR},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "tx_hash = #{txHash,jdbcType=VARCHAR}",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVUserSendRecord record);
}