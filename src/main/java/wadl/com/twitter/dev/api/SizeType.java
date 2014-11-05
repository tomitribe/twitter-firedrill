
package com.twitter.dev.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="h" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="w" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sizeType", propOrder = {
    "h",
    "resize",
    "w"
})
public class SizeType {

    protected int h;
    @XmlElement(required = true)
    protected String resize;
    protected int w;

    /**
     * Gets the value of the h property.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }

    /**
     * Gets the value of the resize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResize() {
        return resize;
    }

    /**
     * Sets the value of the resize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResize(String value) {
        this.resize = value;
    }

    /**
     * Gets the value of the w property.
     * 
     */
    public int getW() {
        return w;
    }

    /**
     * Sets the value of the w property.
     * 
     */
    public void setW(int value) {
        this.w = value;
    }

}
