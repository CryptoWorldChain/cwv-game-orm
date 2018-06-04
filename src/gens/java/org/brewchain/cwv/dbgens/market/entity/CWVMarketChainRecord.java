package org.brewchain.cwv.dbgens.market.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_chain_record")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketChainRecord extends CWVMarketChainRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.property_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.user_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.transaction_hash
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private String transactionHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.contract_address
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private String contractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.contract_type
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Byte contractType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.contract_subtype
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Short contractSubtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.status
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.create_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.update_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.property_id
     *
     * @return the value of cwv_market_chain_record.property_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.property_id
     *
     * @param propertyId the value for cwv_market_chain_record.property_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.user_id
     *
     * @return the value of cwv_market_chain_record.user_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.user_id
     *
     * @param userId the value for cwv_market_chain_record.user_id
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.transaction_hash
     *
     * @return the value of cwv_market_chain_record.transaction_hash
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public String getTransactionHash() {
        return transactionHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.transaction_hash
     *
     * @param transactionHash the value for cwv_market_chain_record.transaction_hash
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.contract_address
     *
     * @return the value of cwv_market_chain_record.contract_address
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.contract_address
     *
     * @param contractAddress the value for cwv_market_chain_record.contract_address
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.contract_type
     *
     * @return the value of cwv_market_chain_record.contract_type
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Byte getContractType() {
        return contractType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.contract_type
     *
     * @param contractType the value for cwv_market_chain_record.contract_type
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setContractType(Byte contractType) {
        this.contractType = contractType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.contract_subtype
     *
     * @return the value of cwv_market_chain_record.contract_subtype
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Short getContractSubtype() {
        return contractSubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.contract_subtype
     *
     * @param contractSubtype the value for cwv_market_chain_record.contract_subtype
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setContractSubtype(Short contractSubtype) {
        this.contractSubtype = contractSubtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.status
     *
     * @return the value of cwv_market_chain_record.status
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.status
     *
     * @param status the value for cwv_market_chain_record.status
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.create_time
     *
     * @return the value of cwv_market_chain_record.create_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.create_time
     *
     * @param createTime the value for cwv_market_chain_record.create_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.update_time
     *
     * @return the value of cwv_market_chain_record.update_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.update_time
     *
     * @param updateTime the value for cwv_market_chain_record.update_time
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
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
        CWVMarketChainRecord other = (CWVMarketChainRecord) that;
        return (this.getChainRecordId() == null ? other.getChainRecordId() == null : this.getChainRecordId().equals(other.getChainRecordId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTransactionHash() == null ? other.getTransactionHash() == null : this.getTransactionHash().equals(other.getTransactionHash()))
            && (this.getContractAddress() == null ? other.getContractAddress() == null : this.getContractAddress().equals(other.getContractAddress()))
            && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
            && (this.getContractSubtype() == null ? other.getContractSubtype() == null : this.getContractSubtype().equals(other.getContractSubtype()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChainRecordId() == null) ? 0 : getChainRecordId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTransactionHash() == null) ? 0 : getTransactionHash().hashCode());
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getContractSubtype() == null) ? 0 : getContractSubtype().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Mon Jun 04 22:59:16 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", userId=").append(userId);
        sb.append(", transactionHash=").append(transactionHash);
        sb.append(", contractAddress=").append(contractAddress);
        sb.append(", contractType=").append(contractType);
        sb.append(", contractSubtype=").append(contractSubtype);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}