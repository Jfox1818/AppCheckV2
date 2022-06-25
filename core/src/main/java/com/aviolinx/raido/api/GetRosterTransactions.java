
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RosterTransactionRequestFilter" type="{http://raido.aviolinx.com/api/}RosterTransactionRequestFilter"/>
 *         &lt;element name="RosterTransactionRequestData" type="{http://raido.aviolinx.com/api/}RosterTransactionRequestData"/>
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
    "username",
    "password",
    "rosterTransactionRequestFilter",
    "rosterTransactionRequestData"
})
@XmlRootElement(name = "GetRosterTransactions")
public class GetRosterTransactions {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "RosterTransactionRequestFilter", required = true, nillable = true)
    protected RosterTransactionRequestFilter rosterTransactionRequestFilter;
    @XmlElement(name = "RosterTransactionRequestData", required = true, nillable = true)
    protected RosterTransactionRequestData rosterTransactionRequestData;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the rosterTransactionRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RosterTransactionRequestFilter }
     *     
     */
    public RosterTransactionRequestFilter getRosterTransactionRequestFilter() {
        return rosterTransactionRequestFilter;
    }

    /**
     * Sets the value of the rosterTransactionRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterTransactionRequestFilter }
     *     
     */
    public void setRosterTransactionRequestFilter(RosterTransactionRequestFilter value) {
        this.rosterTransactionRequestFilter = value;
    }

    /**
     * Gets the value of the rosterTransactionRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link RosterTransactionRequestData }
     *     
     */
    public RosterTransactionRequestData getRosterTransactionRequestData() {
        return rosterTransactionRequestData;
    }

    /**
     * Sets the value of the rosterTransactionRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RosterTransactionRequestData }
     *     
     */
    public void setRosterTransactionRequestData(RosterTransactionRequestData value) {
        this.rosterTransactionRequestData = value;
    }

}
