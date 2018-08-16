package org.brewchain.cwv.dbgens.market.mapper;

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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecord;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketChainRecordKey;

public interface CWVMarketChainRecordMapper extends StaticTableDaoSupport<CWVMarketChainRecord, CWVMarketChainRecordExample, CWVMarketChainRecordKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @SelectProvider(type=CWVMarketChainRecordSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketChainRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @DeleteProvider(type=CWVMarketChainRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketChainRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @Delete({
        "delete from cwv_market_chain_record",
        "where chain_record_id = #{chainRecordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketChainRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @Insert({
        "insert into cwv_market_chain_record (chain_record_id, property_id, ",
        "user_id, transaction_hash, ",
        "contract_address, contract_type, ",
        "contract_subtype, status, ",
        "create_time, update_time)",
        "values (#{chainRecordId,jdbcType=INTEGER}, #{propertyId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{transactionHash,jdbcType=VARCHAR}, ",
        "#{contractAddress,jdbcType=VARCHAR}, #{contractType,jdbcType=TINYINT}, ",
        "#{contractSubtype,jdbcType=SMALLINT}, #{status,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVMarketChainRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @InsertProvider(type=CWVMarketChainRecordSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketChainRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @SelectProvider(type=CWVMarketChainRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="chain_record_id", property="chainRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_hash", property="transactionHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_address", property="contractAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_type", property="contractType", jdbcType=JdbcType.TINYINT),
        @Result(column="contract_subtype", property="contractSubtype", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVMarketChainRecord> selectByExample(CWVMarketChainRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @Select({
        "select",
        "chain_record_id, property_id, user_id, transaction_hash, contract_address, contract_type, ",
        "contract_subtype, status, create_time, update_time",
        "from cwv_market_chain_record",
        "where chain_record_id = #{chainRecordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="chain_record_id", property="chainRecordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="property_id", property="propertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_hash", property="transactionHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_address", property="contractAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_type", property="contractType", jdbcType=JdbcType.TINYINT),
        @Result(column="contract_subtype", property="contractSubtype", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVMarketChainRecord selectByPrimaryKey(CWVMarketChainRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketChainRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketChainRecord record, @Param("example") CWVMarketChainRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketChainRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketChainRecord record, @Param("example") CWVMarketChainRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketChainRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketChainRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Thu Aug 16 19:29:42 CST 2018
     */
    @Update({
        "update cwv_market_chain_record",
        "set property_id = #{propertyId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "transaction_hash = #{transactionHash,jdbcType=VARCHAR},",
          "contract_address = #{contractAddress,jdbcType=VARCHAR},",
          "contract_type = #{contractType,jdbcType=TINYINT},",
          "contract_subtype = #{contractSubtype,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where chain_record_id = #{chainRecordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketChainRecord record);
}