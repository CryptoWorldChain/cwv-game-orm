package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserSendRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_send_record.record_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    private Integer recordId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_send_record.record_id
     *
     * @return the value of cwv_user_send_record.record_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_send_record.record_id
     *
     * @param recordId the value for cwv_user_send_record.record_id
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
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
        CWVUserSendRecordKey other = (CWVUserSendRecordKey) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_send_record
     *
     * @mbggenerated Fri Jul 20 14:49:40 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append("]");
        return sb.toString();
    }
}