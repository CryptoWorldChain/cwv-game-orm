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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.type
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private Byte type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.amount
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.status
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.start_time
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.end_time
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.user_id
     *
     * @return the value of cwv_user_property_income.user_id
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.amount
     *
     * @return the value of cwv_user_property_income.amount
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.start_time
     *
     * @return the value of cwv_user_property_income.start_time
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
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
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeId() == null) ? 0 : getIncomeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Wed Apr 11 21:16:30 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", amount=").append(amount);
        sb.append(", status=").append(status);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append("]");
        return sb.toString();
    }
}