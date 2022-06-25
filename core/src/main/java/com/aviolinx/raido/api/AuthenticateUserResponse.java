
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
 *         &lt;element name="AuthenticateUserResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "authenticateUserResult"
})
@XmlRootElement(name = "AuthenticateUserResponse")
public class AuthenticateUserResponse {

    @XmlElement(name = "AuthenticateUserResult")
    protected boolean authenticateUserResult;

    /**
     * Gets the value of the authenticateUserResult property.
     * 
     */
    public boolean isAuthenticateUserResult() {
        return authenticateUserResult;
    }

    /**
     * Sets the value of the authenticateUserResult property.
     * 
     */
    public void setAuthenticateUserResult(boolean value) {
        this.authenticateUserResult = value;
    }

}
