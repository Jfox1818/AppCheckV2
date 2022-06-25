
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
 *         &lt;element name="UserRequestFilter" type="{http://raido.aviolinx.com/api/}UserRequestFilter"/>
 *         &lt;element name="UserRequestData" type="{http://raido.aviolinx.com/api/}UserRequestData"/>
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
    "userRequestFilter",
    "userRequestData"
})
@XmlRootElement(name = "GetUsers")
public class GetUsers {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "UserRequestFilter", required = true, nillable = true)
    protected UserRequestFilter userRequestFilter;
    @XmlElement(name = "UserRequestData", required = true, nillable = true)
    protected UserRequestData userRequestData;

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
     * Gets the value of the userRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link UserRequestFilter }
     *     
     */
    public UserRequestFilter getUserRequestFilter() {
        return userRequestFilter;
    }

    /**
     * Sets the value of the userRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRequestFilter }
     *     
     */
    public void setUserRequestFilter(UserRequestFilter value) {
        this.userRequestFilter = value;
    }

    /**
     * Gets the value of the userRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link UserRequestData }
     *     
     */
    public UserRequestData getUserRequestData() {
        return userRequestData;
    }

    /**
     * Sets the value of the userRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRequestData }
     *     
     */
    public void setUserRequestData(UserRequestData value) {
        this.userRequestData = value;
    }

}
