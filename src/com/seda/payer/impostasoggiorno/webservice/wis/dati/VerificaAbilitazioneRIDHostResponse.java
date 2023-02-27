/**
 * VerificaAbilitazioneRIDHostResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class VerificaAbilitazioneRIDHostResponse  implements java.io.Serializable {
    private java.lang.String abilitazioneEnte;

    private java.lang.String autorizzazioneRID;

    private java.lang.String codiceRIDcontribuente;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public VerificaAbilitazioneRIDHostResponse() {
    }

    public VerificaAbilitazioneRIDHostResponse(
           java.lang.String abilitazioneEnte,
           java.lang.String autorizzazioneRID,
           java.lang.String codiceRIDcontribuente,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.abilitazioneEnte = abilitazioneEnte;
           this.autorizzazioneRID = autorizzazioneRID;
           this.codiceRIDcontribuente = codiceRIDcontribuente;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the abilitazioneEnte value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @return abilitazioneEnte
     */
    public java.lang.String getAbilitazioneEnte() {
        return abilitazioneEnte;
    }


    /**
     * Sets the abilitazioneEnte value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @param abilitazioneEnte
     */
    public void setAbilitazioneEnte(java.lang.String abilitazioneEnte) {
        this.abilitazioneEnte = abilitazioneEnte;
    }


    /**
     * Gets the autorizzazioneRID value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @return autorizzazioneRID
     */
    public java.lang.String getAutorizzazioneRID() {
        return autorizzazioneRID;
    }


    /**
     * Sets the autorizzazioneRID value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @param autorizzazioneRID
     */
    public void setAutorizzazioneRID(java.lang.String autorizzazioneRID) {
        this.autorizzazioneRID = autorizzazioneRID;
    }


    /**
     * Gets the codiceRIDcontribuente value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @return codiceRIDcontribuente
     */
    public java.lang.String getCodiceRIDcontribuente() {
        return codiceRIDcontribuente;
    }


    /**
     * Sets the codiceRIDcontribuente value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @param codiceRIDcontribuente
     */
    public void setCodiceRIDcontribuente(java.lang.String codiceRIDcontribuente) {
        this.codiceRIDcontribuente = codiceRIDcontribuente;
    }


    /**
     * Gets the retCode value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this VerificaAbilitazioneRIDHostResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerificaAbilitazioneRIDHostResponse)) return false;
        VerificaAbilitazioneRIDHostResponse other = (VerificaAbilitazioneRIDHostResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abilitazioneEnte==null && other.getAbilitazioneEnte()==null) || 
             (this.abilitazioneEnte!=null &&
              this.abilitazioneEnte.equals(other.getAbilitazioneEnte()))) &&
            ((this.autorizzazioneRID==null && other.getAutorizzazioneRID()==null) || 
             (this.autorizzazioneRID!=null &&
              this.autorizzazioneRID.equals(other.getAutorizzazioneRID()))) &&
            ((this.codiceRIDcontribuente==null && other.getCodiceRIDcontribuente()==null) || 
             (this.codiceRIDcontribuente!=null &&
              this.codiceRIDcontribuente.equals(other.getCodiceRIDcontribuente()))) &&
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
        if (getAbilitazioneEnte() != null) {
            _hashCode += getAbilitazioneEnte().hashCode();
        }
        if (getAutorizzazioneRID() != null) {
            _hashCode += getAutorizzazioneRID().hashCode();
        }
        if (getCodiceRIDcontribuente() != null) {
            _hashCode += getCodiceRIDcontribuente().hashCode();
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
        new org.apache.axis.description.TypeDesc(VerificaAbilitazioneRIDHostResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAbilitazioneRIDHostResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abilitazioneEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "abilitazioneEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizzazioneRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "autorizzazioneRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceRIDcontribuente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceRIDcontribuente"));
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
