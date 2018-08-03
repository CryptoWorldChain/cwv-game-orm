package org.brewchain.cwv.dbgens.game.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_game_property_game_copy_copy")
@AllArgsConstructor
@NoArgsConstructor
public class CWVGamePropertyGameCopyCopy extends CWVGamePropertyGameCopyCopyKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.property_id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Integer propertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.name
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.game_type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String gameType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.game_url
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String gameUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.game_status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String gameStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.icon
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.invoke_game
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String invokeGame;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.players_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Integer playersCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.developers_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Integer developersCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.instructions
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String instructions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.images
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private String images;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_game_property_game_copy_copy.income
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    private BigDecimal income;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.property_id
     *
     * @return the value of cwv_game_property_game_copy_copy.property_id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.property_id
     *
     * @param propertyId the value for cwv_game_property_game_copy_copy.property_id
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.name
     *
     * @return the value of cwv_game_property_game_copy_copy.name
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.name
     *
     * @param name the value for cwv_game_property_game_copy_copy.name
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.type
     *
     * @return the value of cwv_game_property_game_copy_copy.type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.type
     *
     * @param type the value for cwv_game_property_game_copy_copy.type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.game_type
     *
     * @return the value of cwv_game_property_game_copy_copy.game_type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.game_type
     *
     * @param gameType the value for cwv_game_property_game_copy_copy.game_type
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.game_url
     *
     * @return the value of cwv_game_property_game_copy_copy.game_url
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getGameUrl() {
        return gameUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.game_url
     *
     * @param gameUrl the value for cwv_game_property_game_copy_copy.game_url
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setGameUrl(String gameUrl) {
        this.gameUrl = gameUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.game_status
     *
     * @return the value of cwv_game_property_game_copy_copy.game_status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getGameStatus() {
        return gameStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.game_status
     *
     * @param gameStatus the value for cwv_game_property_game_copy_copy.game_status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.icon
     *
     * @return the value of cwv_game_property_game_copy_copy.icon
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.icon
     *
     * @param icon the value for cwv_game_property_game_copy_copy.icon
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.invoke_game
     *
     * @return the value of cwv_game_property_game_copy_copy.invoke_game
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getInvokeGame() {
        return invokeGame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.invoke_game
     *
     * @param invokeGame the value for cwv_game_property_game_copy_copy.invoke_game
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setInvokeGame(String invokeGame) {
        this.invokeGame = invokeGame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.players_count
     *
     * @return the value of cwv_game_property_game_copy_copy.players_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Integer getPlayersCount() {
        return playersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.players_count
     *
     * @param playersCount the value for cwv_game_property_game_copy_copy.players_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setPlayersCount(Integer playersCount) {
        this.playersCount = playersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.developers_count
     *
     * @return the value of cwv_game_property_game_copy_copy.developers_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Integer getDevelopersCount() {
        return developersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.developers_count
     *
     * @param developersCount the value for cwv_game_property_game_copy_copy.developers_count
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setDevelopersCount(Integer developersCount) {
        this.developersCount = developersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.instructions
     *
     * @return the value of cwv_game_property_game_copy_copy.instructions
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.instructions
     *
     * @param instructions the value for cwv_game_property_game_copy_copy.instructions
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.images
     *
     * @return the value of cwv_game_property_game_copy_copy.images
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.images
     *
     * @param images the value for cwv_game_property_game_copy_copy.images
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.status
     *
     * @return the value of cwv_game_property_game_copy_copy.status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.status
     *
     * @param status the value for cwv_game_property_game_copy_copy.status
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_game_property_game_copy_copy.income
     *
     * @return the value of cwv_game_property_game_copy_copy.income
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_game_property_game_copy_copy.income
     *
     * @param income the value for cwv_game_property_game_copy_copy.income
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy_copy
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
        CWVGamePropertyGameCopyCopy other = (CWVGamePropertyGameCopyCopy) that;
        return (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()))
            && (this.getPropertyId() == null ? other.getPropertyId() == null : this.getPropertyId().equals(other.getPropertyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getGameType() == null ? other.getGameType() == null : this.getGameType().equals(other.getGameType()))
            && (this.getGameUrl() == null ? other.getGameUrl() == null : this.getGameUrl().equals(other.getGameUrl()))
            && (this.getGameStatus() == null ? other.getGameStatus() == null : this.getGameStatus().equals(other.getGameStatus()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getInvokeGame() == null ? other.getInvokeGame() == null : this.getInvokeGame().equals(other.getInvokeGame()))
            && (this.getPlayersCount() == null ? other.getPlayersCount() == null : this.getPlayersCount().equals(other.getPlayersCount()))
            && (this.getDevelopersCount() == null ? other.getDevelopersCount() == null : this.getDevelopersCount().equals(other.getDevelopersCount()))
            && (this.getInstructions() == null ? other.getInstructions() == null : this.getInstructions().equals(other.getInstructions()))
            && (this.getImages() == null ? other.getImages() == null : this.getImages().equals(other.getImages()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy_copy
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        result = prime * result + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getGameType() == null) ? 0 : getGameType().hashCode());
        result = prime * result + ((getGameUrl() == null) ? 0 : getGameUrl().hashCode());
        result = prime * result + ((getGameStatus() == null) ? 0 : getGameStatus().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getInvokeGame() == null) ? 0 : getInvokeGame().hashCode());
        result = prime * result + ((getPlayersCount() == null) ? 0 : getPlayersCount().hashCode());
        result = prime * result + ((getDevelopersCount() == null) ? 0 : getDevelopersCount().hashCode());
        result = prime * result + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        result = prime * result + ((getImages() == null) ? 0 : getImages().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_game_property_game_copy_copy
     *
     * @mbggenerated Fri Aug 03 16:45:08 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", propertyId=").append(propertyId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", gameType=").append(gameType);
        sb.append(", gameUrl=").append(gameUrl);
        sb.append(", gameStatus=").append(gameStatus);
        sb.append(", icon=").append(icon);
        sb.append(", invokeGame=").append(invokeGame);
        sb.append(", playersCount=").append(playersCount);
        sb.append(", developersCount=").append(developersCount);
        sb.append(", instructions=").append(instructions);
        sb.append(", images=").append(images);
        sb.append(", status=").append(status);
        sb.append(", income=").append(income);
        sb.append("]");
        return sb.toString();
    }
}