/**
 * VerificaAnagraficaContribuentiRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class VerificaAnagraficaContribuentiRequest  implements java.io.Serializable {
    private java.lang.String codEnteGes;

    private java.lang.String codCiseGes;

    public VerificaAnagraficaContribuentiRequest() {
    }

    public VerificaAnagraficaContribuentiRequest(
           java.lang.String codEnteGes,
           java.lang.String codCiseGes) {
           this.codEnteGes = codEnteGes;
           this.codCiseGes = codCiseGes;
    }


    /**
     * Gets the codEnteGes value for this VerificaAnagraficaContribuentiRequest.
     * 
     * @return codEnteGes
     */
    public java.lang.String getCodEnteGes() {
        return codEnteGes;
    }


    /**
     * Sets the codEnteGes value for this VerificaAnagraficaContribuentiRequest.
     * 
     * @param codEnteGes
     */
    public void setCodEnteGes(java.lang.String codEnteGes) {
        this.codEnteGes = codEnteGes;
    }


    /**
     * Gets the codCiseGes value for this VerificaAnagraficaContribuentiRequest.
     * 
     * @return codCiseGes
     */
    public java.lang.String getCodCiseGes() {
        return codCiseGes;
    }


    /**
     * Sets the codCiseGes value for this VerificaAnagraficaContribuentiRequest.
     * 
     * @param codCiseGes
     */
    public void setCodCiseGes(java.lang.String codCiseGes) {
        this.codCiseGes = codCiseGes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaAnagraficaContribuentiRequest)) return false;
        VerificaAnagraficaContribuentiRequest other = (VerificaAnagraficaContribuentiRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codEnteGes==null && other.getCodEnteGes()==null) || 
             (this.codEnteGes!=null &&
              this.codEnteGes.equals(other.getCodEnteGes()))) &&
            ((this.codCiseGes==null && other.getCodCiseGes()==null) || 
             (this.codCiseGes!=null &&
              this.codCiseGes.equals(other.getCodCiseGes())));
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
        if (getCodEnteGes() != null) {
            _hashCode += getCodEnteGes().hashCode();
        }
        if (getCodCiseGes() != null) {
            _hashCode += getCodCiseGes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerificaAnagraficaContribuentiRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaAnagraficaContribuentiRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEnteGes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codEnteGes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCiseGes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codCiseGes"));
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
