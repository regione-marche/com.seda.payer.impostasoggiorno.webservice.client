/**
 * TipologiaStrutturaRicettiva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class TipologiaStrutturaRicettiva  implements java.io.Serializable {
    private java.lang.String chiaveTipologiaStruttura;

    private java.lang.String descrizioneTipologiaStruttura;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    public TipologiaStrutturaRicettiva() {
    }

    public TipologiaStrutturaRicettiva(
           java.lang.String chiaveTipologiaStruttura,
           java.lang.String descrizioneTipologiaStruttura,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento) {
           this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
           this.descrizioneTipologiaStruttura = descrizioneTipologiaStruttura;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the chiaveTipologiaStruttura value for this TipologiaStrutturaRicettiva.
     * 
     * @return chiaveTipologiaStruttura
     */
    public java.lang.String getChiaveTipologiaStruttura() {
        return chiaveTipologiaStruttura;
    }


    /**
     * Sets the chiaveTipologiaStruttura value for this TipologiaStrutturaRicettiva.
     * 
     * @param chiaveTipologiaStruttura
     */
    public void setChiaveTipologiaStruttura(java.lang.String chiaveTipologiaStruttura) {
        this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
    }


    /**
     * Gets the descrizioneTipologiaStruttura value for this TipologiaStrutturaRicettiva.
     * 
     * @return descrizioneTipologiaStruttura
     */
    public java.lang.String getDescrizioneTipologiaStruttura() {
        return descrizioneTipologiaStruttura;
    }


    /**
     * Sets the descrizioneTipologiaStruttura value for this TipologiaStrutturaRicettiva.
     * 
     * @param descrizioneTipologiaStruttura
     */
    public void setDescrizioneTipologiaStruttura(java.lang.String descrizioneTipologiaStruttura) {
        this.descrizioneTipologiaStruttura = descrizioneTipologiaStruttura;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this TipologiaStrutturaRicettiva.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this TipologiaStrutturaRicettiva.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this TipologiaStrutturaRicettiva.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this TipologiaStrutturaRicettiva.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipologiaStrutturaRicettiva)) return false;
        TipologiaStrutturaRicettiva other = (TipologiaStrutturaRicettiva) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTipologiaStruttura==null && other.getChiaveTipologiaStruttura()==null) || 
             (this.chiaveTipologiaStruttura!=null &&
              this.chiaveTipologiaStruttura.equals(other.getChiaveTipologiaStruttura()))) &&
            ((this.descrizioneTipologiaStruttura==null && other.getDescrizioneTipologiaStruttura()==null) || 
             (this.descrizioneTipologiaStruttura!=null &&
              this.descrizioneTipologiaStruttura.equals(other.getDescrizioneTipologiaStruttura()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento())));
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
        if (getChiaveTipologiaStruttura() != null) {
            _hashCode += getChiaveTipologiaStruttura().hashCode();
        }
        if (getDescrizioneTipologiaStruttura() != null) {
            _hashCode += getDescrizioneTipologiaStruttura().hashCode();
        }
        if (getDataUltimoAggiornamento() != null) {
            _hashCode += getDataUltimoAggiornamento().hashCode();
        }
        if (getOperatoreUltimoAggiornamento() != null) {
            _hashCode += getOperatoreUltimoAggiornamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipologiaStrutturaRicettiva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaStrutturaRicettiva"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimoAggiornamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataUltimoAggiornamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoreUltimoAggiornamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "operatoreUltimoAggiornamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
