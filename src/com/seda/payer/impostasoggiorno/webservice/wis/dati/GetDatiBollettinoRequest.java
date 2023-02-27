/**
 * GetDatiBollettinoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class GetDatiBollettinoRequest  implements java.io.Serializable {
    private java.lang.String codiceUtente;

    private java.lang.String numeroBollettino;

    private java.lang.String codiceEnteGestionaleEntrate;

    private java.lang.String impostaServizioGestionaleEntrate;

    private java.lang.String flagImportoZero;

    public GetDatiBollettinoRequest() {
    }

    public GetDatiBollettinoRequest(
           java.lang.String codiceUtente,
           java.lang.String numeroBollettino,
           java.lang.String codiceEnteGestionaleEntrate,
           java.lang.String impostaServizioGestionaleEntrate,
           java.lang.String flagImportoZero) {
           this.codiceUtente = codiceUtente;
           this.numeroBollettino = numeroBollettino;
           this.codiceEnteGestionaleEntrate = codiceEnteGestionaleEntrate;
           this.impostaServizioGestionaleEntrate = impostaServizioGestionaleEntrate;
           this.flagImportoZero = flagImportoZero;
    }


    /**
     * Gets the codiceUtente value for this GetDatiBollettinoRequest.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this GetDatiBollettinoRequest.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the numeroBollettino value for this GetDatiBollettinoRequest.
     * 
     * @return numeroBollettino
     */
    public java.lang.String getNumeroBollettino() {
        return numeroBollettino;
    }


    /**
     * Sets the numeroBollettino value for this GetDatiBollettinoRequest.
     * 
     * @param numeroBollettino
     */
    public void setNumeroBollettino(java.lang.String numeroBollettino) {
        this.numeroBollettino = numeroBollettino;
    }


    /**
     * Gets the codiceEnteGestionaleEntrate value for this GetDatiBollettinoRequest.
     * 
     * @return codiceEnteGestionaleEntrate
     */
    public java.lang.String getCodiceEnteGestionaleEntrate() {
        return codiceEnteGestionaleEntrate;
    }


    /**
     * Sets the codiceEnteGestionaleEntrate value for this GetDatiBollettinoRequest.
     * 
     * @param codiceEnteGestionaleEntrate
     */
    public void setCodiceEnteGestionaleEntrate(java.lang.String codiceEnteGestionaleEntrate) {
        this.codiceEnteGestionaleEntrate = codiceEnteGestionaleEntrate;
    }


    /**
     * Gets the impostaServizioGestionaleEntrate value for this GetDatiBollettinoRequest.
     * 
     * @return impostaServizioGestionaleEntrate
     */
    public java.lang.String getImpostaServizioGestionaleEntrate() {
        return impostaServizioGestionaleEntrate;
    }


    /**
     * Sets the impostaServizioGestionaleEntrate value for this GetDatiBollettinoRequest.
     * 
     * @param impostaServizioGestionaleEntrate
     */
    public void setImpostaServizioGestionaleEntrate(java.lang.String impostaServizioGestionaleEntrate) {
        this.impostaServizioGestionaleEntrate = impostaServizioGestionaleEntrate;
    }


    /**
     * Gets the flagImportoZero value for this GetDatiBollettinoRequest.
     * 
     * @return flagImportoZero
     */
    public java.lang.String getFlagImportoZero() {
        return flagImportoZero;
    }


    /**
     * Sets the flagImportoZero value for this GetDatiBollettinoRequest.
     * 
     * @param flagImportoZero
     */
    public void setFlagImportoZero(java.lang.String flagImportoZero) {
        this.flagImportoZero = flagImportoZero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDatiBollettinoRequest)) return false;
        GetDatiBollettinoRequest other = (GetDatiBollettinoRequest) obj;
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
            ((this.numeroBollettino==null && other.getNumeroBollettino()==null) || 
             (this.numeroBollettino!=null &&
              this.numeroBollettino.equals(other.getNumeroBollettino()))) &&
            ((this.codiceEnteGestionaleEntrate==null && other.getCodiceEnteGestionaleEntrate()==null) || 
             (this.codiceEnteGestionaleEntrate!=null &&
              this.codiceEnteGestionaleEntrate.equals(other.getCodiceEnteGestionaleEntrate()))) &&
            ((this.impostaServizioGestionaleEntrate==null && other.getImpostaServizioGestionaleEntrate()==null) || 
             (this.impostaServizioGestionaleEntrate!=null &&
              this.impostaServizioGestionaleEntrate.equals(other.getImpostaServizioGestionaleEntrate()))) &&
            ((this.flagImportoZero==null && other.getFlagImportoZero()==null) || 
             (this.flagImportoZero!=null &&
              this.flagImportoZero.equals(other.getFlagImportoZero())));
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
        if (getNumeroBollettino() != null) {
            _hashCode += getNumeroBollettino().hashCode();
        }
        if (getCodiceEnteGestionaleEntrate() != null) {
            _hashCode += getCodiceEnteGestionaleEntrate().hashCode();
        }
        if (getImpostaServizioGestionaleEntrate() != null) {
            _hashCode += getImpostaServizioGestionaleEntrate().hashCode();
        }
        if (getFlagImportoZero() != null) {
            _hashCode += getFlagImportoZero().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDatiBollettinoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "numeroBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceEnteGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceEnteGestionaleEntrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizioGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "impostaServizioGestionaleEntrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagImportoZero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "flagImportoZero"));
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