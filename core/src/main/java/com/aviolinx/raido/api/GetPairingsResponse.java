
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
 *         &lt;element name="GetPairingsResult" type="{http://raido.aviolinx.com/api/}ArrayOfPairing" minOccurs="0"/>
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
    "getPairingsResult"
})
@XmlRootElement(name = "GetPairingsResponse")
public class GetPairingsResponse {

    @XmlElement(name = "GetPairingsResult")
    protected ArrayOfPairing getPairingsResult;

    /**
     * Gets the value of the getPairingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPairing }
     *     
     */
    public ArrayOfPairing getGetPairingsResult() {
        return getPairingsResult;
    }

    /**
     * Sets the value of the getPairingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPairing }
     *     
     */
    public void setGetPairingsResult(ArrayOfPairing value) {
        this.getPairingsResult = value;
    }

}
