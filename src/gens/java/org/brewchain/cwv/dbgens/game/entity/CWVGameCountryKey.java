package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameCountryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_country.country_id
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
     */
    private Integer countryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_country.country_id
     *
     * @return the value of cwv_game_country.country_id
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_country.country_id
     *
     * @param countryId the value for cwv_game_country.country_id
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
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
        CWVGameCountryKey other = (CWVGameCountryKey) that;
        return (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_country
     *
     * @mbggenerated Thu Apr 26 16:31:47 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countryId=").append(countryId);
        sb.append("]");
        return sb.toString();
    }
}