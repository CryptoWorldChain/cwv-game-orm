package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_auction")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketAuction extends CWVMarketAuctionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.bid_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Integer bidId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private BigDecimal bidPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.last_bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private BigDecimal lastBidPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.chain_status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.chain_trans_hash
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.chain_contract
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private String chainContract;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.bid_id
     *
     * @return the value of cwv_market_auction.bid_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Integer getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.bid_id
     *
     * @param bidId the value for cwv_market_auction.bid_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.user_id
     *
     * @return the value of cwv_market_auction.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.user_id
     *
     * @param userId the value for cwv_market_auction.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.bid_price
     *
     * @return the value of cwv_market_auction.bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.bid_price
     *
     * @param bidPrice the value for cwv_market_auction.bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.last_bid_price
     *
     * @return the value of cwv_market_auction.last_bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public BigDecimal getLastBidPrice() {
        return lastBidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.last_bid_price
     *
     * @param lastBidPrice the value for cwv_market_auction.last_bid_price
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setLastBidPrice(BigDecimal lastBidPrice) {
        this.lastBidPrice = lastBidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.status
     *
     * @return the value of cwv_market_auction.status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.status
     *
     * @param status the value for cwv_market_auction.status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.create_time
     *
     * @return the value of cwv_market_auction.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.create_time
     *
     * @param createTime the value for cwv_market_auction.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.chain_status
     *
     * @return the value of cwv_market_auction.chain_status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.chain_status
     *
     * @param chainStatus the value for cwv_market_auction.chain_status
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.chain_trans_hash
     *
     * @return the value of cwv_market_auction.chain_trans_hash
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_market_auction.chain_trans_hash
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.chain_contract
     *
     * @return the value of cwv_market_auction.chain_contract
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public String getChainContract() {
        return chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.chain_contract
     *
     * @param chainContract the value for cwv_market_auction.chain_contract
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setChainContract(String chainContract) {
        this.chainContract = chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CWVMarketAuction other = (CWVMarketAuction) that;
        return (this.getAuctionId() == null ? other.getAuctionId() == null : this.getAuctionId().equals(other.getAuctionId()))
            && (this.getBidId() == null ? other.getBidId() == null : this.getBidId().equals(other.getBidId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBidPrice() == null ? other.getBidPrice() == null : this.getBidPrice().equals(other.getBidPrice()))
            && (this.getLastBidPrice() == null ? other.getLastBidPrice() == null : this.getLastBidPrice().equals(other.getLastBidPrice()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getChainContract() == null ? other.getChainContract() == null : this.getChainContract().equals(other.getChainContract()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuctionId() == null) ? 0 : getAuctionId().hashCode());
        result = prime * result + ((getBidId() == null) ? 0 : getBidId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        result = prime * result + ((getLastBidPrice() == null) ? 0 : getLastBidPrice().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getChainContract() == null) ? 0 : getChainContract().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bidId=").append(bidId);
        sb.append(", userId=").append(userId);
        sb.append(", bidPrice=").append(bidPrice);
        sb.append(", lastBidPrice=").append(lastBidPrice);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", chainContract=").append(chainContract);
        sb.append("]");
        return sb.toString();
    }
}