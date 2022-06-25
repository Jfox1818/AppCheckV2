
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfRosterLegalException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRosterLegalException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RosterLegalException" type="{http://raido.aviolinx.com/api/}RosterLegalException" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRosterLegalException", propOrder = {
    "rosterLegalException"
})
public class ArrayOfRosterLegalException {

    @XmlElement(name = "RosterLegalException", nillable = true)
    protected List<RosterLegalException> rosterLegalException;

    /**
     * Gets the value of the rosterLegalException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rosterLegalException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRosterLegalException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RosterLegalException }
     * 
     * 
     */
    public List<RosterLegalException> getRosterLegalException() {
        if (rosterLegalException == null) {
            rosterLegalException = new ArrayList<RosterLegalException>();
        }
        return this.rosterLegalException;
    }

}
