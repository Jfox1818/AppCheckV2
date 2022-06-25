
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigurationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Projects" type="{http://raido.aviolinx.com/api/}ArrayOfProject" minOccurs="0"/>
 *         &lt;element name="TransactionCodes" type="{http://raido.aviolinx.com/api/}ArrayOfTransactionCode" minOccurs="0"/>
 *         &lt;element name="Reasons" type="{http://raido.aviolinx.com/api/}ArrayOfReason" minOccurs="0"/>
 *         &lt;element name="ReasonCategories" type="{http://raido.aviolinx.com/api/}ArrayOfReasonCategory" minOccurs="0"/>
 *         &lt;element name="HotelInfos" type="{http://raido.aviolinx.com/api/}ArrayOfHotelInfo" minOccurs="0"/>
 *         &lt;element name="CrewComplements" type="{http://raido.aviolinx.com/api/}ArrayOfCrewComplement" minOccurs="0"/>
 *         &lt;element name="ReferenceActivities" type="{http://raido.aviolinx.com/api/}ArrayOfReferenceActivity" minOccurs="0"/>
 *         &lt;element name="AircraftTypes" type="{http://raido.aviolinx.com/api/}ArrayOfAircraftType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationData", propOrder = {
    "projects",
    "transactionCodes",
    "reasons",
    "reasonCategories",
    "hotelInfos",
    "crewComplements",
    "referenceActivities",
    "aircraftTypes"
})
public class ConfigurationData {

    @XmlElement(name = "Projects")
    protected ArrayOfProject projects;
    @XmlElement(name = "TransactionCodes")
    protected ArrayOfTransactionCode transactionCodes;
    @XmlElement(name = "Reasons")
    protected ArrayOfReason reasons;
    @XmlElement(name = "ReasonCategories")
    protected ArrayOfReasonCategory reasonCategories;
    @XmlElement(name = "HotelInfos")
    protected ArrayOfHotelInfo hotelInfos;
    @XmlElement(name = "CrewComplements")
    protected ArrayOfCrewComplement crewComplements;
    @XmlElement(name = "ReferenceActivities")
    protected ArrayOfReferenceActivity referenceActivities;
    @XmlElement(name = "AircraftTypes")
    protected ArrayOfAircraftType aircraftTypes;

    /**
     * Gets the value of the projects property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProject }
     *     
     */
    public ArrayOfProject getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProject }
     *     
     */
    public void setProjects(ArrayOfProject value) {
        this.projects = value;
    }

    /**
     * Gets the value of the transactionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionCode }
     *     
     */
    public ArrayOfTransactionCode getTransactionCodes() {
        return transactionCodes;
    }

    /**
     * Sets the value of the transactionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionCode }
     *     
     */
    public void setTransactionCodes(ArrayOfTransactionCode value) {
        this.transactionCodes = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReason }
     *     
     */
    public ArrayOfReason getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReason }
     *     
     */
    public void setReasons(ArrayOfReason value) {
        this.reasons = value;
    }

    /**
     * Gets the value of the reasonCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReasonCategory }
     *     
     */
    public ArrayOfReasonCategory getReasonCategories() {
        return reasonCategories;
    }

    /**
     * Sets the value of the reasonCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReasonCategory }
     *     
     */
    public void setReasonCategories(ArrayOfReasonCategory value) {
        this.reasonCategories = value;
    }

    /**
     * Gets the value of the hotelInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public ArrayOfHotelInfo getHotelInfos() {
        return hotelInfos;
    }

    /**
     * Sets the value of the hotelInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelInfo }
     *     
     */
    public void setHotelInfos(ArrayOfHotelInfo value) {
        this.hotelInfos = value;
    }

    /**
     * Gets the value of the crewComplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrewComplement }
     *     
     */
    public ArrayOfCrewComplement getCrewComplements() {
        return crewComplements;
    }

    /**
     * Sets the value of the crewComplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrewComplement }
     *     
     */
    public void setCrewComplements(ArrayOfCrewComplement value) {
        this.crewComplements = value;
    }

    /**
     * Gets the value of the referenceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReferenceActivity }
     *     
     */
    public ArrayOfReferenceActivity getReferenceActivities() {
        return referenceActivities;
    }

    /**
     * Sets the value of the referenceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReferenceActivity }
     *     
     */
    public void setReferenceActivities(ArrayOfReferenceActivity value) {
        this.referenceActivities = value;
    }

    /**
     * Gets the value of the aircraftTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAircraftType }
     *     
     */
    public ArrayOfAircraftType getAircraftTypes() {
        return aircraftTypes;
    }

    /**
     * Sets the value of the aircraftTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAircraftType }
     *     
     */
    public void setAircraftTypes(ArrayOfAircraftType value) {
        this.aircraftTypes = value;
    }

}
