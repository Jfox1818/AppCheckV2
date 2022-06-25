
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
 *         &lt;element name="RevisionsRequestFilter" type="{http://raido.aviolinx.com/api/}RevisionsRequestFilter"/>
 *         &lt;element name="RevisionsRequestData" type="{http://raido.aviolinx.com/api/}RevisionsRequestData"/>
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
    "revisionsRequestFilter",
    "revisionsRequestData"
})
@XmlRootElement(name = "GetCrewRevisions")
public class GetCrewRevisions {

    @XmlElement(name = "Username", required = true, nillable = true)
    protected String username;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(name = "RevisionsRequestFilter", required = true, nillable = true)
    protected RevisionsRequestFilter revisionsRequestFilter;
    @XmlElement(name = "RevisionsRequestData", required = true, nillable = true)
    protected RevisionsRequestData revisionsRequestData;

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
     * Gets the value of the revisionsRequestFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionsRequestFilter }
     *     
     */
    public RevisionsRequestFilter getRevisionsRequestFilter() {
        return revisionsRequestFilter;
    }

    /**
     * Sets the value of the revisionsRequestFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionsRequestFilter }
     *     
     */
    public void setRevisionsRequestFilter(RevisionsRequestFilter value) {
        this.revisionsRequestFilter = value;
    }

    /**
     * Gets the value of the revisionsRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link RevisionsRequestData }
     *     
     */
    public RevisionsRequestData getRevisionsRequestData() {
        return revisionsRequestData;
    }

    /**
     * Sets the value of the revisionsRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisionsRequestData }
     *     
     */
    public void setRevisionsRequestData(RevisionsRequestData value) {
        this.revisionsRequestData = value;
    }

}
