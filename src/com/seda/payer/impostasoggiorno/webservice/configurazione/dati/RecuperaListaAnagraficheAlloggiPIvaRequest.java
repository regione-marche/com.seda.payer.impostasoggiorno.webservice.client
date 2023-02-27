/**
 * RecuperaListaAnagraficheAlloggiPIvaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaAnagraficheAlloggiPIvaRequest  implements java.io.Serializable {
    private java.lang.String partitaIva;

    private java.lang.String codiceTipologiaStruttura;

    public RecuperaListaAnagraficheAlloggiPIvaRequest() {
    }

    public RecuperaListaAnagraficheAlloggiPIvaRequest(
           java.lang.String partitaIva,
           java.lang.String codiceTipologiaStruttura) {
           this.partitaIva = partitaIva;
           this.codiceTipologiaStruttura = codiceTipologiaStruttura;
    }


    /**
     * Gets the partitaIva value for this RecuperaListaAnagraficheAlloggiPIvaRequest.
     * 
     * @return partitaIva
     */
    public java.lang.String getPartitaIva() {
        return partitaIva;
    }


    /**
     * Sets the partitaIva value for this RecuperaListaAnagraficheAlloggiPIvaRequest.
     * 
     * @param partitaIva
     */
    public void setPartitaIva(java.lang.String partitaIva) {
        this.partitaIva = partitaIva;
    }


    /**
     * Gets the codiceTipologiaStruttura value for this RecuperaListaAnagraficheAlloggiPIvaRequest.
     * 
     * @return codiceTipologiaStruttura
     */
    public java.lang.String getCodiceTipologiaStruttura() {
        return codiceTipologiaStruttura;
    }


    /**
     * Sets the codiceTipologiaStruttura value for this RecuperaListaAnagraficheAlloggiPIvaRequest.
     * 
     * @param codiceTipologiaStruttura
     */
    public void setCodiceTipologiaStruttura(java.lang.String codiceTipologiaStruttura) {
        this.codiceTipologiaStruttura = codiceTipologiaStruttura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaAnagraficheAlloggiPIvaRequest)) return false;
        RecuperaListaAnagraficheAlloggiPIvaRequest other = (RecuperaListaAnagraficheAlloggiPIvaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partitaIva==null && other.getPartitaIva()==null) || 
             (this.partitaIva!=null &&
              this.partitaIva.equals(other.getPartitaIva()))) &&
            ((this.codiceTipologiaStruttura==null && other.getCodiceTipologiaStruttura()==null) || 
             (this.codiceTipologiaStruttura!=null &&
              this.codiceTipologiaStruttura.equals(other.getCodiceTipologiaStruttura())));
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
        if (getPartitaIva() != null) {
            _hashCode += getPartitaIva().hashCode();
        }
        if (getCodiceTipologiaStruttura() != null) {
            _hashCode += getCodiceTipologiaStruttura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaAnagraficheAlloggiPIvaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficheAlloggiPIvaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitaIva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "partitaIva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codiceTipologiaStruttura"));
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
