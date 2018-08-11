package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserRechargeAddressKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_recharge_address.recharge_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
     */
    private Integer rechargeAddressId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_recharge_address.recharge_address_id
     *
     * @return the value of cwv_user_recharge_address.recharge_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
     */
    public Integer getRechargeAddressId() {
        return rechargeAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_recharge_address.recharge_address_id
     *
     * @param rechargeAddressId the value for cwv_user_recharge_address.recharge_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
     */
    public void setRechargeAddressId(Integer rechargeAddressId) {
        this.rechargeAddressId = rechargeAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
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
        CWVUserRechargeAddressKey other = (CWVUserRechargeAddressKey) that;
        return (this.getRechargeAddressId() == null ? other.getRechargeAddressId() == null : this.getRechargeAddressId().equals(other.getRechargeAddressId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRechargeAddressId() == null) ? 0 : getRechargeAddressId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_recharge_address
     *
     * @mbggenerated Sat Aug 11 16:34:12 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rechargeAddressId=").append(rechargeAddressId);
        sb.append("]");
        return sb.toString();
    }
}