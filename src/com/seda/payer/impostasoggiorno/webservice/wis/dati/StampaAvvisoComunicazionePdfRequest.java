/**
 * StampaAvvisoComunicazionePdfRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class StampaAvvisoComunicazionePdfRequest  implements java.io.Serializable {
    private java.lang.String chiaveTestataComunicazione;

    private java.lang.String descrizioneComune;

    private java.lang.String siglaProvincia;

    private boolean enteRIDabilitato;

    private boolean contribuenteRIDabilitato;

    private boolean pdfCumulativo;

    public StampaAvvisoComunicazionePdfRequest() {
    }

    public StampaAvvisoComunicazionePdfRequest(
           java.lang.String chiaveTestataComunicazione,
           java.lang.String descrizioneComune,
           java.lang.String siglaProvincia,
           boolean enteRIDabilitato,
           boolean contribuenteRIDabilitato,
           boolean pdfCumulativo) {
           this.chiaveTestataComunicazione = chiaveTestataComunicazione;
           this.descrizioneComune = descrizioneComune;
           this.siglaProvincia = siglaProvincia;
           this.enteRIDabilitato = enteRIDabilitato;
           this.contribuenteRIDabilitato = contribuenteRIDabilitato;
           this.pdfCumulativo = pdfCumulativo;
    }


    /**
     * Gets the chiaveTestataComunicazione value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return chiaveTestataComunicazione
     */
    public java.lang.String getChiaveTestataComunicazione() {
        return chiaveTestataComunicazione;
    }


    /**
     * Sets the chiaveTestataComunicazione value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param chiaveTestataComunicazione
     */
    public void setChiaveTestataComunicazione(java.lang.String chiaveTestataComunicazione) {
        this.chiaveTestataComunicazione = chiaveTestataComunicazione;
    }


    /**
     * Gets the descrizioneComune value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the siglaProvincia value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the enteRIDabilitato value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return enteRIDabilitato
     */
    public boolean isEnteRIDabilitato() {
        return enteRIDabilitato;
    }


    /**
     * Sets the enteRIDabilitato value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param enteRIDabilitato
     */
    public void setEnteRIDabilitato(boolean enteRIDabilitato) {
        this.enteRIDabilitato = enteRIDabilitato;
    }


    /**
     * Gets the contribuenteRIDabilitato value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return contribuenteRIDabilitato
     */
    public boolean isContribuenteRIDabilitato() {
        return contribuenteRIDabilitato;
    }


    /**
     * Sets the contribuenteRIDabilitato value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param contribuenteRIDabilitato
     */
    public void setContribuenteRIDabilitato(boolean contribuenteRIDabilitato) {
        this.contribuenteRIDabilitato = contribuenteRIDabilitato;
    }


    /**
     * Gets the pdfCumulativo value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @return pdfCumulativo
     */
    public boolean isPdfCumulativo() {
        return pdfCumulativo;
    }


    /**
     * Sets the pdfCumulativo value for this StampaAvvisoComunicazionePdfRequest.
     * 
     * @param pdfCumulativo
     */
    public void setPdfCumulativo(boolean pdfCumulativo) {
        this.pdfCumulativo = pdfCumulativo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StampaAvvisoComunicazionePdfRequest)) return false;
        StampaAvvisoComunicazionePdfRequest other = (StampaAvvisoComunicazionePdfRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTestataComunicazione==null && other.getChiaveTestataComunicazione()==null) || 
             (this.chiaveTestataComunicazione!=null &&
              this.chiaveTestataComunicazione.equals(other.getChiaveTestataComunicazione()))) &&
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia()))) &&
            this.enteRIDabilitato == other.isEnteRIDabilitato() &&
            this.contribuenteRIDabilitato == other.isContribuenteRIDabilitato() &&
            this.pdfCumulativo == other.isPdfCumulativo();
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
        if (getChiaveTestataComunicazione() != null) {
            _hashCode += getChiaveTestataComunicazione().hashCode();
        }
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        _hashCode += (isEnteRIDabilitato() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isContribuenteRIDabilitato() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPdfCumulativo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StampaAvvisoComunicazionePdfRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">StampaAvvisoComunicazionePdfRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "descrizioneComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "siglaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enteRIDabilitato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "enteRIDabilitato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribuenteRIDabilitato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "contribuenteRIDabilitato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pdfCumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "pdfCumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
