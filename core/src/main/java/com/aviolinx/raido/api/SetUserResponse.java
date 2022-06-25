
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
 *         &lt;element name="SetUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setUserResult"
})
@XmlRootElement(name = "SetUserResponse")
public class SetUserResponse {

    @XmlElement(name = "SetUserResult")
    protected boolean setUserResult;

    /**
     * Gets the value of the setUserResult property.
     * 
     */
    public boolean isSetUserResult() {
        return setUserResult;
    }

    /**
     * Sets the value of the setUserResult property.
     * 
     */
    public void setSetUserResult(boolean value) {
        this.setUserResult = value;
    }

}
