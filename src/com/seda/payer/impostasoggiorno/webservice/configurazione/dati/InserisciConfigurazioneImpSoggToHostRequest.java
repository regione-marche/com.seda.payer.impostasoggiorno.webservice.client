/**
 * InserisciConfigurazioneImpSoggToHostRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class InserisciConfigurazioneImpSoggToHostRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno;

    private java.lang.String codUtente;

    public InserisciConfigurazioneImpSoggToHostRequest() {
    }

    public InserisciConfigurazioneImpSoggToHostRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno,
           java.lang.String codUtente) {
           this.configurazioneImpostaSoggiorno = configurazioneImpostaSoggiorno;
           this.codUtente = codUtente;
    }


    /**
     * Gets the configurazioneImpostaSoggiorno value for this InserisciConfigurazioneImpSoggToHostRequest.
     * 
     * @return configurazioneImpostaSoggiorno
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno getConfigurazioneImpostaSoggiorno() {
        return configurazioneImpostaSoggiorno;
    }


    /**
     * Sets the configurazioneImpostaSoggiorno value for this InserisciConfigurazioneImpSoggToHostRequest.
     * 
     * @param configurazioneImpostaSoggiorno
     */
    public void setConfigurazioneImpostaSoggiorno(com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno) {
        this.configurazioneImpostaSoggiorno = configurazioneImpostaSoggiorno;
    }


    /**
     * Gets the codUtente value for this InserisciConfigurazioneImpSoggToHostRequest.
     * 
     * @return codUtente
     */
    public java.lang.String getCodUtente() {
        return codUtente;
    }


    /**
     * Sets the codUtente value for this InserisciConfigurazioneImpSoggToHostRequest.
     * 
     * @param codUtente
     */
    public void setCodUtente(java.lang.String codUtente) {
        this.codUtente = codUtente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserisciConfigurazioneImpSoggToHostRequest)) return false;
        InserisciConfigurazioneImpSoggToHostRequest other = (InserisciConfigurazioneImpSoggToHostRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configurazioneImpostaSoggiorno==null && other.getConfigurazioneImpostaSoggiorno()==null) || 
             (this.configurazioneImpostaSoggiorno!=null &&
              this.configurazioneImpostaSoggiorno.equals(other.getConfigurazioneImpostaSoggiorno()))) &&
            ((this.codUtente==null && other.getCodUtente()==null) || 
             (this.codUtente!=null &&
              this.codUtente.equals(other.getCodUtente())));
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
        if (getConfigurazioneImpostaSoggiorno() != null) {
            _hashCode += getConfigurazioneImpostaSoggiorno().hashCode();
        }
        if (getCodUtente() != null) {
            _hashCode += getCodUtente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserisciConfigurazioneImpSoggToHostRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciConfigurazioneImpSoggToHostRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurazioneImpostaSoggiorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "configurazioneImpostaSoggiorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ConfigurazioneImpostaSoggiorno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codUtente"));
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