
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
 *         &lt;element name="SetMaintenanceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setMaintenanceResult"
})
@XmlRootElement(name = "SetMaintenanceResponse")
public class SetMaintenanceResponse {

    @XmlElement(name = "SetMaintenanceResult")
    protected boolean setMaintenanceResult;

    /**
     * Gets the value of the setMaintenanceResult property.
     * 
     */
    public boolean isSetMaintenanceResult() {
        return setMaintenanceResult;
    }

    /**
     * Sets the value of the setMaintenanceResult property.
     * 
     */
    public void setSetMaintenanceResult(boolean value) {
        this.setMaintenanceResult = value;
    }

}
