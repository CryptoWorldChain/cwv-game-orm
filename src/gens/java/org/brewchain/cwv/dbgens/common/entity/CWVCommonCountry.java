package org.brewchain.cwv.dbgens.common.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_common_country")
@AllArgsConstructor
@NoArgsConstructor
public class CWVCommonCountry extends CWVCommonCountryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.domain_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String domainCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.short_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String shortName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.full_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.region_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String regionCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.phone_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String phoneCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_common_country.sort
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    private String sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.domain_code
     *
     * @return the value of cwv_common_country.domain_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.domain_code
     *
     * @param domainCode the value for cwv_common_country.domain_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.short_name
     *
     * @return the value of cwv_common_country.short_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.short_name
     *
     * @param shortName the value for cwv_common_country.short_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.full_name
     *
     * @return the value of cwv_common_country.full_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.full_name
     *
     * @param fullName the value for cwv_common_country.full_name
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.region_code
     *
     * @return the value of cwv_common_country.region_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.region_code
     *
     * @param regionCode the value for cwv_common_country.region_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.phone_code
     *
     * @return the value of cwv_common_country.phone_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getPhoneCode() {
        return phoneCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.phone_code
     *
     * @param phoneCode the value for cwv_common_country.phone_code
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_common_country.sort
     *
     * @return the value of cwv_common_country.sort
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public String getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_common_country.sort
     *
     * @param sort the value for cwv_common_country.sort
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
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
        CWVCommonCountry other = (CWVCommonCountry) that;
        return (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getDomainCode() == null ? other.getDomainCode() == null : this.getDomainCode().equals(other.getDomainCode()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getRegionCode() == null ? other.getRegionCode() == null : this.getRegionCode().equals(other.getRegionCode()))
            && (this.getPhoneCode() == null ? other.getPhoneCode() == null : this.getPhoneCode().equals(other.getPhoneCode()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getDomainCode() == null) ? 0 : getDomainCode().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getRegionCode() == null) ? 0 : getRegionCode().hashCode());
        result = prime * result + ((getPhoneCode() == null) ? 0 : getPhoneCode().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_common_country
     *
     * @mbggenerated Thu Aug 23 16:16:46 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", domainCode=").append(domainCode);
        sb.append(", shortName=").append(shortName);
        sb.append(", fullName=").append(fullName);
        sb.append(", regionCode=").append(regionCode);
        sb.append(", phoneCode=").append(phoneCode);
        sb.append(", sort=").append(sort);
        sb.append("]");
        return sb.toString();
    }
}