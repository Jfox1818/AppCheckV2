
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
 *         &lt;element name="SetExternalCrewResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setExternalCrewResult"
})
@XmlRootElement(name = "SetExternalCrewResponse")
public class SetExternalCrewResponse {

    @XmlElement(name = "SetExternalCrewResult")
    protected boolean setExternalCrewResult;

    /**
     * Gets the value of the setExternalCrewResult property.
     * 
     */
    public boolean isSetExternalCrewResult() {
        return setExternalCrewResult;
    }

    /**
     * Sets the value of the setExternalCrewResult property.
     * 
     */
    public void setSetExternalCrewResult(boolean value) {
        this.setExternalCrewResult = value;
    }

}
