package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGameDicKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.dic_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    private Integer dicId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.dic_id
     *
     * @return the value of cwv_game_dic.dic_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.dic_id
     *
     * @param dicId the value for cwv_game_dic.dic_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    public void setDicId(Integer dicId) {
        this.dicId = dicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
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
        CWVGameDicKey other = (CWVGameDicKey) that;
        return (this.getDicId() == null ? other.getDicId() == null : this.getDicId().equals(other.getDicId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDicId() == null) ? 0 : getDicId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dicId=").append(dicId);
        sb.append("]");
        return sb.toString();
    }
}