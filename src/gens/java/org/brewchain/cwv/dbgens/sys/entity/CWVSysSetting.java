package org.brewchain.cwv.dbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_sys_setting")
@AllArgsConstructor
@NoArgsConstructor
public class CWVSysSetting extends CWVSysSettingKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_setting.name
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_setting.value
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_setting.description
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_setting.name
     *
     * @return the value of cwv_sys_setting.name
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_setting.name
     *
     * @param name the value for cwv_sys_setting.name
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_setting.value
     *
     * @return the value of cwv_sys_setting.value
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_setting.value
     *
     * @param value the value for cwv_sys_setting.value
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_setting.description
     *
     * @return the value of cwv_sys_setting.description
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_setting.description
     *
     * @param description the value for cwv_sys_setting.description
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
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
        CWVSysSetting other = (CWVSysSetting) that;
        return (this.getSettingId() == null ? other.getSettingId() == null : this.getSettingId().equals(other.getSettingId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_setting
     *
     * @mbggenerated Wed Jun 13 22:15:10 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}