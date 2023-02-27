/**
 * RecuperaDettaglioDiarioCompletoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaDettaglioDiarioCompletoRequest  implements java.io.Serializable {
    private java.lang.String chiaveTestataDiario;

    public RecuperaDettaglioDiarioCompletoRequest() {
    }

    public RecuperaDettaglioDiarioCompletoRequest(
           java.lang.String chiaveTestataDiario) {
           this.chiaveTestataDiario = chiaveTestataDiario;
    }


    /**
     * Gets the chiaveTestataDiario value for this RecuperaDettaglioDiarioCompletoRequest.
     * 
     * @return chiaveTestataDiario
     */
    public java.lang.String getChiaveTestataDiario() {
        return chiaveTestataDiario;
    }


    /**
     * Sets the chiaveTestataDiario value for this RecuperaDettaglioDiarioCompletoRequest.
     * 
     * @param chiaveTestataDiario
     */
    public void setChiaveTestataDiario(java.lang.String chiaveTestataDiario) {
        this.chiaveTestataDiario = chiaveTestataDiario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettaglioDiarioCompletoRequest)) return false;
        RecuperaDettaglioDiarioCompletoRequest other = (RecuperaDettaglioDiarioCompletoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTestataDiario==null && other.getChiaveTestataDiario()==null) || 
             (this.chiaveTestataDiario!=null &&
              this.chiaveTestataDiario.equals(other.getChiaveTestataDiario())));
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
        if (getChiaveTestataDiario() != null) {
            _hashCode += getChiaveTestataDiario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettaglioDiarioCompletoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataDiario"));
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
