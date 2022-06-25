
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
 *         &lt;element name="GetAircraftsResult" type="{http://raido.aviolinx.com/api/}ArrayOfAircraft" minOccurs="0"/>
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
    "getAircraftsResult"
})
@XmlRootElement(name = "GetAircraftsResponse")
public class GetAircraftsResponse {

    @XmlElement(name = "GetAircraftsResult")
    protected ArrayOfAircraft getAircraftsResult;

    /**
     * Gets the value of the getAircraftsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAircraft }
     *     
     */
    public ArrayOfAircraft getGetAircraftsResult() {
        return getAircraftsResult;
    }

    /**
     * Sets the value of the getAircraftsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAircraft }
     *     
     */
    public void setGetAircraftsResult(ArrayOfAircraft value) {
        this.getAircraftsResult = value;
    }

}
