//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.28 at 06:01:22 PM IST 
//


package com.edms.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for membersList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membersList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="membersListResult" type="{http://edms.com/group}ArrayOfMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "membersList", propOrder = {
    "membersListResult"
})
public class MembersList {

    protected ArrayOfMembers membersListResult;

    /**
     * Gets the value of the membersListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMembers }
     *     
     */
    public ArrayOfMembers getMembersListResult() {
        return membersListResult;
    }

    /**
     * Sets the value of the membersListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMembers }
     *     
     */
    public void setMembersListResult(ArrayOfMembers value) {
        this.membersListResult = value;
    }

}
