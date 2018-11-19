
package org.notima.sveawebpayadmin;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetClientsByIdentityAccountResult" type="{http://schemas.datacontract.org/2004/07/DataObjects.Admin.Service.Responses}GetClientsByIdentityAccountResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getClientsByIdentityAccountResult"
})
@XmlRootElement(name = "GetClientsByIdentityAccountResponse", namespace = "http://tempuri.org/")
public class GetClientsByIdentityAccountResponse2 {

    @XmlElement(name = "GetClientsByIdentityAccountResult", namespace = "http://tempuri.org/", nillable = true)
    protected GetClientsByIdentityAccountResponse getClientsByIdentityAccountResult;

    /**
     * Gets the value of the getClientsByIdentityAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetClientsByIdentityAccountResponse }
     *     
     */
    public GetClientsByIdentityAccountResponse getGetClientsByIdentityAccountResult() {
        return getClientsByIdentityAccountResult;
    }

    /**
     * Sets the value of the getClientsByIdentityAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetClientsByIdentityAccountResponse }
     *     
     */
    public void setGetClientsByIdentityAccountResult(GetClientsByIdentityAccountResponse value) {
        this.getClientsByIdentityAccountResult = value;
    }

}