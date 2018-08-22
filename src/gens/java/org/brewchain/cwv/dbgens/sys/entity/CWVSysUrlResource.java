package org.brewchain.cwv.dbgens.sys.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_sys_url_resource")
@AllArgsConstructor
@NoArgsConstructor
public class CWVSysUrlResource extends CWVSysUrlResourceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.URL_RESOURCE_NAME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String urlResourceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.URL_RESOURCE_PATH
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String urlResourcePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.URL_RESOURCE_TYPE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private Integer urlResourceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.URL_LOG_OUT
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String urlLogOut;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.RESOURCE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String resource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.user_day_limit
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private Integer userDayLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.interval_time
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private Integer intervalTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.STATUS
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.CREATED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.CREATED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.MODIFIED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.MODIFIED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.RESERVED_FIELD1
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String reservedField1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.RESERVED_FIELD2
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    private String reservedField2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.URL_RESOURCE_NAME
     *
     * @return the value of cwv_sys_url_resource.URL_RESOURCE_NAME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getUrlResourceName() {
        return urlResourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.URL_RESOURCE_NAME
     *
     * @param urlResourceName the value for cwv_sys_url_resource.URL_RESOURCE_NAME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setUrlResourceName(String urlResourceName) {
        this.urlResourceName = urlResourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.URL_RESOURCE_PATH
     *
     * @return the value of cwv_sys_url_resource.URL_RESOURCE_PATH
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getUrlResourcePath() {
        return urlResourcePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.URL_RESOURCE_PATH
     *
     * @param urlResourcePath the value for cwv_sys_url_resource.URL_RESOURCE_PATH
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setUrlResourcePath(String urlResourcePath) {
        this.urlResourcePath = urlResourcePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.URL_RESOURCE_TYPE
     *
     * @return the value of cwv_sys_url_resource.URL_RESOURCE_TYPE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public Integer getUrlResourceType() {
        return urlResourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.URL_RESOURCE_TYPE
     *
     * @param urlResourceType the value for cwv_sys_url_resource.URL_RESOURCE_TYPE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setUrlResourceType(Integer urlResourceType) {
        this.urlResourceType = urlResourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.URL_LOG_OUT
     *
     * @return the value of cwv_sys_url_resource.URL_LOG_OUT
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getUrlLogOut() {
        return urlLogOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.URL_LOG_OUT
     *
     * @param urlLogOut the value for cwv_sys_url_resource.URL_LOG_OUT
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setUrlLogOut(String urlLogOut) {
        this.urlLogOut = urlLogOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.RESOURCE
     *
     * @return the value of cwv_sys_url_resource.RESOURCE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getResource() {
        return resource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.RESOURCE
     *
     * @param resource the value for cwv_sys_url_resource.RESOURCE
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.user_day_limit
     *
     * @return the value of cwv_sys_url_resource.user_day_limit
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public Integer getUserDayLimit() {
        return userDayLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.user_day_limit
     *
     * @param userDayLimit the value for cwv_sys_url_resource.user_day_limit
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setUserDayLimit(Integer userDayLimit) {
        this.userDayLimit = userDayLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.interval_time
     *
     * @return the value of cwv_sys_url_resource.interval_time
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public Integer getIntervalTime() {
        return intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.interval_time
     *
     * @param intervalTime the value for cwv_sys_url_resource.interval_time
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.STATUS
     *
     * @return the value of cwv_sys_url_resource.STATUS
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.STATUS
     *
     * @param status the value for cwv_sys_url_resource.STATUS
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.CREATED_TIME
     *
     * @return the value of cwv_sys_url_resource.CREATED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.CREATED_TIME
     *
     * @param createdTime the value for cwv_sys_url_resource.CREATED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.CREATED_BY
     *
     * @return the value of cwv_sys_url_resource.CREATED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.CREATED_BY
     *
     * @param createdBy the value for cwv_sys_url_resource.CREATED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.MODIFIED_TIME
     *
     * @return the value of cwv_sys_url_resource.MODIFIED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.MODIFIED_TIME
     *
     * @param modifiedTime the value for cwv_sys_url_resource.MODIFIED_TIME
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.MODIFIED_BY
     *
     * @return the value of cwv_sys_url_resource.MODIFIED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.MODIFIED_BY
     *
     * @param modifiedBy the value for cwv_sys_url_resource.MODIFIED_BY
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.RESERVED_FIELD1
     *
     * @return the value of cwv_sys_url_resource.RESERVED_FIELD1
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getReservedField1() {
        return reservedField1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.RESERVED_FIELD1
     *
     * @param reservedField1 the value for cwv_sys_url_resource.RESERVED_FIELD1
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setReservedField1(String reservedField1) {
        this.reservedField1 = reservedField1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.RESERVED_FIELD2
     *
     * @return the value of cwv_sys_url_resource.RESERVED_FIELD2
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public String getReservedField2() {
        return reservedField2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.RESERVED_FIELD2
     *
     * @param reservedField2 the value for cwv_sys_url_resource.RESERVED_FIELD2
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    public void setReservedField2(String reservedField2) {
        this.reservedField2 = reservedField2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
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
        CWVSysUrlResource other = (CWVSysUrlResource) that;
        return (this.getUrlResourceId() == null ? other.getUrlResourceId() == null : this.getUrlResourceId().equals(other.getUrlResourceId()))
            && (this.getUrlResourceName() == null ? other.getUrlResourceName() == null : this.getUrlResourceName().equals(other.getUrlResourceName()))
            && (this.getUrlResourcePath() == null ? other.getUrlResourcePath() == null : this.getUrlResourcePath().equals(other.getUrlResourcePath()))
            && (this.getUrlResourceType() == null ? other.getUrlResourceType() == null : this.getUrlResourceType().equals(other.getUrlResourceType()))
            && (this.getUrlLogOut() == null ? other.getUrlLogOut() == null : this.getUrlLogOut().equals(other.getUrlLogOut()))
            && (this.getResource() == null ? other.getResource() == null : this.getResource().equals(other.getResource()))
            && (this.getUserDayLimit() == null ? other.getUserDayLimit() == null : this.getUserDayLimit().equals(other.getUserDayLimit()))
            && (this.getIntervalTime() == null ? other.getIntervalTime() == null : this.getIntervalTime().equals(other.getIntervalTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getModifiedTime() == null ? other.getModifiedTime() == null : this.getModifiedTime().equals(other.getModifiedTime()))
            && (this.getModifiedBy() == null ? other.getModifiedBy() == null : this.getModifiedBy().equals(other.getModifiedBy()))
            && (this.getReservedField1() == null ? other.getReservedField1() == null : this.getReservedField1().equals(other.getReservedField1()))
            && (this.getReservedField2() == null ? other.getReservedField2() == null : this.getReservedField2().equals(other.getReservedField2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUrlResourceId() == null) ? 0 : getUrlResourceId().hashCode());
        result = prime * result + ((getUrlResourceName() == null) ? 0 : getUrlResourceName().hashCode());
        result = prime * result + ((getUrlResourcePath() == null) ? 0 : getUrlResourcePath().hashCode());
        result = prime * result + ((getUrlResourceType() == null) ? 0 : getUrlResourceType().hashCode());
        result = prime * result + ((getUrlLogOut() == null) ? 0 : getUrlLogOut().hashCode());
        result = prime * result + ((getResource() == null) ? 0 : getResource().hashCode());
        result = prime * result + ((getUserDayLimit() == null) ? 0 : getUserDayLimit().hashCode());
        result = prime * result + ((getIntervalTime() == null) ? 0 : getIntervalTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getModifiedTime() == null) ? 0 : getModifiedTime().hashCode());
        result = prime * result + ((getModifiedBy() == null) ? 0 : getModifiedBy().hashCode());
        result = prime * result + ((getReservedField1() == null) ? 0 : getReservedField1().hashCode());
        result = prime * result + ((getReservedField2() == null) ? 0 : getReservedField2().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Wed Aug 22 14:07:30 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urlResourceName=").append(urlResourceName);
        sb.append(", urlResourcePath=").append(urlResourcePath);
        sb.append(", urlResourceType=").append(urlResourceType);
        sb.append(", urlLogOut=").append(urlLogOut);
        sb.append(", resource=").append(resource);
        sb.append(", userDayLimit=").append(userDayLimit);
        sb.append(", intervalTime=").append(intervalTime);
        sb.append(", status=").append(status);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", reservedField1=").append(reservedField1);
        sb.append(", reservedField2=").append(reservedField2);
        sb.append("]");
        return sb.toString();
    }
}