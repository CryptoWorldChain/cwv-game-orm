package org.brewchain.cwv.dbgens.market.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketDrawKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.draw_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    private Integer drawId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.draw_id
     *
     * @return the value of cwv_market_draw.draw_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public Integer getDrawId() {
        return drawId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.draw_id
     *
     * @param drawId the value for cwv_market_draw.draw_id
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
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
        CWVMarketDrawKey other = (CWVMarketDrawKey) that;
        return (this.getDrawId() == null ? other.getDrawId() == null : this.getDrawId().equals(other.getDrawId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrawId() == null) ? 0 : getDrawId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Aug 23 16:16:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drawId=").append(drawId);
        sb.append("]");
        return sb.toString();
    }
}