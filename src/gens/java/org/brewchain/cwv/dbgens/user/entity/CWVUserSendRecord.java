package org.brewchain.cwv.dbgens.user.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_send_record")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserSendRecord extends CWVUserSendRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.coin_type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Byte coinType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.input_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private String inputAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.out_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private String outAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.amount
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.tx_hash
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    private String txHash;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.user_id
     *
     * @return the value of cwv_user_send_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.user_id
     *
     * @param userId the value for cwv_user_send_record.user_id
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.coin_type
     *
     * @return the value of cwv_user_send_record.coin_type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Byte getCoinType() {
        return coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.coin_type
     *
     * @param coinType the value for cwv_user_send_record.coin_type
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setCoinType(Byte coinType) {
        this.coinType = coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.input_address
     *
     * @return the value of cwv_user_send_record.input_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public String getInputAddress() {
        return inputAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.input_address
     *
     * @param inputAddress the value for cwv_user_send_record.input_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setInputAddress(String inputAddress) {
        this.inputAddress = inputAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.out_address
     *
     * @return the value of cwv_user_send_record.out_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public String getOutAddress() {
        return outAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.out_address
     *
     * @param outAddress the value for cwv_user_send_record.out_address
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setOutAddress(String outAddress) {
        this.outAddress = outAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.amount
     *
     * @return the value of cwv_user_send_record.amount
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.amount
     *
     * @param amount the value for cwv_user_send_record.amount
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.status
     *
     * @return the value of cwv_user_send_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.status
     *
     * @param status the value for cwv_user_send_record.status
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.create_time
     *
     * @return the value of cwv_user_send_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.create_time
     *
     * @param createTime the value for cwv_user_send_record.create_time
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.tx_hash
     *
     * @return the value of cwv_user_send_record.tx_hash
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.tx_hash
     *
     * @param txHash the value for cwv_user_send_record.tx_hash
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
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
        CWVUserSendRecord other = (CWVUserSendRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCoinType() == null ? other.getCoinType() == null : this.getCoinType().equals(other.getCoinType()))
            && (this.getInputAddress() == null ? other.getInputAddress() == null : this.getInputAddress().equals(other.getInputAddress()))
            && (this.getOutAddress() == null ? other.getOutAddress() == null : this.getOutAddress().equals(other.getOutAddress()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getTxHash() == null ? other.getTxHash() == null : this.getTxHash().equals(other.getTxHash()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Thu Aug 23 16:16:50 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCoinType() == null) ? 0 : getCoinType().hashCode());
        result = prime * result + ((getInputAddress() == null) ? 0 : getInputAddress().hashCode());
        result = prime * result + ((getOutAddress() == null) ? 0 : getOutAddress().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getTxHash() == null) ? 0 : getTxHash().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
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
        sb.append(", coinType=").append(coinType);
        sb.append(", inputAddress=").append(inputAddress);
        sb.append(", outAddress=").append(outAddress);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", txHash=").append(txHash);
        sb.append("]");
        return sb.toString();
    }
}