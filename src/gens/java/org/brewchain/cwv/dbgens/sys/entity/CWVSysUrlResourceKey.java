package org.brewchain.cwv.dbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVSysUrlResourceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_sys_url_resource.URL_RESOURCE_ID
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
     */
    private String urlResourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_sys_url_resource.URL_RESOURCE_ID
     *
     * @return the value of cwv_sys_url_resource.URL_RESOURCE_ID
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
     */
    public String getUrlResourceId() {
        return urlResourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_sys_url_resource.URL_RESOURCE_ID
     *
     * @param urlResourceId the value for cwv_sys_url_resource.URL_RESOURCE_ID
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
     */
    public void setUrlResourceId(String urlResourceId) {
        this.urlResourceId = urlResourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
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
        CWVSysUrlResourceKey other = (CWVSysUrlResourceKey) that;
        return (this.getUrlResourceId() == null ? other.getUrlResourceId() == null : this.getUrlResourceId().equals(other.getUrlResourceId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUrlResourceId() == null) ? 0 : getUrlResourceId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_sys_url_resource
     *
     * @mbggenerated Sat Jul 07 13:31:13 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urlResourceId=").append(urlResourceId);
        sb.append("]");
        return sb.toString();
    }
}