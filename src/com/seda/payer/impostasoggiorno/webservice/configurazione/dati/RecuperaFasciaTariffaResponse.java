/**
 * RecuperaFasciaTariffaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaFasciaTariffaResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato;

    private com.seda.payer.impostasoggiorno.webservice.dati.FasciaTariffaImpostaSoggiorno tariffa;

    public RecuperaFasciaTariffaResponse() {
    }

    public RecuperaFasciaTariffaResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato,
           com.seda.payer.impostasoggiorno.webservice.dati.FasciaTariffaImpostaSoggiorno tariffa) {
           this.risultato = risultato;
           this.tariffa = tariffa;
    }


    /**
     * Gets the risultato value for this RecuperaFasciaTariffaResponse.
     * 
     * @return risultato
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ResponseType getRisultato() {
        return risultato;
    }


    /**
     * Sets the risultato value for this RecuperaFasciaTariffaResponse.
     * 
     * @param risultato
     */
    public void setRisultato(com.seda.payer.impostasoggiorno.webservice.dati.ResponseType risultato) {
        this.risultato = risultato;
    }


    /**
     * Gets the tariffa value for this RecuperaFasciaTariffaResponse.
     * 
     * @return tariffa
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.FasciaTariffaImpostaSoggiorno getTariffa() {
        return tariffa;
    }


    /**
     * Sets the tariffa value for this RecuperaFasciaTariffaResponse.
     * 
     * @param tariffa
     */
    public void setTariffa(com.seda.payer.impostasoggiorno.webservice.dati.FasciaTariffaImpostaSoggiorno tariffa) {
        this.tariffa = tariffa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaFasciaTariffaResponse)) return false;
        RecuperaFasciaTariffaResponse other = (RecuperaFasciaTariffaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.risultato==null && other.getRisultato()==null) || 
             (this.risultato!=null &&
              this.risultato.equals(other.getRisultato()))) &&
            ((this.tariffa==null && other.getTariffa()==null) || 
             (this.tariffa!=null &&
              this.tariffa.equals(other.getTariffa())));
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
        if (getRisultato() != null) {
            _hashCode += getRisultato().hashCode();
        }
        if (getTariffa() != null) {
            _hashCode += getTariffa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaFasciaTariffaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasciaTariffaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risultato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "risultato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "tariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "FasciaTariffaImpostaSoggiorno"));
        elemField.setMinOccurs(0);
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
