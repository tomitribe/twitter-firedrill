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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for urlsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="urlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="display_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expanded_url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indices" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urlsType", propOrder = {
        "displayUrl",
        "expandedUrl",
        "indices",
        "url"
})
public class UrlsType {

    @XmlElement(name = "display_url", required = true)
    protected String displayUrl;
    @XmlElement(name = "expanded_url", required = true)
    protected String expandedUrl;
    @XmlElement(type = Integer.class)
    protected List<Integer> indices;
    @XmlElement(required = true)
    protected String url;

    /**
     * Gets the value of the displayUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    /**
     * Gets the value of the expandedUrl property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * Sets the value of the expandedUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpandedUrl(String value) {
        this.expandedUrl = value;
    }

    /**
     * Gets the value of the indices property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indices property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndices().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getIndices() {
        if (indices == null) {
            indices = new ArrayList<Integer>();
        }
        return this.indices;
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

}
