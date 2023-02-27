/**
 * RecuperaAnagraficaStrutturaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaAnagraficaStrutturaResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RecuperaAnagraficaStrutturaResponse() {
    }

    public RecuperaAnagraficaStrutturaResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.anagraficaStruttura = anagraficaStruttura;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the anagraficaStruttura value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @return anagraficaStruttura
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStruttura() {
        return anagraficaStruttura;
    }


    /**
     * Sets the anagraficaStruttura value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @param anagraficaStruttura
     */
    public void setAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura) {
        this.anagraficaStruttura = anagraficaStruttura;
    }


    /**
     * Gets the retCode value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaAnagraficaStrutturaResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaAnagraficaStrutturaResponse)) return false;
        RecuperaAnagraficaStrutturaResponse other = (RecuperaAnagraficaStrutturaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anagraficaStruttura==null && other.getAnagraficaStruttura()==null) || 
             (this.anagraficaStruttura!=null &&
              this.anagraficaStruttura.equals(other.getAnagraficaStruttura()))) &&
            ((this.retCode==null && other.getRetCode()==null) || 
             (this.retCode!=null &&
              this.retCode.equals(other.getRetCode()))) &&
            ((this.retMessage==null && other.getRetMessage()==null) || 
             (this.retMessage!=null &&
              this.retMessage.equals(other.getRetMessage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAnagraficaStruttura() != null) {
            _hashCode += getAnagraficaStruttura().hashCode();
        }
        if (getRetCode() != null) {
            _hashCode += getRetCode().hashCode();
        }
        if (getRetMessage() != null) {
            _hashCode += getRetMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaAnagraficaStrutturaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "anagraficaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "retMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
