/**
 * RecuperaListaEntiImpostaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaEntiImpostaResponse  implements java.io.Serializable {
    private java.lang.String listXml;

    private com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato;

    public RecuperaListaEntiImpostaResponse() {
    }

    public RecuperaListaEntiImpostaResponse(
           java.lang.String listXml,
           com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato) {
           this.listXml = listXml;
           this.risultato = risultato;
    }


    /**
     * Gets the listXml value for this RecuperaListaEntiImpostaResponse.
     * 
     * @return listXml
     */
    public java.lang.String getListXml() {
        return listXml;
    }


    /**
     * Sets the listXml value for this RecuperaListaEntiImpostaResponse.
     * 
     * @param listXml
     */
    public void setListXml(java.lang.String listXml) {
        this.listXml = listXml;
    }


    /**
     * Gets the risultato value for this RecuperaListaEntiImpostaResponse.
     * 
     * @return risultato
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ResponseType getRisultato() {
        return risultato;
    }


    /**
     * Sets the risultato value for this RecuperaListaEntiImpostaResponse.
     * 
     * @param risultato
     */
    public void setRisultato(com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato) {
        this.risultato = risultato;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaEntiImpostaResponse)) return false;
        RecuperaListaEntiImpostaResponse other = (RecuperaListaEntiImpostaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listXml==null && other.getListXml()==null) || 
             (this.listXml!=null &&
              this.listXml.equals(other.getListXml()))) &&
            ((this.risultato==null && other.getRisultato()==null) || 
             (this.risultato!=null &&
              this.risultato.equals(other.getRisultato())));
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
        if (getListXml() != null) {
            _hashCode += getListXml().hashCode();
        }
        if (getRisultato() != null) {
            _hashCode += getRisultato().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaEntiImpostaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaEntiImpostaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "listXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risultato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "risultato"));
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
