package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserWalletKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_wallet.wallet_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    private Integer walletId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_wallet.wallet_id
     *
     * @return the value of cwv_user_wallet.wallet_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    public Integer getWalletId() {
        return walletId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_wallet.wallet_id
     *
     * @param walletId the value for cwv_user_wallet.wallet_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
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
        CWVUserWalletKey other = (CWVUserWalletKey) that;
        return (this.getWalletId() == null ? other.getWalletId() == null : this.getWalletId().equals(other.getWalletId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWalletId() == null) ? 0 : getWalletId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_wallet
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", walletId=").append(walletId);
        sb.append("]");
        return sb.toString();
    }
}