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
 * <p>Java class for contributorsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="contributorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_str" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="screen_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contributorsType", propOrder = {
        "id",
        "idStr",
        "screenName"
})
public class ContributorsType {

    protected long id;
    @XmlElement(name = "id_str", required = true)
    protected String idStr;
    @XmlElement(name = "screen_name", required = true)
    protected String screenName;

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

}
