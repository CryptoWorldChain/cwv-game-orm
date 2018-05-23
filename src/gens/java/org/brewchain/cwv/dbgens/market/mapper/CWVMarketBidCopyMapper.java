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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopy;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketBidCopyKey;

public interface CWVMarketBidCopyMapper extends StaticTableDaoSupport<CWVMarketBidCopy, CWVMarketBidCopyExample, CWVMarketBidCopyKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @SelectProvider(type=CWVMarketBidCopySqlProvider.class, method="countByExample")
    int countByExample(CWVMarketBidCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @DeleteProvider(type=CWVMarketBidCopySqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketBidCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @Delete({
        "delete from cwv_market_bid_copy",
        "where bid_id = #{bidId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketBidCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @Insert({
        "insert into cwv_market_bid_copy (bid_id, game_property_id, ",
        "owner, auction_start, ",
        "auction_end, increase_ladder, ",
        "bid_start, bid_amount, ",
        "bidders_count, status, ",
        "last_update_time, announce_time, ",
        "create_time, create_user)",
        "values (#{bidId,jdbcType=INTEGER}, #{gamePropertyId,jdbcType=INTEGER}, ",
        "#{owner,jdbcType=INTEGER}, #{auctionStart,jdbcType=TIMESTAMP}, ",
        "#{auctionEnd,jdbcType=TIMESTAMP}, #{increaseLadder,jdbcType=DECIMAL}, ",
        "#{bidStart,jdbcType=DECIMAL}, #{bidAmount,jdbcType=DECIMAL}, ",
        "#{biddersCount,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP}, #{announceTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{createUser,jdbcType=VARCHAR})"
    })
    int insert(CWVMarketBidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @InsertProvider(type=CWVMarketBidCopySqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketBidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @SelectProvider(type=CWVMarketBidCopySqlProvider.class, method="selectByExample")
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
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="announce_time", property="announceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR)
    })
    List<CWVMarketBidCopy> selectByExample(CWVMarketBidCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @Select({
        "select",
        "bid_id, game_property_id, owner, auction_start, auction_end, increase_ladder, ",
        "bid_start, bid_amount, bidders_count, status, last_update_time, announce_time, ",
        "create_time, create_user",
        "from cwv_market_bid_copy",
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
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="announce_time", property="announceTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR)
    })
    CWVMarketBidCopy selectByPrimaryKey(CWVMarketBidCopyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidCopySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketBidCopy record, @Param("example") CWVMarketBidCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidCopySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketBidCopy record, @Param("example") CWVMarketBidCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @UpdateProvider(type=CWVMarketBidCopySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketBidCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Wed May 23 22:06:43 CST 2018
     */
    @Update({
        "update cwv_market_bid_copy",
        "set game_property_id = #{gamePropertyId,jdbcType=INTEGER},",
          "owner = #{owner,jdbcType=INTEGER},",
          "auction_start = #{auctionStart,jdbcType=TIMESTAMP},",
          "auction_end = #{auctionEnd,jdbcType=TIMESTAMP},",
          "increase_ladder = #{increaseLadder,jdbcType=DECIMAL},",
          "bid_start = #{bidStart,jdbcType=DECIMAL},",
          "bid_amount = #{bidAmount,jdbcType=DECIMAL},",
          "bidders_count = #{biddersCount,jdbcType=INTEGER},",
          "status = #{status,jdbcType=TINYINT},",
          "last_update_time = #{lastUpdateTime,jdbcType=TIMESTAMP},",
          "announce_time = #{announceTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=VARCHAR}",
        "where bid_id = #{bidId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketBidCopy record);
}