
package com.twitter.dev.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tweetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tweetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contributors" type="{http://dev.twitter.com/api}contributorsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinates" type="{http://dev.twitter.com/api}coordinatesType" minOccurs="0"/>
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="current_user_retweet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entities" type="{http://dev.twitter.com/api}entitiesType"/>
 *         &lt;element name="favorite_count" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="favorited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="filter_level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="in_reply_to_screen_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_reply_to_status_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="in_reply_to_status_id_str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="in_reply_to_user_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="in_reply_to_user_id_str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://dev.twitter.com/api}placesType" minOccurs="0"/>
 *         &lt;element name="possibly_sensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="scopes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retweet_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="retweeted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retweeted_status" type="{http://dev.twitter.com/api}tweetsType"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="truncated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="user" type="{http://dev.twitter.com/api}usersType"/>
 *         &lt;element name="withheld_copyright" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="withheld_in_countries" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="withheld_scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tweetsType", propOrder = {
    "annotations",
    "contributors",
    "coordinates",
    "createdAt",
    "currentUserRetweet",
    "entities",
    "favoriteCount",
    "favorited",
    "filterLevel",
    "geo",
    "id",
    "idStr",
    "inReplyToScreenName",
    "inReplyToStatusId",
    "inReplyToStatusIdStr",
    "inReplyToUserId",
    "inReplyToUserIdStr",
    "lang",
    "place",
    "possiblySensitive",
    "scopes",
    "retweetCount",
    "retweeted",
    "retweetedStatus",
    "source",
    "text",
    "truncated",
    "user",
    "withheldCopyright",
    "withheldInCountries",
    "withheldScope"
})
public class TweetsType {

    @XmlElement(required = true)
    protected String annotations;
    protected List<ContributorsType> contributors;
    protected CoordinatesType coordinates;
    @XmlElement(name = "created_at", required = true)
    protected String createdAt;
    @XmlElement(name = "current_user_retweet", required = true)
    protected String currentUserRetweet;
    @XmlElement(required = true)
    protected EntitiesType entities;
    @XmlElement(name = "favorite_count")
    protected BigInteger favoriteCount;
    protected Boolean favorited;
    @XmlElement(name = "filter_level", required = true)
    protected String filterLevel;
    protected String geo;
    protected long id;
    @XmlElement(name = "id_str", required = true)
    protected String idStr;
    @XmlElement(name = "in_reply_to_screen_name")
    protected String inReplyToScreenName;
    @XmlElement(name = "in_reply_to_status_id")
    protected Long inReplyToStatusId;
    @XmlElement(name = "in_reply_to_status_id_str")
    protected String inReplyToStatusIdStr;
    @XmlElement(name = "in_reply_to_user_id")
    protected Long inReplyToUserId;
    @XmlElement(name = "in_reply_to_user_id_str")
    protected String inReplyToUserIdStr;
    protected String lang;
    protected PlacesType place;
    @XmlElement(name = "possibly_sensitive")
    protected Boolean possiblySensitive;
    @XmlElement(required = true)
    protected String scopes;
    @XmlElement(name = "retweet_count")
    protected int retweetCount;
    protected boolean retweeted;
    @XmlElement(name = "retweeted_status", required = true)
    protected TweetsType retweetedStatus;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String text;
    protected boolean truncated;
    @XmlElement(required = true)
    protected UsersType user;
    @XmlElement(name = "withheld_copyright")
    protected boolean withheldCopyright;
    @XmlElement(name = "withheld_in_countries", required = true)
    protected List<String> withheldInCountries;
    @XmlElement(name = "withheld_scope", required = true)
    protected String withheldScope;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorsType }
     * 
     * 
     */
    public List<ContributorsType> getContributors() {
        if (contributors == null) {
            contributors = new ArrayList<ContributorsType>();
        }
        return this.contributors;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the currentUserRetweet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUserRetweet() {
        return currentUserRetweet;
    }

    /**
     * Sets the value of the currentUserRetweet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUserRetweet(String value) {
        this.currentUserRetweet = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link EntitiesType }
     *     
     */
    public EntitiesType getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitiesType }
     *     
     */
    public void setEntities(EntitiesType value) {
        this.entities = value;
    }

    /**
     * Gets the value of the favoriteCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFavoriteCount() {
        return favoriteCount;
    }

    /**
     * Sets the value of the favoriteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFavoriteCount(BigInteger value) {
        this.favoriteCount = value;
    }

    /**
     * Gets the value of the favorited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorited() {
        return favorited;
    }

    /**
     * Sets the value of the favorited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorited(Boolean value) {
        this.favorited = value;
    }

    /**
     * Gets the value of the filterLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLevel() {
        return filterLevel;
    }

    /**
     * Sets the value of the filterLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLevel(String value) {
        this.filterLevel = value;
    }

    /**
     * Gets the value of the geo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo() {
        return geo;
    }

    /**
     * Sets the value of the geo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo(String value) {
        this.geo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     * Sets the value of the idStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStr(String value) {
        this.idStr = value;
    }

    /**
     * Gets the value of the inReplyToScreenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * Sets the value of the inReplyToScreenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyToScreenName(String value) {
        this.inReplyToScreenName = value;
    }

    /**
     * Gets the value of the inReplyToStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * Sets the value of the inReplyToStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInReplyToStatusId(Long value) {
        this.inReplyToStatusId = value;
    }

    /**
     * Gets the value of the inReplyToStatusIdStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     * Sets the value of the inReplyToStatusIdStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyToStatusIdStr(String value) {
        this.inReplyToStatusIdStr = value;
    }

    /**
     * Gets the value of the inReplyToUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * Sets the value of the inReplyToUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInReplyToUserId(Long value) {
        this.inReplyToUserId = value;
    }

    /**
     * Gets the value of the inReplyToUserIdStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     * Sets the value of the inReplyToUserIdStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyToUserIdStr(String value) {
        this.inReplyToUserIdStr = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesType }
     *     
     */
    public PlacesType getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesType }
     *     
     */
    public void setPlace(PlacesType value) {
        this.place = value;
    }

    /**
     * Gets the value of the possiblySensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    /**
     * Sets the value of the possiblySensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossiblySensitive(Boolean value) {
        this.possiblySensitive = value;
    }

    /**
     * Gets the value of the scopes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopes() {
        return scopes;
    }

    /**
     * Sets the value of the scopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopes(String value) {
        this.scopes = value;
    }

    /**
     * Gets the value of the retweetCount property.
     * 
     */
    public int getRetweetCount() {
        return retweetCount;
    }

    /**
     * Sets the value of the retweetCount property.
     * 
     */
    public void setRetweetCount(int value) {
        this.retweetCount = value;
    }

    /**
     * Gets the value of the retweeted property.
     * 
     */
    public boolean isRetweeted() {
        return retweeted;
    }

    /**
     * Sets the value of the retweeted property.
     * 
     */
    public void setRetweeted(boolean value) {
        this.retweeted = value;
    }

    /**
     * Gets the value of the retweetedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TweetsType }
     *     
     */
    public TweetsType getRetweetedStatus() {
        return retweetedStatus;
    }

    /**
     * Sets the value of the retweetedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TweetsType }
     *     
     */
    public void setRetweetedStatus(TweetsType value) {
        this.retweetedStatus = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the truncated property.
     * 
     */
    public boolean isTruncated() {
        return truncated;
    }

    /**
     * Sets the value of the truncated property.
     * 
     */
    public void setTruncated(boolean value) {
        this.truncated = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UsersType }
     *     
     */
    public UsersType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsersType }
     *     
     */
    public void setUser(UsersType value) {
        this.user = value;
    }

    /**
     * Gets the value of the withheldCopyright property.
     * 
     */
    public boolean isWithheldCopyright() {
        return withheldCopyright;
    }

    /**
     * Sets the value of the withheldCopyright property.
     * 
     */
    public void setWithheldCopyright(boolean value) {
        this.withheldCopyright = value;
    }

    /**
     * Gets the value of the withheldInCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withheldInCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithheldInCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWithheldInCountries() {
        if (withheldInCountries == null) {
            withheldInCountries = new ArrayList<String>();
        }
        return this.withheldInCountries;
    }

    /**
     * Gets the value of the withheldScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithheldScope() {
        return withheldScope;
    }

    /**
     * Sets the value of the withheldScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithheldScope(String value) {
        this.withheldScope = value;
    }

}
