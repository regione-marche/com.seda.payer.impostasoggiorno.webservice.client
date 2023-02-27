/**
 * RecuperaListaTipologiaStrutturaRicettivaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaTipologiaStrutturaRicettivaRequest  implements java.io.Serializable {
    private java.lang.String descrizioneTipologiaStruttura;

    private int rowsPerPage;

    private int pageNumber;

    public RecuperaListaTipologiaStrutturaRicettivaRequest() {
    }

    public RecuperaListaTipologiaStrutturaRicettivaRequest(
           java.lang.String descrizioneTipologiaStruttura,
           int rowsPerPage,
           int pageNumber) {
           this.descrizioneTipologiaStruttura = descrizioneTipologiaStruttura;
           this.rowsPerPage = rowsPerPage;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the descrizioneTipologiaStruttura value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @return descrizioneTipologiaStruttura
     */
    public java.lang.String getDescrizioneTipologiaStruttura() {
        return descrizioneTipologiaStruttura;
    }


    /**
     * Sets the descrizioneTipologiaStruttura value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @param descrizioneTipologiaStruttura
     */
    public void setDescrizioneTipologiaStruttura(java.lang.String descrizioneTipologiaStruttura) {
        this.descrizioneTipologiaStruttura = descrizioneTipologiaStruttura;
    }


    /**
     * Gets the rowsPerPage value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @return rowsPerPage
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the pageNumber value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this RecuperaListaTipologiaStrutturaRicettivaRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaTipologiaStrutturaRicettivaRequest)) return false;
        RecuperaListaTipologiaStrutturaRicettivaRequest other = (RecuperaListaTipologiaStrutturaRicettivaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descrizioneTipologiaStruttura==null && other.getDescrizioneTipologiaStruttura()==null) || 
             (this.descrizioneTipologiaStruttura!=null &&
              this.descrizioneTipologiaStruttura.equals(other.getDescrizioneTipologiaStruttura()))) &&
            this.rowsPerPage == other.getRowsPerPage() &&
            this.pageNumber == other.getPageNumber();
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
        if (getDescrizioneTipologiaStruttura() != null) {
            _hashCode += getDescrizioneTipologiaStruttura().hashCode();
        }
        _hashCode += getRowsPerPage();
        _hashCode += getPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaTipologiaStrutturaRicettivaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaStrutturaRicettivaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "rowsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
