package org.brewchain.cwv.dbgens.user.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVUserPropertyIncomeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_user_property_income.income_id
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    private Integer incomeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_user_property_income.income_id
     *
     * @return the value of cwv_user_property_income.income_id
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    public Integer getIncomeId() {
        return incomeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_user_property_income.income_id
     *
     * @param incomeId the value for cwv_user_property_income.income_id
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
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
        CWVUserPropertyIncomeKey other = (CWVUserPropertyIncomeKey) that;
        return (this.getIncomeId() == null ? other.getIncomeId() == null : this.getIncomeId().equals(other.getIncomeId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeId() == null) ? 0 : getIncomeId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_user_property_income
     *
     * @mbggenerated Mon Jul 09 14:56:18 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", incomeId=").append(incomeId);
        sb.append("]");
        return sb.toString();
    }
}