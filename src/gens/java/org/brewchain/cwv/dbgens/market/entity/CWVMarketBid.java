package org.brewchain.cwv.dbgens.market.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="cwv_market_bid")
@AllArgsConstructor
@NoArgsConstructor
public class CWVMarketBid extends CWVMarketBidKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.game_property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer gamePropertyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.owner
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.auction_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date auctionStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.auction_end
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date auctionEnd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.increase_ladder
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Long increaseLadder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.bid_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private BigDecimal bidStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.bid_amount
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private BigDecimal bidAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.bidders_count
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer biddersCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Byte chainStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainTransHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String chainContract;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.last_update_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.announce_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date announceTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.create_user
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.country_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer countryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.map_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private Integer mapId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.property_template_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyTemplateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.property_template
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyTemplate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.nick_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String nickName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.property_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.property_type
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.property_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String propertyStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.income_remark
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String incomeRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.last_price
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private BigDecimal lastPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwv_market_bid.image_url
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    private String imageUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.game_property_id
     *
     * @return the value of cwv_market_bid.game_property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getGamePropertyId() {
        return gamePropertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.game_property_id
     *
     * @param gamePropertyId the value for cwv_market_bid.game_property_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setGamePropertyId(Integer gamePropertyId) {
        this.gamePropertyId = gamePropertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.owner
     *
     * @return the value of cwv_market_bid.owner
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.owner
     *
     * @param owner the value for cwv_market_bid.owner
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.auction_start
     *
     * @return the value of cwv_market_bid.auction_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getAuctionStart() {
        return auctionStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.auction_start
     *
     * @param auctionStart the value for cwv_market_bid.auction_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setAuctionStart(Date auctionStart) {
        this.auctionStart = auctionStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.auction_end
     *
     * @return the value of cwv_market_bid.auction_end
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getAuctionEnd() {
        return auctionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.auction_end
     *
     * @param auctionEnd the value for cwv_market_bid.auction_end
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.increase_ladder
     *
     * @return the value of cwv_market_bid.increase_ladder
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Long getIncreaseLadder() {
        return increaseLadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.increase_ladder
     *
     * @param increaseLadder the value for cwv_market_bid.increase_ladder
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setIncreaseLadder(Long increaseLadder) {
        this.increaseLadder = increaseLadder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.bid_start
     *
     * @return the value of cwv_market_bid.bid_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public BigDecimal getBidStart() {
        return bidStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.bid_start
     *
     * @param bidStart the value for cwv_market_bid.bid_start
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setBidStart(BigDecimal bidStart) {
        this.bidStart = bidStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.bid_amount
     *
     * @return the value of cwv_market_bid.bid_amount
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.bid_amount
     *
     * @param bidAmount the value for cwv_market_bid.bid_amount
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.bidders_count
     *
     * @return the value of cwv_market_bid.bidders_count
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getBiddersCount() {
        return biddersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.bidders_count
     *
     * @param biddersCount the value for cwv_market_bid.bidders_count
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setBiddersCount(Integer biddersCount) {
        this.biddersCount = biddersCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.status
     *
     * @return the value of cwv_market_bid.status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.status
     *
     * @param status the value for cwv_market_bid.status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.chain_status
     *
     * @return the value of cwv_market_bid.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Byte getChainStatus() {
        return chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.chain_status
     *
     * @param chainStatus the value for cwv_market_bid.chain_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainStatus(Byte chainStatus) {
        this.chainStatus = chainStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.chain_trans_hash
     *
     * @return the value of cwv_market_bid.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainTransHash() {
        return chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.chain_trans_hash
     *
     * @param chainTransHash the value for cwv_market_bid.chain_trans_hash
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainTransHash(String chainTransHash) {
        this.chainTransHash = chainTransHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.chain_contract
     *
     * @return the value of cwv_market_bid.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getChainContract() {
        return chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.chain_contract
     *
     * @param chainContract the value for cwv_market_bid.chain_contract
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setChainContract(String chainContract) {
        this.chainContract = chainContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.last_update_time
     *
     * @return the value of cwv_market_bid.last_update_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.last_update_time
     *
     * @param lastUpdateTime the value for cwv_market_bid.last_update_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.announce_time
     *
     * @return the value of cwv_market_bid.announce_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getAnnounceTime() {
        return announceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.announce_time
     *
     * @param announceTime the value for cwv_market_bid.announce_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.create_time
     *
     * @return the value of cwv_market_bid.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.create_time
     *
     * @param createTime the value for cwv_market_bid.create_time
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.create_user
     *
     * @return the value of cwv_market_bid.create_user
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.create_user
     *
     * @param createUser the value for cwv_market_bid.create_user
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.country_id
     *
     * @return the value of cwv_market_bid.country_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.country_id
     *
     * @param countryId the value for cwv_market_bid.country_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.map_id
     *
     * @return the value of cwv_market_bid.map_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public Integer getMapId() {
        return mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.map_id
     *
     * @param mapId the value for cwv_market_bid.map_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.property_template_id
     *
     * @return the value of cwv_market_bid.property_template_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyTemplateId() {
        return propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.property_template_id
     *
     * @param propertyTemplateId the value for cwv_market_bid.property_template_id
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyTemplateId(String propertyTemplateId) {
        this.propertyTemplateId = propertyTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.property_template
     *
     * @return the value of cwv_market_bid.property_template
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyTemplate() {
        return propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.property_template
     *
     * @param propertyTemplate the value for cwv_market_bid.property_template
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyTemplate(String propertyTemplate) {
        this.propertyTemplate = propertyTemplate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.nick_name
     *
     * @return the value of cwv_market_bid.nick_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.nick_name
     *
     * @param nickName the value for cwv_market_bid.nick_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.property_name
     *
     * @return the value of cwv_market_bid.property_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.property_name
     *
     * @param propertyName the value for cwv_market_bid.property_name
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.property_type
     *
     * @return the value of cwv_market_bid.property_type
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.property_type
     *
     * @param propertyType the value for cwv_market_bid.property_type
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.property_status
     *
     * @return the value of cwv_market_bid.property_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.property_status
     *
     * @param propertyStatus the value for cwv_market_bid.property_status
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.income_remark
     *
     * @return the value of cwv_market_bid.income_remark
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getIncomeRemark() {
        return incomeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.income_remark
     *
     * @param incomeRemark the value for cwv_market_bid.income_remark
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setIncomeRemark(String incomeRemark) {
        this.incomeRemark = incomeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.last_price
     *
     * @return the value of cwv_market_bid.last_price
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.last_price
     *
     * @param lastPrice the value for cwv_market_bid.last_price
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwv_market_bid.image_url
     *
     * @return the value of cwv_market_bid.image_url
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwv_market_bid.image_url
     *
     * @param imageUrl the value for cwv_market_bid.image_url
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
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
        CWVMarketBid other = (CWVMarketBid) that;
        return (this.getBidId() == null ? other.getBidId() == null : this.getBidId().equals(other.getBidId()))
            && (this.getGamePropertyId() == null ? other.getGamePropertyId() == null : this.getGamePropertyId().equals(other.getGamePropertyId()))
            && (this.getOwner() == null ? other.getOwner() == null : this.getOwner().equals(other.getOwner()))
            && (this.getAuctionStart() == null ? other.getAuctionStart() == null : this.getAuctionStart().equals(other.getAuctionStart()))
            && (this.getAuctionEnd() == null ? other.getAuctionEnd() == null : this.getAuctionEnd().equals(other.getAuctionEnd()))
            && (this.getIncreaseLadder() == null ? other.getIncreaseLadder() == null : this.getIncreaseLadder().equals(other.getIncreaseLadder()))
            && (this.getBidStart() == null ? other.getBidStart() == null : this.getBidStart().equals(other.getBidStart()))
            && (this.getBidAmount() == null ? other.getBidAmount() == null : this.getBidAmount().equals(other.getBidAmount()))
            && (this.getBiddersCount() == null ? other.getBiddersCount() == null : this.getBiddersCount().equals(other.getBiddersCount()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getChainStatus() == null ? other.getChainStatus() == null : this.getChainStatus().equals(other.getChainStatus()))
            && (this.getChainTransHash() == null ? other.getChainTransHash() == null : this.getChainTransHash().equals(other.getChainTransHash()))
            && (this.getChainContract() == null ? other.getChainContract() == null : this.getChainContract().equals(other.getChainContract()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getAnnounceTime() == null ? other.getAnnounceTime() == null : this.getAnnounceTime().equals(other.getAnnounceTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCountryId() == null ? other.getCountryId() == null : this.getCountryId().equals(other.getCountryId()))
            && (this.getMapId() == null ? other.getMapId() == null : this.getMapId().equals(other.getMapId()))
            && (this.getPropertyTemplateId() == null ? other.getPropertyTemplateId() == null : this.getPropertyTemplateId().equals(other.getPropertyTemplateId()))
            && (this.getPropertyTemplate() == null ? other.getPropertyTemplate() == null : this.getPropertyTemplate().equals(other.getPropertyTemplate()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getPropertyName() == null ? other.getPropertyName() == null : this.getPropertyName().equals(other.getPropertyName()))
            && (this.getPropertyType() == null ? other.getPropertyType() == null : this.getPropertyType().equals(other.getPropertyType()))
            && (this.getPropertyStatus() == null ? other.getPropertyStatus() == null : this.getPropertyStatus().equals(other.getPropertyStatus()))
            && (this.getIncomeRemark() == null ? other.getIncomeRemark() == null : this.getIncomeRemark().equals(other.getIncomeRemark()))
            && (this.getLastPrice() == null ? other.getLastPrice() == null : this.getLastPrice().equals(other.getLastPrice()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBidId() == null) ? 0 : getBidId().hashCode());
        result = prime * result + ((getGamePropertyId() == null) ? 0 : getGamePropertyId().hashCode());
        result = prime * result + ((getOwner() == null) ? 0 : getOwner().hashCode());
        result = prime * result + ((getAuctionStart() == null) ? 0 : getAuctionStart().hashCode());
        result = prime * result + ((getAuctionEnd() == null) ? 0 : getAuctionEnd().hashCode());
        result = prime * result + ((getIncreaseLadder() == null) ? 0 : getIncreaseLadder().hashCode());
        result = prime * result + ((getBidStart() == null) ? 0 : getBidStart().hashCode());
        result = prime * result + ((getBidAmount() == null) ? 0 : getBidAmount().hashCode());
        result = prime * result + ((getBiddersCount() == null) ? 0 : getBiddersCount().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getChainStatus() == null) ? 0 : getChainStatus().hashCode());
        result = prime * result + ((getChainTransHash() == null) ? 0 : getChainTransHash().hashCode());
        result = prime * result + ((getChainContract() == null) ? 0 : getChainContract().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getAnnounceTime() == null) ? 0 : getAnnounceTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCountryId() == null) ? 0 : getCountryId().hashCode());
        result = prime * result + ((getMapId() == null) ? 0 : getMapId().hashCode());
        result = prime * result + ((getPropertyTemplateId() == null) ? 0 : getPropertyTemplateId().hashCode());
        result = prime * result + ((getPropertyTemplate() == null) ? 0 : getPropertyTemplate().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        result = prime * result + ((getPropertyType() == null) ? 0 : getPropertyType().hashCode());
        result = prime * result + ((getPropertyStatus() == null) ? 0 : getPropertyStatus().hashCode());
        result = prime * result + ((getIncomeRemark() == null) ? 0 : getIncomeRemark().hashCode());
        result = prime * result + ((getLastPrice() == null) ? 0 : getLastPrice().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwv_market_bid
     *
     * @mbggenerated Mon Jul 23 15:21:57 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gamePropertyId=").append(gamePropertyId);
        sb.append(", owner=").append(owner);
        sb.append(", auctionStart=").append(auctionStart);
        sb.append(", auctionEnd=").append(auctionEnd);
        sb.append(", increaseLadder=").append(increaseLadder);
        sb.append(", bidStart=").append(bidStart);
        sb.append(", bidAmount=").append(bidAmount);
        sb.append(", biddersCount=").append(biddersCount);
        sb.append(", status=").append(status);
        sb.append(", chainStatus=").append(chainStatus);
        sb.append(", chainTransHash=").append(chainTransHash);
        sb.append(", chainContract=").append(chainContract);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", announceTime=").append(announceTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", countryId=").append(countryId);
        sb.append(", mapId=").append(mapId);
        sb.append(", propertyTemplateId=").append(propertyTemplateId);
        sb.append(", propertyTemplate=").append(propertyTemplate);
        sb.append(", nickName=").append(nickName);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", propertyType=").append(propertyType);
        sb.append(", propertyStatus=").append(propertyStatus);
        sb.append(", incomeRemark=").append(incomeRemark);
        sb.append(", lastPrice=").append(lastPrice);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append("]");
        return sb.toString();
    }
}