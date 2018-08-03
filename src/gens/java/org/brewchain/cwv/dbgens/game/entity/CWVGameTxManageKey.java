package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameTxManageKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_tx_manage.id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_tx_manage.id
     *
     * @return the value of cwv_game_tx_manage.id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_tx_manage.id
     *
     * @param id the value for cwv_game_tx_manage.id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
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
        CWVGameTxManageKey other = (CWVGameTxManageKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_tx_manage
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}