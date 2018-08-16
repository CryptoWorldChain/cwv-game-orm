package org.brewchain.cwv.dbgens.auth.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_auth_user")
@AllArgsConstructor
@NoArgsConstructor
public class CWVAuthUser extends CWVAuthUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.user_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.nick_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.password
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.salt
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.validate_phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String validatePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.validate_email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String validateEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.status
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.country_id
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private Integer countryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_auth_user.country_code
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    private String countryCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.user_name
     *
     * @return the value of cwv_auth_user.user_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.user_name
     *
     * @param userName the value for cwv_auth_user.user_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.nick_name
     *
     * @return the value of cwv_auth_user.nick_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.nick_name
     *
     * @param nickName the value for cwv_auth_user.nick_name
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.password
     *
     * @return the value of cwv_auth_user.password
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.password
     *
     * @param password the value for cwv_auth_user.password
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.salt
     *
     * @return the value of cwv_auth_user.salt
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.salt
     *
     * @param salt the value for cwv_auth_user.salt
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.phone
     *
     * @return the value of cwv_auth_user.phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.phone
     *
     * @param phone the value for cwv_auth_user.phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.email
     *
     * @return the value of cwv_auth_user.email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.email
     *
     * @param email the value for cwv_auth_user.email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.image_url
     *
     * @return the value of cwv_auth_user.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.image_url
     *
     * @param imageUrl the value for cwv_auth_user.image_url
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.validate_phone
     *
     * @return the value of cwv_auth_user.validate_phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getValidatePhone() {
        return validatePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.validate_phone
     *
     * @param validatePhone the value for cwv_auth_user.validate_phone
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setValidatePhone(String validatePhone) {
        this.validatePhone = validatePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.validate_email
     *
     * @return the value of cwv_auth_user.validate_email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getValidateEmail() {
        return validateEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.validate_email
     *
     * @param validateEmail the value for cwv_auth_user.validate_email
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setValidateEmail(String validateEmail) {
        this.validateEmail = validateEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.status
     *
     * @return the value of cwv_auth_user.status
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.status
     *
     * @param status the value for cwv_auth_user.status
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.created_time
     *
     * @return the value of cwv_auth_user.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.created_time
     *
     * @param createdTime the value for cwv_auth_user.created_time
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.country_id
     *
     * @return the value of cwv_auth_user.country_id
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.country_id
     *
     * @param countryId the value for cwv_auth_user.country_id
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_auth_user.country_code
     *
     * @return the value of cwv_auth_user.country_code
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_auth_user.country_code
     *
     * @param countryCode the value for cwv_auth_user.country_code
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
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
        CWVAuthUser other = (CWVAuthUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getValidatePhone() == null ? other.getValidatePhone() == null : this.getValidatePhone().equals(other.getValidatePhone()))
            && (this.getValidateEmail() == null ? other.getValidateEmail() == null : this.getValidateEmail().equals(other.getValidateEmail()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getValidatePhone() == null) ? 0 : getValidatePhone().hashCode());
        result = prime * result + ((getValidateEmail() == null) ? 0 : getValidateEmail().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_auth_user
     *
     * @mbggenerated Thu Aug 16 19:29:36 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", validatePhone=").append(validatePhone);
        sb.append(", validateEmail=").append(validateEmail);
        sb.append(", status=").append(status);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", countryId=").append(countryId);
        sb.append(", countryCode=").append(countryCode);
        sb.append("]");
        return sb.toString();
    }
}