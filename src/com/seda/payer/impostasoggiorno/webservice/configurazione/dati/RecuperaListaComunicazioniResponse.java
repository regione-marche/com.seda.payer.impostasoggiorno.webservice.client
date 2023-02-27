/**
 * RecuperaListaComunicazioniResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaComunicazioniResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response;

    private java.lang.String listComunicazioniXml;

    private com.seda.payer.impostasoggiorno.webservice.dati.PageInfo pageInfo;

    private int totSoggetti;

    private int totPernottamentiSoggettiAdImposta;

    private java.math.BigDecimal totImporto;

    public RecuperaListaComunicazioniResponse() {
    }

    public RecuperaListaComunicazioniResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response,
           java.lang.String listComunicazioniXml,
           com.seda.payer.impostasoggiorno.webservice.dati.PageInfo pageInfo,
           int totSoggetti,
           int totPernottamentiSoggettiAdImposta,
           java.math.BigDecimal totImporto) {
           this.response = response;
           this.listComunicazioniXml = listComunicazioniXml;
           this.pageInfo = pageInfo;
           this.totSoggetti = totSoggetti;
           this.totPernottamentiSoggettiAdImposta = totPernottamentiSoggettiAdImposta;
           this.totImporto = totImporto;
    }


    /**
     * Gets the response value for this RecuperaListaComunicazioniResponse.
     * 
     * @return response
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ResponseType getResponse() {
        return response;
    }


    /**
     * Sets the response value for this RecuperaListaComunicazioniResponse.
     * 
     * @param response
     */
    public void setResponse(com.seda.payer.impostasoggiorno.webservice.dati.ResponseType response) {
        this.response = response;
    }


    /**
     * Gets the listComunicazioniXml value for this RecuperaListaComunicazioniResponse.
     * 
     * @return listComunicazioniXml
     */
    public java.lang.String getListComunicazioniXml() {
        return listComunicazioniXml;
    }


    /**
     * Sets the listComunicazioniXml value for this RecuperaListaComunicazioniResponse.
     * 
     * @param listComunicazioniXml
     */
    public void setListComunicazioniXml(java.lang.String listComunicazioniXml) {
        this.listComunicazioniXml = listComunicazioniXml;
    }


    /**
     * Gets the pageInfo value for this RecuperaListaComunicazioniResponse.
     * 
     * @return pageInfo
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.PageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this RecuperaListaComunicazioniResponse.
     * 
     * @param pageInfo
     */
    public void setPageInfo(com.seda.payer.impostasoggiorno.webservice.dati.PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the totSoggetti value for this RecuperaListaComunicazioniResponse.
     * 
     * @return totSoggetti
     */
    public int getTotSoggetti() {
        return totSoggetti;
    }


    /**
     * Sets the totSoggetti value for this RecuperaListaComunicazioniResponse.
     * 
     * @param totSoggetti
     */
    public void setTotSoggetti(int totSoggetti) {
        this.totSoggetti = totSoggetti;
    }


    /**
     * Gets the totPernottamentiSoggettiAdImposta value for this RecuperaListaComunicazioniResponse.
     * 
     * @return totPernottamentiSoggettiAdImposta
     */
    public int getTotPernottamentiSoggettiAdImposta() {
        return totPernottamentiSoggettiAdImposta;
    }


    /**
     * Sets the totPernottamentiSoggettiAdImposta value for this RecuperaListaComunicazioniResponse.
     * 
     * @param totPernottamentiSoggettiAdImposta
     */
    public void setTotPernottamentiSoggettiAdImposta(int totPernottamentiSoggettiAdImposta) {
        this.totPernottamentiSoggettiAdImposta = totPernottamentiSoggettiAdImposta;
    }


    /**
     * Gets the totImporto value for this RecuperaListaComunicazioniResponse.
     * 
     * @return totImporto
     */
    public java.math.BigDecimal getTotImporto() {
        return totImporto;
    }


    /**
     * Sets the totImporto value for this RecuperaListaComunicazioniResponse.
     * 
     * @param totImporto
     */
    public void setTotImporto(java.math.BigDecimal totImporto) {
        this.totImporto = totImporto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaComunicazioniResponse)) return false;
        RecuperaListaComunicazioniResponse other = (RecuperaListaComunicazioniResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.listComunicazioniXml==null && other.getListComunicazioniXml()==null) || 
             (this.listComunicazioniXml!=null &&
              this.listComunicazioniXml.equals(other.getListComunicazioniXml()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo()))) &&
            this.totSoggetti == other.getTotSoggetti() &&
            this.totPernottamentiSoggettiAdImposta == other.getTotPernottamentiSoggettiAdImposta() &&
            ((this.totImporto==null && other.getTotImporto()==null) || 
             (this.totImporto!=null &&
              this.totImporto.equals(other.getTotImporto())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getListComunicazioniXml() != null) {
            _hashCode += getListComunicazioniXml().hashCode();
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        _hashCode += getTotSoggetti();
        _hashCode += getTotPernottamentiSoggettiAdImposta();
        if (getTotImporto() != null) {
            _hashCode += getTotImporto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaComunicazioniResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listComunicazioniXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "listComunicazioniXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "pageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "PageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totSoggetti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "totSoggetti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totPernottamentiSoggettiAdImposta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "totPernottamentiSoggettiAdImposta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totImporto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "totImporto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
