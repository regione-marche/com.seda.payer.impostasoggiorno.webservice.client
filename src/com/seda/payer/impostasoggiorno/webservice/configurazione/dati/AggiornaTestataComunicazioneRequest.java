/**
 * AggiornaTestataComunicazioneRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class AggiornaTestataComunicazioneRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione;

    public AggiornaTestataComunicazioneRequest() {
    }

    public AggiornaTestataComunicazioneRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione) {
           this.testataComunicazione = testataComunicazione;
    }


    /**
     * Gets the testataComunicazione value for this AggiornaTestataComunicazioneRequest.
     * 
     * @return testataComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno getTestataComunicazione() {
        return testataComunicazione;
    }


    /**
     * Sets the testataComunicazione value for this AggiornaTestataComunicazioneRequest.
     * 
     * @param testataComunicazione
     */
    public void setTestataComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione) {
        this.testataComunicazione = testataComunicazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggiornaTestataComunicazioneRequest)) return false;
        AggiornaTestataComunicazioneRequest other = (AggiornaTestataComunicazioneRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testataComunicazione==null && other.getTestataComunicazione()==null) || 
             (this.testataComunicazione!=null &&
              this.testataComunicazione.equals(other.getTestataComunicazione())));
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
        if (getTestataComunicazione() != null) {
            _hashCode += getTestataComunicazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AggiornaTestataComunicazioneRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTestataComunicazioneRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "testataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataComunicazioneImpostaSoggiorno"));
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
