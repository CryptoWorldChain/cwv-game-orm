package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_dic")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGameDic extends CWVGameDicKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.dic_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    private String dicKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.dic_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    private String dicValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.parent_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    private String parentKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.parent_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    private String parentValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_dic.seq
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    private Short seq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.dic_key
     *
     * @return the value of cwv_game_dic.dic_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public String getDicKey() {
        return dicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.dic_key
     *
     * @param dicKey the value for cwv_game_dic.dic_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setDicKey(String dicKey) {
        this.dicKey = dicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.dic_value
     *
     * @return the value of cwv_game_dic.dic_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public String getDicValue() {
        return dicValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.dic_value
     *
     * @param dicValue the value for cwv_game_dic.dic_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.parent_key
     *
     * @return the value of cwv_game_dic.parent_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public String getParentKey() {
        return parentKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.parent_key
     *
     * @param parentKey the value for cwv_game_dic.parent_key
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.parent_value
     *
     * @return the value of cwv_game_dic.parent_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public String getParentValue() {
        return parentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.parent_value
     *
     * @param parentValue the value for cwv_game_dic.parent_value
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setParentValue(String parentValue) {
        this.parentValue = parentValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_dic.seq
     *
     * @return the value of cwv_game_dic.seq
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public Short getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_dic.seq
     *
     * @param seq the value for cwv_game_dic.seq
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
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
        CWVGameDic other = (CWVGameDic) that;
        return (this.getDicId() == null ? other.getDicId() == null : this.getDicId().equals(other.getDicId()))
            && (this.getDicKey() == null ? other.getDicKey() == null : this.getDicKey().equals(other.getDicKey()))
            && (this.getDicValue() == null ? other.getDicValue() == null : this.getDicValue().equals(other.getDicValue()))
            && (this.getParentKey() == null ? other.getParentKey() == null : this.getParentKey().equals(other.getParentKey()))
            && (this.getParentValue() == null ? other.getParentValue() == null : this.getParentValue().equals(other.getParentValue()))
            && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDicId() == null) ? 0 : getDicId().hashCode());
        result = prime * result + ((getDicKey() == null) ? 0 : getDicKey().hashCode());
        result = prime * result + ((getDicValue() == null) ? 0 : getDicValue().hashCode());
        result = prime * result + ((getParentKey() == null) ? 0 : getParentKey().hashCode());
        result = prime * result + ((getParentValue() == null) ? 0 : getParentValue().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_dic
     *
     * @mbggenerated Fri Jul 20 14:49:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dicKey=").append(dicKey);
        sb.append(", dicValue=").append(dicValue);
        sb.append(", parentKey=").append(parentKey);
        sb.append(", parentValue=").append(parentValue);
        sb.append(", seq=").append(seq);
        sb.append("]");
        return sb.toString();
    }
}