package org.brewchain.cwv.dbgens.market.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketAuctionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_auction.auction_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Integer auctionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_auction.auction_id
     *
     * @return the value of cwv_market_auction.auction_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Integer getAuctionId() {
        return auctionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_auction.auction_id
     *
     * @param auctionId the value for cwv_market_auction.auction_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
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
        CWVMarketAuctionKey other = (CWVMarketAuctionKey) that;
        return (this.getAuctionId() == null ? other.getAuctionId() == null : this.getAuctionId().equals(other.getAuctionId()));
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
        sb.append(", auctionId=").append(auctionId);
        sb.append("]");
        return sb.toString();
    }
}