
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COCEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectFilter", propOrder = {
    "name",
    "shortCode",
    "projectNumber",
    "coceid",
    "company"
})
public class ProjectFilter {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ShortCode")
    protected String shortCode;
    @XmlElement(name = "ProjectNumber")
    protected String projectNumber;
    @XmlElement(name = "COCEID")
    protected String coceid;
    @XmlElement(name = "Company")
    protected String company;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     * Sets the value of the shortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCode(String value) {
        this.shortCode = value;
    }

    /**
     * Gets the value of the projectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNumber() {
        return projectNumber;
    }

    /**
     * Sets the value of the projectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNumber(String value) {
        this.projectNumber = value;
    }

    /**
     * Gets the value of the coceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOCEID() {
        return coceid;
    }

    /**
     * Sets the value of the coceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOCEID(String value) {
        this.coceid = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

}
