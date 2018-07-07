package org.brewchain.cwv.dbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVSysSettingKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_setting.setting_id
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
     */
    private Integer settingId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_setting.setting_id
     *
     * @return the value of cwv_sys_setting.setting_id
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
     */
    public Integer getSettingId() {
        return settingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_setting.setting_id
     *
     * @param settingId the value for cwv_sys_setting.setting_id
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
     */
    public void setSettingId(Integer settingId) {
        this.settingId = settingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
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
        CWVSysSettingKey other = (CWVSysSettingKey) that;
        return (this.getSettingId() == null ? other.getSettingId() == null : this.getSettingId().equals(other.getSettingId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Sat Jul 07 16:59:49 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", settingId=").append(settingId);
        sb.append("]");
        return sb.toString();
    }
}