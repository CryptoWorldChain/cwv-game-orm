package org.brewchain.cwv.dbgens.common.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVCommonSmsVerifyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_sms_verify.verify_id
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String verifyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_sms_verify.verify_id
     *
     * @return the value of cwv_common_sms_verify.verify_id
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getVerifyId() {
        return verifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_sms_verify.verify_id
     *
     * @param verifyId the value for cwv_common_sms_verify.verify_id
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
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
        CWVCommonSmsVerifyKey other = (CWVCommonSmsVerifyKey) that;
        return (this.getVerifyId() == null ? other.getVerifyId() == null : this.getVerifyId().equals(other.getVerifyId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVerifyId() == null) ? 0 : getVerifyId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_sms_verify
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", verifyId=").append(verifyId);
        sb.append("]");
        return sb.toString();
    }
}