package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_exchange_copy")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketExchangeCopy extends CWVMarketExchangeCopyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.sell_price
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private BigDecimal sellPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.tax
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private BigDecimal tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.status
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.update_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.create_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange_copy.create_user
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    private Integer createUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.property_id
     *
     * @return the value of cwv_market_exchange_copy.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.property_id
     *
     * @param propertyId the value for cwv_market_exchange_copy.property_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.user_id
     *
     * @return the value of cwv_market_exchange_copy.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.user_id
     *
     * @param userId the value for cwv_market_exchange_copy.user_id
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.sell_price
     *
     * @return the value of cwv_market_exchange_copy.sell_price
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.sell_price
     *
     * @param sellPrice the value for cwv_market_exchange_copy.sell_price
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.tax
     *
     * @return the value of cwv_market_exchange_copy.tax
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.tax
     *
     * @param tax the value for cwv_market_exchange_copy.tax
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.status
     *
     * @return the value of cwv_market_exchange_copy.status
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.status
     *
     * @param status the value for cwv_market_exchange_copy.status
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.update_time
     *
     * @return the value of cwv_market_exchange_copy.update_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.update_time
     *
     * @param updateTime the value for cwv_market_exchange_copy.update_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.create_time
     *
     * @return the value of cwv_market_exchange_copy.create_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.create_time
     *
     * @param createTime the value for cwv_market_exchange_copy.create_time
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange_copy.create_user
     *
     * @return the value of cwv_market_exchange_copy.create_user
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange_copy.create_user
     *
     * @param createUser the value for cwv_market_exchange_copy.create_user
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
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
        CWVMarketExchangeCopy other = (CWVMarketExchangeCopy) that;
        return (this.getExchangeId() == null ? other.getExchangeId() == null : this.getExchangeId().equals(other.getExchangeId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSellPrice() == null ? other.getSellPrice() == null : this.getSellPrice().equals(other.getSellPrice()))
            && (this.getTax() == null ? other.getTax() == null : this.getTax().equals(other.getTax()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExchangeId() == null) ? 0 : getExchangeId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSellPrice() == null) ? 0 : getSellPrice().hashCode());
        result = prime * result + ((getTax() == null) ? 0 : getTax().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange_copy
     *
     * @mbggenerated Wed Jul 25 18:19:05 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", userId=").append(userId);
        sb.append(", sellPrice=").append(sellPrice);
        sb.append(", tax=").append(tax);
        sb.append(", status=").append(status);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append("]");
        return sb.toString();
    }
}