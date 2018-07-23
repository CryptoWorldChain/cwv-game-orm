package org.brewchain.cwv.dbgens.user.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_trade_pwd")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserTradePwd extends CWVUserTradePwdKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_trade_pwd.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_trade_pwd.trade_password
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    private String tradePassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_trade_pwd.created_time
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_trade_pwd.user_id
     *
     * @return the value of cwv_user_trade_pwd.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_trade_pwd.user_id
     *
     * @param userId the value for cwv_user_trade_pwd.user_id
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_trade_pwd.trade_password
     *
     * @return the value of cwv_user_trade_pwd.trade_password
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public String getTradePassword() {
        return tradePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_trade_pwd.trade_password
     *
     * @param tradePassword the value for cwv_user_trade_pwd.trade_password
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_trade_pwd.created_time
     *
     * @return the value of cwv_user_trade_pwd.created_time
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_trade_pwd.created_time
     *
     * @param createdTime the value for cwv_user_trade_pwd.created_time
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
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
        CWVUserTradePwd other = (CWVUserTradePwd) that;
        return (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTradePassword() == null ? other.getTradePassword() == null : this.getTradePassword().equals(other.getTradePassword()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTradePassword() == null) ? 0 : getTradePassword().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Mon Jul 23 15:21:56 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", tradePassword=").append(tradePassword);
        sb.append(", createdTime=").append(createdTime);
        sb.append("]");
        return sb.toString();
    }
}