/**
 * GetBollettinoCumulativoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class GetBollettinoCumulativoRequest  implements java.io.Serializable {
    private java.lang.String codiceUtente;

    private java.lang.String listaDocumentiStruttureCorrelate;
    
    private java.lang.String idBollettinoCumulativoDaAggiornare;

    public GetBollettinoCumulativoRequest() {
    }

    public GetBollettinoCumulativoRequest(
           java.lang.String codiceUtente,
           java.lang.String listaDocumentiStruttureCorrelate,
           java.lang.String idBollettinoCumulativoDaAggiornare) {
           this.codiceUtente = codiceUtente;
           this.listaDocumentiStruttureCorrelate = listaDocumentiStruttureCorrelate;
           this.idBollettinoCumulativoDaAggiornare = idBollettinoCumulativoDaAggiornare;
    }


    /**
     * Gets the codiceUtente value for this GetBollettinoCumulativoRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this GetBollettinoCumulativoRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the listaDocumentiStruttureCorrelate value for this GetBollettinoCumulativoRequest.
     * 
     * @return listaDocumentiStruttureCorrelate
     */
    public java.lang.String getListaDocumentiStruttureCorrelate() {
        return listaDocumentiStruttureCorrelate;
    }


    /**
     * Sets the listaDocumentiStruttureCorrelate value for this GetBollettinoCumulativoRequest.
     * 
     * @param listaDocumentiStruttureCorrelate
     */
    public void setListaDocumentiStruttureCorrelate(java.lang.String listaDocumentiStruttureCorrelate) {
        this.listaDocumentiStruttureCorrelate = listaDocumentiStruttureCorrelate;
    }
    
    /**
     * Gets the idBollettinoCumulativoDaAggiornare value for this GetBollettinoCumulativoRequest.
     * 
     * @return idBollettinoCumulativoDaAggiornare
     */
    public java.lang.String getIdBollettinoCumulativoDaAggiornare() {
        return idBollettinoCumulativoDaAggiornare;
    }


    /**
     * Sets the idBollettinoCumulativoDaAggiornare value for this GetBollettinoCumulativoRequest.
     * 
     * @param idBollettinoCumulativoDaAggiornare
     */
    public void setIdBollettinoCumulativoDaAggiornare(java.lang.String idBollettinoCumulativoDaAggiornare) {
        this.idBollettinoCumulativoDaAggiornare = idBollettinoCumulativoDaAggiornare;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBollettinoCumulativoRequest)) return false;
        GetBollettinoCumulativoRequest other = (GetBollettinoCumulativoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.listaDocumentiStruttureCorrelate==null && other.getListaDocumentiStruttureCorrelate()==null) || 
             (this.listaDocumentiStruttureCorrelate!=null &&
              this.listaDocumentiStruttureCorrelate.equals(other.getListaDocumentiStruttureCorrelate()))) &&
            ((this.idBollettinoCumulativoDaAggiornare==null && other.getIdBollettinoCumulativoDaAggiornare()==null) || 
             (this.idBollettinoCumulativoDaAggiornare!=null &&
              this.idBollettinoCumulativoDaAggiornare.equals(other.getIdBollettinoCumulativoDaAggiornare())));
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
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getListaDocumentiStruttureCorrelate() != null) {
            _hashCode += getListaDocumentiStruttureCorrelate().hashCode();
        }
        if (getIdBollettinoCumulativoDaAggiornare() != null) {
            _hashCode += getIdBollettinoCumulativoDaAggiornare().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBollettinoCumulativoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetBollettinoCumulativoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDocumentiStruttureCorrelate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listaDocumentiStruttureCorrelate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBollettinoCumulativoDaAggiornare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "idBollettinoCumulativoDaAggiornare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
