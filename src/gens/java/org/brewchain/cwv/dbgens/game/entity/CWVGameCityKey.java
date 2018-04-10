package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameCityKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_city.city_id
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    private Integer cityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_city.city_id
     *
     * @return the value of cwv_game_city.city_id
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_city.city_id
     *
     * @param cityId the value for cwv_game_city.city_id
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
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
        CWVGameCityKey other = (CWVGameCityKey) that;
        return (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_city
     *
     * @mbggenerated Tue Apr 10 11:08:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityId=").append(cityId);
        sb.append("]");
        return sb.toString();
    }
}