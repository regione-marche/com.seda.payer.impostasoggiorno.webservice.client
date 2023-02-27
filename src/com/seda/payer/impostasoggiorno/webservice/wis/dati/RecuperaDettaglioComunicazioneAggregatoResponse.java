/**
 * RecuperaDettaglioComunicazioneAggregatoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaDettaglioComunicazioneAggregatoResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione;

    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva;

    private com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno;

    private com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva;

    private com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettagliComunicazione;

    private java.lang.String listDettagliComunicazioneXml;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RecuperaDettaglioComunicazioneAggregatoResponse() {
    }

    public RecuperaDettaglioComunicazioneAggregatoResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione,
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva,
           com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno,
           com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva,
           com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettagliComunicazione,
           java.lang.String listDettagliComunicazioneXml,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.testataComunicazione = testataComunicazione;
           this.anagraficaStrutturaRicettiva = anagraficaStrutturaRicettiva;
           this.tariffaImpostaSoggiorno = tariffaImpostaSoggiorno;
           this.tipologiaStrutturaRicettiva = tipologiaStrutturaRicettiva;
           this.listDettagliComunicazione = listDettagliComunicazione;
           this.listDettagliComunicazioneXml = listDettagliComunicazioneXml;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the testataComunicazione value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return testataComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno getTestataComunicazione() {
        return testataComunicazione;
    }


    /**
     * Sets the testataComunicazione value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param testataComunicazione
     */
    public void setTestataComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno testataComunicazione) {
        this.testataComunicazione = testataComunicazione;
    }


    /**
     * Gets the anagraficaStrutturaRicettiva value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return anagraficaStrutturaRicettiva
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStrutturaRicettiva() {
        return anagraficaStrutturaRicettiva;
    }


    /**
     * Sets the anagraficaStrutturaRicettiva value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param anagraficaStrutturaRicettiva
     */
    public void setAnagraficaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva) {
        this.anagraficaStrutturaRicettiva = anagraficaStrutturaRicettiva;
    }


    /**
     * Gets the tariffaImpostaSoggiorno value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return tariffaImpostaSoggiorno
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno getTariffaImpostaSoggiorno() {
        return tariffaImpostaSoggiorno;
    }


    /**
     * Sets the tariffaImpostaSoggiorno value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param tariffaImpostaSoggiorno
     */
    public void setTariffaImpostaSoggiorno(com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno) {
        this.tariffaImpostaSoggiorno = tariffaImpostaSoggiorno;
    }


    /**
     * Gets the tipologiaStrutturaRicettiva value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return tipologiaStrutturaRicettiva
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva getTipologiaStrutturaRicettiva() {
        return tipologiaStrutturaRicettiva;
    }


    /**
     * Sets the tipologiaStrutturaRicettiva value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param tipologiaStrutturaRicettiva
     */
    public void setTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva) {
        this.tipologiaStrutturaRicettiva = tipologiaStrutturaRicettiva;
    }


    /**
     * Gets the listDettagliComunicazione value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return listDettagliComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] getListDettagliComunicazione() {
        return listDettagliComunicazione;
    }


    /**
     * Sets the listDettagliComunicazione value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param listDettagliComunicazione
     */
    public void setListDettagliComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno[] listDettagliComunicazione) {
        this.listDettagliComunicazione = listDettagliComunicazione;
    }

    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno getListDettagliComunicazione(int i) {
        return this.listDettagliComunicazione[i];
    }

    public void setListDettagliComunicazione(int i, com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno _value) {
        this.listDettagliComunicazione[i] = _value;
    }


    /**
     * Gets the listDettagliComunicazioneXml value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return listDettagliComunicazioneXml
     */
    public java.lang.String getListDettagliComunicazioneXml() {
        return listDettagliComunicazioneXml;
    }


    /**
     * Sets the listDettagliComunicazioneXml value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param listDettagliComunicazioneXml
     */
    public void setListDettagliComunicazioneXml(java.lang.String listDettagliComunicazioneXml) {
        this.listDettagliComunicazioneXml = listDettagliComunicazioneXml;
    }


    /**
     * Gets the retCode value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaDettaglioComunicazioneAggregatoResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettaglioComunicazioneAggregatoResponse)) return false;
        RecuperaDettaglioComunicazioneAggregatoResponse other = (RecuperaDettaglioComunicazioneAggregatoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testataComunicazione==null && other.getTestataComunicazione()==null) || 
             (this.testataComunicazione!=null &&
              this.testataComunicazione.equals(other.getTestataComunicazione()))) &&
            ((this.anagraficaStrutturaRicettiva==null && other.getAnagraficaStrutturaRicettiva()==null) || 
             (this.anagraficaStrutturaRicettiva!=null &&
              this.anagraficaStrutturaRicettiva.equals(other.getAnagraficaStrutturaRicettiva()))) &&
            ((this.tariffaImpostaSoggiorno==null && other.getTariffaImpostaSoggiorno()==null) || 
             (this.tariffaImpostaSoggiorno!=null &&
              this.tariffaImpostaSoggiorno.equals(other.getTariffaImpostaSoggiorno()))) &&
            ((this.tipologiaStrutturaRicettiva==null && other.getTipologiaStrutturaRicettiva()==null) || 
             (this.tipologiaStrutturaRicettiva!=null &&
              this.tipologiaStrutturaRicettiva.equals(other.getTipologiaStrutturaRicettiva()))) &&
            ((this.listDettagliComunicazione==null && other.getListDettagliComunicazione()==null) || 
             (this.listDettagliComunicazione!=null &&
              java.util.Arrays.equals(this.listDettagliComunicazione, other.getListDettagliComunicazione()))) &&
            ((this.listDettagliComunicazioneXml==null && other.getListDettagliComunicazioneXml()==null) || 
             (this.listDettagliComunicazioneXml!=null &&
              this.listDettagliComunicazioneXml.equals(other.getListDettagliComunicazioneXml()))) &&
            ((this.retCode==null && other.getRetCode()==null) || 
             (this.retCode!=null &&
              this.retCode.equals(other.getRetCode()))) &&
            ((this.retMessage==null && other.getRetMessage()==null) || 
             (this.retMessage!=null &&
              this.retMessage.equals(other.getRetMessage())));
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
        if (getTestataComunicazione() != null) {
            _hashCode += getTestataComunicazione().hashCode();
        }
        if (getAnagraficaStrutturaRicettiva() != null) {
            _hashCode += getAnagraficaStrutturaRicettiva().hashCode();
        }
        if (getTariffaImpostaSoggiorno() != null) {
            _hashCode += getTariffaImpostaSoggiorno().hashCode();
        }
        if (getTipologiaStrutturaRicettiva() != null) {
            _hashCode += getTipologiaStrutturaRicettiva().hashCode();
        }
        if (getListDettagliComunicazione() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDettagliComunicazione());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDettagliComunicazione(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListDettagliComunicazioneXml() != null) {
            _hashCode += getListDettagliComunicazioneXml().hashCode();
        }
        if (getRetCode() != null) {
            _hashCode += getRetCode().hashCode();
        }
        if (getRetMessage() != null) {
            _hashCode += getRetMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettaglioComunicazioneAggregatoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioComunicazioneAggregatoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "testataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataComunicazioneImpostaSoggiorno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaStrutturaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "anagraficaStrutturaRicettiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariffaImpostaSoggiorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "tariffaImpostaSoggiorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TariffaImpostaSoggiorno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipologiaStrutturaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "tipologiaStrutturaRicettiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaStrutturaRicettiva"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDettagliComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listDettagliComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioComunicazioneImpostaSoggiorno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDettagliComunicazioneXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listDettagliComunicazioneXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "retCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "retMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
