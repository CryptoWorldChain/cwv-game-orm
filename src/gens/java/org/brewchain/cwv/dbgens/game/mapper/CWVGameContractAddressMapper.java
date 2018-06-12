package org.brewchain.cwv.dbgens.game.mapper;

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
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddress;
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddressExample;
import org.brewchain.cwv.dbgens.game.entity.CWVGameContractAddressKey;

public interface CWVGameContractAddressMapper extends StaticTableDaoSupport<CWVGameContractAddress, CWVGameContractAddressExample, CWVGameContractAddressKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @SelectProvider(type=CWVGameContractAddressSqlProvider.class, method="countByExample")
    int countByExample(CWVGameContractAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @DeleteProvider(type=CWVGameContractAddressSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVGameContractAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Delete({
        "delete from cwv_game_contract_address",
        "where contract_address_id = #{contractAddressId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVGameContractAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Insert({
        "insert into cwv_game_contract_address (contract_address_id, contract_address, ",
        "contract_type, contract_state)",
        "values (#{contractAddressId,jdbcType=INTEGER}, #{contractAddress,jdbcType=VARCHAR}, ",
        "#{contractType,jdbcType=VARCHAR}, #{contractState,jdbcType=CHAR})"
    })
    int insert(CWVGameContractAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @InsertProvider(type=CWVGameContractAddressSqlProvider.class, method="insertSelective")
    int insertSelective(CWVGameContractAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @SelectProvider(type=CWVGameContractAddressSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="contract_address_id", property="contractAddressId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contract_address", property="contractAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_type", property="contractType", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_state", property="contractState", jdbcType=JdbcType.CHAR)
    })
    List<CWVGameContractAddress> selectByExample(CWVGameContractAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Select({
        "select",
        "contract_address_id, contract_address, contract_type, contract_state",
        "from cwv_game_contract_address",
        "where contract_address_id = #{contractAddressId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="contract_address_id", property="contractAddressId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="contract_address", property="contractAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_type", property="contractType", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_state", property="contractState", jdbcType=JdbcType.CHAR)
    })
    CWVGameContractAddress selectByPrimaryKey(CWVGameContractAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @UpdateProvider(type=CWVGameContractAddressSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVGameContractAddress record, @Param("example") CWVGameContractAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @UpdateProvider(type=CWVGameContractAddressSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVGameContractAddress record, @Param("example") CWVGameContractAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @UpdateProvider(type=CWVGameContractAddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVGameContractAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Update({
        "update cwv_game_contract_address",
        "set contract_address = #{contractAddress,jdbcType=VARCHAR},",
          "contract_type = #{contractType,jdbcType=VARCHAR},",
          "contract_state = #{contractState,jdbcType=CHAR}",
        "where contract_address_id = #{contractAddressId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVGameContractAddress record);
}