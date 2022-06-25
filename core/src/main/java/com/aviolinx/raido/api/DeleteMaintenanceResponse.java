
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
 *         &lt;element name="DeleteMaintenanceResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteMaintenanceResult"
})
@XmlRootElement(name = "DeleteMaintenanceResponse")
public class DeleteMaintenanceResponse {

    @XmlElement(name = "DeleteMaintenanceResult")
    protected boolean deleteMaintenanceResult;

    /**
     * Gets the value of the deleteMaintenanceResult property.
     * 
     */
    public boolean isDeleteMaintenanceResult() {
        return deleteMaintenanceResult;
    }

    /**
     * Sets the value of the deleteMaintenanceResult property.
     * 
     */
    public void setDeleteMaintenanceResult(boolean value) {
        this.deleteMaintenanceResult = value;
    }

}
