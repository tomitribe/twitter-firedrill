
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


/**
 * <p>Java class for placesType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="placesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bounding_box" type="{http://dev.twitter.com/api}boundingboxType"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="full_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placesType", propOrder = {
        "attributes",
        "boundingBox",
        "country",
        "countryCode",
        "fullName",
        "id",
        "name",
        "placeType",
        "url"
})
public class PlacesType {

    @XmlElement(required = true)
    protected String attributes;
    @XmlElement(name = "bounding_box", required = true)
    protected BoundingboxType boundingBox;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(name = "country_code", required = true)
    protected String countryCode;
    @XmlElement(name = "full_name", required = true)
    protected String fullName;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "place_type", required = true)
    protected String placeType;
    @XmlElement(required = true)
    protected String url;

    /**
     * Gets the value of the attributes property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAttributes(String value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the boundingBox property.
     *
     * @return possible object is
     * {@link BoundingboxType }
     */
    public BoundingboxType getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     *
     * @param value allowed object is
     *              {@link BoundingboxType }
     */
    public void setBoundingBox(BoundingboxType value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the fullName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the placeType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlaceType(String value) {
        this.placeType = value;
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
