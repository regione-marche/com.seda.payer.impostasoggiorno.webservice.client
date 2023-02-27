/**
 * RecuperaTariffaImpostaSoggiornoStrutturaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaTariffaImpostaSoggiornoStrutturaRequest  implements java.io.Serializable {
    private java.lang.String codiceBelfiore;

    private java.lang.String chiaveTipologisStruttura;

    private java.util.Date dataFinePeriodo;

    public RecuperaTariffaImpostaSoggiornoStrutturaRequest() {
    }

    public RecuperaTariffaImpostaSoggiornoStrutturaRequest(
           java.lang.String codiceBelfiore,
           java.lang.String chiaveTipologisStruttura,
           java.util.Date dataFinePeriodo) {
           this.codiceBelfiore = codiceBelfiore;
           this.chiaveTipologisStruttura = chiaveTipologisStruttura;
           this.dataFinePeriodo = dataFinePeriodo;
    }


    /**
     * Gets the codiceBelfiore value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the chiaveTipologisStruttura value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @return chiaveTipologisStruttura
     */
    public java.lang.String getChiaveTipologisStruttura() {
        return chiaveTipologisStruttura;
    }


    /**
     * Sets the chiaveTipologisStruttura value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @param chiaveTipologisStruttura
     */
    public void setChiaveTipologisStruttura(java.lang.String chiaveTipologisStruttura) {
        this.chiaveTipologisStruttura = chiaveTipologisStruttura;
    }


    /**
     * Gets the dataFinePeriodo value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @return dataFinePeriodo
     */
    public java.util.Date getDataFinePeriodo() {
        return dataFinePeriodo;
    }


    /**
     * Sets the dataFinePeriodo value for this RecuperaTariffaImpostaSoggiornoStrutturaRequest.
     * 
     * @param dataFinePeriodo
     */
    public void setDataFinePeriodo(java.util.Date dataFinePeriodo) {
        this.dataFinePeriodo = dataFinePeriodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaTariffaImpostaSoggiornoStrutturaRequest)) return false;
        RecuperaTariffaImpostaSoggiornoStrutturaRequest other = (RecuperaTariffaImpostaSoggiornoStrutturaRequest) obj;
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
            ((this.chiaveTipologisStruttura==null && other.getChiaveTipologisStruttura()==null) || 
             (this.chiaveTipologisStruttura!=null &&
              this.chiaveTipologisStruttura.equals(other.getChiaveTipologisStruttura()))) &&
            ((this.dataFinePeriodo==null && other.getDataFinePeriodo()==null) || 
             (this.dataFinePeriodo!=null &&
              this.dataFinePeriodo.equals(other.getDataFinePeriodo())));
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
        if (getChiaveTipologisStruttura() != null) {
            _hashCode += getChiaveTipologisStruttura().hashCode();
        }
        if (getDataFinePeriodo() != null) {
            _hashCode += getDataFinePeriodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaTariffaImpostaSoggiornoStrutturaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaImpostaSoggiornoStrutturaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologisStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologisStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinePeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "dataFinePeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
