//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.19 at 10:40:46 AM IST 
//


package com.edms.folder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetRecycledDocs" type="{http://edms.com/Folder}FolderListReturn" minOccurs="0"/>
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
    "getRecycledDocs"
})
@XmlRootElement(name = "getRecycledDocsResponse")
public class GetRecycledDocsResponse {

    @XmlElement(name = "GetRecycledDocs")
    protected FolderListReturn getRecycledDocs;

    /**
     * Gets the value of the getRecycledDocs property.
     * 
     * @return
     *     possible object is
     *     {@link FolderListReturn }
     *     
     */
    public FolderListReturn getGetRecycledDocs() {
        return getRecycledDocs;
    }

    /**
     * Sets the value of the getRecycledDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderListReturn }
     *     
     */
    public void setGetRecycledDocs(FolderListReturn value) {
        this.getRecycledDocs = value;
    }

}
