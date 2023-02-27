/**
 * RecuperaTipologiaStrutturaRicettivaCsvResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaTipologiaStrutturaRicettivaCsvResponse  implements java.io.Serializable {
    private java.lang.String stringaCsv;

    private com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response;

    public RecuperaTipologiaStrutturaRicettivaCsvResponse() {
    }

    public RecuperaTipologiaStrutturaRicettivaCsvResponse(
           java.lang.String stringaCsv,
           com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response) {
           this.stringaCsv = stringaCsv;
           this.response = response;
    }


    /**
     * Gets the stringaCsv value for this RecuperaTipologiaStrutturaRicettivaCsvResponse.
     * 
     * @return stringaCsv
     */
    public java.lang.String getStringaCsv() {
        return stringaCsv;
    }


    /**
     * Sets the stringaCsv value for this RecuperaTipologiaStrutturaRicettivaCsvResponse.
     * 
     * @param stringaCsv
     */
    public void setStringaCsv(java.lang.String stringaCsv) {
        this.stringaCsv = stringaCsv;
    }


    /**
     * Gets the response value for this RecuperaTipologiaStrutturaRicettivaCsvResponse.
     * 
     * @return response
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this RecuperaTipologiaStrutturaRicettivaCsvResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaTipologiaStrutturaRicettivaCsvResponse)) return false;
        RecuperaTipologiaStrutturaRicettivaCsvResponse other = (RecuperaTipologiaStrutturaRicettivaCsvResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stringaCsv==null && other.getStringaCsv()==null) || 
             (this.stringaCsv!=null &&
              this.stringaCsv.equals(other.getStringaCsv()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getStringaCsv() != null) {
            _hashCode += getStringaCsv().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaTipologiaStrutturaRicettivaCsvResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaCsvResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringaCsv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "stringaCsv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ResponseType"));
        elemField.setNillable(false);
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
