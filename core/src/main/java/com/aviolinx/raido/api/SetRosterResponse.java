
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="SetRosterResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setRosterResult"
})
@XmlRootElement(name = "SetRosterResponse")
public class SetRosterResponse {

    @XmlElement(name = "SetRosterResult")
    protected boolean setRosterResult;

    /**
     * Gets the value of the setRosterResult property.
     * 
     */
    public boolean isSetRosterResult() {
        return setRosterResult;
    }

    /**
     * Sets the value of the setRosterResult property.
     * 
     */
    public void setSetRosterResult(boolean value) {
        this.setRosterResult = value;
    }

}
