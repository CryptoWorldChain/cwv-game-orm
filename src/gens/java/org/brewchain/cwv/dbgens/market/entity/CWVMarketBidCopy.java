package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_bid_copy")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketBidCopy extends CWVMarketBidCopyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.game_property_id
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Integer gamePropertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.owner
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Integer owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.auction_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Date auctionStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.auction_end
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Date auctionEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.increase_ladder
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Long increaseLadder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.bid_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private BigDecimal bidStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.bid_amount
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private BigDecimal bidAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.bidders_count
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Integer biddersCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.status
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.last_update_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.announce_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Date announceTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.create_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid_copy.create_user
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    private String createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.game_property_id
     *
     * @return the value of cwv_market_bid_copy.game_property_id
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Integer getGamePropertyId() {
        return gamePropertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.game_property_id
     *
     * @param gamePropertyId the value for cwv_market_bid_copy.game_property_id
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setGamePropertyId(Integer gamePropertyId) {
        this.gamePropertyId = gamePropertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.owner
     *
     * @return the value of cwv_market_bid_copy.owner
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Integer getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.owner
     *
     * @param owner the value for cwv_market_bid_copy.owner
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.auction_start
     *
     * @return the value of cwv_market_bid_copy.auction_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Date getAuctionStart() {
        return auctionStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.auction_start
     *
     * @param auctionStart the value for cwv_market_bid_copy.auction_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setAuctionStart(Date auctionStart) {
        this.auctionStart = auctionStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.auction_end
     *
     * @return the value of cwv_market_bid_copy.auction_end
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Date getAuctionEnd() {
        return auctionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.auction_end
     *
     * @param auctionEnd the value for cwv_market_bid_copy.auction_end
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.increase_ladder
     *
     * @return the value of cwv_market_bid_copy.increase_ladder
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Long getIncreaseLadder() {
        return increaseLadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.increase_ladder
     *
     * @param increaseLadder the value for cwv_market_bid_copy.increase_ladder
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setIncreaseLadder(Long increaseLadder) {
        this.increaseLadder = increaseLadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.bid_start
     *
     * @return the value of cwv_market_bid_copy.bid_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public BigDecimal getBidStart() {
        return bidStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.bid_start
     *
     * @param bidStart the value for cwv_market_bid_copy.bid_start
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setBidStart(BigDecimal bidStart) {
        this.bidStart = bidStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.bid_amount
     *
     * @return the value of cwv_market_bid_copy.bid_amount
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.bid_amount
     *
     * @param bidAmount the value for cwv_market_bid_copy.bid_amount
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.bidders_count
     *
     * @return the value of cwv_market_bid_copy.bidders_count
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Integer getBiddersCount() {
        return biddersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.bidders_count
     *
     * @param biddersCount the value for cwv_market_bid_copy.bidders_count
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setBiddersCount(Integer biddersCount) {
        this.biddersCount = biddersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.status
     *
     * @return the value of cwv_market_bid_copy.status
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.status
     *
     * @param status the value for cwv_market_bid_copy.status
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.last_update_time
     *
     * @return the value of cwv_market_bid_copy.last_update_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.last_update_time
     *
     * @param lastUpdateTime the value for cwv_market_bid_copy.last_update_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.announce_time
     *
     * @return the value of cwv_market_bid_copy.announce_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Date getAnnounceTime() {
        return announceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.announce_time
     *
     * @param announceTime the value for cwv_market_bid_copy.announce_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.create_time
     *
     * @return the value of cwv_market_bid_copy.create_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.create_time
     *
     * @param createTime the value for cwv_market_bid_copy.create_time
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid_copy.create_user
     *
     * @return the value of cwv_market_bid_copy.create_user
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid_copy.create_user
     *
     * @param createUser the value for cwv_market_bid_copy.create_user
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
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
        CWVMarketBidCopy other = (CWVMarketBidCopy) that;
        return (this.getBidId() == null ? other.getBidId() == null : this.getBidId().equals(other.getBidId()))
            && (this.getGamePropertyId() == null ? other.getGamePropertyId() == null : this.getGamePropertyId().equals(other.getGamePropertyId()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getAuctionStart() == null ? other.getAuctionStart() == null : this.getAuctionStart().equals(other.getAuctionStart()))
            && (this.getAuctionEnd() == null ? other.getAuctionEnd() == null : this.getAuctionEnd().equals(other.getAuctionEnd()))
            && (this.getIncreaseLadder() == null ? other.getIncreaseLadder() == null : this.getIncreaseLadder().equals(other.getIncreaseLadder()))
            && (this.getBidStart() == null ? other.getBidStart() == null : this.getBidStart().equals(other.getBidStart()))
            && (this.getBidAmount() == null ? other.getBidAmount() == null : this.getBidAmount().equals(other.getBidAmount()))
            && (this.getBiddersCount() == null ? other.getBiddersCount() == null : this.getBiddersCount().equals(other.getBiddersCount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getAnnounceTime() == null ? other.getAnnounceTime() == null : this.getAnnounceTime().equals(other.getAnnounceTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBidId() == null) ? 0 : getBidId().hashCode());
        result = prime * result + ((getGamePropertyId() == null) ? 0 : getGamePropertyId().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getAuctionStart() == null) ? 0 : getAuctionStart().hashCode());
        result = prime * result + ((getAuctionEnd() == null) ? 0 : getAuctionEnd().hashCode());
        result = prime * result + ((getIncreaseLadder() == null) ? 0 : getIncreaseLadder().hashCode());
        result = prime * result + ((getBidStart() == null) ? 0 : getBidStart().hashCode());
        result = prime * result + ((getBidAmount() == null) ? 0 : getBidAmount().hashCode());
        result = prime * result + ((getBiddersCount() == null) ? 0 : getBiddersCount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getAnnounceTime() == null) ? 0 : getAnnounceTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid_copy
     *
     * @mbggenerated Mon Jun 11 21:04:01 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gamePropertyId=").append(gamePropertyId);
        sb.append(", owner=").append(owner);
        sb.append(", auctionStart=").append(auctionStart);
        sb.append(", auctionEnd=").append(auctionEnd);
        sb.append(", increaseLadder=").append(increaseLadder);
        sb.append(", bidStart=").append(bidStart);
        sb.append(", bidAmount=").append(bidAmount);
        sb.append(", biddersCount=").append(biddersCount);
        sb.append(", status=").append(status);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", announceTime=").append(announceTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append("]");
        return sb.toString();
    }
}