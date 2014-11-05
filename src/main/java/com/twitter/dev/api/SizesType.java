
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
 * <p>Java class for sizesType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="sizesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thumb" type="{http://dev.twitter.com/api}sizeType"/>
 *         &lt;element name="large" type="{http://dev.twitter.com/api}sizeType"/>
 *         &lt;element name="medium" type="{http://dev.twitter.com/api}sizeType"/>
 *         &lt;element name="small" type="{http://dev.twitter.com/api}sizeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizesType", propOrder = {
        "thumb",
        "large",
        "medium",
        "small"
})
public class SizesType {

    @XmlElement(required = true)
    protected SizeType thumb;
    @XmlElement(required = true)
    protected SizeType large;
    @XmlElement(required = true)
    protected SizeType medium;
    @XmlElement(required = true)
    protected SizeType small;

    /**
     * Gets the value of the thumb property.
     *
     * @return possible object is
     * {@link SizeType }
     */
    public SizeType getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     *
     * @param value allowed object is
     *              {@link SizeType }
     */
    public void setThumb(SizeType value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the large property.
     *
     * @return possible object is
     * {@link SizeType }
     */
    public SizeType getLarge() {
        return large;
    }

    /**
     * Sets the value of the large property.
     *
     * @param value allowed object is
     *              {@link SizeType }
     */
    public void setLarge(SizeType value) {
        this.large = value;
    }

    /**
     * Gets the value of the medium property.
     *
     * @return possible object is
     * {@link SizeType }
     */
    public SizeType getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     *
     * @param value allowed object is
     *              {@link SizeType }
     */
    public void setMedium(SizeType value) {
        this.medium = value;
    }

    /**
     * Gets the value of the small property.
     *
     * @return possible object is
     * {@link SizeType }
     */
    public SizeType getSmall() {
        return small;
    }

    /**
     * Sets the value of the small property.
     *
     * @param value allowed object is
     *              {@link SizeType }
     */
    public void setSmall(SizeType value) {
        this.small = value;
    }

}
