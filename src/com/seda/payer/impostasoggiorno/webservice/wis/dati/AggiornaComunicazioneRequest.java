/**
 * AggiornaComunicazioneRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class AggiornaComunicazioneRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione;

    private com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettaglioComunicazione;

    public AggiornaComunicazioneRequest() {
    }

    public AggiornaComunicazioneRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione,
           com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettaglioComunicazione) {
           this.testataComunicazione = testataComunicazione;
           this.listDettaglioComunicazione = listDettaglioComunicazione;
    }


    /**
     * Gets the testataComunicazione value for this AggiornaComunicazioneRequest.
     * 
     * @return testataComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno getTestataComunicazione() {
        return testataComunicazione;
    }


    /**
     * Sets the testataComunicazione value for this AggiornaComunicazioneRequest.
     * 
     * @param testataComunicazione
     */
    public void setTestataComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione) {
        this.testataComunicazione = testataComunicazione;
    }


    /**
     * Gets the listDettaglioComunicazione value for this AggiornaComunicazioneRequest.
     * 
     * @return listDettaglioComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] getListDettaglioComunicazione() {
        return listDettaglioComunicazione;
    }


    /**
     * Sets the listDettaglioComunicazione value for this AggiornaComunicazioneRequest.
     * 
     * @param listDettaglioComunicazione
     */
    public void setListDettaglioComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettaglioComunicazione) {
        this.listDettaglioComunicazione = listDettaglioComunicazione;
    }

    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno getListDettaglioComunicazione(int i) {
        return this.listDettaglioComunicazione[i];
    }

    public void setListDettaglioComunicazione(int i, com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno _value) {
        this.listDettaglioComunicazione[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AggiornaComunicazioneRequest)) return false;
        AggiornaComunicazioneRequest other = (AggiornaComunicazioneRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testataComunicazione==null && other.getTestataComunicazione()==null) || 
             (this.testataComunicazione!=null &&
              this.testataComunicazione.equals(other.getTestataComunicazione()))) &&
            ((this.listDettaglioComunicazione==null && other.getListDettaglioComunicazione()==null) || 
             (this.listDettaglioComunicazione!=null &&
              java.util.Arrays.equals(this.listDettaglioComunicazione, other.getListDettaglioComunicazione())));
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
        if (getTestataComunicazione() != null) {
            _hashCode += getTestataComunicazione().hashCode();
        }
        if (getListDettaglioComunicazione() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDettaglioComunicazione());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDettaglioComunicazione(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AggiornaComunicazioneRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaComunicazioneRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "testataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataComunicazioneImpostaSoggiorno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDettaglioComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listDettaglioComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioComunicazioneImpostaSoggiorno"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
