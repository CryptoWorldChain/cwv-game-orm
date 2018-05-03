package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_exchange")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketExchange extends CWVMarketExchangeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.user_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.sell_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private BigDecimal sellPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.tax
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private BigDecimal tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.update_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.create_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.create_user
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.country_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Integer countryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.map_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private Integer mapId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_template_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String propertyTemplateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_template
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String propertyTemplate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.nick_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_type
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.property_status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String propertyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.income_remark
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private String incomeRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.income
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private BigDecimal income;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_exchange.last_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    private BigDecimal lastPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_id
     *
     * @return the value of cwv_market_exchange.property_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_id
     *
     * @param propertyId the value for cwv_market_exchange.property_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.user_id
     *
     * @return the value of cwv_market_exchange.user_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.user_id
     *
     * @param userId the value for cwv_market_exchange.user_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.sell_price
     *
     * @return the value of cwv_market_exchange.sell_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.sell_price
     *
     * @param sellPrice the value for cwv_market_exchange.sell_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.tax
     *
     * @return the value of cwv_market_exchange.tax
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.tax
     *
     * @param tax the value for cwv_market_exchange.tax
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.status
     *
     * @return the value of cwv_market_exchange.status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.status
     *
     * @param status the value for cwv_market_exchange.status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.update_time
     *
     * @return the value of cwv_market_exchange.update_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.update_time
     *
     * @param updateTime the value for cwv_market_exchange.update_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.create_time
     *
     * @return the value of cwv_market_exchange.create_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.create_time
     *
     * @param createTime the value for cwv_market_exchange.create_time
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.create_user
     *
     * @return the value of cwv_market_exchange.create_user
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.create_user
     *
     * @param createUser the value for cwv_market_exchange.create_user
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.country_id
     *
     * @return the value of cwv_market_exchange.country_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.country_id
     *
     * @param countryId the value for cwv_market_exchange.country_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.map_id
     *
     * @return the value of cwv_market_exchange.map_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public Integer getMapId() {
        return mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.map_id
     *
     * @param mapId the value for cwv_market_exchange.map_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_template_id
     *
     * @return the value of cwv_market_exchange.property_template_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getPropertyTemplateId() {
        return propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_template_id
     *
     * @param propertyTemplateId the value for cwv_market_exchange.property_template_id
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyTemplateId(String propertyTemplateId) {
        this.propertyTemplateId = propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_template
     *
     * @return the value of cwv_market_exchange.property_template
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getPropertyTemplate() {
        return propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_template
     *
     * @param propertyTemplate the value for cwv_market_exchange.property_template
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyTemplate(String propertyTemplate) {
        this.propertyTemplate = propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.nick_name
     *
     * @return the value of cwv_market_exchange.nick_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.nick_name
     *
     * @param nickName the value for cwv_market_exchange.nick_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_name
     *
     * @return the value of cwv_market_exchange.property_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_name
     *
     * @param propertyName the value for cwv_market_exchange.property_name
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_type
     *
     * @return the value of cwv_market_exchange.property_type
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_type
     *
     * @param propertyType the value for cwv_market_exchange.property_type
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.property_status
     *
     * @return the value of cwv_market_exchange.property_status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.property_status
     *
     * @param propertyStatus the value for cwv_market_exchange.property_status
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.income_remark
     *
     * @return the value of cwv_market_exchange.income_remark
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public String getIncomeRemark() {
        return incomeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.income_remark
     *
     * @param incomeRemark the value for cwv_market_exchange.income_remark
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setIncomeRemark(String incomeRemark) {
        this.incomeRemark = incomeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.income
     *
     * @return the value of cwv_market_exchange.income
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.income
     *
     * @param income the value for cwv_market_exchange.income
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_exchange.last_price
     *
     * @return the value of cwv_market_exchange.last_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_exchange.last_price
     *
     * @param lastPrice the value for cwv_market_exchange.last_price
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
     */
    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
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
        CWVMarketExchange other = (CWVMarketExchange) that;
        return (this.getExchangeId() == null ? other.getExchangeId() == null : this.getExchangeId().equals(other.getExchangeId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSellPrice() == null ? other.getSellPrice() == null : this.getSellPrice().equals(other.getSellPrice()))
            && (this.getTax() == null ? other.getTax() == null : this.getTax().equals(other.getTax()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getMapId() == null ? other.getMapId() == null : this.getMapId().equals(other.getMapId()))
            && (this.getPropertyTemplateId() == null ? other.getPropertyTemplateId() == null : this.getPropertyTemplateId().equals(other.getPropertyTemplateId()))
            && (this.getPropertyTemplate() == null ? other.getPropertyTemplate() == null : this.getPropertyTemplate().equals(other.getPropertyTemplate()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getPropertyType() == null ? other.getPropertyType() == null : this.getPropertyType().equals(other.getPropertyType()))
            && (this.getPropertyStatus() == null ? other.getPropertyStatus() == null : this.getPropertyStatus().equals(other.getPropertyStatus()))
            && (this.getIncomeRemark() == null ? other.getIncomeRemark() == null : this.getIncomeRemark().equals(other.getIncomeRemark()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
            && (this.getLastPrice() == null ? other.getLastPrice() == null : this.getLastPrice().equals(other.getLastPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
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
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getMapId() == null) ? 0 : getMapId().hashCode());
        result = prime * result + ((getPropertyTemplateId() == null) ? 0 : getPropertyTemplateId().hashCode());
        result = prime * result + ((getPropertyTemplate() == null) ? 0 : getPropertyTemplate().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getPropertyType() == null) ? 0 : getPropertyType().hashCode());
        result = prime * result + ((getPropertyStatus() == null) ? 0 : getPropertyStatus().hashCode());
        result = prime * result + ((getIncomeRemark() == null) ? 0 : getIncomeRemark().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getLastPrice() == null) ? 0 : getLastPrice().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_exchange
     *
     * @mbggenerated Thu May 03 14:40:09 CST 2018
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
        sb.append(", countryId=").append(countryId);
        sb.append(", mapId=").append(mapId);
        sb.append(", propertyTemplateId=").append(propertyTemplateId);
        sb.append(", propertyTemplate=").append(propertyTemplate);
        sb.append(", nickName=").append(nickName);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", propertyStatus=").append(propertyStatus);
        sb.append(", incomeRemark=").append(incomeRemark);
        sb.append(", income=").append(income);
        sb.append(", lastPrice=").append(lastPrice);
        sb.append("]");
        return sb.toString();
    }
}