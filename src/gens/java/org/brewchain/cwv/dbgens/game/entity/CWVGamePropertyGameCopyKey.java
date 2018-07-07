package org.brewchain.cwv.dbgens.game.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class CWVGamePropertyGameCopyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy.game_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    private Integer gameId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy.game_id
     *
     * @return the value of cwv_game_property_game_copy.game_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy.game_id
     *
     * @param gameId the value for cwv_game_property_game_copy.game_id
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy
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
        CWVGamePropertyGameCopyKey other = (CWVGamePropertyGameCopyKey) that;
        return (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy
     *
     * @mbggenerated Sat Jul 07 15:07:11 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameId=").append(gameId);
        sb.append("]");
        return sb.toString();
    }
}