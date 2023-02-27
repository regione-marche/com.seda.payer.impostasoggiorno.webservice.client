/**
 * TariffaImpostaSoggiorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class TariffaImpostaSoggiorno  implements java.io.Serializable {
    private java.lang.String chiaveTariffa;

    private java.lang.String codiceBelfiore;

    private java.lang.String chiaveTipologiaStruttura;

    private java.util.Date dataValiditaTariffa;

    private java.math.BigDecimal importoTariffa;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    private java.lang.String descrizioneComune;

    private java.lang.String descrizioneTipologiaRicettiva;

    private java.lang.String ricercaDataDa;

    private java.lang.String ricercaDataA;

    public TariffaImpostaSoggiorno() {
    }

    public TariffaImpostaSoggiorno(
           java.lang.String chiaveTariffa,
           java.lang.String codiceBelfiore,
           java.lang.String chiaveTipologiaStruttura,
           java.util.Date dataValiditaTariffa,
           java.math.BigDecimal importoTariffa,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento,
           java.lang.String descrizioneComune,
           java.lang.String descrizioneTipologiaRicettiva,
           java.lang.String ricercaDataDa,
           java.lang.String ricercaDataA) {
           this.chiaveTariffa = chiaveTariffa;
           this.codiceBelfiore = codiceBelfiore;
           this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
           this.dataValiditaTariffa = dataValiditaTariffa;
           this.importoTariffa = importoTariffa;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
           this.descrizioneComune = descrizioneComune;
           this.descrizioneTipologiaRicettiva = descrizioneTipologiaRicettiva;
           this.ricercaDataDa = ricercaDataDa;
           this.ricercaDataA = ricercaDataA;
    }


    /**
     * Gets the chiaveTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @return chiaveTariffa
     */
    public java.lang.String getChiaveTariffa() {
        return chiaveTariffa;
    }


    /**
     * Sets the chiaveTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @param chiaveTariffa
     */
    public void setChiaveTariffa(java.lang.String chiaveTariffa) {
        this.chiaveTariffa = chiaveTariffa;
    }


    /**
     * Gets the codiceBelfiore value for this TariffaImpostaSoggiorno.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this TariffaImpostaSoggiorno.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the chiaveTipologiaStruttura value for this TariffaImpostaSoggiorno.
     * 
     * @return chiaveTipologiaStruttura
     */
    public java.lang.String getChiaveTipologiaStruttura() {
        return chiaveTipologiaStruttura;
    }


    /**
     * Sets the chiaveTipologiaStruttura value for this TariffaImpostaSoggiorno.
     * 
     * @param chiaveTipologiaStruttura
     */
    public void setChiaveTipologiaStruttura(java.lang.String chiaveTipologiaStruttura) {
        this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
    }


    /**
     * Gets the dataValiditaTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @return dataValiditaTariffa
     */
    public java.util.Date getDataValiditaTariffa() {
        return dataValiditaTariffa;
    }


    /**
     * Sets the dataValiditaTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @param dataValiditaTariffa
     */
    public void setDataValiditaTariffa(java.util.Date dataValiditaTariffa) {
        this.dataValiditaTariffa = dataValiditaTariffa;
    }


    /**
     * Gets the importoTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @return importoTariffa
     */
    public java.math.BigDecimal getImportoTariffa() {
        return importoTariffa;
    }


    /**
     * Sets the importoTariffa value for this TariffaImpostaSoggiorno.
     * 
     * @param importoTariffa
     */
    public void setImportoTariffa(java.math.BigDecimal importoTariffa) {
        this.importoTariffa = importoTariffa;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this TariffaImpostaSoggiorno.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this TariffaImpostaSoggiorno.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this TariffaImpostaSoggiorno.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this TariffaImpostaSoggiorno.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the descrizioneComune value for this TariffaImpostaSoggiorno.
     * 
     * @return descrizioneComune
     */
    public java.lang.String getDescrizioneComune() {
        return descrizioneComune;
    }


    /**
     * Sets the descrizioneComune value for this TariffaImpostaSoggiorno.
     * 
     * @param descrizioneComune
     */
    public void setDescrizioneComune(java.lang.String descrizioneComune) {
        this.descrizioneComune = descrizioneComune;
    }


    /**
     * Gets the descrizioneTipologiaRicettiva value for this TariffaImpostaSoggiorno.
     * 
     * @return descrizioneTipologiaRicettiva
     */
    public java.lang.String getDescrizioneTipologiaRicettiva() {
        return descrizioneTipologiaRicettiva;
    }


    /**
     * Sets the descrizioneTipologiaRicettiva value for this TariffaImpostaSoggiorno.
     * 
     * @param descrizioneTipologiaRicettiva
     */
    public void setDescrizioneTipologiaRicettiva(java.lang.String descrizioneTipologiaRicettiva) {
        this.descrizioneTipologiaRicettiva = descrizioneTipologiaRicettiva;
    }


    /**
     * Gets the ricercaDataDa value for this TariffaImpostaSoggiorno.
     * 
     * @return ricercaDataDa
     */
    public java.lang.String getRicercaDataDa() {
        return ricercaDataDa;
    }


    /**
     * Sets the ricercaDataDa value for this TariffaImpostaSoggiorno.
     * 
     * @param ricercaDataDa
     */
    public void setRicercaDataDa(java.lang.String ricercaDataDa) {
        this.ricercaDataDa = ricercaDataDa;
    }


    /**
     * Gets the ricercaDataA value for this TariffaImpostaSoggiorno.
     * 
     * @return ricercaDataA
     */
    public java.lang.String getRicercaDataA() {
        return ricercaDataA;
    }


    /**
     * Sets the ricercaDataA value for this TariffaImpostaSoggiorno.
     * 
     * @param ricercaDataA
     */
    public void setRicercaDataA(java.lang.String ricercaDataA) {
        this.ricercaDataA = ricercaDataA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TariffaImpostaSoggiorno)) return false;
        TariffaImpostaSoggiorno other = (TariffaImpostaSoggiorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTariffa==null && other.getChiaveTariffa()==null) || 
             (this.chiaveTariffa!=null &&
              this.chiaveTariffa.equals(other.getChiaveTariffa()))) &&
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.chiaveTipologiaStruttura==null && other.getChiaveTipologiaStruttura()==null) || 
             (this.chiaveTipologiaStruttura!=null &&
              this.chiaveTipologiaStruttura.equals(other.getChiaveTipologiaStruttura()))) &&
            ((this.dataValiditaTariffa==null && other.getDataValiditaTariffa()==null) || 
             (this.dataValiditaTariffa!=null &&
              this.dataValiditaTariffa.equals(other.getDataValiditaTariffa()))) &&
            ((this.importoTariffa==null && other.getImportoTariffa()==null) || 
             (this.importoTariffa!=null &&
              this.importoTariffa.equals(other.getImportoTariffa()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento()))) &&
            ((this.descrizioneComune==null && other.getDescrizioneComune()==null) || 
             (this.descrizioneComune!=null &&
              this.descrizioneComune.equals(other.getDescrizioneComune()))) &&
            ((this.descrizioneTipologiaRicettiva==null && other.getDescrizioneTipologiaRicettiva()==null) || 
             (this.descrizioneTipologiaRicettiva!=null &&
              this.descrizioneTipologiaRicettiva.equals(other.getDescrizioneTipologiaRicettiva()))) &&
            ((this.ricercaDataDa==null && other.getRicercaDataDa()==null) || 
             (this.ricercaDataDa!=null &&
              this.ricercaDataDa.equals(other.getRicercaDataDa()))) &&
            ((this.ricercaDataA==null && other.getRicercaDataA()==null) || 
             (this.ricercaDataA!=null &&
              this.ricercaDataA.equals(other.getRicercaDataA())));
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
        if (getChiaveTariffa() != null) {
            _hashCode += getChiaveTariffa().hashCode();
        }
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getChiaveTipologiaStruttura() != null) {
            _hashCode += getChiaveTipologiaStruttura().hashCode();
        }
        if (getDataValiditaTariffa() != null) {
            _hashCode += getDataValiditaTariffa().hashCode();
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
        if (getDescrizioneComune() != null) {
            _hashCode += getDescrizioneComune().hashCode();
        }
        if (getDescrizioneTipologiaRicettiva() != null) {
            _hashCode += getDescrizioneTipologiaRicettiva().hashCode();
        }
        if (getRicercaDataDa() != null) {
            _hashCode += getRicercaDataDa().hashCode();
        }
        if (getRicercaDataA() != null) {
            _hashCode += getRicercaDataA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffaImpostaSoggiorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TariffaImpostaSoggiorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValiditaTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataValiditaTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneComune");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneComune"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipologiaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipologiaRicettiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaDataDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ricercaDataDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ricercaDataA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ricercaDataA"));
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
