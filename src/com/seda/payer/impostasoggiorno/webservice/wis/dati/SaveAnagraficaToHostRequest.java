/**
 * SaveAnagraficaToHostRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class SaveAnagraficaToHostRequest  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura;

    private com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequestTipoRichiesta tipoRichiesta;

    private java.lang.String descrizioneComune;

    private java.lang.String siglaProvincia;

    public SaveAnagraficaToHostRequest() {
    }

    public SaveAnagraficaToHostRequest(
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura,
           com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequestTipoRichiesta tipoRichiesta,
           java.lang.String descrizioneComune,
           java.lang.String siglaProvincia) {
           this.anagraficaStruttura = anagraficaStruttura;
           this.tipoRichiesta = tipoRichiesta;
           this.descrizioneComune = descrizioneComune;
           this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the anagraficaStruttura value for this SaveAnagraficaToHostRequest.
     * 
     * @return anagraficaStruttura
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStruttura() {
        return anagraficaStruttura;
    }


    /**
     * Sets the anagraficaStruttura value for this SaveAnagraficaToHostRequest.
     * 
     * @param anagraficaStruttura
     */
    public void setAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStruttura) {
        this.anagraficaStruttura = anagraficaStruttura;
    }


    /**
     * Gets the tipoRichiesta value for this SaveAnagraficaToHostRequest.
     * 
     * @return tipoRichiesta
     */
    public com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequestTipoRichiesta getTipoRichiesta() {
        return tipoRichiesta;
    }


    /**
     * Sets the tipoRichiesta value for this SaveAnagraficaToHostRequest.
     * 
     * @param tipoRichiesta
     */
    public void setTipoRichiesta(com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequestTipoRichiesta tipoRichiesta) {
        this.tipoRichiesta = tipoRichiesta;
    }


    /**
     * Gets the descrizioneComune value for this SaveAnagraficaToHostRequest.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this SaveAnagraficaToHostRequest.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the siglaProvincia value for this SaveAnagraficaToHostRequest.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this SaveAnagraficaToHostRequest.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveAnagraficaToHostRequest)) return false;
        SaveAnagraficaToHostRequest other = (SaveAnagraficaToHostRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anagraficaStruttura==null && other.getAnagraficaStruttura()==null) || 
             (this.anagraficaStruttura!=null &&
              this.anagraficaStruttura.equals(other.getAnagraficaStruttura()))) &&
            ((this.tipoRichiesta==null && other.getTipoRichiesta()==null) || 
             (this.tipoRichiesta!=null &&
              this.tipoRichiesta.equals(other.getTipoRichiesta()))) &&
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune()))) &&
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia())));
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
        if (getAnagraficaStruttura() != null) {
            _hashCode += getAnagraficaStruttura().hashCode();
        }
        if (getTipoRichiesta() != null) {
            _hashCode += getTipoRichiesta().hashCode();
        }
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveAnagraficaToHostRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveAnagraficaToHostRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "anagraficaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRichiesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "tipoRichiesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveAnagraficaToHostRequest>tipoRichiesta"));
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
