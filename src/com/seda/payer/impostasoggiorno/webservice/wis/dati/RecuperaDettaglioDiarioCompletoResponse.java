/**
 * RecuperaDettaglioDiarioCompletoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class RecuperaDettaglioDiarioCompletoResponse  implements java.io.Serializable {
    private com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario;

    private com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva;

    private com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno;

    private com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva;

    private com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettagliDiario;

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public RecuperaDettaglioDiarioCompletoResponse() {
    }

    public RecuperaDettaglioDiarioCompletoResponse(
           com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario,
           com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva,
           com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno,
           com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva,
           com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettagliDiario,
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.testataDiario = testataDiario;
           this.anagraficaStrutturaRicettiva = anagraficaStrutturaRicettiva;
           this.tariffaImpostaSoggiorno = tariffaImpostaSoggiorno;
           this.tipologiaStrutturaRicettiva = tipologiaStrutturaRicettiva;
           this.listDettagliDiario = listDettagliDiario;
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the testataDiario value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return testataDiario
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno getTestataDiario() {
        return testataDiario;
    }


    /**
     * Sets the testataDiario value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param testataDiario
     */
    public void setTestataDiario(com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno testataDiario) {
        this.testataDiario = testataDiario;
    }


    /**
     * Gets the anagraficaStrutturaRicettiva value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return anagraficaStrutturaRicettiva
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva getAnagraficaStrutturaRicettiva() {
        return anagraficaStrutturaRicettiva;
    }


    /**
     * Sets the anagraficaStrutturaRicettiva value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param anagraficaStrutturaRicettiva
     */
    public void setAnagraficaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva anagraficaStrutturaRicettiva) {
        this.anagraficaStrutturaRicettiva = anagraficaStrutturaRicettiva;
    }


    /**
     * Gets the tariffaImpostaSoggiorno value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return tariffaImpostaSoggiorno
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno getTariffaImpostaSoggiorno() {
        return tariffaImpostaSoggiorno;
    }


    /**
     * Sets the tariffaImpostaSoggiorno value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param tariffaImpostaSoggiorno
     */
    public void setTariffaImpostaSoggiorno(com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno tariffaImpostaSoggiorno) {
        this.tariffaImpostaSoggiorno = tariffaImpostaSoggiorno;
    }


    /**
     * Gets the tipologiaStrutturaRicettiva value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return tipologiaStrutturaRicettiva
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva getTipologiaStrutturaRicettiva() {
        return tipologiaStrutturaRicettiva;
    }


    /**
     * Sets the tipologiaStrutturaRicettiva value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param tipologiaStrutturaRicettiva
     */
    public void setTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva tipologiaStrutturaRicettiva) {
        this.tipologiaStrutturaRicettiva = tipologiaStrutturaRicettiva;
    }


    /**
     * Gets the listDettagliDiario value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return listDettagliDiario
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] getListDettagliDiario() {
        return listDettagliDiario;
    }


    /**
     * Sets the listDettagliDiario value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param listDettagliDiario
     */
    public void setListDettagliDiario(com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno[] listDettagliDiario) {
        this.listDettagliDiario = listDettagliDiario;
    }

    public com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno getListDettagliDiario(int i) {
        return this.listDettagliDiario[i];
    }

    public void setListDettagliDiario(int i, com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno _value) {
        this.listDettagliDiario[i] = _value;
    }


    /**
     * Gets the retCode value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this RecuperaDettaglioDiarioCompletoResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettaglioDiarioCompletoResponse)) return false;
        RecuperaDettaglioDiarioCompletoResponse other = (RecuperaDettaglioDiarioCompletoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testataDiario==null && other.getTestataDiario()==null) || 
             (this.testataDiario!=null &&
              this.testataDiario.equals(other.getTestataDiario()))) &&
            ((this.anagraficaStrutturaRicettiva==null && other.getAnagraficaStrutturaRicettiva()==null) || 
             (this.anagraficaStrutturaRicettiva!=null &&
              this.anagraficaStrutturaRicettiva.equals(other.getAnagraficaStrutturaRicettiva()))) &&
            ((this.tariffaImpostaSoggiorno==null && other.getTariffaImpostaSoggiorno()==null) || 
             (this.tariffaImpostaSoggiorno!=null &&
              this.tariffaImpostaSoggiorno.equals(other.getTariffaImpostaSoggiorno()))) &&
            ((this.tipologiaStrutturaRicettiva==null && other.getTipologiaStrutturaRicettiva()==null) || 
             (this.tipologiaStrutturaRicettiva!=null &&
              this.tipologiaStrutturaRicettiva.equals(other.getTipologiaStrutturaRicettiva()))) &&
            ((this.listDettagliDiario==null && other.getListDettagliDiario()==null) || 
             (this.listDettagliDiario!=null &&
              java.util.Arrays.equals(this.listDettagliDiario, other.getListDettagliDiario()))) &&
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
        if (getTestataDiario() != null) {
            _hashCode += getTestataDiario().hashCode();
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
        if (getListDettagliDiario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDettagliDiario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDettagliDiario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(RecuperaDettaglioDiarioCompletoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testataDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "testataDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataDiarioImpostaSoggiorno"));
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
        elemField.setFieldName("listDettagliDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "listDettagliDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioDiarioImpostaSoggiorno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
