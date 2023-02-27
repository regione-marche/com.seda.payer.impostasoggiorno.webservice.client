/**
 * RecuperaListaFasceTariffaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaFasceTariffaRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffa;

    private com.seda.payer.impostasoggiorno.webservice.dati.Paginazione pagina;

    public RecuperaListaFasceTariffaRequest() {
    }

    public RecuperaListaFasceTariffaRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffa,
           com.seda.payer.impostasoggiorno.webservice.dati.Paginazione pagina) {
           this.tariffa = tariffa;
           this.pagina = pagina;
    }


    /**
     * Gets the tariffa value for this RecuperaListaFasceTariffaRequest.
     * 
     * @return tariffa
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno getTariffa() {
        return tariffa;
    }


    /**
     * Sets the tariffa value for this RecuperaListaFasceTariffaRequest.
     * 
     * @param tariffa
     */
    public void setTariffa(com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffa) {
        this.tariffa = tariffa;
    }


    /**
     * Gets the pagina value for this RecuperaListaFasceTariffaRequest.
     * 
     * @return pagina
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.Paginazione getPagina() {
        return pagina;
    }


    /**
     * Sets the pagina value for this RecuperaListaFasceTariffaRequest.
     * 
     * @param pagina
     */
    public void setPagina(com.seda.payer.impostasoggiorno.webservice.dati.Paginazione pagina) {
        this.pagina = pagina;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaFasceTariffaRequest)) return false;
        RecuperaListaFasceTariffaRequest other = (RecuperaListaFasceTariffaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tariffa==null && other.getTariffa()==null) || 
             (this.tariffa!=null &&
              this.tariffa.equals(other.getTariffa()))) &&
            ((this.pagina==null && other.getPagina()==null) || 
             (this.pagina!=null &&
              this.pagina.equals(other.getPagina())));
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
        if (getTariffa() != null) {
            _hashCode += getTariffa().hashCode();
        }
        if (getPagina() != null) {
            _hashCode += getPagina().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaFasceTariffaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "tariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TariffaImpostaSoggiorno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "pagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "Paginazione"));
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
