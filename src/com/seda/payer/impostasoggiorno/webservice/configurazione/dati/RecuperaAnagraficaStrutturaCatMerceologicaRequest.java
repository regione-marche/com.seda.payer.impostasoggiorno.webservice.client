/**
 * RecuperaAnagraficaStrutturaCatMerceologicaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaAnagraficaStrutturaCatMerceologicaRequest  implements java.io.Serializable {
    private java.lang.String codiceBelfiore;

    private java.lang.String partitaIVAStruttura;

    private java.lang.String chiaveTipologiaStruttura;

    public RecuperaAnagraficaStrutturaCatMerceologicaRequest() {
    }

    public RecuperaAnagraficaStrutturaCatMerceologicaRequest(
           java.lang.String codiceBelfiore,
           java.lang.String partitaIVAStruttura,
           java.lang.String chiaveTipologiaStruttura) {
           this.codiceBelfiore = codiceBelfiore;
           this.partitaIVAStruttura = partitaIVAStruttura;
           this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
    }


    /**
     * Gets the codiceBelfiore value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the partitaIVAStruttura value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @return partitaIVAStruttura
     */
    public java.lang.String getPartitaIVAStruttura() {
        return partitaIVAStruttura;
    }


    /**
     * Sets the partitaIVAStruttura value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @param partitaIVAStruttura
     */
    public void setPartitaIVAStruttura(java.lang.String partitaIVAStruttura) {
        this.partitaIVAStruttura = partitaIVAStruttura;
    }


    /**
     * Gets the chiaveTipologiaStruttura value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @return chiaveTipologiaStruttura
     */
    public java.lang.String getChiaveTipologiaStruttura() {
        return chiaveTipologiaStruttura;
    }


    /**
     * Sets the chiaveTipologiaStruttura value for this RecuperaAnagraficaStrutturaCatMerceologicaRequest.
     * 
     * @param chiaveTipologiaStruttura
     */
    public void setChiaveTipologiaStruttura(java.lang.String chiaveTipologiaStruttura) {
        this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaAnagraficaStrutturaCatMerceologicaRequest)) return false;
        RecuperaAnagraficaStrutturaCatMerceologicaRequest other = (RecuperaAnagraficaStrutturaCatMerceologicaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.partitaIVAStruttura==null && other.getPartitaIVAStruttura()==null) || 
             (this.partitaIVAStruttura!=null &&
              this.partitaIVAStruttura.equals(other.getPartitaIVAStruttura()))) &&
            ((this.chiaveTipologiaStruttura==null && other.getChiaveTipologiaStruttura()==null) || 
             (this.chiaveTipologiaStruttura!=null &&
              this.chiaveTipologiaStruttura.equals(other.getChiaveTipologiaStruttura())));
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
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getPartitaIVAStruttura() != null) {
            _hashCode += getPartitaIVAStruttura().hashCode();
        }
        if (getChiaveTipologiaStruttura() != null) {
            _hashCode += getChiaveTipologiaStruttura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaAnagraficaStrutturaCatMerceologicaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCatMerceologicaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitaIVAStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "partitaIVAStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologiaStruttura"));
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
