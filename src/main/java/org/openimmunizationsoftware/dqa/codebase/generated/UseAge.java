//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.29 at 11:28:47 PM EST 
//


package org.openimmunizationsoftware.dqa.codebase.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="not-before-month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="not-after-month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notBeforeMonth",
    "notAfterMonth"
})
public class UseAge {

    @XmlElement(name = "not-before-month")
    protected int notBeforeMonth;
    @XmlElement(name = "not-after-month")
    protected int notAfterMonth;

    /**
     * Gets the value of the notBeforeMonth property.
     * 
     */
    public int getNotBeforeMonth() {
        return notBeforeMonth;
    }

    /**
     * Sets the value of the notBeforeMonth property.
     * 
     */
    public void setNotBeforeMonth(int value) {
        this.notBeforeMonth = value;
    }

    /**
     * Gets the value of the notAfterMonth property.
     * 
     */
    public int getNotAfterMonth() {
        return notAfterMonth;
    }

    /**
     * Sets the value of the notAfterMonth property.
     * 
     */
    public void setNotAfterMonth(int value) {
        this.notAfterMonth = value;
    }

}
