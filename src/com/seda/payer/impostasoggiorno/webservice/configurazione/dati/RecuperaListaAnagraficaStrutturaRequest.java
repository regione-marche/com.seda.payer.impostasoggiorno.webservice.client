/**
 * RecuperaListaAnagraficaStrutturaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaAnagraficaStrutturaRequest  implements java.io.Serializable {
    private java.lang.String descrizioneComune;

    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura;

    private int rowsPerPage;

    private int pageNumber;

    public RecuperaListaAnagraficaStrutturaRequest() {
    }

    public RecuperaListaAnagraficaStrutturaRequest(
           java.lang.String descrizioneComune,
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura,
           int rowsPerPage,
           int pageNumber) {
           this.descrizioneComune = descrizioneComune;
           this.anagraficaStruttura = anagraficaStruttura;
           this.rowsPerPage = rowsPerPage;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the descrizioneComune value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the anagraficaStruttura value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @return anagraficaStruttura
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStruttura() {
        return anagraficaStruttura;
    }


    /**
     * Sets the anagraficaStruttura value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @param anagraficaStruttura
     */
    public void setAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura) {
        this.anagraficaStruttura = anagraficaStruttura;
    }


    /**
     * Gets the rowsPerPage value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @return rowsPerPage
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the pageNumber value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this RecuperaListaAnagraficaStrutturaRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaAnagraficaStrutturaRequest)) return false;
        RecuperaListaAnagraficaStrutturaRequest other = (RecuperaListaAnagraficaStrutturaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune()))) &&
            ((this.anagraficaStruttura==null && other.getAnagraficaStruttura()==null) || 
             (this.anagraficaStruttura!=null &&
              this.anagraficaStruttura.equals(other.getAnagraficaStruttura()))) &&
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
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        if (getAnagraficaStruttura() != null) {
            _hashCode += getAnagraficaStruttura().hashCode();
        }
        _hashCode += getRowsPerPage();
        _hashCode += getPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaAnagraficaStrutturaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "descrizioneComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "anagraficaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
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
