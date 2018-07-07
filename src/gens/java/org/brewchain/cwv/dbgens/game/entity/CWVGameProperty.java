package org.brewchain.cwv.dbgens.game.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_property")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameProperty extends CWVGamePropertyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.game_map_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Integer gameMapId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.user_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_name
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_sub_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Byte propertySubType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_market_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Byte propertyMarketType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_status
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String propertyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.last_price
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private BigDecimal lastPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.price_increase
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private BigDecimal priceIncrease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.last_price_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Date lastPriceTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.image_url
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.income
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private BigDecimal income;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.is_display
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String isDisplay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.created_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_template_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String propertyTemplateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.property_template
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String propertyTemplate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.longitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.latitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property.crypto_token
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    private String cryptoToken;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.game_map_id
     *
     * @return the value of cwv_game_property.game_map_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Integer getGameMapId() {
        return gameMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.game_map_id
     *
     * @param gameMapId the value for cwv_game_property.game_map_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setGameMapId(Integer gameMapId) {
        this.gameMapId = gameMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.user_id
     *
     * @return the value of cwv_game_property.user_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.user_id
     *
     * @param userId the value for cwv_game_property.user_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_name
     *
     * @return the value of cwv_game_property.property_name
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_name
     *
     * @param propertyName the value for cwv_game_property.property_name
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_type
     *
     * @return the value of cwv_game_property.property_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_type
     *
     * @param propertyType the value for cwv_game_property.property_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_sub_type
     *
     * @return the value of cwv_game_property.property_sub_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Byte getPropertySubType() {
        return propertySubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_sub_type
     *
     * @param propertySubType the value for cwv_game_property.property_sub_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertySubType(Byte propertySubType) {
        this.propertySubType = propertySubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_market_type
     *
     * @return the value of cwv_game_property.property_market_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Byte getPropertyMarketType() {
        return propertyMarketType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_market_type
     *
     * @param propertyMarketType the value for cwv_game_property.property_market_type
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyMarketType(Byte propertyMarketType) {
        this.propertyMarketType = propertyMarketType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_status
     *
     * @return the value of cwv_game_property.property_status
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_status
     *
     * @param propertyStatus the value for cwv_game_property.property_status
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.last_price
     *
     * @return the value of cwv_game_property.last_price
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.last_price
     *
     * @param lastPrice the value for cwv_game_property.last_price
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.price_increase
     *
     * @return the value of cwv_game_property.price_increase
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public BigDecimal getPriceIncrease() {
        return priceIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.price_increase
     *
     * @param priceIncrease the value for cwv_game_property.price_increase
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPriceIncrease(BigDecimal priceIncrease) {
        this.priceIncrease = priceIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.last_price_time
     *
     * @return the value of cwv_game_property.last_price_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Date getLastPriceTime() {
        return lastPriceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.last_price_time
     *
     * @param lastPriceTime the value for cwv_game_property.last_price_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setLastPriceTime(Date lastPriceTime) {
        this.lastPriceTime = lastPriceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.image_url
     *
     * @return the value of cwv_game_property.image_url
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.image_url
     *
     * @param imageUrl the value for cwv_game_property.image_url
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.income
     *
     * @return the value of cwv_game_property.income
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.income
     *
     * @param income the value for cwv_game_property.income
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.is_display
     *
     * @return the value of cwv_game_property.is_display
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.is_display
     *
     * @param isDisplay the value for cwv_game_property.is_display
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.created_time
     *
     * @return the value of cwv_game_property.created_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.created_time
     *
     * @param createdTime the value for cwv_game_property.created_time
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_template_id
     *
     * @return the value of cwv_game_property.property_template_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getPropertyTemplateId() {
        return propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_template_id
     *
     * @param propertyTemplateId the value for cwv_game_property.property_template_id
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyTemplateId(String propertyTemplateId) {
        this.propertyTemplateId = propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.property_template
     *
     * @return the value of cwv_game_property.property_template
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getPropertyTemplate() {
        return propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.property_template
     *
     * @param propertyTemplate the value for cwv_game_property.property_template
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setPropertyTemplate(String propertyTemplate) {
        this.propertyTemplate = propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.longitude
     *
     * @return the value of cwv_game_property.longitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.longitude
     *
     * @param longitude the value for cwv_game_property.longitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.latitude
     *
     * @return the value of cwv_game_property.latitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.latitude
     *
     * @param latitude the value for cwv_game_property.latitude
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property.crypto_token
     *
     * @return the value of cwv_game_property.crypto_token
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public String getCryptoToken() {
        return cryptoToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property.crypto_token
     *
     * @param cryptoToken the value for cwv_game_property.crypto_token
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    public void setCryptoToken(String cryptoToken) {
        this.cryptoToken = cryptoToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
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
        CWVGameProperty other = (CWVGameProperty) that;
        return (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getGameMapId() == null ? other.getGameMapId() == null : this.getGameMapId().equals(other.getGameMapId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getPropertyType() == null ? other.getPropertyType() == null : this.getPropertyType().equals(other.getPropertyType()))
            && (this.getPropertySubType() == null ? other.getPropertySubType() == null : this.getPropertySubType().equals(other.getPropertySubType()))
            && (this.getPropertyMarketType() == null ? other.getPropertyMarketType() == null : this.getPropertyMarketType().equals(other.getPropertyMarketType()))
            && (this.getPropertyStatus() == null ? other.getPropertyStatus() == null : this.getPropertyStatus().equals(other.getPropertyStatus()))
            && (this.getLastPrice() == null ? other.getLastPrice() == null : this.getLastPrice().equals(other.getLastPrice()))
            && (this.getPriceIncrease() == null ? other.getPriceIncrease() == null : this.getPriceIncrease().equals(other.getPriceIncrease()))
            && (this.getLastPriceTime() == null ? other.getLastPriceTime() == null : this.getLastPriceTime().equals(other.getLastPriceTime()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
            && (this.getIsDisplay() == null ? other.getIsDisplay() == null : this.getIsDisplay().equals(other.getIsDisplay()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getPropertyTemplateId() == null ? other.getPropertyTemplateId() == null : this.getPropertyTemplateId().equals(other.getPropertyTemplateId()))
            && (this.getPropertyTemplate() == null ? other.getPropertyTemplate() == null : this.getPropertyTemplate().equals(other.getPropertyTemplate()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getCryptoToken() == null ? other.getCryptoToken() == null : this.getCryptoToken().equals(other.getCryptoToken()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getGameMapId() == null) ? 0 : getGameMapId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getPropertyType() == null) ? 0 : getPropertyType().hashCode());
        result = prime * result + ((getPropertySubType() == null) ? 0 : getPropertySubType().hashCode());
        result = prime * result + ((getPropertyMarketType() == null) ? 0 : getPropertyMarketType().hashCode());
        result = prime * result + ((getPropertyStatus() == null) ? 0 : getPropertyStatus().hashCode());
        result = prime * result + ((getLastPrice() == null) ? 0 : getLastPrice().hashCode());
        result = prime * result + ((getPriceIncrease() == null) ? 0 : getPriceIncrease().hashCode());
        result = prime * result + ((getLastPriceTime() == null) ? 0 : getLastPriceTime().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getIsDisplay() == null) ? 0 : getIsDisplay().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getPropertyTemplateId() == null) ? 0 : getPropertyTemplateId().hashCode());
        result = prime * result + ((getPropertyTemplate() == null) ? 0 : getPropertyTemplate().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getCryptoToken() == null) ? 0 : getCryptoToken().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property
     *
     * @mbggenerated Sat Jul 07 13:30:28 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameMapId=").append(gameMapId);
        sb.append(", userId=").append(userId);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", propertySubType=").append(propertySubType);
        sb.append(", propertyMarketType=").append(propertyMarketType);
        sb.append(", propertyStatus=").append(propertyStatus);
        sb.append(", lastPrice=").append(lastPrice);
        sb.append(", priceIncrease=").append(priceIncrease);
        sb.append(", lastPriceTime=").append(lastPriceTime);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", income=").append(income);
        sb.append(", isDisplay=").append(isDisplay);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", propertyTemplateId=").append(propertyTemplateId);
        sb.append(", propertyTemplate=").append(propertyTemplate);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", cryptoToken=").append(cryptoToken);
        sb.append("]");
        return sb.toString();
    }
}