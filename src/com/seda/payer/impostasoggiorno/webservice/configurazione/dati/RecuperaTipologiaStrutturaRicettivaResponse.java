/**
 * RecuperaTipologiaStrutturaRicettivaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaTipologiaStrutturaRicettivaResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStruttura;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RecuperaTipologiaStrutturaRicettivaResponse() {
    }

    public RecuperaTipologiaStrutturaRicettivaResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStruttura,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.tipologiaStruttura = tipologiaStruttura;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the tipologiaStruttura value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @return tipologiaStruttura
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva getTipologiaStruttura() {
        return tipologiaStruttura;
    }


    /**
     * Sets the tipologiaStruttura value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @param tipologiaStruttura
     */
    public void setTipologiaStruttura(com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStruttura) {
        this.tipologiaStruttura = tipologiaStruttura;
    }


    /**
     * Gets the retCode value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaTipologiaStrutturaRicettivaResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaTipologiaStrutturaRicettivaResponse)) return false;
        RecuperaTipologiaStrutturaRicettivaResponse other = (RecuperaTipologiaStrutturaRicettivaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipologiaStruttura==null && other.getTipologiaStruttura()==null) || 
             (this.tipologiaStruttura!=null &&
              this.tipologiaStruttura.equals(other.getTipologiaStruttura()))) &&
            ((this.retCode==null && other.getRetCode()==null) || 
             (this.retCode!=null &&
              this.retCode.equals(other.getRetCode()))) &&
            ((this.retMessage==null && other.getRetMessage()==null) || 
             (this.retMessage!=null &&
              this.retMessage.equals(other.getRetMessage())));
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
        if (getTipologiaStruttura() != null) {
            _hashCode += getTipologiaStruttura().hashCode();
        }
        if (getRetCode() != null) {
            _hashCode += getRetCode().hashCode();
        }
        if (getRetMessage() != null) {
            _hashCode += getRetMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaTipologiaStrutturaRicettivaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "tipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaStrutturaRicettiva"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "retMessage"));
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
