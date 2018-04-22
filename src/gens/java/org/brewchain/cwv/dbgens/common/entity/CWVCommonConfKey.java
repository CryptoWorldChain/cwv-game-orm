package org.brewchain.cwv.dbgens.common.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVCommonConfKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.conf_id
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
     */
    private Integer confId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.conf_id
     *
     * @return the value of cwv_common_conf.conf_id
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
     */
    public Integer getConfId() {
        return confId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.conf_id
     *
     * @param confId the value for cwv_common_conf.conf_id
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
     */
    public void setConfId(Integer confId) {
        this.confId = confId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
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
        CWVCommonConfKey other = (CWVCommonConfKey) that;
        return (this.getConfId() == null ? other.getConfId() == null : this.getConfId().equals(other.getConfId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConfId() == null) ? 0 : getConfId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Sun Apr 22 11:52:07 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", confId=").append(confId);
        sb.append("]");
        return sb.toString();
    }
}