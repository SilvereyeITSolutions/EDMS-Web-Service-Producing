//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.28 at 06:01:22 PM IST 
//


package com.edms.workflow;

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
 *         &lt;element name="userTaskListReturn" type="{http://edms.com/Workflow}UserTaskListReturn"/>
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
    "userTaskListReturn"
})
@XmlRootElement(name = "getFetchUserTaskResponse")
public class GetFetchUserTaskResponse {

    @XmlElement(required = true)
    protected UserTaskListReturn userTaskListReturn;

    /**
     * Gets the value of the userTaskListReturn property.
     * 
     * @return
     *     possible object is
     *     {@link UserTaskListReturn }
     *     
     */
    public UserTaskListReturn getUserTaskListReturn() {
        return userTaskListReturn;
    }

    /**
     * Sets the value of the userTaskListReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTaskListReturn }
     *     
     */
    public void setUserTaskListReturn(UserTaskListReturn value) {
        this.userTaskListReturn = value;
    }

}
