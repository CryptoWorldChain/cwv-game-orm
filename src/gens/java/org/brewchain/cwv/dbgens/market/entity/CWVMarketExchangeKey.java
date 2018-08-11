package org.brewchain.cwv.dbgens.market.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketExchangeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.exchange_id
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    private Integer exchangeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.exchange_id
     *
     * @return the value of cwv_market_exchange.exchange_id
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public Integer getExchangeId() {
        return exchangeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.exchange_id
     *
     * @param exchangeId the value for cwv_market_exchange.exchange_id
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
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
        CWVMarketExchangeKey other = (CWVMarketExchangeKey) that;
        return (this.getExchangeId() == null ? other.getExchangeId() == null : this.getExchangeId().equals(other.getExchangeId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExchangeId() == null) ? 0 : getExchangeId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Sat Aug 11 16:34:13 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exchangeId=").append(exchangeId);
        sb.append("]");
        return sb.toString();
    }
}