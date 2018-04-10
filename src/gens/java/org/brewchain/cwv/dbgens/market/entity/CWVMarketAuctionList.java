package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_auction_list")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketAuctionList extends CWVMarketAuctionListKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private Integer bidId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.nick_name
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private Date nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.bid_price
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private Date bidPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.user_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private BigDecimal userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.create_time
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction_list.create_user
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private String createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.bid_id
     *
     * @return the value of cwv_market_auction_list.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public Integer getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.bid_id
     *
     * @param bidId the value for cwv_market_auction_list.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.nick_name
     *
     * @return the value of cwv_market_auction_list.nick_name
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public Date getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.nick_name
     *
     * @param nickName the value for cwv_market_auction_list.nick_name
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setNickName(Date nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.bid_price
     *
     * @return the value of cwv_market_auction_list.bid_price
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public Date getBidPrice() {
        return bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.bid_price
     *
     * @param bidPrice the value for cwv_market_auction_list.bid_price
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setBidPrice(Date bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.user_id
     *
     * @return the value of cwv_market_auction_list.user_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.user_id
     *
     * @param userId the value for cwv_market_auction_list.user_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.create_time
     *
     * @return the value of cwv_market_auction_list.create_time
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.create_time
     *
     * @param createTime the value for cwv_market_auction_list.create_time
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction_list.create_user
     *
     * @return the value of cwv_market_auction_list.create_user
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction_list.create_user
     *
     * @param createUser the value for cwv_market_auction_list.create_user
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction_list
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
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
        CWVMarketAuctionList other = (CWVMarketAuctionList) that;
        return (this.getAuctionId() == null ? other.getAuctionId() == null : this.getAuctionId().equals(other.getAuctionId()))
            && (this.getBidId() == null ? other.getBidId() == null : this.getBidId().equals(other.getBidId()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getBidPrice() == null ? other.getBidPrice() == null : this.getBidPrice().equals(other.getBidPrice()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction_list
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuctionId() == null) ? 0 : getAuctionId().hashCode());
        result = prime * result + ((getBidId() == null) ? 0 : getBidId().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_auction_list
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bidId=").append(bidId);
        sb.append(", nickName=").append(nickName);
        sb.append(", bidPrice=").append(bidPrice);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append("]");
        return sb.toString();
    }
}