package org.brewchain.cwv.dbgens.market.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketBidKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    private Integer bidId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.bid_id
     *
     * @return the value of cwv_market_bid.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public Integer getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.bid_id
     *
     * @param bidId the value for cwv_market_bid.bid_id
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
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
        CWVMarketBidKey other = (CWVMarketBidKey) that;
        return (this.getBidId() == null ? other.getBidId() == null : this.getBidId().equals(other.getBidId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Tue Apr 10 11:08:41 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBidId() == null) ? 0 : getBidId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
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
        sb.append("]");
        return sb.toString();
    }
}