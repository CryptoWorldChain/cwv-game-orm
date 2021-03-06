package org.brewchain.cwv.dbgens.user.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_transaction_record")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserTransactionRecord extends CWVUserTransactionRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.market_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Integer marketId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.detail
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.gain_cost
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private BigDecimal gainCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.create_user
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_transaction_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.user_id
     *
     * @return the value of cwv_user_transaction_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.user_id
     *
     * @param userId the value for cwv_user_transaction_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.market_id
     *
     * @return the value of cwv_user_transaction_record.market_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Integer getMarketId() {
        return marketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.market_id
     *
     * @param marketId the value for cwv_user_transaction_record.market_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setMarketId(Integer marketId) {
        this.marketId = marketId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.type
     *
     * @return the value of cwv_user_transaction_record.type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.type
     *
     * @param type the value for cwv_user_transaction_record.type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.detail
     *
     * @return the value of cwv_user_transaction_record.detail
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.detail
     *
     * @param detail the value for cwv_user_transaction_record.detail
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.gain_cost
     *
     * @return the value of cwv_user_transaction_record.gain_cost
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public BigDecimal getGainCost() {
        return gainCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.gain_cost
     *
     * @param gainCost the value for cwv_user_transaction_record.gain_cost
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setGainCost(BigDecimal gainCost) {
        this.gainCost = gainCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.create_time
     *
     * @return the value of cwv_user_transaction_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.create_time
     *
     * @param createTime the value for cwv_user_transaction_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.create_user
     *
     * @return the value of cwv_user_transaction_record.create_user
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.create_user
     *
     * @param createUser the value for cwv_user_transaction_record.create_user
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_transaction_record.status
     *
     * @return the value of cwv_user_transaction_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_transaction_record.status
     *
     * @param status the value for cwv_user_transaction_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
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
        CWVUserTransactionRecord other = (CWVUserTransactionRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMarketId() == null ? other.getMarketId() == null : this.getMarketId().equals(other.getMarketId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getGainCost() == null ? other.getGainCost() == null : this.getGainCost().equals(other.getGainCost()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMarketId() == null) ? 0 : getMarketId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getGainCost() == null) ? 0 : getGainCost().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_transaction_record
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", marketId=").append(marketId);
        sb.append(", type=").append(type);
        sb.append(", detail=").append(detail);
        sb.append(", gainCost=").append(gainCost);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}