package org.brewchain.cwv.dbgens.market.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_draw")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketDraw extends CWVMarketDrawKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.property_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.user_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_draw.create_time
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.property_id
     *
     * @return the value of cwv_market_draw.property_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.property_id
     *
     * @param propertyId the value for cwv_market_draw.property_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.user_id
     *
     * @return the value of cwv_market_draw.user_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.user_id
     *
     * @param userId the value for cwv_market_draw.user_id
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_draw.create_time
     *
     * @return the value of cwv_market_draw.create_time
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_draw.create_time
     *
     * @param createTime the value for cwv_market_draw.create_time
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
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
        CWVMarketDraw other = (CWVMarketDraw) that;
        return (this.getDrawId() == null ? other.getDrawId() == null : this.getDrawId().equals(other.getDrawId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrawId() == null) ? 0 : getDrawId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_draw
     *
     * @mbggenerated Thu Apr 26 16:32:02 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}