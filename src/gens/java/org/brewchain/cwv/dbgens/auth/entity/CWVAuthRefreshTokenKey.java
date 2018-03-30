package org.brewchain.cwv.dbgens.auth.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVAuthRefreshTokenKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_refresh_token.id
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_refresh_token.id
     *
     * @return the value of cwv_auth_refresh_token.id
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_refresh_token.id
     *
     * @param id the value for cwv_auth_refresh_token.id
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
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
        CWVAuthRefreshTokenKey other = (CWVAuthRefreshTokenKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Fri Mar 30 16:12:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}