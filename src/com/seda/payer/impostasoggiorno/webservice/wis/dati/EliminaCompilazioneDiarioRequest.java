/**
 * EliminaCompilazioneDiarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class EliminaCompilazioneDiarioRequest  implements java.io.Serializable {
    private java.lang.String chiaveTestataCompilazione;

    public EliminaCompilazioneDiarioRequest() {
    }

    public EliminaCompilazioneDiarioRequest(
           java.lang.String chiaveTestataCompilazione) {
           this.chiaveTestataCompilazione = chiaveTestataCompilazione;
    }


    /**
     * Gets the chiaveTestataCompilazione value for this EliminaCompilazioneDiarioRequest.
     * 
     * @return chiaveTestataCompilazione
     */
    public java.lang.String getChiaveTestataCompilazione() {
        return chiaveTestataCompilazione;
    }


    /**
     * Sets the chiaveTestataCompilazione value for this EliminaCompilazioneDiarioRequest.
     * 
     * @param chiaveTestataCompilazione
     */
    public void setChiaveTestataCompilazione(java.lang.String chiaveTestataCompilazione) {
        this.chiaveTestataCompilazione = chiaveTestataCompilazione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EliminaCompilazioneDiarioRequest)) return false;
        EliminaCompilazioneDiarioRequest other = (EliminaCompilazioneDiarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTestataCompilazione==null && other.getChiaveTestataCompilazione()==null) || 
             (this.chiaveTestataCompilazione!=null &&
              this.chiaveTestataCompilazione.equals(other.getChiaveTestataCompilazione())));
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
        if (getChiaveTestataCompilazione() != null) {
            _hashCode += getChiaveTestataCompilazione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EliminaCompilazioneDiarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">EliminaCompilazioneDiarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataCompilazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataCompilazione"));
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
