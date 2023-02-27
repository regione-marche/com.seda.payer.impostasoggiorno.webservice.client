/**
 * RecuperaAnagraficaStrutturaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaAnagraficaStrutturaRequest  implements java.io.Serializable {
    private java.lang.String chiaveAnagraficaStruttura;

    private java.lang.String annoComunicazione;

    public RecuperaAnagraficaStrutturaRequest() {
    }

    public RecuperaAnagraficaStrutturaRequest(
           java.lang.String chiaveAnagraficaStruttura,
           java.lang.String annoComunicazione) {
           this.chiaveAnagraficaStruttura = chiaveAnagraficaStruttura;
           this.annoComunicazione = annoComunicazione;
    }


    /**
     * Gets the chiaveAnagraficaStruttura value for this RecuperaAnagraficaStrutturaRequest.
     * 
     * @return chiaveAnagraficaStruttura
     */
    public java.lang.String getChiaveAnagraficaStruttura() {
        return chiaveAnagraficaStruttura;
    }


    /**
     * Sets the chiaveAnagraficaStruttura value for this RecuperaAnagraficaStrutturaRequest.
     * 
     * @param chiaveAnagraficaStruttura
     */
    public void setChiaveAnagraficaStruttura(java.lang.String chiaveAnagraficaStruttura) {
        this.chiaveAnagraficaStruttura = chiaveAnagraficaStruttura;
    }


    /**
     * Gets the annoComunicazione value for this RecuperaAnagraficaStrutturaRequest.
     * 
     * @return annoComunicazione
     */
    public java.lang.String getAnnoComunicazione() {
        return annoComunicazione;
    }


    /**
     * Sets the annoComunicazione value for this RecuperaAnagraficaStrutturaRequest.
     * 
     * @param annoComunicazione
     */
    public void setAnnoComunicazione(java.lang.String annoComunicazione) {
        this.annoComunicazione = annoComunicazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaAnagraficaStrutturaRequest)) return false;
        RecuperaAnagraficaStrutturaRequest other = (RecuperaAnagraficaStrutturaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveAnagraficaStruttura==null && other.getChiaveAnagraficaStruttura()==null) || 
             (this.chiaveAnagraficaStruttura!=null &&
              this.chiaveAnagraficaStruttura.equals(other.getChiaveAnagraficaStruttura()))) &&
            ((this.annoComunicazione==null && other.getAnnoComunicazione()==null) || 
             (this.annoComunicazione!=null &&
              this.annoComunicazione.equals(other.getAnnoComunicazione())));
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
        if (getChiaveAnagraficaStruttura() != null) {
            _hashCode += getChiaveAnagraficaStruttura().hashCode();
        }
        if (getAnnoComunicazione() != null) {
            _hashCode += getAnnoComunicazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaAnagraficaStrutturaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveAnagraficaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "chiaveAnagraficaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "annoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
