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
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuction;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionExample;
import org.brewchain.cwv.dbgens.market.entity.CWVMarketAuctionKey;

public interface CWVMarketAuctionMapper extends StaticTableDaoSupport<CWVMarketAuction, CWVMarketAuctionExample, CWVMarketAuctionKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @SelectProvider(type=CWVMarketAuctionSqlProvider.class, method="countByExample")
    int countByExample(CWVMarketAuctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @DeleteProvider(type=CWVMarketAuctionSqlProvider.class, method="deleteByExample")
    int deleteByExample(CWVMarketAuctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @Delete({
        "delete from cwv_market_auction",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(CWVMarketAuctionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @Insert({
        "insert into cwv_market_auction (auction_id, bid_id, ",
        "user_id, bid_price, ",
        "status, create_time)",
        "values (#{auctionId,jdbcType=INTEGER}, #{bidId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{bidPrice,jdbcType=DECIMAL}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(CWVMarketAuction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @InsertProvider(type=CWVMarketAuctionSqlProvider.class, method="insertSelective")
    int insertSelective(CWVMarketAuction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @SelectProvider(type=CWVMarketAuctionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bid_id", property="bidId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="bid_price", property="bidPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CWVMarketAuction> selectByExample(CWVMarketAuctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @Select({
        "select",
        "auction_id, bid_id, user_id, bid_price, status, create_time",
        "from cwv_market_auction",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="auction_id", property="auctionId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bid_id", property="bidId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="bid_price", property="bidPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CWVMarketAuction selectByPrimaryKey(CWVMarketAuctionKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @UpdateProvider(type=CWVMarketAuctionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CWVMarketAuction record, @Param("example") CWVMarketAuctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @UpdateProvider(type=CWVMarketAuctionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CWVMarketAuction record, @Param("example") CWVMarketAuctionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @UpdateProvider(type=CWVMarketAuctionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CWVMarketAuction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Wed Apr 11 21:16:31 CST 2018
     */
    @Update({
        "update cwv_market_auction",
        "set bid_id = #{bidId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "bid_price = #{bidPrice,jdbcType=DECIMAL},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where auction_id = #{auctionId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CWVMarketAuction record);
}