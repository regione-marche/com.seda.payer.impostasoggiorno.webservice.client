/**
 * RiepilogoImpostaSoggiornoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RiepilogoImpostaSoggiornoResponse  implements java.io.Serializable {
    private java.lang.Integer comunicazioniInviate;

    private java.lang.Integer comunicazioniDaInviare;

    private java.lang.String stato;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RiepilogoImpostaSoggiornoResponse() {
    }

    public RiepilogoImpostaSoggiornoResponse(
           java.lang.Integer comunicazioniInviate,
           java.lang.Integer comunicazioniDaInviare,
           java.lang.String stato,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.comunicazioniInviate = comunicazioniInviate;
           this.comunicazioniDaInviare = comunicazioniDaInviare;
           this.stato = stato;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the comunicazioniInviate value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @return comunicazioniInviate
     */
    public java.lang.Integer getComunicazioniInviate() {
        return comunicazioniInviate;
    }


    /**
     * Sets the comunicazioniInviate value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @param comunicazioniInviate
     */
    public void setComunicazioniInviate(java.lang.Integer comunicazioniInviate) {
        this.comunicazioniInviate = comunicazioniInviate;
    }


    /**
     * Gets the comunicazioniDaInviare value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @return comunicazioniDaInviare
     */
    public java.lang.Integer getComunicazioniDaInviare() {
        return comunicazioniDaInviare;
    }


    /**
     * Sets the comunicazioniDaInviare value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @param comunicazioniDaInviare
     */
    public void setComunicazioniDaInviare(java.lang.Integer comunicazioniDaInviare) {
        this.comunicazioniDaInviare = comunicazioniDaInviare;
    }


    /**
     * Gets the stato value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @return stato
     */
    public java.lang.String getStato() {
        return stato;
    }


    /**
     * Sets the stato value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @param stato
     */
    public void setStato(java.lang.String stato) {
        this.stato = stato;
    }


    /**
     * Gets the retCode value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RiepilogoImpostaSoggiornoResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiepilogoImpostaSoggiornoResponse)) return false;
        RiepilogoImpostaSoggiornoResponse other = (RiepilogoImpostaSoggiornoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comunicazioniInviate==null && other.getComunicazioniInviate()==null) || 
             (this.comunicazioniInviate!=null &&
              this.comunicazioniInviate.equals(other.getComunicazioniInviate()))) &&
            ((this.comunicazioniDaInviare==null && other.getComunicazioniDaInviare()==null) || 
             (this.comunicazioniDaInviare!=null &&
              this.comunicazioniDaInviare.equals(other.getComunicazioniDaInviare()))) &&
            ((this.stato==null && other.getStato()==null) || 
             (this.stato!=null &&
              this.stato.equals(other.getStato()))) &&
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
        if (getComunicazioniInviate() != null) {
            _hashCode += getComunicazioniInviate().hashCode();
        }
        if (getComunicazioniDaInviare() != null) {
            _hashCode += getComunicazioniDaInviare().hashCode();
        }
        if (getStato() != null) {
            _hashCode += getStato().hashCode();
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
        new org.apache.axis.description.TypeDesc(RiepilogoImpostaSoggiornoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RiepilogoImpostaSoggiornoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicazioniInviate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "comunicazioniInviate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunicazioniDaInviare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "comunicazioniDaInviare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "stato"));
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
