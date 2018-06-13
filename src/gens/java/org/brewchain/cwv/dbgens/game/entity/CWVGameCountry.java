package org.brewchain.cwv.dbgens.game.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_country")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameCountry extends CWVGameCountryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.country_name
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private String countryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.image_url
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.status
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.is_display
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private String isDisplay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.created_time
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.map_num
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    private Integer mapNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.country_name
     *
     * @return the value of cwv_game_country.country_name
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.country_name
     *
     * @param countryName the value for cwv_game_country.country_name
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.image_url
     *
     * @return the value of cwv_game_country.image_url
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.image_url
     *
     * @param imageUrl the value for cwv_game_country.image_url
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.status
     *
     * @return the value of cwv_game_country.status
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.status
     *
     * @param status the value for cwv_game_country.status
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.is_display
     *
     * @return the value of cwv_game_country.is_display
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public String getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.is_display
     *
     * @param isDisplay the value for cwv_game_country.is_display
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.created_time
     *
     * @return the value of cwv_game_country.created_time
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.created_time
     *
     * @param createdTime the value for cwv_game_country.created_time
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.map_num
     *
     * @return the value of cwv_game_country.map_num
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public Integer getMapNum() {
        return mapNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.map_num
     *
     * @param mapNum the value for cwv_game_country.map_num
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    public void setMapNum(Integer mapNum) {
        this.mapNum = mapNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
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
        CWVGameCountry other = (CWVGameCountry) that;
        return (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountryName() == null ? other.getCountryName() == null : this.getCountryName().equals(other.getCountryName()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDisplay() == null ? other.getIsDisplay() == null : this.getIsDisplay().equals(other.getIsDisplay()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getMapNum() == null ? other.getMapNum() == null : this.getMapNum().equals(other.getMapNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDisplay() == null) ? 0 : getIsDisplay().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getMapNum() == null) ? 0 : getMapNum().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Wed Jun 13 22:15:03 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countryName=").append(countryName);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", status=").append(status);
        sb.append(", isDisplay=").append(isDisplay);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", mapNum=").append(mapNum);
        sb.append("]");
        return sb.toString();
    }
}