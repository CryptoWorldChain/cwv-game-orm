package org.brewchain.cwv.dbgens.common.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_common_sms_verify")
@AllArgsConstructor
@NoArgsConstructor
public class CWVCommonSmsVerify extends CWVCommonSmsVerifyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.phone
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.country_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private String countryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.verify_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private String verifyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.verify_type
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private String verifyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.is_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private String isVerify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.expires
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    private Date expires;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.phone
     *
     * @return the value of cwv_common_sms_verify.phone
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.phone
     *
     * @param phone the value for cwv_common_sms_verify.phone
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.country_code
     *
     * @return the value of cwv_common_sms_verify.country_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.country_code
     *
     * @param countryCode the value for cwv_common_sms_verify.country_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.verify_code
     *
     * @return the value of cwv_common_sms_verify.verify_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.verify_code
     *
     * @param verifyCode the value for cwv_common_sms_verify.verify_code
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.verify_type
     *
     * @return the value of cwv_common_sms_verify.verify_type
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public String getVerifyType() {
        return verifyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.verify_type
     *
     * @param verifyType the value for cwv_common_sms_verify.verify_type
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.is_verify
     *
     * @return the value of cwv_common_sms_verify.is_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public String getIsVerify() {
        return isVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.is_verify
     *
     * @param isVerify the value for cwv_common_sms_verify.is_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setIsVerify(String isVerify) {
        this.isVerify = isVerify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.expires
     *
     * @return the value of cwv_common_sms_verify.expires
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.expires
     *
     * @param expires the value for cwv_common_sms_verify.expires
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
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
        CWVCommonSmsVerify other = (CWVCommonSmsVerify) that;
        return (this.getVerifyId() == null ? other.getVerifyId() == null : this.getVerifyId().equals(other.getVerifyId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCountryCode() == null ? other.getCountryCode() == null : this.getCountryCode().equals(other.getCountryCode()))
            && (this.getVerifyCode() == null ? other.getVerifyCode() == null : this.getVerifyCode().equals(other.getVerifyCode()))
            && (this.getVerifyType() == null ? other.getVerifyType() == null : this.getVerifyType().equals(other.getVerifyType()))
            && (this.getIsVerify() == null ? other.getIsVerify() == null : this.getIsVerify().equals(other.getIsVerify()))
            && (this.getExpires() == null ? other.getExpires() == null : this.getExpires().equals(other.getExpires()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVerifyId() == null) ? 0 : getVerifyId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        result = prime * result + ((getVerifyCode() == null) ? 0 : getVerifyCode().hashCode());
        result = prime * result + ((getVerifyType() == null) ? 0 : getVerifyType().hashCode());
        result = prime * result + ((getIsVerify() == null) ? 0 : getIsVerify().hashCode());
        result = prime * result + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Sat Jul 07 15:07:16 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", verifyCode=").append(verifyCode);
        sb.append(", verifyType=").append(verifyType);
        sb.append(", isVerify=").append(isVerify);
        sb.append(", expires=").append(expires);
        sb.append("]");
        return sb.toString();
    }
}