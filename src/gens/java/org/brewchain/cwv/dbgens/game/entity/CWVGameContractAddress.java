package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_contract_address")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameContractAddress extends CWVGameContractAddressKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    private String contractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_type
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    private String contractType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_state
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    private String contractState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_address
     *
     * @return the value of cwv_game_contract_address.contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.contract_address
     *
     * @param contractAddress the value for cwv_game_contract_address.contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_type
     *
     * @return the value of cwv_game_contract_address.contract_type
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.contract_type
     *
     * @param contractType the value for cwv_game_contract_address.contract_type
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_state
     *
     * @return the value of cwv_game_contract_address.contract_state
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.contract_state
     *
     * @param contractState the value for cwv_game_contract_address.contract_state
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    public void setContractState(String contractState) {
        this.contractState = contractState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
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
        CWVGameContractAddress other = (CWVGameContractAddress) that;
        return (this.getContractAddressId() == null ? other.getContractAddressId() == null : this.getContractAddressId().equals(other.getContractAddressId()))
            && (this.getContractAddress() == null ? other.getContractAddress() == null : this.getContractAddress().equals(other.getContractAddress()))
            && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
            && (this.getContractState() == null ? other.getContractState() == null : this.getContractState().equals(other.getContractState()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractAddressId() == null) ? 0 : getContractAddressId().hashCode());
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getContractState() == null) ? 0 : getContractState().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Tue Jun 12 17:26:21 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contractAddress=").append(contractAddress);
        sb.append(", contractType=").append(contractType);
        sb.append(", contractState=").append(contractState);
        sb.append("]");
        return sb.toString();
    }
}