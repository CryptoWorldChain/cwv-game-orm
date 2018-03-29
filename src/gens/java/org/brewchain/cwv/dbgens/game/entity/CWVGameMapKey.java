package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameMapKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_map.map_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    private Integer mapId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_map.map_id
     *
     * @return the value of cwv_game_map.map_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public Integer getMapId() {
        return mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_map.map_id
     *
     * @param mapId the value for cwv_game_map.map_id
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
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
        CWVGameMapKey other = (CWVGameMapKey) that;
        return (this.getMapId() == null ? other.getMapId() == null : this.getMapId().equals(other.getMapId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMapId() == null) ? 0 : getMapId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_map
     *
     * @mbggenerated Thu Mar 29 23:06:18 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapId=").append(mapId);
        sb.append("]");
        return sb.toString();
    }
}