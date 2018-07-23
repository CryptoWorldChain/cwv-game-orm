package org.brewchain.cwv.dbgens.market.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_draw")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketDraw extends CWVMarketDrawKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainRandom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_status_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Byte chainStatusRandom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_trans_hash_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainTransHashRandom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainContract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.user_address
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String userAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.property_token
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyToken;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.property_id
     *
     * @return the value of cwv_market_draw.property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.property_id
     *
     * @param propertyId the value for cwv_market_draw.property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.user_id
     *
     * @return the value of cwv_market_draw.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.user_id
     *
     * @param userId the value for cwv_market_draw.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.create_time
     *
     * @return the value of cwv_market_draw.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.create_time
     *
     * @param createTime the value for cwv_market_draw.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_random
     *
     * @return the value of cwv_market_draw.chain_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainRandom() {
        return chainRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_random
     *
     * @param chainRandom the value for cwv_market_draw.chain_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainRandom(String chainRandom) {
        this.chainRandom = chainRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_status_random
     *
     * @return the value of cwv_market_draw.chain_status_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Byte getChainStatusRandom() {
        return chainStatusRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_status_random
     *
     * @param chainStatusRandom the value for cwv_market_draw.chain_status_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainStatusRandom(Byte chainStatusRandom) {
        this.chainStatusRandom = chainStatusRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_trans_hash_random
     *
     * @return the value of cwv_market_draw.chain_trans_hash_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainTransHashRandom() {
        return chainTransHashRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_trans_hash_random
     *
     * @param chainTransHashRandom the value for cwv_market_draw.chain_trans_hash_random
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainTransHashRandom(String chainTransHashRandom) {
        this.chainTransHashRandom = chainTransHashRandom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_status
     *
     * @return the value of cwv_market_draw.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_status
     *
     * @param chainStatus the value for cwv_market_draw.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_trans_hash
     *
     * @return the value of cwv_market_draw.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_market_draw.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.chain_contract
     *
     * @return the value of cwv_market_draw.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainContract() {
        return chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.chain_contract
     *
     * @param chainContract the value for cwv_market_draw.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainContract(String chainContract) {
        this.chainContract = chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.user_address
     *
     * @return the value of cwv_market_draw.user_address
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.user_address
     *
     * @param userAddress the value for cwv_market_draw.user_address
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.property_token
     *
     * @return the value of cwv_market_draw.property_token
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyToken() {
        return propertyToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.property_token
     *
     * @param propertyToken the value for cwv_market_draw.property_token
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyToken(String propertyToken) {
        this.propertyToken = propertyToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
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
        CWVMarketDraw other = (CWVMarketDraw) that;
        return (this.getDrawId() == null ? other.getDrawId() == null : this.getDrawId().equals(other.getDrawId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getChainRandom() == null ? other.getChainRandom() == null : this.getChainRandom().equals(other.getChainRandom()))
            && (this.getChainStatusRandom() == null ? other.getChainStatusRandom() == null : this.getChainStatusRandom().equals(other.getChainStatusRandom()))
            && (this.getChainTransHashRandom() == null ? other.getChainTransHashRandom() == null : this.getChainTransHashRandom().equals(other.getChainTransHashRandom()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getChainContract() == null ? other.getChainContract() == null : this.getChainContract().equals(other.getChainContract()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getPropertyToken() == null ? other.getPropertyToken() == null : this.getPropertyToken().equals(other.getPropertyToken()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrawId() == null) ? 0 : getDrawId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getChainRandom() == null) ? 0 : getChainRandom().hashCode());
        result = prime * result + ((getChainStatusRandom() == null) ? 0 : getChainStatusRandom().hashCode());
        result = prime * result + ((getChainTransHashRandom() == null) ? 0 : getChainTransHashRandom().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getChainContract() == null) ? 0 : getChainContract().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getPropertyToken() == null) ? 0 : getPropertyToken().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", chainRandom=").append(chainRandom);
        sb.append(", chainStatusRandom=").append(chainStatusRandom);
        sb.append(", chainTransHashRandom=").append(chainTransHashRandom);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", chainContract=").append(chainContract);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", propertyToken=").append(propertyToken);
        sb.append("]");
        return sb.toString();
    }
}