
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RosterTransactionRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RosterTransactionRequestFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://raido.aviolinx.com/api/}DateRangeBasicRequestFilter">
 *       &lt;sequence>
 *         &lt;element name="TransactionFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OnlyActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnlyWithTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RosterTransactionRequestFilter", propOrder = {
    "transactionFrom",
    "transactionTo",
    "onlyActive",
    "onlyWithTransactions"
})
public class RosterTransactionRequestFilter
    extends DateRangeBasicRequestFilter
{

    @XmlElement(name = "TransactionFrom", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionFrom;
    @XmlElement(name = "TransactionTo", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTo;
    @XmlElement(name = "OnlyActive")
    protected boolean onlyActive;
    @XmlElement(name = "OnlyWithTransactions")
    protected boolean onlyWithTransactions;

    /**
     * Gets the value of the transactionFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionFrom() {
        return transactionFrom;
    }

    /**
     * Sets the value of the transactionFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionFrom(XMLGregorianCalendar value) {
        this.transactionFrom = value;
    }

    /**
     * Gets the value of the transactionTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTo() {
        return transactionTo;
    }

    /**
     * Sets the value of the transactionTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTo(XMLGregorianCalendar value) {
        this.transactionTo = value;
    }

    /**
     * Gets the value of the onlyActive property.
     * 
     */
    public boolean isOnlyActive() {
        return onlyActive;
    }

    /**
     * Sets the value of the onlyActive property.
     * 
     */
    public void setOnlyActive(boolean value) {
        this.onlyActive = value;
    }

    /**
     * Gets the value of the onlyWithTransactions property.
     * 
     */
    public boolean isOnlyWithTransactions() {
        return onlyWithTransactions;
    }

    /**
     * Sets the value of the onlyWithTransactions property.
     * 
     */
    public void setOnlyWithTransactions(boolean value) {
        this.onlyWithTransactions = value;
    }

}
