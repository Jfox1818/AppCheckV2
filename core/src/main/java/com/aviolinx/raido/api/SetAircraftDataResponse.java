
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
 *         &lt;element name="SetAircraftDataResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setAircraftDataResult"
})
@XmlRootElement(name = "SetAircraftDataResponse")
public class SetAircraftDataResponse {

    @XmlElement(name = "SetAircraftDataResult")
    protected boolean setAircraftDataResult;

    /**
     * Gets the value of the setAircraftDataResult property.
     * 
     */
    public boolean isSetAircraftDataResult() {
        return setAircraftDataResult;
    }

    /**
     * Sets the value of the setAircraftDataResult property.
     * 
     */
    public void setSetAircraftDataResult(boolean value) {
        this.setAircraftDataResult = value;
    }

}
