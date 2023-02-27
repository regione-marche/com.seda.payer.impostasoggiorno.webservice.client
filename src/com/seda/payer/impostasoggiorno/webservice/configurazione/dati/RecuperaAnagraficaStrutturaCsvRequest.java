/**
 * RecuperaAnagraficaStrutturaCsvRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaAnagraficaStrutturaCsvRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura;

    private java.lang.String descrizioneComune;

    public RecuperaAnagraficaStrutturaCsvRequest() {
    }

    public RecuperaAnagraficaStrutturaCsvRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura,
           java.lang.String descrizioneComune) {
           this.anagraficaStruttura = anagraficaStruttura;
           this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the anagraficaStruttura value for this RecuperaAnagraficaStrutturaCsvRequest.
     * 
     * @return anagraficaStruttura
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStruttura() {
        return anagraficaStruttura;
    }


    /**
     * Sets the anagraficaStruttura value for this RecuperaAnagraficaStrutturaCsvRequest.
     * 
     * @param anagraficaStruttura
     */
    public void setAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura) {
        this.anagraficaStruttura = anagraficaStruttura;
    }


    /**
     * Gets the descrizioneComune value for this RecuperaAnagraficaStrutturaCsvRequest.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this RecuperaAnagraficaStrutturaCsvRequest.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaAnagraficaStrutturaCsvRequest)) return false;
        RecuperaAnagraficaStrutturaCsvRequest other = (RecuperaAnagraficaStrutturaCsvRequest) obj;
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
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune())));
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
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaAnagraficaStrutturaCsvRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCsvRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "anagraficaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "descrizioneComune"));
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
