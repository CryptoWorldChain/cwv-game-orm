package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameContractAddressKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
     */
    private Integer contractAddressId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_address_id
     *
     * @return the value of cwv_game_contract_address.contract_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
     */
    public Integer getContractAddressId() {
        return contractAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.contract_address_id
     *
     * @param contractAddressId the value for cwv_game_contract_address.contract_address_id
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
     */
    public void setContractAddressId(Integer contractAddressId) {
        this.contractAddressId = contractAddressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
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
        CWVGameContractAddressKey other = (CWVGameContractAddressKey) that;
        return (this.getContractAddressId() == null ? other.getContractAddressId() == null : this.getContractAddressId().equals(other.getContractAddressId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractAddressId() == null) ? 0 : getContractAddressId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Sat Aug 11 16:34:08 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contractAddressId=").append(contractAddressId);
        sb.append("]");
        return sb.toString();
    }
}