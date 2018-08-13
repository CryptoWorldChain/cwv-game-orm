package org.brewchain.cwv.dbgens.game.entity;

import java.util.Date;
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private String contractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_type
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private String contractType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_state
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private String contractState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.contract_num
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private Integer contractNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.chain_status
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.chain_trans_hash
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_contract_address.create_time
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_address
     *
     * @return the value of cwv_game_contract_address.contract_address
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public void setContractState(String contractState) {
        this.contractState = contractState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.contract_num
     *
     * @return the value of cwv_game_contract_address.contract_num
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public Integer getContractNum() {
        return contractNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.contract_num
     *
     * @param contractNum the value for cwv_game_contract_address.contract_num
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public void setContractNum(Integer contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.chain_status
     *
     * @return the value of cwv_game_contract_address.chain_status
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.chain_status
     *
     * @param chainStatus the value for cwv_game_contract_address.chain_status
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.chain_trans_hash
     *
     * @return the value of cwv_game_contract_address.chain_trans_hash
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_game_contract_address.chain_trans_hash
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_contract_address.create_time
     *
     * @return the value of cwv_game_contract_address.create_time
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_contract_address.create_time
     *
     * @param createTime the value for cwv_game_contract_address.create_time
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
            && (this.getContractState() == null ? other.getContractState() == null : this.getContractState().equals(other.getContractState()))
            && (this.getContractNum() == null ? other.getContractNum() == null : this.getContractNum().equals(other.getContractNum()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractAddressId() == null) ? 0 : getContractAddressId().hashCode());
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getContractState() == null) ? 0 : getContractState().hashCode());
        result = prime * result + ((getContractNum() == null) ? 0 : getContractNum().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_contract_address
     *
     * @mbggenerated Mon Aug 13 13:38:24 CST 2018
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
        sb.append(", contractNum=").append(contractNum);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}