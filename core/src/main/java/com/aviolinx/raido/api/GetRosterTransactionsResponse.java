
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
 *         &lt;element name="GetRosterTransactionsResult" type="{http://raido.aviolinx.com/api/}ArrayOfCrew" minOccurs="0"/>
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
    "getRosterTransactionsResult"
})
@XmlRootElement(name = "GetRosterTransactionsResponse")
public class GetRosterTransactionsResponse {

    @XmlElement(name = "GetRosterTransactionsResult")
    protected ArrayOfCrew getRosterTransactionsResult;

    /**
     * Gets the value of the getRosterTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrew }
     *     
     */
    public ArrayOfCrew getGetRosterTransactionsResult() {
        return getRosterTransactionsResult;
    }

    /**
     * Sets the value of the getRosterTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrew }
     *     
     */
    public void setGetRosterTransactionsResult(ArrayOfCrew value) {
        this.getRosterTransactionsResult = value;
    }

}
