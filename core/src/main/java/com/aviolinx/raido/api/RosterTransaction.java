
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RosterTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatedByUniqueId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ChangeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOriginal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsReleased" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfirmedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RosterActivities" type="{http://raido.aviolinx.com/api/}ArrayOfRosterActivity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterTransaction", propOrder = {
    "timestamp",
    "createdByUniqueId",
    "status",
    "revisionNumber",
    "changeType",
    "transactionCode",
    "isOriginal",
    "isReleased",
    "confirmedDate",
    "rosterActivities"
})
public class RosterTransaction {

    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "CreatedByUniqueId")
    protected int createdByUniqueId;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "RevisionNumber")
    protected int revisionNumber;
    @XmlElement(name = "ChangeType")
    protected String changeType;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "IsOriginal")
    protected boolean isOriginal;
    @XmlElement(name = "IsReleased")
    protected boolean isReleased;
    @XmlElement(name = "ConfirmedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmedDate;
    @XmlElement(name = "RosterActivities")
    protected ArrayOfRosterActivity rosterActivities;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the createdByUniqueId property.
     * 
     */
    public int getCreatedByUniqueId() {
        return createdByUniqueId;
    }

    /**
     * Sets the value of the createdByUniqueId property.
     * 
     */
    public void setCreatedByUniqueId(int value) {
        this.createdByUniqueId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     */
    public int getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     */
    public void setRevisionNumber(int value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the isOriginal property.
     * 
     */
    public boolean isIsOriginal() {
        return isOriginal;
    }

    /**
     * Sets the value of the isOriginal property.
     * 
     */
    public void setIsOriginal(boolean value) {
        this.isOriginal = value;
    }

    /**
     * Gets the value of the isReleased property.
     * 
     */
    public boolean isIsReleased() {
        return isReleased;
    }

    /**
     * Sets the value of the isReleased property.
     * 
     */
    public void setIsReleased(boolean value) {
        this.isReleased = value;
    }

    /**
     * Gets the value of the confirmedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmedDate() {
        return confirmedDate;
    }

    /**
     * Sets the value of the confirmedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmedDate(XMLGregorianCalendar value) {
        this.confirmedDate = value;
    }

    /**
     * Gets the value of the rosterActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public ArrayOfRosterActivity getRosterActivities() {
        return rosterActivities;
    }

    /**
     * Sets the value of the rosterActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRosterActivity }
     *     
     */
    public void setRosterActivities(ArrayOfRosterActivity value) {
        this.rosterActivities = value;
    }

}
