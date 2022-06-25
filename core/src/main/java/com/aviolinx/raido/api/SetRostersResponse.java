
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
 *         &lt;element name="SetRostersResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "setRostersResult"
})
@XmlRootElement(name = "SetRostersResponse")
public class SetRostersResponse {

    @XmlElement(name = "SetRostersResult")
    protected boolean setRostersResult;

    /**
     * Gets the value of the setRostersResult property.
     * 
     */
    public boolean isSetRostersResult() {
        return setRostersResult;
    }

    /**
     * Sets the value of the setRostersResult property.
     * 
     */
    public void setSetRostersResult(boolean value) {
        this.setRostersResult = value;
    }

}
