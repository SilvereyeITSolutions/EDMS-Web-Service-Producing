//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.28 at 06:01:22 PM IST 
//


package com.edms.workflowhistory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistTaskInstListReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistTaskInstListReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="histTaskInstList" type="{http://edms.com/WorkflowHistory}HistTaskInstList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistTaskInstListReturn", propOrder = {
    "histTaskInstList"
})
public class HistTaskInstListReturn {

    @XmlElement(nillable = true)
    protected List<HistTaskInstList> histTaskInstList;

    /**
     * Gets the value of the histTaskInstList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the histTaskInstList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistTaskInstList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistTaskInstList }
     * 
     * 
     */
    public List<HistTaskInstList> getHistTaskInstList() {
        if (histTaskInstList == null) {
            histTaskInstList = new ArrayList<HistTaskInstList>();
        }
        return this.histTaskInstList;
    }

}
