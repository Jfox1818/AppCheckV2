
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
 *         &lt;element name="SetCrewDocumentResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setCrewDocumentResult"
})
@XmlRootElement(name = "SetCrewDocumentResponse")
public class SetCrewDocumentResponse {

    @XmlElement(name = "SetCrewDocumentResult")
    protected boolean setCrewDocumentResult;

    /**
     * Gets the value of the setCrewDocumentResult property.
     * 
     */
    public boolean isSetCrewDocumentResult() {
        return setCrewDocumentResult;
    }

    /**
     * Sets the value of the setCrewDocumentResult property.
     * 
     */
    public void setSetCrewDocumentResult(boolean value) {
        this.setCrewDocumentResult = value;
    }

}
