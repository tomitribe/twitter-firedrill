
package com.twitter.dev.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hashtags" type="{http://dev.twitter.com/api}hashtagsType" maxOccurs="unbounded"/>
 *         &lt;element name="media" type="{http://dev.twitter.com/api}mediaType" maxOccurs="unbounded"/>
 *         &lt;element name="urls" type="{http://dev.twitter.com/api}urlsType" maxOccurs="unbounded"/>
 *         &lt;element name="user_mentions" type="{http://dev.twitter.com/api}usermentionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entitiesType", propOrder = {
    "hashtags",
    "media",
    "urls",
    "userMentions"
})
public class EntitiesType {

    @XmlElement(required = true)
    protected List<HashtagsType> hashtags;
    @XmlElement(required = true)
    protected List<MediaType> media;
    @XmlElement(required = true)
    protected List<UrlsType> urls;
    @XmlElement(name = "user_mentions", required = true)
    protected List<UsermentionType> userMentions;

    /**
     * Gets the value of the hashtags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hashtags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHashtags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashtagsType }
     * 
     * 
     */
    public List<HashtagsType> getHashtags() {
        if (hashtags == null) {
            hashtags = new ArrayList<HashtagsType>();
        }
        return this.hashtags;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaType }
     * 
     * 
     */
    public List<MediaType> getMedia() {
        if (media == null) {
            media = new ArrayList<MediaType>();
        }
        return this.media;
    }

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlsType }
     * 
     * 
     */
    public List<UrlsType> getUrls() {
        if (urls == null) {
            urls = new ArrayList<UrlsType>();
        }
        return this.urls;
    }

    /**
     * Gets the value of the userMentions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userMentions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserMentions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsermentionType }
     * 
     * 
     */
    public List<UsermentionType> getUserMentions() {
        if (userMentions == null) {
            userMentions = new ArrayList<UsermentionType>();
        }
        return this.userMentions;
    }

}
