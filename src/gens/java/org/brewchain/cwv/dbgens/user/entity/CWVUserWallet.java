package org.brewchain.cwv.dbgens.user.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_wallet")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserWallet extends CWVUserWalletKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.user_id
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.coin_type
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Byte coinType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.account
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.topup_balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private BigDecimal topupBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.draw_count
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Integer drawCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.draw_count_history
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Integer drawCountHistory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.draw_count_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Integer drawCountRecord;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.income_ordinary
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private BigDecimal incomeOrdinary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.income_typical
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private BigDecimal incomeTypical;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.income_functional
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private BigDecimal incomeFunctional;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.update_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.create_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.coin_icon
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    private String coinIcon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.user_id
     *
     * @return the value of cwv_user_wallet.user_id
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.user_id
     *
     * @param userId the value for cwv_user_wallet.user_id
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.coin_type
     *
     * @return the value of cwv_user_wallet.coin_type
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Byte getCoinType() {
        return coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.coin_type
     *
     * @param coinType the value for cwv_user_wallet.coin_type
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setCoinType(Byte coinType) {
        this.coinType = coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.account
     *
     * @return the value of cwv_user_wallet.account
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.account
     *
     * @param account the value for cwv_user_wallet.account
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.balance
     *
     * @return the value of cwv_user_wallet.balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.balance
     *
     * @param balance the value for cwv_user_wallet.balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.topup_balance
     *
     * @return the value of cwv_user_wallet.topup_balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public BigDecimal getTopupBalance() {
        return topupBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.topup_balance
     *
     * @param topupBalance the value for cwv_user_wallet.topup_balance
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setTopupBalance(BigDecimal topupBalance) {
        this.topupBalance = topupBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.draw_count
     *
     * @return the value of cwv_user_wallet.draw_count
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Integer getDrawCount() {
        return drawCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.draw_count
     *
     * @param drawCount the value for cwv_user_wallet.draw_count
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setDrawCount(Integer drawCount) {
        this.drawCount = drawCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.draw_count_history
     *
     * @return the value of cwv_user_wallet.draw_count_history
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Integer getDrawCountHistory() {
        return drawCountHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.draw_count_history
     *
     * @param drawCountHistory the value for cwv_user_wallet.draw_count_history
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setDrawCountHistory(Integer drawCountHistory) {
        this.drawCountHistory = drawCountHistory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.draw_count_record
     *
     * @return the value of cwv_user_wallet.draw_count_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Integer getDrawCountRecord() {
        return drawCountRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.draw_count_record
     *
     * @param drawCountRecord the value for cwv_user_wallet.draw_count_record
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setDrawCountRecord(Integer drawCountRecord) {
        this.drawCountRecord = drawCountRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.income_ordinary
     *
     * @return the value of cwv_user_wallet.income_ordinary
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public BigDecimal getIncomeOrdinary() {
        return incomeOrdinary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.income_ordinary
     *
     * @param incomeOrdinary the value for cwv_user_wallet.income_ordinary
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setIncomeOrdinary(BigDecimal incomeOrdinary) {
        this.incomeOrdinary = incomeOrdinary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.income_typical
     *
     * @return the value of cwv_user_wallet.income_typical
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public BigDecimal getIncomeTypical() {
        return incomeTypical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.income_typical
     *
     * @param incomeTypical the value for cwv_user_wallet.income_typical
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setIncomeTypical(BigDecimal incomeTypical) {
        this.incomeTypical = incomeTypical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.income_functional
     *
     * @return the value of cwv_user_wallet.income_functional
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public BigDecimal getIncomeFunctional() {
        return incomeFunctional;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.income_functional
     *
     * @param incomeFunctional the value for cwv_user_wallet.income_functional
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setIncomeFunctional(BigDecimal incomeFunctional) {
        this.incomeFunctional = incomeFunctional;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.update_time
     *
     * @return the value of cwv_user_wallet.update_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.update_time
     *
     * @param updateTime the value for cwv_user_wallet.update_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.create_time
     *
     * @return the value of cwv_user_wallet.create_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.create_time
     *
     * @param createTime the value for cwv_user_wallet.create_time
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.coin_icon
     *
     * @return the value of cwv_user_wallet.coin_icon
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public String getCoinIcon() {
        return coinIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.coin_icon
     *
     * @param coinIcon the value for cwv_user_wallet.coin_icon
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    public void setCoinIcon(String coinIcon) {
        this.coinIcon = coinIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
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
        CWVUserWallet other = (CWVUserWallet) that;
        return (this.getWalletId() == null ? other.getWalletId() == null : this.getWalletId().equals(other.getWalletId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCoinType() == null ? other.getCoinType() == null : this.getCoinType().equals(other.getCoinType()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getTopupBalance() == null ? other.getTopupBalance() == null : this.getTopupBalance().equals(other.getTopupBalance()))
            && (this.getDrawCount() == null ? other.getDrawCount() == null : this.getDrawCount().equals(other.getDrawCount()))
            && (this.getDrawCountHistory() == null ? other.getDrawCountHistory() == null : this.getDrawCountHistory().equals(other.getDrawCountHistory()))
            && (this.getDrawCountRecord() == null ? other.getDrawCountRecord() == null : this.getDrawCountRecord().equals(other.getDrawCountRecord()))
            && (this.getIncomeOrdinary() == null ? other.getIncomeOrdinary() == null : this.getIncomeOrdinary().equals(other.getIncomeOrdinary()))
            && (this.getIncomeTypical() == null ? other.getIncomeTypical() == null : this.getIncomeTypical().equals(other.getIncomeTypical()))
            && (this.getIncomeFunctional() == null ? other.getIncomeFunctional() == null : this.getIncomeFunctional().equals(other.getIncomeFunctional()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCoinIcon() == null ? other.getCoinIcon() == null : this.getCoinIcon().equals(other.getCoinIcon()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWalletId() == null) ? 0 : getWalletId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCoinType() == null) ? 0 : getCoinType().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getTopupBalance() == null) ? 0 : getTopupBalance().hashCode());
        result = prime * result + ((getDrawCount() == null) ? 0 : getDrawCount().hashCode());
        result = prime * result + ((getDrawCountHistory() == null) ? 0 : getDrawCountHistory().hashCode());
        result = prime * result + ((getDrawCountRecord() == null) ? 0 : getDrawCountRecord().hashCode());
        result = prime * result + ((getIncomeOrdinary() == null) ? 0 : getIncomeOrdinary().hashCode());
        result = prime * result + ((getIncomeTypical() == null) ? 0 : getIncomeTypical().hashCode());
        result = prime * result + ((getIncomeFunctional() == null) ? 0 : getIncomeFunctional().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCoinIcon() == null) ? 0 : getCoinIcon().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Wed Jun 13 22:15:07 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", coinType=").append(coinType);
        sb.append(", account=").append(account);
        sb.append(", balance=").append(balance);
        sb.append(", topupBalance=").append(topupBalance);
        sb.append(", drawCount=").append(drawCount);
        sb.append(", drawCountHistory=").append(drawCountHistory);
        sb.append(", drawCountRecord=").append(drawCountRecord);
        sb.append(", incomeOrdinary=").append(incomeOrdinary);
        sb.append(", incomeTypical=").append(incomeTypical);
        sb.append(", incomeFunctional=").append(incomeFunctional);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", coinIcon=").append(coinIcon);
        sb.append("]");
        return sb.toString();
    }
}