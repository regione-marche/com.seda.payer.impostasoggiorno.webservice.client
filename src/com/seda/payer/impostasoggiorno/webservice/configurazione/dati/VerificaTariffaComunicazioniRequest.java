/**
 * VerificaTariffaComunicazioniRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class VerificaTariffaComunicazioniRequest  implements java.io.Serializable {
    private java.lang.String chiaveTariffa;

    public VerificaTariffaComunicazioniRequest() {
    }

    public VerificaTariffaComunicazioniRequest(
           java.lang.String chiaveTariffa) {
           this.chiaveTariffa = chiaveTariffa;
    }


    /**
     * Gets the chiaveTariffa value for this VerificaTariffaComunicazioniRequest.
     * 
     * @return chiaveTariffa
     */
    public java.lang.String getChiaveTariffa() {
        return chiaveTariffa;
    }


    /**
     * Sets the chiaveTariffa value for this VerificaTariffaComunicazioniRequest.
     * 
     * @param chiaveTariffa
     */
    public void setChiaveTariffa(java.lang.String chiaveTariffa) {
        this.chiaveTariffa = chiaveTariffa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaTariffaComunicazioniRequest)) return false;
        VerificaTariffaComunicazioniRequest other = (VerificaTariffaComunicazioniRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTariffa==null && other.getChiaveTariffa()==null) || 
             (this.chiaveTariffa!=null &&
              this.chiaveTariffa.equals(other.getChiaveTariffa())));
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
        if (getChiaveTariffa() != null) {
            _hashCode += getChiaveTariffa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaTariffaComunicazioniRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaTariffaComunicazioniRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "chiaveTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
