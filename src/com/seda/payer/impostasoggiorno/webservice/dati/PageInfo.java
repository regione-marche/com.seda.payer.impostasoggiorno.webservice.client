/**
 * PageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class PageInfo  implements java.io.Serializable {
    private int firstRow;

    private int lastRow;

    private int numRows;

    private int numPages;

    private int pageNumber;

    private java.lang.Integer rowsPerPage;

    public PageInfo() {
    }

    public PageInfo(
           int firstRow,
           int lastRow,
           int numRows,
           int numPages,
           int pageNumber,
           java.lang.Integer rowsPerPage) {
           this.firstRow = firstRow;
           this.lastRow = lastRow;
           this.numRows = numRows;
           this.numPages = numPages;
           this.pageNumber = pageNumber;
           this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the firstRow value for this PageInfo.
     * 
     * @return firstRow
     */
    public int getFirstRow() {
        return firstRow;
    }


    /**
     * Sets the firstRow value for this PageInfo.
     * 
     * @param firstRow
     */
    public void setFirstRow(int firstRow) {
        this.firstRow = firstRow;
    }


    /**
     * Gets the lastRow value for this PageInfo.
     * 
     * @return lastRow
     */
    public int getLastRow() {
        return lastRow;
    }


    /**
     * Sets the lastRow value for this PageInfo.
     * 
     * @param lastRow
     */
    public void setLastRow(int lastRow) {
        this.lastRow = lastRow;
    }


    /**
     * Gets the numRows value for this PageInfo.
     * 
     * @return numRows
     */
    public int getNumRows() {
        return numRows;
    }


    /**
     * Sets the numRows value for this PageInfo.
     * 
     * @param numRows
     */
    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }


    /**
     * Gets the numPages value for this PageInfo.
     * 
     * @return numPages
     */
    public int getNumPages() {
        return numPages;
    }


    /**
     * Sets the numPages value for this PageInfo.
     * 
     * @param numPages
     */
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }


    /**
     * Gets the pageNumber value for this PageInfo.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this PageInfo.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the rowsPerPage value for this PageInfo.
     * 
     * @return rowsPerPage
     */
    public java.lang.Integer getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this PageInfo.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(java.lang.Integer rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PageInfo)) return false;
        PageInfo other = (PageInfo) obj;
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
            this.pageNumber == other.getPageNumber() &&
            ((this.rowsPerPage==null && other.getRowsPerPage()==null) || 
             (this.rowsPerPage!=null &&
              this.rowsPerPage.equals(other.getRowsPerPage())));
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
        if (getRowsPerPage() != null) {
            _hashCode += getRowsPerPage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "PageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "firstRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "lastRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "rowsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
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
