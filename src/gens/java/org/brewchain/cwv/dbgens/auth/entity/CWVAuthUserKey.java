package org.brewchain.cwv.dbgens.auth.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVAuthUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.user_id
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.user_id
     *
     * @return the value of cwv_auth_user.user_id
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.user_id
     *
     * @param userId the value for cwv_auth_user.user_id
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
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
        CWVAuthUserKey other = (CWVAuthUserKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Mon May 07 17:58:18 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}