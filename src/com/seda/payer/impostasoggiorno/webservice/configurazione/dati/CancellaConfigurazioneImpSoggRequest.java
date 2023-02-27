/**
 * CancellaConfigurazioneImpSoggRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class CancellaConfigurazioneImpSoggRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno;

    public CancellaConfigurazioneImpSoggRequest() {
    }

    public CancellaConfigurazioneImpSoggRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno) {
           this.configurazioneImpostaSoggiorno = configurazioneImpostaSoggiorno;
    }


    /**
     * Gets the configurazioneImpostaSoggiorno value for this CancellaConfigurazioneImpSoggRequest.
     * 
     * @return configurazioneImpostaSoggiorno
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno getConfigurazioneImpostaSoggiorno() {
        return configurazioneImpostaSoggiorno;
    }


    /**
     * Sets the configurazioneImpostaSoggiorno value for this CancellaConfigurazioneImpSoggRequest.
     * 
     * @param configurazioneImpostaSoggiorno
     */
    public void setConfigurazioneImpostaSoggiorno(com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno configurazioneImpostaSoggiorno) {
        this.configurazioneImpostaSoggiorno = configurazioneImpostaSoggiorno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancellaConfigurazioneImpSoggRequest)) return false;
        CancellaConfigurazioneImpSoggRequest other = (CancellaConfigurazioneImpSoggRequest) obj;
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
              this.configurazioneImpostaSoggiorno.equals(other.getConfigurazioneImpostaSoggiorno())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancellaConfigurazioneImpSoggRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaConfigurazioneImpSoggRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurazioneImpostaSoggiorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "configurazioneImpostaSoggiorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ConfigurazioneImpostaSoggiorno"));
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
