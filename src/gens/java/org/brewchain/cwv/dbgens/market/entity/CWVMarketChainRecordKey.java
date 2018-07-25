package org.brewchain.cwv.dbgens.market.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketChainRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_chain_record.chain_record_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Integer chainRecordId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_chain_record.chain_record_id
     *
     * @return the value of cwv_market_chain_record.chain_record_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Integer getChainRecordId() {
        return chainRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_chain_record.chain_record_id
     *
     * @param chainRecordId the value for cwv_market_chain_record.chain_record_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setChainRecordId(Integer chainRecordId) {
        this.chainRecordId = chainRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
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
        CWVMarketChainRecordKey other = (CWVMarketChainRecordKey) that;
        return (this.getChainRecordId() == null ? other.getChainRecordId() == null : this.getChainRecordId().equals(other.getChainRecordId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChainRecordId() == null) ? 0 : getChainRecordId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_chain_record
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chainRecordId=").append(chainRecordId);
        sb.append("]");
        return sb.toString();
    }
}