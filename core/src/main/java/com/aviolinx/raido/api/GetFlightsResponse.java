
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
 *         &lt;element name="GetFlightsResult" type="{http://raido.aviolinx.com/api/}ArrayOfFlight" minOccurs="0"/>
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
    "getFlightsResult"
})
@XmlRootElement(name = "GetFlightsResponse")
public class GetFlightsResponse {

    @XmlElement(name = "GetFlightsResult")
    protected ArrayOfFlight getFlightsResult;

    /**
     * Gets the value of the getFlightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFlight }
     *     
     */
    public ArrayOfFlight getGetFlightsResult() {
        return getFlightsResult;
    }

    /**
     * Sets the value of the getFlightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFlight }
     *     
     */
    public void setGetFlightsResult(ArrayOfFlight value) {
        this.getFlightsResult = value;
    }

}
