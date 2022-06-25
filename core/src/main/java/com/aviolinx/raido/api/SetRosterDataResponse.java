
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
 *         &lt;element name="SetRosterDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setRosterDataResult"
})
@XmlRootElement(name = "SetRosterDataResponse")
public class SetRosterDataResponse {

    @XmlElement(name = "SetRosterDataResult")
    protected boolean setRosterDataResult;

    /**
     * Gets the value of the setRosterDataResult property.
     * 
     */
    public boolean isSetRosterDataResult() {
        return setRosterDataResult;
    }

    /**
     * Sets the value of the setRosterDataResult property.
     * 
     */
    public void setSetRosterDataResult(boolean value) {
        this.setRosterDataResult = value;
    }

}
