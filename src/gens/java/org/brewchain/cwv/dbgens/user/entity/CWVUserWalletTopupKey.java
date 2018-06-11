package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserWalletTopupKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet_topup.topup_id
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
     */
    private Integer topupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet_topup.topup_id
     *
     * @return the value of cwv_user_wallet_topup.topup_id
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
     */
    public Integer getTopupId() {
        return topupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet_topup.topup_id
     *
     * @param topupId the value for cwv_user_wallet_topup.topup_id
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
     */
    public void setTopupId(Integer topupId) {
        this.topupId = topupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
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
        CWVUserWalletTopupKey other = (CWVUserWalletTopupKey) that;
        return (this.getTopupId() == null ? other.getTopupId() == null : this.getTopupId().equals(other.getTopupId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTopupId() == null) ? 0 : getTopupId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet_topup
     *
     * @mbggenerated Mon Jun 11 21:03:59 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", topupId=").append(topupId);
        sb.append("]");
        return sb.toString();
    }
}