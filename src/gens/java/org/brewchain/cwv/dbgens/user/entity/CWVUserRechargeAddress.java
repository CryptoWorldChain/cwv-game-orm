package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_user_recharge_address")
@AllArgsConstructor
@NoArgsConstructor
public class CWVUserRechargeAddress extends CWVUserRechargeAddressKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_recharge_address.recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    private String rechargeAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_recharge_address.coin_type
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    private String coinType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_recharge_address.recharge_address
     *
     * @return the value of cwv_user_recharge_address.recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    public String getRechargeAddress() {
        return rechargeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_recharge_address.recharge_address
     *
     * @param rechargeAddress the value for cwv_user_recharge_address.recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    public void setRechargeAddress(String rechargeAddress) {
        this.rechargeAddress = rechargeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_recharge_address.coin_type
     *
     * @return the value of cwv_user_recharge_address.coin_type
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    public String getCoinType() {
        return coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_recharge_address.coin_type
     *
     * @param coinType the value for cwv_user_recharge_address.coin_type
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
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
        CWVUserRechargeAddress other = (CWVUserRechargeAddress) that;
        return (this.getRechargeAddressId() == null ? other.getRechargeAddressId() == null : this.getRechargeAddressId().equals(other.getRechargeAddressId()))
            && (this.getRechargeAddress() == null ? other.getRechargeAddress() == null : this.getRechargeAddress().equals(other.getRechargeAddress()))
            && (this.getCoinType() == null ? other.getCoinType() == null : this.getCoinType().equals(other.getCoinType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRechargeAddressId() == null) ? 0 : getRechargeAddressId().hashCode());
        result = prime * result + ((getRechargeAddress() == null) ? 0 : getRechargeAddress().hashCode());
        result = prime * result + ((getCoinType() == null) ? 0 : getCoinType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Jul 07 15:07:33 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rechargeAddress=").append(rechargeAddress);
        sb.append(", coinType=").append(coinType);
        sb.append("]");
        return sb.toString();
    }
}