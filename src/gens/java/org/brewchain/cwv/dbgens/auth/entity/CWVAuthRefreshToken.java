package org.brewchain.cwv.dbgens.auth.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_auth_refresh_token")
@AllArgsConstructor
@NoArgsConstructor
public class CWVAuthRefreshToken extends CWVAuthRefreshTokenKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_refresh_token.refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    private String refreshToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_refresh_token.expires
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    private Date expires;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_refresh_token.client_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    private String clientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_refresh_token.user_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_refresh_token.refresh_token
     *
     * @return the value of cwv_auth_refresh_token.refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_refresh_token.refresh_token
     *
     * @param refreshToken the value for cwv_auth_refresh_token.refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_refresh_token.expires
     *
     * @return the value of cwv_auth_refresh_token.expires
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_refresh_token.expires
     *
     * @param expires the value for cwv_auth_refresh_token.expires
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_refresh_token.client_id
     *
     * @return the value of cwv_auth_refresh_token.client_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_refresh_token.client_id
     *
     * @param clientId the value for cwv_auth_refresh_token.client_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_refresh_token.user_id
     *
     * @return the value of cwv_auth_refresh_token.user_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_refresh_token.user_id
     *
     * @param userId the value for cwv_auth_refresh_token.user_id
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
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
        CWVAuthRefreshToken other = (CWVAuthRefreshToken) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRefreshToken() == null ? other.getRefreshToken() == null : this.getRefreshToken().equals(other.getRefreshToken()))
            && (this.getExpires() == null ? other.getExpires() == null : this.getExpires().equals(other.getExpires()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        result = prime * result + ((getExpires() == null) ? 0 : getExpires().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_refresh_token
     *
     * @mbggenerated Sat Jul 07 15:07:21 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", expires=").append(expires);
        sb.append(", clientId=").append(clientId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}