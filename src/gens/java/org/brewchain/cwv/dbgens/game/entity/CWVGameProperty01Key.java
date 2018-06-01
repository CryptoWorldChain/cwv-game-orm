package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameProperty01Key {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_01.property_id
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    private Integer propertyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_01.property_id
     *
     * @return the value of cwv_game_property_01.property_id
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_01.property_id
     *
     * @param propertyId the value for cwv_game_property_01.property_id
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
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
        CWVGameProperty01Key other = (CWVGameProperty01Key) that;
        return (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_01
     *
     * @mbggenerated Fri Jun 01 15:48:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append("]");
        return sb.toString();
    }
}