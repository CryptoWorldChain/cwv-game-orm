package org.brewchain.cwv.dbgens.game.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_map")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameMap extends CWVGameMapKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.map_name
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private String mapName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.map_name_zh
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private String mapNameZh;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.game_city_id
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private Integer gameCityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.template
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private Integer template;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.status
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.total_count
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private Integer totalCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.is_display
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    private String isDisplay;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.map_name
     *
     * @return the value of cwv_game_map.map_name
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.map_name
     *
     * @param mapName the value for cwv_game_map.map_name
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.map_name_zh
     *
     * @return the value of cwv_game_map.map_name_zh
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public String getMapNameZh() {
        return mapNameZh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.map_name_zh
     *
     * @param mapNameZh the value for cwv_game_map.map_name_zh
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setMapNameZh(String mapNameZh) {
        this.mapNameZh = mapNameZh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.game_city_id
     *
     * @return the value of cwv_game_map.game_city_id
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public Integer getGameCityId() {
        return gameCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.game_city_id
     *
     * @param gameCityId the value for cwv_game_map.game_city_id
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setGameCityId(Integer gameCityId) {
        this.gameCityId = gameCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.template
     *
     * @return the value of cwv_game_map.template
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public Integer getTemplate() {
        return template;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.template
     *
     * @param template the value for cwv_game_map.template
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setTemplate(Integer template) {
        this.template = template;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.image_url
     *
     * @return the value of cwv_game_map.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.image_url
     *
     * @param imageUrl the value for cwv_game_map.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.created_time
     *
     * @return the value of cwv_game_map.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.created_time
     *
     * @param createdTime the value for cwv_game_map.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.status
     *
     * @return the value of cwv_game_map.status
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.status
     *
     * @param status the value for cwv_game_map.status
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.total_count
     *
     * @return the value of cwv_game_map.total_count
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.total_count
     *
     * @param totalCount the value for cwv_game_map.total_count
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.is_display
     *
     * @return the value of cwv_game_map.is_display
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public String getIsDisplay() {
        return isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.is_display
     *
     * @param isDisplay the value for cwv_game_map.is_display
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
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
        CWVGameMap other = (CWVGameMap) that;
        return (this.getMapId() == null ? other.getMapId() == null : this.getMapId().equals(other.getMapId()))
            && (this.getMapName() == null ? other.getMapName() == null : this.getMapName().equals(other.getMapName()))
            && (this.getMapNameZh() == null ? other.getMapNameZh() == null : this.getMapNameZh().equals(other.getMapNameZh()))
            && (this.getGameCityId() == null ? other.getGameCityId() == null : this.getGameCityId().equals(other.getGameCityId()))
            && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getIsDisplay() == null ? other.getIsDisplay() == null : this.getIsDisplay().equals(other.getIsDisplay()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMapId() == null) ? 0 : getMapId().hashCode());
        result = prime * result + ((getMapName() == null) ? 0 : getMapName().hashCode());
        result = prime * result + ((getMapNameZh() == null) ? 0 : getMapNameZh().hashCode());
        result = prime * result + ((getGameCityId() == null) ? 0 : getGameCityId().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getIsDisplay() == null) ? 0 : getIsDisplay().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Aug 16 19:29:31 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapName=").append(mapName);
        sb.append(", mapNameZh=").append(mapNameZh);
        sb.append(", gameCityId=").append(gameCityId);
        sb.append(", template=").append(template);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", status=").append(status);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", isDisplay=").append(isDisplay);
        sb.append("]");
        return sb.toString();
    }
}