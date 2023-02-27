/**
 * RecuperaListaAnagraficaStrutturaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaAnagraficaStrutturaResponse  implements java.io.Serializable {
    private java.lang.String listXml;

    private com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponsePageInfo pageInfo;

    public RecuperaListaAnagraficaStrutturaResponse() {
    }

    public RecuperaListaAnagraficaStrutturaResponse(
           java.lang.String listXml,
           com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponsePageInfo pageInfo) {
           this.listXml = listXml;
           this.pageInfo = pageInfo;
    }


    /**
     * Gets the listXml value for this RecuperaListaAnagraficaStrutturaResponse.
     * 
     * @return listXml
     */
    public java.lang.String getListXml() {
        return listXml;
    }


    /**
     * Sets the listXml value for this RecuperaListaAnagraficaStrutturaResponse.
     * 
     * @param listXml
     */
    public void setListXml(java.lang.String listXml) {
        this.listXml = listXml;
    }


    /**
     * Gets the pageInfo value for this RecuperaListaAnagraficaStrutturaResponse.
     * 
     * @return pageInfo
     */
    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponsePageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this RecuperaListaAnagraficaStrutturaResponse.
     * 
     * @param pageInfo
     */
    public void setPageInfo(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponsePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaAnagraficaStrutturaResponse)) return false;
        RecuperaListaAnagraficaStrutturaResponse other = (RecuperaListaAnagraficaStrutturaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listXml==null && other.getListXml()==null) || 
             (this.listXml!=null &&
              this.listXml.equals(other.getListXml()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo())));
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
        if (getListXml() != null) {
            _hashCode += getListXml().hashCode();
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaAnagraficaStrutturaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "listXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "pageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaAnagraficaStrutturaResponse>pageInfo"));
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
