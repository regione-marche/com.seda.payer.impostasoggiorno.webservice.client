/**
 * FasciaTariffaImpostaSoggiorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class FasciaTariffaImpostaSoggiorno  implements java.io.Serializable {
    private java.lang.Long chiaveFasciaTariffa;

    private java.lang.String chiaveTariffa;

    private java.lang.String codice;

    private java.lang.String descrizione;

    private java.math.BigDecimal importoTariffa;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    public FasciaTariffaImpostaSoggiorno() {
    }

    public FasciaTariffaImpostaSoggiorno(
           java.lang.Long chiaveFasciaTariffa,
           java.lang.String chiaveTariffa,
           java.lang.String codice,
           java.lang.String descrizione,
           java.math.BigDecimal importoTariffa,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento) {
           this.chiaveFasciaTariffa = chiaveFasciaTariffa;
           this.chiaveTariffa = chiaveTariffa;
           this.codice = codice;
           this.descrizione = descrizione;
           this.importoTariffa = importoTariffa;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the chiaveFasciaTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return chiaveFasciaTariffa
     */
    public java.lang.Long getChiaveFasciaTariffa() {
        return chiaveFasciaTariffa;
    }


    /**
     * Sets the chiaveFasciaTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param chiaveFasciaTariffa
     */
    public void setChiaveFasciaTariffa(java.lang.Long chiaveFasciaTariffa) {
        this.chiaveFasciaTariffa = chiaveFasciaTariffa;
    }


    /**
     * Gets the chiaveTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return chiaveTariffa
     */
    public java.lang.String getChiaveTariffa() {
        return chiaveTariffa;
    }


    /**
     * Sets the chiaveTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param chiaveTariffa
     */
    public void setChiaveTariffa(java.lang.String chiaveTariffa) {
        this.chiaveTariffa = chiaveTariffa;
    }


    /**
     * Gets the codice value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return codice
     */
    public java.lang.String getCodice() {
        return codice;
    }


    /**
     * Sets the codice value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param codice
     */
    public void setCodice(java.lang.String codice) {
        this.codice = codice;
    }


    /**
     * Gets the descrizione value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return descrizione
     */
    public java.lang.String getDescrizione() {
        return descrizione;
    }


    /**
     * Sets the descrizione value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param descrizione
     */
    public void setDescrizione(java.lang.String descrizione) {
        this.descrizione = descrizione;
    }


    /**
     * Gets the importoTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return importoTariffa
     */
    public java.math.BigDecimal getImportoTariffa() {
        return importoTariffa;
    }


    /**
     * Sets the importoTariffa value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param importoTariffa
     */
    public void setImportoTariffa(java.math.BigDecimal importoTariffa) {
        this.importoTariffa = importoTariffa;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this FasciaTariffaImpostaSoggiorno.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FasciaTariffaImpostaSoggiorno)) return false;
        FasciaTariffaImpostaSoggiorno other = (FasciaTariffaImpostaSoggiorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveFasciaTariffa==null && other.getChiaveFasciaTariffa()==null) || 
             (this.chiaveFasciaTariffa!=null &&
              this.chiaveFasciaTariffa.equals(other.getChiaveFasciaTariffa()))) &&
            ((this.chiaveTariffa==null && other.getChiaveTariffa()==null) || 
             (this.chiaveTariffa!=null &&
              this.chiaveTariffa.equals(other.getChiaveTariffa()))) &&
            ((this.codice==null && other.getCodice()==null) || 
             (this.codice!=null &&
              this.codice.equals(other.getCodice()))) &&
            ((this.descrizione==null && other.getDescrizione()==null) || 
             (this.descrizione!=null &&
              this.descrizione.equals(other.getDescrizione()))) &&
            ((this.importoTariffa==null && other.getImportoTariffa()==null) || 
             (this.importoTariffa!=null &&
              this.importoTariffa.equals(other.getImportoTariffa()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento())));
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
        if (getChiaveFasciaTariffa() != null) {
            _hashCode += getChiaveFasciaTariffa().hashCode();
        }
        if (getChiaveTariffa() != null) {
            _hashCode += getChiaveTariffa().hashCode();
        }
        if (getCodice() != null) {
            _hashCode += getCodice().hashCode();
        }
        if (getDescrizione() != null) {
            _hashCode += getDescrizione().hashCode();
        }
        if (getImportoTariffa() != null) {
            _hashCode += getImportoTariffa().hashCode();
        }
        if (getDataUltimoAggiornamento() != null) {
            _hashCode += getDataUltimoAggiornamento().hashCode();
        }
        if (getOperatoreUltimoAggiornamento() != null) {
            _hashCode += getOperatoreUltimoAggiornamento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FasciaTariffaImpostaSoggiorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "FasciaTariffaImpostaSoggiorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveFasciaTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveFasciaTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "importoTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUltimoAggiornamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataUltimoAggiornamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoreUltimoAggiornamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "operatoreUltimoAggiornamento"));
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
