
/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2014
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */

package com.twitter.dev.api;

import com.tomitribe.wadlx.api.Description;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for usersType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="usersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contributors_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default_profile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="default_profile_image" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entities" type="{http://dev.twitter.com/api}entitiesType"/>
 *         &lt;element name="favourites_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="follow_request_sent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="following" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="followers_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="friends_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="geo_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_translator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listed_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="profile_background_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_background_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_background_image_url_https" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_background_tile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="profile_banner_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_image_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_image_url_https" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_link_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_sidebar_border_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_sidebar_fill_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_text_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="profile_use_background_image" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="screen_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="show_all_inline_media" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://dev.twitter.com/api}tweetsType" minOccurs="0"/>
 *         &lt;element name="statuses_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="time_zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utc_offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="verified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="withheld_in_countries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="withheld_scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Description("<p>Java class for usersType complex type.\n" +
        "<p/>\n" +
        "<p>The following schema fragment specifies the expected content contained within this class.\n" +
        "<p/>\n" +
        "<pre>\n" +
        "&lt;complexType name=\"usersType\">\n" +
        "  &lt;complexContent>\n" +
        "    &lt;restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n" +
        "      &lt;sequence>\n" +
        "        &lt;element name=\"contributors_enabled\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"created_at\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"default_profile\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"default_profile_image\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"description\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"entities\" type=\"{http://dev.twitter.com/api}entitiesType\"/>\n" +
        "        &lt;element name=\"favourites_count\" type=\"{http://www.w3.org/2001/XMLSchema}int\"/>\n" +
        "        &lt;element name=\"follow_request_sent\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"following\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"followers_count\" type=\"{http://www.w3.org/2001/XMLSchema}int\"/>\n" +
        "        &lt;element name=\"friends_count\" type=\"{http://www.w3.org/2001/XMLSchema}int\"/>\n" +
        "        &lt;element name=\"geo_enabled\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"id\" type=\"{http://www.w3.org/2001/XMLSchema}long\"/>\n" +
        "        &lt;element name=\"id_str\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"is_translator\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"lang\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"listed_count\" type=\"{http://www.w3.org/2001/XMLSchema}int\"/>\n" +
        "        &lt;element name=\"location\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"notifications\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"profile_background_color\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_background_image_url\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_background_image_url_https\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_background_tile\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"profile_banner_url\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_image_url\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_image_url_https\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_link_color\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_sidebar_border_color\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_sidebar_fill_color\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_text_color\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"profile_use_background_image\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"protected\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"screen_name\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"show_all_inline_media\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"status\" type=\"{http://dev.twitter.com/api}tweetsType\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"statuses_count\" type=\"{http://www.w3.org/2001/XMLSchema}int\"/>\n" +
        "        &lt;element name=\"time_zone\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"utc_offset\" type=\"{http://www.w3.org/2001/XMLSchema}int\" minOccurs=\"0\"/>\n" +
        "        &lt;element name=\"verified\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\"/>\n" +
        "        &lt;element name=\"withheld_in_countries\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "        &lt;element name=\"withheld_scope\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n" +
        "      &lt;/sequence>\n" +
        "    &lt;/restriction>\n" +
        "  &lt;/complexContent>\n" +
        "&lt;/complexType>\n" +
        "</pre>")
public class UsersType {

    @XmlElement(name = "contributors_enabled")
    @Description("contributorsEnabled")
    protected boolean contributorsEnabled;
    @XmlElement(name = "created_at", required = true)
    @Description("createdAt")
    protected String createdAt;
    @XmlElement(name = "default_profile")
    @Description("defaultProfile")
    protected boolean defaultProfile;
    @XmlElement(name = "default_profile_image")
    @Description("defaultProfileImage")
    protected boolean defaultProfileImage;
    @Description("description")
    protected String description;
    @XmlElement(required = true)
    @Description("entities")
    protected EntitiesType entities;
    @XmlElement(name = "favourites_count")
    @Description("favouritesCount")
    protected int favouritesCount;
    @XmlElement(name = "follow_request_sent")
    @Description("followRequestSent")
    protected Boolean followRequestSent;
    @Description("following")
    protected Boolean following;
    @XmlElement(name = "followers_count")
    protected int followersCount;
    @XmlElement(name = "friends_count")
    protected int friendsCount;
    @XmlElement(name = "geo_enabled")
    protected boolean geoEnabled;
    protected long id;
    @XmlElement(name = "id_str", required = true)
    protected String idStr;
    @XmlElement(name = "is_translator")
    protected boolean isTranslator;
    @XmlElement(required = true)
    protected String lang;
    @XmlElement(name = "listed_count")
    protected int listedCount;
    protected String location;
    @XmlElement(required = true)
    protected String name;
    protected Boolean notifications;
    @XmlElement(name = "profile_background_color", required = true)
    protected String profileBackgroundColor;
    @XmlElement(name = "profile_background_image_url", required = true)
    protected String profileBackgroundImageUrl;
    @XmlElement(name = "profile_background_image_url_https", required = true)
    protected String profileBackgroundImageUrlHttps;
    @XmlElement(name = "profile_background_tile")
    protected boolean profileBackgroundTile;
    @XmlElement(name = "profile_banner_url", required = true)
    protected String profileBannerUrl;
    @XmlElement(name = "profile_image_url", required = true)
    protected String profileImageUrl;
    @XmlElement(name = "profile_image_url_https", required = true)
    protected String profileImageUrlHttps;
    @XmlElement(name = "profile_link_color", required = true)
    protected String profileLinkColor;
    @XmlElement(name = "profile_sidebar_border_color", required = true)
    protected String profileSidebarBorderColor;
    @XmlElement(name = "profile_sidebar_fill_color", required = true)
    protected String profileSidebarFillColor;
    @XmlElement(name = "profile_text_color", required = true)
    protected String profileTextColor;
    @XmlElement(name = "profile_use_background_image")
    protected boolean profileUseBackgroundImage;
    @XmlElement(name = "protected")
    protected boolean _protected;
    @XmlElement(name = "screen_name", required = true)
    protected String screenName;
    @XmlElement(name = "show_all_inline_media")
    protected boolean showAllInlineMedia;
    protected TweetsType status;
    @XmlElement(name = "statuses_count")
    protected int statusesCount;
    @XmlElement(name = "time_zone")
    protected String timeZone;
    protected String url;
    @XmlElement(name = "utc_offset")
    protected Integer utcOffset;
    protected boolean verified;
    @XmlElement(name = "withheld_in_countries", required = true)
    protected String withheldInCountries;
    @XmlElement(name = "withheld_scope", required = true)
    protected String withheldScope;

    /**
     * Gets the value of the contributorsEnabled property.
     */
    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     * Sets the value of the contributorsEnabled property.
     */
    public void setContributorsEnabled(boolean value) {
        this.contributorsEnabled = value;
    }

    /**
     * Gets the value of the createdAt property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the defaultProfile property.
     */
    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    /**
     * Sets the value of the defaultProfile property.
     */
    public void setDefaultProfile(boolean value) {
        this.defaultProfile = value;
    }

    /**
     * Gets the value of the defaultProfileImage property.
     */
    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     * Sets the value of the defaultProfileImage property.
     */
    public void setDefaultProfileImage(boolean value) {
        this.defaultProfileImage = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the entities property.
     *
     * @return possible object is
     * {@link EntitiesType }
     */
    public EntitiesType getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     *
     * @param value allowed object is
     *              {@link EntitiesType }
     */
    public void setEntities(EntitiesType value) {
        this.entities = value;
    }

    /**
     * Gets the value of the favouritesCount property.
     */
    public int getFavouritesCount() {
        return favouritesCount;
    }

    /**
     * Sets the value of the favouritesCount property.
     */
    public void setFavouritesCount(int value) {
        this.favouritesCount = value;
    }

    /**
     * Gets the value of the followRequestSent property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFollowRequestSent() {
        return followRequestSent;
    }

    /**
     * Sets the value of the followRequestSent property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFollowRequestSent(Boolean value) {
        this.followRequestSent = value;
    }

    /**
     * Gets the value of the following property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isFollowing() {
        return following;
    }

    /**
     * Sets the value of the following property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setFollowing(Boolean value) {
        this.following = value;
    }

    /**
     * Gets the value of the followersCount property.
     */
    public int getFollowersCount() {
        return followersCount;
    }

    /**
     * Sets the value of the followersCount property.
     */
    public void setFollowersCount(int value) {
        this.followersCount = value;
    }

    /**
     * Gets the value of the friendsCount property.
     */
    public int getFriendsCount() {
        return friendsCount;
    }

    /**
     * Sets the value of the friendsCount property.
     */
    public void setFriendsCount(int value) {
        this.friendsCount = value;
    }

    /**
     * Gets the value of the geoEnabled property.
     */
    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    /**
     * Sets the value of the geoEnabled property.
     */
    public void setGeoEnabled(boolean value) {
        this.geoEnabled = value;
    }

    /**
     * Gets the value of the id property.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the idStr property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIdStr() {
        return idStr;
    }

    /**
     * Sets the value of the idStr property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIdStr(String value) {
        this.idStr = value;
    }

    /**
     * Gets the value of the isTranslator property.
     */
    public boolean isIsTranslator() {
        return isTranslator;
    }

    /**
     * Sets the value of the isTranslator property.
     */
    public void setIsTranslator(boolean value) {
        this.isTranslator = value;
    }

    /**
     * Gets the value of the lang property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the listedCount property.
     */
    public int getListedCount() {
        return listedCount;
    }

    /**
     * Sets the value of the listedCount property.
     */
    public void setListedCount(int value) {
        this.listedCount = value;
    }

    /**
     * Gets the value of the location property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the notifications property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNotifications(Boolean value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the profileBackgroundColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     * Sets the value of the profileBackgroundColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileBackgroundColor(String value) {
        this.profileBackgroundColor = value;
    }

    /**
     * Gets the value of the profileBackgroundImageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     * Sets the value of the profileBackgroundImageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileBackgroundImageUrl(String value) {
        this.profileBackgroundImageUrl = value;
    }

    /**
     * Gets the value of the profileBackgroundImageUrlHttps property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     * Sets the value of the profileBackgroundImageUrlHttps property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileBackgroundImageUrlHttps(String value) {
        this.profileBackgroundImageUrlHttps = value;
    }

    /**
     * Gets the value of the profileBackgroundTile property.
     */
    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     * Sets the value of the profileBackgroundTile property.
     */
    public void setProfileBackgroundTile(boolean value) {
        this.profileBackgroundTile = value;
    }

    /**
     * Gets the value of the profileBannerUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    /**
     * Sets the value of the profileBannerUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileBannerUrl(String value) {
        this.profileBannerUrl = value;
    }

    /**
     * Gets the value of the profileImageUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * Sets the value of the profileImageUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileImageUrl(String value) {
        this.profileImageUrl = value;
    }

    /**
     * Gets the value of the profileImageUrlHttps property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     * Sets the value of the profileImageUrlHttps property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileImageUrlHttps(String value) {
        this.profileImageUrlHttps = value;
    }

    /**
     * Gets the value of the profileLinkColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     * Sets the value of the profileLinkColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileLinkColor(String value) {
        this.profileLinkColor = value;
    }

    /**
     * Gets the value of the profileSidebarBorderColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     * Sets the value of the profileSidebarBorderColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileSidebarBorderColor(String value) {
        this.profileSidebarBorderColor = value;
    }

    /**
     * Gets the value of the profileSidebarFillColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     * Sets the value of the profileSidebarFillColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileSidebarFillColor(String value) {
        this.profileSidebarFillColor = value;
    }

    /**
     * Gets the value of the profileTextColor property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     * Sets the value of the profileTextColor property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setProfileTextColor(String value) {
        this.profileTextColor = value;
    }

    /**
     * Gets the value of the profileUseBackgroundImage property.
     */
    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     * Sets the value of the profileUseBackgroundImage property.
     */
    public void setProfileUseBackgroundImage(boolean value) {
        this.profileUseBackgroundImage = value;
    }

    /**
     * Gets the value of the protected property.
     */
    public boolean isProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     */
    public void setProtected(boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the screenName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * Sets the value of the screenName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setScreenName(String value) {
        this.screenName = value;
    }

    /**
     * Gets the value of the showAllInlineMedia property.
     */
    public boolean isShowAllInlineMedia() {
        return showAllInlineMedia;
    }

    /**
     * Sets the value of the showAllInlineMedia property.
     */
    public void setShowAllInlineMedia(boolean value) {
        this.showAllInlineMedia = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link TweetsType }
     */
    public TweetsType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link TweetsType }
     */
    public void setStatus(TweetsType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusesCount property.
     */
    public int getStatusesCount() {
        return statusesCount;
    }

    /**
     * Sets the value of the statusesCount property.
     */
    public void setStatusesCount(int value) {
        this.statusesCount = value;
    }

    /**
     * Gets the value of the timeZone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the utcOffset property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getUtcOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setUtcOffset(Integer value) {
        this.utcOffset = value;
    }

    /**
     * Gets the value of the verified property.
     */
    public boolean isVerified() {
        return verified;
    }

    /**
     * Sets the value of the verified property.
     */
    public void setVerified(boolean value) {
        this.verified = value;
    }

    /**
     * Gets the value of the withheldInCountries property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWithheldInCountries() {
        return withheldInCountries;
    }

    /**
     * Sets the value of the withheldInCountries property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWithheldInCountries(String value) {
        this.withheldInCountries = value;
    }

    /**
     * Gets the value of the withheldScope property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWithheldScope() {
        return withheldScope;
    }

    /**
     * Sets the value of the withheldScope property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWithheldScope(String value) {
        this.withheldScope = value;
    }

}
