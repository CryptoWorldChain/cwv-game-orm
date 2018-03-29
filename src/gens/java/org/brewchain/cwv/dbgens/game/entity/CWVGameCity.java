package org.brewchain.cwv.dbgens.game.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_city")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameCity extends CWVGameCityKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.game_country_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private Integer gameCountryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.city_name
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.status
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.is_display
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private String isDisplay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.created_time
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.game_country_id
     *
     * @return the value of cwv_game_city.game_country_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public Integer getGameCountryId() {
        return gameCountryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.game_country_id
     *
     * @param gameCountryId the value for cwv_game_city.game_country_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setGameCountryId(Integer gameCountryId) {
        this.gameCountryId = gameCountryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.city_name
     *
     * @return the value of cwv_game_city.city_name
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.city_name
     *
     * @param cityName the value for cwv_game_city.city_name
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.status
     *
     * @return the value of cwv_game_city.status
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.status
     *
     * @param status the value for cwv_game_city.status
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.is_display
     *
     * @return the value of cwv_game_city.is_display
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public String getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.is_display
     *
     * @param isDisplay the value for cwv_game_city.is_display
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.created_time
     *
     * @return the value of cwv_game_city.created_time
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.created_time
     *
     * @param createdTime the value for cwv_game_city.created_time
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
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
        CWVGameCity other = (CWVGameCity) that;
        return (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getGameCountryId() == null ? other.getGameCountryId() == null : this.getGameCountryId().equals(other.getGameCountryId()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDisplay() == null ? other.getIsDisplay() == null : this.getIsDisplay().equals(other.getIsDisplay()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getGameCountryId() == null) ? 0 : getGameCountryId().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDisplay() == null) ? 0 : getIsDisplay().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameCountryId=").append(gameCountryId);
        sb.append(", cityName=").append(cityName);
        sb.append(", status=").append(status);
        sb.append(", isDisplay=").append(isDisplay);
        sb.append(", createdTime=").append(createdTime);
        sb.append("]");
        return sb.toString();
    }
}