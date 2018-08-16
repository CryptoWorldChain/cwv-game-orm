package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_exchange_buy")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketExchangeBuy extends CWVMarketExchangeBuyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.amount
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.buyer_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String buyerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.seller_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String sellerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_trans_hash
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.property_token
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String propertyToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_status_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private Byte chainStatusGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_trans_hash_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String chainTransHashGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_status_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private Byte chainStatusRollback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_buy.chain_trans_hash_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    private String chainTransHashRollback;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.amount
     *
     * @return the value of cwv_market_exchange_buy.amount
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.amount
     *
     * @param amount the value for cwv_market_exchange_buy.amount
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.buyer_address
     *
     * @return the value of cwv_market_exchange_buy.buyer_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.buyer_address
     *
     * @param buyerAddress the value for cwv_market_exchange_buy.buyer_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.seller_address
     *
     * @return the value of cwv_market_exchange_buy.seller_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getSellerAddress() {
        return sellerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.seller_address
     *
     * @param sellerAddress the value for cwv_market_exchange_buy.seller_address
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.status
     *
     * @return the value of cwv_market_exchange_buy.status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.status
     *
     * @param status the value for cwv_market_exchange_buy.status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_status
     *
     * @return the value of cwv_market_exchange_buy.chain_status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_status
     *
     * @param chainStatus the value for cwv_market_exchange_buy.chain_status
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_trans_hash
     *
     * @return the value of cwv_market_exchange_buy.chain_trans_hash
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_market_exchange_buy.chain_trans_hash
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.property_token
     *
     * @return the value of cwv_market_exchange_buy.property_token
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getPropertyToken() {
        return propertyToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.property_token
     *
     * @param propertyToken the value for cwv_market_exchange_buy.property_token
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setPropertyToken(String propertyToken) {
        this.propertyToken = propertyToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_status_group
     *
     * @return the value of cwv_market_exchange_buy.chain_status_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public Byte getChainStatusGroup() {
        return chainStatusGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_status_group
     *
     * @param chainStatusGroup the value for cwv_market_exchange_buy.chain_status_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainStatusGroup(Byte chainStatusGroup) {
        this.chainStatusGroup = chainStatusGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_trans_hash_group
     *
     * @return the value of cwv_market_exchange_buy.chain_trans_hash_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getChainTransHashGroup() {
        return chainTransHashGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_trans_hash_group
     *
     * @param chainTransHashGroup the value for cwv_market_exchange_buy.chain_trans_hash_group
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainTransHashGroup(String chainTransHashGroup) {
        this.chainTransHashGroup = chainTransHashGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_status_rollback
     *
     * @return the value of cwv_market_exchange_buy.chain_status_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public Byte getChainStatusRollback() {
        return chainStatusRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_status_rollback
     *
     * @param chainStatusRollback the value for cwv_market_exchange_buy.chain_status_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainStatusRollback(Byte chainStatusRollback) {
        this.chainStatusRollback = chainStatusRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_buy.chain_trans_hash_rollback
     *
     * @return the value of cwv_market_exchange_buy.chain_trans_hash_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public String getChainTransHashRollback() {
        return chainTransHashRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_buy.chain_trans_hash_rollback
     *
     * @param chainTransHashRollback the value for cwv_market_exchange_buy.chain_trans_hash_rollback
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    public void setChainTransHashRollback(String chainTransHashRollback) {
        this.chainTransHashRollback = chainTransHashRollback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
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
        CWVMarketExchangeBuy other = (CWVMarketExchangeBuy) that;
        return (this.getExchangeId() == null ? other.getExchangeId() == null : this.getExchangeId().equals(other.getExchangeId()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getBuyerAddress() == null ? other.getBuyerAddress() == null : this.getBuyerAddress().equals(other.getBuyerAddress()))
            && (this.getSellerAddress() == null ? other.getSellerAddress() == null : this.getSellerAddress().equals(other.getSellerAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getPropertyToken() == null ? other.getPropertyToken() == null : this.getPropertyToken().equals(other.getPropertyToken()))
            && (this.getChainStatusGroup() == null ? other.getChainStatusGroup() == null : this.getChainStatusGroup().equals(other.getChainStatusGroup()))
            && (this.getChainTransHashGroup() == null ? other.getChainTransHashGroup() == null : this.getChainTransHashGroup().equals(other.getChainTransHashGroup()))
            && (this.getChainStatusRollback() == null ? other.getChainStatusRollback() == null : this.getChainStatusRollback().equals(other.getChainStatusRollback()))
            && (this.getChainTransHashRollback() == null ? other.getChainTransHashRollback() == null : this.getChainTransHashRollback().equals(other.getChainTransHashRollback()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExchangeId() == null) ? 0 : getExchangeId().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getBuyerAddress() == null) ? 0 : getBuyerAddress().hashCode());
        result = prime * result + ((getSellerAddress() == null) ? 0 : getSellerAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getPropertyToken() == null) ? 0 : getPropertyToken().hashCode());
        result = prime * result + ((getChainStatusGroup() == null) ? 0 : getChainStatusGroup().hashCode());
        result = prime * result + ((getChainTransHashGroup() == null) ? 0 : getChainTransHashGroup().hashCode());
        result = prime * result + ((getChainStatusRollback() == null) ? 0 : getChainStatusRollback().hashCode());
        result = prime * result + ((getChainTransHashRollback() == null) ? 0 : getChainTransHashRollback().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_buy
     *
     * @mbggenerated Thu Aug 16 19:29:43 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", amount=").append(amount);
        sb.append(", buyerAddress=").append(buyerAddress);
        sb.append(", sellerAddress=").append(sellerAddress);
        sb.append(", status=").append(status);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", propertyToken=").append(propertyToken);
        sb.append(", chainStatusGroup=").append(chainStatusGroup);
        sb.append(", chainTransHashGroup=").append(chainTransHashGroup);
        sb.append(", chainStatusRollback=").append(chainStatusRollback);
        sb.append(", chainTransHashRollback=").append(chainTransHashRollback);
        sb.append("]");
        return sb.toString();
    }
}