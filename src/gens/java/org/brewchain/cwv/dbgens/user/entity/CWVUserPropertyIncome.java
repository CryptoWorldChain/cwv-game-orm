package org.brewchain.cwv.dbgens.user.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_property_income")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserPropertyIncome extends CWVUserPropertyIncomeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.type
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.chain_status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.chain_trans_hash
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.chain_status_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Byte chainStatusClaim;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.chain_trans_hash_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private String chainTransHashClaim;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.amount
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.master
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Integer master;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.start_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.end_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.user_id
     *
     * @return the value of cwv_user_property_income.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.user_id
     *
     * @param userId the value for cwv_user_property_income.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.type
     *
     * @return the value of cwv_user_property_income.type
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.type
     *
     * @param type the value for cwv_user_property_income.type
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.property_id
     *
     * @return the value of cwv_user_property_income.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.property_id
     *
     * @param propertyId the value for cwv_user_property_income.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.chain_status
     *
     * @return the value of cwv_user_property_income.chain_status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.chain_status
     *
     * @param chainStatus the value for cwv_user_property_income.chain_status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.chain_trans_hash
     *
     * @return the value of cwv_user_property_income.chain_trans_hash
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_user_property_income.chain_trans_hash
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.chain_status_claim
     *
     * @return the value of cwv_user_property_income.chain_status_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Byte getChainStatusClaim() {
        return chainStatusClaim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.chain_status_claim
     *
     * @param chainStatusClaim the value for cwv_user_property_income.chain_status_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setChainStatusClaim(Byte chainStatusClaim) {
        this.chainStatusClaim = chainStatusClaim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.chain_trans_hash_claim
     *
     * @return the value of cwv_user_property_income.chain_trans_hash_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public String getChainTransHashClaim() {
        return chainTransHashClaim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.chain_trans_hash_claim
     *
     * @param chainTransHashClaim the value for cwv_user_property_income.chain_trans_hash_claim
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setChainTransHashClaim(String chainTransHashClaim) {
        this.chainTransHashClaim = chainTransHashClaim;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.amount
     *
     * @return the value of cwv_user_property_income.amount
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.amount
     *
     * @param amount the value for cwv_user_property_income.amount
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.status
     *
     * @return the value of cwv_user_property_income.status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.status
     *
     * @param status the value for cwv_user_property_income.status
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.master
     *
     * @return the value of cwv_user_property_income.master
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Integer getMaster() {
        return master;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.master
     *
     * @param master the value for cwv_user_property_income.master
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setMaster(Integer master) {
        this.master = master;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.start_time
     *
     * @return the value of cwv_user_property_income.start_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.start_time
     *
     * @param startTime the value for cwv_user_property_income.start_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.end_time
     *
     * @return the value of cwv_user_property_income.end_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.end_time
     *
     * @param endTime the value for cwv_user_property_income.end_time
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
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
        CWVUserPropertyIncome other = (CWVUserPropertyIncome) that;
        return (this.getIncomeId() == null ? other.getIncomeId() == null : this.getIncomeId().equals(other.getIncomeId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getChainStatusClaim() == null ? other.getChainStatusClaim() == null : this.getChainStatusClaim().equals(other.getChainStatusClaim()))
            && (this.getChainTransHashClaim() == null ? other.getChainTransHashClaim() == null : this.getChainTransHashClaim().equals(other.getChainTransHashClaim()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getMaster() == null ? other.getMaster() == null : this.getMaster().equals(other.getMaster()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeId() == null) ? 0 : getIncomeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getChainStatusClaim() == null) ? 0 : getChainStatusClaim().hashCode());
        result = prime * result + ((getChainTransHashClaim() == null) ? 0 : getChainTransHashClaim().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getMaster() == null) ? 0 : getMaster().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Jul 25 18:19:03 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", propertyId=").append(propertyId);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", chainStatusClaim=").append(chainStatusClaim);
        sb.append(", chainTransHashClaim=").append(chainTransHashClaim);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", master=").append(master);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}