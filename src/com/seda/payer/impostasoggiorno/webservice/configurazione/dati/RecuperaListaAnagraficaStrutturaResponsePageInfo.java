/**
 * RecuperaListaAnagraficaStrutturaResponsePageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaAnagraficaStrutturaResponsePageInfo  implements java.io.Serializable {
    private int firstRow;

    private int lastRow;

    private int numRows;

    private int numPages;

    private int pageNumber;

    public RecuperaListaAnagraficaStrutturaResponsePageInfo() {
    }

    public RecuperaListaAnagraficaStrutturaResponsePageInfo(
           int firstRow,
           int lastRow,
           int numRows,
           int numPages,
           int pageNumber) {
           this.firstRow = firstRow;
           this.lastRow = lastRow;
           this.numRows = numRows;
           this.numPages = numPages;
           this.pageNumber = pageNumber;
    }


    /**
     * Gets the firstRow value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @return firstRow
     */
    public int getFirstRow() {
        return firstRow;
    }


    /**
     * Sets the firstRow value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @param firstRow
     */
    public void setFirstRow(int firstRow) {
        this.firstRow = firstRow;
    }


    /**
     * Gets the lastRow value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @return lastRow
     */
    public int getLastRow() {
        return lastRow;
    }


    /**
     * Sets the lastRow value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @param lastRow
     */
    public void setLastRow(int lastRow) {
        this.lastRow = lastRow;
    }


    /**
     * Gets the numRows value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @return numRows
     */
    public int getNumRows() {
        return numRows;
    }


    /**
     * Sets the numRows value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @param numRows
     */
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }


    /**
     * Gets the numPages value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @return numPages
     */
    public int getNumPages() {
        return numPages;
    }


    /**
     * Sets the numPages value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @param numPages
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }


    /**
     * Gets the pageNumber value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this RecuperaListaAnagraficaStrutturaResponsePageInfo.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaAnagraficaStrutturaResponsePageInfo)) return false;
        RecuperaListaAnagraficaStrutturaResponsePageInfo other = (RecuperaListaAnagraficaStrutturaResponsePageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.firstRow == other.getFirstRow() &&
            this.lastRow == other.getLastRow() &&
            this.numRows == other.getNumRows() &&
            this.numPages == other.getNumPages() &&
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
        _hashCode += getFirstRow();
        _hashCode += getLastRow();
        _hashCode += getNumRows();
        _hashCode += getNumPages();
        _hashCode += getPageNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaAnagraficaStrutturaResponsePageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaAnagraficaStrutturaResponse>pageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "firstRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "lastRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "numRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "numPages"));
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
