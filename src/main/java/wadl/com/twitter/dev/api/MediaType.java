
package com.twitter.dev.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expanded_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indices" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="media_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="media_url_https" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sizes" type="{http://dev.twitter.com/api}sizesType"/>
 *         &lt;element name="source_status_id" type="{http://dev.twitter.com/api}sizesType"/>
 *         &lt;element name="source_status_id_str" type="{http://dev.twitter.com/api}sizesType"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mediaType", propOrder = {
    "displayUrl",
    "expandedUrl",
    "id",
    "idStr",
    "indices",
    "mediaUrl",
    "mediaUrlHttps",
    "sizes",
    "sourceStatusId",
    "sourceStatusIdStr",
    "type",
    "url"
})
public class MediaType {

    @XmlElement(name = "display_url", required = true)
    protected String displayUrl;
    @XmlElement(name = "expanded_url", required = true)
    protected String expandedUrl;
    protected long id;
    @XmlElement(name = "id_str", required = true)
    protected String idStr;
    @XmlElement(type = Integer.class)
    protected List<Integer> indices;
    @XmlElement(name = "media_url", required = true)
    protected String mediaUrl;
    @XmlElement(name = "media_url_https", required = true)
    protected String mediaUrlHttps;
    @XmlElement(required = true)
    protected SizesType sizes;
    @XmlElement(name = "source_status_id", required = true)
    protected SizesType sourceStatusId;
    @XmlElement(name = "source_status_id_str", required = true)
    protected SizesType sourceStatusIdStr;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String url;

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    /**
     * Gets the value of the expandedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * Sets the value of the expandedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpandedUrl(String value) {
        this.expandedUrl = value;
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
     * Gets the value of the indices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIndices() {
        if (indices == null) {
            indices = new ArrayList<Integer>();
        }
        return this.indices;
    }

    /**
     * Gets the value of the mediaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets the value of the mediaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaUrl(String value) {
        this.mediaUrl = value;
    }

    /**
     * Gets the value of the mediaUrlHttps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    /**
     * Sets the value of the mediaUrlHttps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaUrlHttps(String value) {
        this.mediaUrlHttps = value;
    }

    /**
     * Gets the value of the sizes property.
     * 
     * @return
     *     possible object is
     *     {@link SizesType }
     *     
     */
    public SizesType getSizes() {
        return sizes;
    }

    /**
     * Sets the value of the sizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizesType }
     *     
     */
    public void setSizes(SizesType value) {
        this.sizes = value;
    }

    /**
     * Gets the value of the sourceStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link SizesType }
     *     
     */
    public SizesType getSourceStatusId() {
        return sourceStatusId;
    }

    /**
     * Sets the value of the sourceStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizesType }
     *     
     */
    public void setSourceStatusId(SizesType value) {
        this.sourceStatusId = value;
    }

    /**
     * Gets the value of the sourceStatusIdStr property.
     * 
     * @return
     *     possible object is
     *     {@link SizesType }
     *     
     */
    public SizesType getSourceStatusIdStr() {
        return sourceStatusIdStr;
    }

    /**
     * Sets the value of the sourceStatusIdStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizesType }
     *     
     */
    public void setSourceStatusIdStr(SizesType value) {
        this.sourceStatusIdStr = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
