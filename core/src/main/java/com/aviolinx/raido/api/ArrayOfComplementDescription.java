
package com.aviolinx.raido.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfComplementDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfComplementDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComplementDescription" type="{http://raido.aviolinx.com/api/}ComplementDescription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfComplementDescription", propOrder = {
    "complementDescription"
})
public class ArrayOfComplementDescription {

    @XmlElement(name = "ComplementDescription", nillable = true)
    protected List<ComplementDescription> complementDescription;

    /**
     * Gets the value of the complementDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplementDescription }
     * 
     * 
     */
    public List<ComplementDescription> getComplementDescription() {
        if (complementDescription == null) {
            complementDescription = new ArrayList<ComplementDescription>();
        }
        return this.complementDescription;
    }

}
