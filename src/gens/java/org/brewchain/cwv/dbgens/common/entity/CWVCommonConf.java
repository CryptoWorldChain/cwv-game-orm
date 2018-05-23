package org.brewchain.cwv.dbgens.common.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_common_conf")
@AllArgsConstructor
@NoArgsConstructor
public class CWVCommonConf extends CWVCommonConfKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.parent
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    private String parent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.name
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.host
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    private String host;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.description
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_conf.status
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.parent
     *
     * @return the value of cwv_common_conf.parent
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public String getParent() {
        return parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.parent
     *
     * @param parent the value for cwv_common_conf.parent
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.name
     *
     * @return the value of cwv_common_conf.name
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.name
     *
     * @param name the value for cwv_common_conf.name
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.host
     *
     * @return the value of cwv_common_conf.host
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.host
     *
     * @param host the value for cwv_common_conf.host
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.description
     *
     * @return the value of cwv_common_conf.description
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.description
     *
     * @param description the value for cwv_common_conf.description
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_conf.status
     *
     * @return the value of cwv_common_conf.status
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_conf.status
     *
     * @param status the value for cwv_common_conf.status
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
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
        CWVCommonConf other = (CWVCommonConf) that;
        return (this.getConfId() == null ? other.getConfId() == null : this.getConfId().equals(other.getConfId()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getHost() == null ? other.getHost() == null : this.getHost().equals(other.getHost()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConfId() == null) ? 0 : getConfId().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getHost() == null) ? 0 : getHost().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_conf
     *
     * @mbggenerated Wed May 23 22:06:39 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parent=").append(parent);
        sb.append(", name=").append(name);
        sb.append(", host=").append(host);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}