package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserTradePwdKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_trade_pwd.trade_id
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
     */
    private Integer tradeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_trade_pwd.trade_id
     *
     * @return the value of cwv_user_trade_pwd.trade_id
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
     */
    public Integer getTradeId() {
        return tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_trade_pwd.trade_id
     *
     * @param tradeId the value for cwv_user_trade_pwd.trade_id
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
     */
    public void setTradeId(Integer tradeId) {
        this.tradeId = tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
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
        CWVUserTradePwdKey other = (CWVUserTradePwdKey) that;
        return (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_trade_pwd
     *
     * @mbggenerated Sat Jul 14 19:26:59 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tradeId=").append(tradeId);
        sb.append("]");
        return sb.toString();
    }
}