/**
 * RecuperaListaComunicazioniSecondarieResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaListaComunicazioniSecondarieResponse  implements java.io.Serializable {
    private java.lang.String listComunicazioniSecondarieXml;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RecuperaListaComunicazioniSecondarieResponse() {
    }

    public RecuperaListaComunicazioniSecondarieResponse(
           java.lang.String listComunicazioniSecondarieXml,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.listComunicazioniSecondarieXml = listComunicazioniSecondarieXml;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the listComunicazioniSecondarieXml value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @return listComunicazioniSecondarieXml
     */
    public java.lang.String getListComunicazioniSecondarieXml() {
        return listComunicazioniSecondarieXml;
    }


    /**
     * Sets the listComunicazioniSecondarieXml value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @param listComunicazioniSecondarieXml
     */
    public void setListComunicazioniSecondarieXml(java.lang.String listComunicazioniSecondarieXml) {
        this.listComunicazioniSecondarieXml = listComunicazioniSecondarieXml;
    }


    /**
     * Gets the retCode value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaListaComunicazioniSecondarieResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaComunicazioniSecondarieResponse)) return false;
        RecuperaListaComunicazioniSecondarieResponse other = (RecuperaListaComunicazioniSecondarieResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listComunicazioniSecondarieXml==null && other.getListComunicazioniSecondarieXml()==null) || 
             (this.listComunicazioniSecondarieXml!=null &&
              this.listComunicazioniSecondarieXml.equals(other.getListComunicazioniSecondarieXml()))) &&
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
        if (getListComunicazioniSecondarieXml() != null) {
            _hashCode += getListComunicazioniSecondarieXml().hashCode();
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
        new org.apache.axis.description.TypeDesc(RecuperaListaComunicazioniSecondarieResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniSecondarieResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listComunicazioniSecondarieXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listComunicazioniSecondarieXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "retMessage"));
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
