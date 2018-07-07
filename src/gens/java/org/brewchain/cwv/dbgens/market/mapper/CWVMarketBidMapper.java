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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBid;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidKey;

public interface CWVMarketBidMapper extends StaticTableDaoSupport<CWVMarketBid, CWVMarketBidExample, CWVMarketBidKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @SelectProvider(type=CWVMarketBidSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketBidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @DeleteProvider(type=CWVMarketBidSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketBidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @Delete({
        "delete from cwv_market_bid",
        "where bid_id = #{bidId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketBidKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @Insert({
        "insert into cwv_market_bid (bid_id, game_property_id, ",
        "owner, auction_start, ",
        "auction_end, increase_ladder, ",
        "bid_start, bid_amount, ",
        "bidders_count, status, ",
        "chain_status, chain_trans_hash, ",
        "chain_contract, last_update_time, ",
        "announce_time, create_time, ",
        "create_user, country_id, ",
        "map_id, property_template_id, ",
        "property_template, nick_name, ",
        "property_name, property_type, ",
        "property_status, income_remark, ",
        "last_price, image_url)",
        "values (#{bidId,jdbcType=INTEGER}, #{gamePropertyId,jdbcType=INTEGER}, ",
        "#{owner,jdbcType=INTEGER}, #{auctionStart,jdbcType=TIMESTAMP}, ",
        "#{auctionEnd,jdbcType=TIMESTAMP}, #{increaseLadder,jdbcType=DECIMAL}, ",
        "#{bidStart,jdbcType=DECIMAL}, #{bidAmount,jdbcType=DECIMAL}, ",
        "#{biddersCount,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, ",
        "#{chainStatus,jdbcType=TINYINT}, #{chainTransHash,jdbcType=VARCHAR}, ",
        "#{chainContract,jdbcType=VARCHAR}, #{lastUpdateTime,jdbcType=TIMESTAMP}, ",
        "#{announceTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=VARCHAR}, #{countryId,jdbcType=INTEGER}, ",
        "#{mapId,jdbcType=INTEGER}, #{propertyTemplateId,jdbcType=VARCHAR}, ",
        "#{propertyTemplate,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{propertyName,jdbcType=VARCHAR}, #{propertyType,jdbcType=VARCHAR}, ",
        "#{propertyStatus,jdbcType=VARCHAR}, #{incomeRemark,jdbcType=VARCHAR}, ",
        "#{lastPrice,jdbcType=DECIMAL}, #{imageUrl,jdbcType=VARCHAR})"
    })
    int insert(CWVMarketBid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @InsertProvider(type=CWVMarketBidSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketBid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @SelectProvider(type=CWVMarketBidSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="bid_id", property="bidId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="game_property_id", property="gamePropertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="owner", property="owner", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_start", property="auctionStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_end", property="auctionEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="increase_ladder", property="increaseLadder", jdbcType=JdbcType.DECIMAL),
        @Result(column="bid_start", property="bidStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="bid_amount", property="bidAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="bidders_count", property="biddersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="announce_time", property="announceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="income_remark", property="incomeRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVMarketBid> selectByExample(CWVMarketBidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @Select({
        "select",
        "bid_id, game_property_id, owner, auction_start, auction_end, increase_ladder, ",
        "bid_start, bid_amount, bidders_count, status, chain_status, chain_trans_hash, ",
        "chain_contract, last_update_time, announce_time, create_time, create_user, country_id, ",
        "map_id, property_template_id, property_template, nick_name, property_name, property_type, ",
        "property_status, income_remark, last_price, image_url",
        "from cwv_market_bid",
        "where bid_id = #{bidId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="bid_id", property="bidId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="game_property_id", property="gamePropertyId", jdbcType=JdbcType.INTEGER),
        @Result(column="owner", property="owner", jdbcType=JdbcType.INTEGER),
        @Result(column="auction_start", property="auctionStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="auction_end", property="auctionEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="increase_ladder", property="increaseLadder", jdbcType=JdbcType.DECIMAL),
        @Result(column="bid_start", property="bidStart", jdbcType=JdbcType.DECIMAL),
        @Result(column="bid_amount", property="bidAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="bidders_count", property="biddersCount", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_status", property="chainStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="chain_trans_hash", property="chainTransHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="chain_contract", property="chainContract", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="announce_time", property="announceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="country_id", property="countryId", jdbcType=JdbcType.INTEGER),
        @Result(column="map_id", property="mapId", jdbcType=JdbcType.INTEGER),
        @Result(column="property_template_id", property="propertyTemplateId", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_template", property="propertyTemplate", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_name", property="propertyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_type", property="propertyType", jdbcType=JdbcType.VARCHAR),
        @Result(column="property_status", property="propertyStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="income_remark", property="incomeRemark", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_price", property="lastPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR)
    })
    CWVMarketBid selectByPrimaryKey(CWVMarketBidKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketBid record, @Param("example") CWVMarketBidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketBid record, @Param("example") CWVMarketBidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketBid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Sat Jul 07 15:07:42 CST 2018
     */
    @Update({
        "update cwv_market_bid",
        "set game_property_id = #{gamePropertyId,jdbcType=INTEGER},",
          "owner = #{owner,jdbcType=INTEGER},",
          "auction_start = #{auctionStart,jdbcType=TIMESTAMP},",
          "auction_end = #{auctionEnd,jdbcType=TIMESTAMP},",
          "increase_ladder = #{increaseLadder,jdbcType=DECIMAL},",
          "bid_start = #{bidStart,jdbcType=DECIMAL},",
          "bid_amount = #{bidAmount,jdbcType=DECIMAL},",
          "bidders_count = #{biddersCount,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "chain_status = #{chainStatus,jdbcType=TINYINT},",
          "chain_trans_hash = #{chainTransHash,jdbcType=VARCHAR},",
          "chain_contract = #{chainContract,jdbcType=VARCHAR},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "announce_time = #{announceTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=VARCHAR},",
          "country_id = #{countryId,jdbcType=INTEGER},",
          "map_id = #{mapId,jdbcType=INTEGER},",
          "property_template_id = #{propertyTemplateId,jdbcType=VARCHAR},",
          "property_template = #{propertyTemplate,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "property_name = #{propertyName,jdbcType=VARCHAR},",
          "property_type = #{propertyType,jdbcType=VARCHAR},",
          "property_status = #{propertyStatus,jdbcType=VARCHAR},",
          "income_remark = #{incomeRemark,jdbcType=VARCHAR},",
          "last_price = #{lastPrice,jdbcType=DECIMAL},",
          "image_url = #{imageUrl,jdbcType=VARCHAR}",
        "where bid_id = #{bidId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketBid record);
}