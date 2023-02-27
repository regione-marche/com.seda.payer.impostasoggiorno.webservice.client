/**
 * InserisciCompilazioneDiarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class InserisciCompilazioneDiarioRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario;

    private com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettaglioDiario;

    public InserisciCompilazioneDiarioRequest() {
    }

    public InserisciCompilazioneDiarioRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario,
           com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettaglioDiario) {
           this.testataDiario = testataDiario;
           this.listDettaglioDiario = listDettaglioDiario;
    }


    /**
     * Gets the testataDiario value for this InserisciCompilazioneDiarioRequest.
     * 
     * @return testataDiario
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno getTestataDiario() {
        return testataDiario;
    }


    /**
     * Sets the testataDiario value for this InserisciCompilazioneDiarioRequest.
     * 
     * @param testataDiario
     */
    public void setTestataDiario(com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario) {
        this.testataDiario = testataDiario;
    }


    /**
     * Gets the listDettaglioDiario value for this InserisciCompilazioneDiarioRequest.
     * 
     * @return listDettaglioDiario
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] getListDettaglioDiario() {
        return listDettaglioDiario;
    }


    /**
     * Sets the listDettaglioDiario value for this InserisciCompilazioneDiarioRequest.
     * 
     * @param listDettaglioDiario
     */
    public void setListDettaglioDiario(com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettaglioDiario) {
        this.listDettaglioDiario = listDettaglioDiario;
    }

    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno getListDettaglioDiario(int i) {
        return this.listDettaglioDiario[i];
    }

    public void setListDettaglioDiario(int i, com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno _value) {
        this.listDettaglioDiario[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserisciCompilazioneDiarioRequest)) return false;
        InserisciCompilazioneDiarioRequest other = (InserisciCompilazioneDiarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testataDiario==null && other.getTestataDiario()==null) || 
             (this.testataDiario!=null &&
              this.testataDiario.equals(other.getTestataDiario()))) &&
            ((this.listDettaglioDiario==null && other.getListDettaglioDiario()==null) || 
             (this.listDettaglioDiario!=null &&
              java.util.Arrays.equals(this.listDettaglioDiario, other.getListDettaglioDiario())));
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
        if (getTestataDiario() != null) {
            _hashCode += getTestataDiario().hashCode();
        }
        if (getListDettaglioDiario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDettaglioDiario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDettaglioDiario(), i);
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
        new org.apache.axis.description.TypeDesc(InserisciCompilazioneDiarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciCompilazioneDiarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testataDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "testataDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataDiarioImpostaSoggiorno"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDettaglioDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listDettaglioDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioDiarioImpostaSoggiorno"));
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
