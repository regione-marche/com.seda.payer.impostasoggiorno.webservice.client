/**
 * DettaglioComunicazioneImpostaSoggiorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class DettaglioComunicazioneImpostaSoggiorno  implements java.io.Serializable {
    private java.lang.String chiaveDettaglioComunicazione;

    private java.lang.String chiaveTestataComunicazione;

    private java.lang.String chiaveTipologiaSoggetto;

    private java.lang.String flagEsenzione;

    private java.lang.Integer chiaveFasciaTariffa;

    private java.math.BigDecimal importoFasciaTariffa;

    private java.lang.Integer numeroGiorniPermanenzaTotale;

    private java.lang.Integer numeroGiorniPermanenzaPagamento;

    private java.lang.Integer numeroPersone;

    private java.math.BigDecimal importoDaPagare;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    private java.lang.String chiaveTariffa;

    private java.lang.String descrizioneTipoSoggetto;

    public DettaglioComunicazioneImpostaSoggiorno() {
    }

    public DettaglioComunicazioneImpostaSoggiorno(
           java.lang.String chiaveDettaglioComunicazione,
           java.lang.String chiaveTestataComunicazione,
           java.lang.String chiaveTipologiaSoggetto,
           java.lang.String flagEsenzione,
           java.lang.Integer chiaveFasciaTariffa,
           java.math.BigDecimal importoFasciaTariffa,
           java.lang.Integer numeroGiorniPermanenzaTotale,
           java.lang.Integer numeroGiorniPermanenzaPagamento,
           java.lang.Integer numeroPersone,
           java.math.BigDecimal importoDaPagare,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento,
           java.lang.String chiaveTariffa,
           java.lang.String descrizioneTipoSoggetto) {
           this.chiaveDettaglioComunicazione = chiaveDettaglioComunicazione;
           this.chiaveTestataComunicazione = chiaveTestataComunicazione;
           this.chiaveTipologiaSoggetto = chiaveTipologiaSoggetto;
           this.flagEsenzione = flagEsenzione;
           this.chiaveFasciaTariffa = chiaveFasciaTariffa;
           this.importoFasciaTariffa = importoFasciaTariffa;
           this.numeroGiorniPermanenzaTotale = numeroGiorniPermanenzaTotale;
           this.numeroGiorniPermanenzaPagamento = numeroGiorniPermanenzaPagamento;
           this.numeroPersone = numeroPersone;
           this.importoDaPagare = importoDaPagare;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
           this.chiaveTariffa = chiaveTariffa;
           this.descrizioneTipoSoggetto = descrizioneTipoSoggetto;
    }


    /**
     * Gets the chiaveDettaglioComunicazione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveDettaglioComunicazione
     */
    public java.lang.String getChiaveDettaglioComunicazione() {
        return chiaveDettaglioComunicazione;
    }


    /**
     * Sets the chiaveDettaglioComunicazione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveDettaglioComunicazione
     */
    public void setChiaveDettaglioComunicazione(java.lang.String chiaveDettaglioComunicazione) {
        this.chiaveDettaglioComunicazione = chiaveDettaglioComunicazione;
    }


    /**
     * Gets the chiaveTestataComunicazione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveTestataComunicazione
     */
    public java.lang.String getChiaveTestataComunicazione() {
        return chiaveTestataComunicazione;
    }


    /**
     * Sets the chiaveTestataComunicazione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveTestataComunicazione
     */
    public void setChiaveTestataComunicazione(java.lang.String chiaveTestataComunicazione) {
        this.chiaveTestataComunicazione = chiaveTestataComunicazione;
    }


    /**
     * Gets the chiaveTipologiaSoggetto value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveTipologiaSoggetto
     */
    public java.lang.String getChiaveTipologiaSoggetto() {
        return chiaveTipologiaSoggetto;
    }


    /**
     * Sets the chiaveTipologiaSoggetto value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveTipologiaSoggetto
     */
    public void setChiaveTipologiaSoggetto(java.lang.String chiaveTipologiaSoggetto) {
        this.chiaveTipologiaSoggetto = chiaveTipologiaSoggetto;
    }


    /**
     * Gets the flagEsenzione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return flagEsenzione
     */
    public java.lang.String getFlagEsenzione() {
        return flagEsenzione;
    }


    /**
     * Sets the flagEsenzione value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param flagEsenzione
     */
    public void setFlagEsenzione(java.lang.String flagEsenzione) {
        this.flagEsenzione = flagEsenzione;
    }


    /**
     * Gets the chiaveFasciaTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveFasciaTariffa
     */
    public java.lang.Integer getChiaveFasciaTariffa() {
        return chiaveFasciaTariffa;
    }


    /**
     * Sets the chiaveFasciaTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveFasciaTariffa
     */
    public void setChiaveFasciaTariffa(java.lang.Integer chiaveFasciaTariffa) {
        this.chiaveFasciaTariffa = chiaveFasciaTariffa;
    }


    /**
     * Gets the importoFasciaTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return importoFasciaTariffa
     */
    public java.math.BigDecimal getImportoFasciaTariffa() {
        return importoFasciaTariffa;
    }


    /**
     * Sets the importoFasciaTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param importoFasciaTariffa
     */
    public void setImportoFasciaTariffa(java.math.BigDecimal importoFasciaTariffa) {
        this.importoFasciaTariffa = importoFasciaTariffa;
    }


    /**
     * Gets the numeroGiorniPermanenzaTotale value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return numeroGiorniPermanenzaTotale
     */
    public java.lang.Integer getNumeroGiorniPermanenzaTotale() {
        return numeroGiorniPermanenzaTotale;
    }


    /**
     * Sets the numeroGiorniPermanenzaTotale value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param numeroGiorniPermanenzaTotale
     */
    public void setNumeroGiorniPermanenzaTotale(java.lang.Integer numeroGiorniPermanenzaTotale) {
        this.numeroGiorniPermanenzaTotale = numeroGiorniPermanenzaTotale;
    }


    /**
     * Gets the numeroGiorniPermanenzaPagamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return numeroGiorniPermanenzaPagamento
     */
    public java.lang.Integer getNumeroGiorniPermanenzaPagamento() {
        return numeroGiorniPermanenzaPagamento;
    }


    /**
     * Sets the numeroGiorniPermanenzaPagamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param numeroGiorniPermanenzaPagamento
     */
    public void setNumeroGiorniPermanenzaPagamento(java.lang.Integer numeroGiorniPermanenzaPagamento) {
        this.numeroGiorniPermanenzaPagamento = numeroGiorniPermanenzaPagamento;
    }


    /**
     * Gets the numeroPersone value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return numeroPersone
     */
    public java.lang.Integer getNumeroPersone() {
        return numeroPersone;
    }


    /**
     * Sets the numeroPersone value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param numeroPersone
     */
    public void setNumeroPersone(java.lang.Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }


    /**
     * Gets the importoDaPagare value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return importoDaPagare
     */
    public java.math.BigDecimal getImportoDaPagare() {
        return importoDaPagare;
    }


    /**
     * Sets the importoDaPagare value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param importoDaPagare
     */
    public void setImportoDaPagare(java.math.BigDecimal importoDaPagare) {
        this.importoDaPagare = importoDaPagare;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the chiaveTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveTariffa
     */
    public java.lang.String getChiaveTariffa() {
        return chiaveTariffa;
    }


    /**
     * Sets the chiaveTariffa value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveTariffa
     */
    public void setChiaveTariffa(java.lang.String chiaveTariffa) {
        this.chiaveTariffa = chiaveTariffa;
    }


    /**
     * Gets the descrizioneTipoSoggetto value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @return descrizioneTipoSoggetto
     */
    public java.lang.String getDescrizioneTipoSoggetto() {
        return descrizioneTipoSoggetto;
    }


    /**
     * Sets the descrizioneTipoSoggetto value for this DettaglioComunicazioneImpostaSoggiorno.
     * 
     * @param descrizioneTipoSoggetto
     */
    public void setDescrizioneTipoSoggetto(java.lang.String descrizioneTipoSoggetto) {
        this.descrizioneTipoSoggetto = descrizioneTipoSoggetto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioComunicazioneImpostaSoggiorno)) return false;
        DettaglioComunicazioneImpostaSoggiorno other = (DettaglioComunicazioneImpostaSoggiorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveDettaglioComunicazione==null && other.getChiaveDettaglioComunicazione()==null) || 
             (this.chiaveDettaglioComunicazione!=null &&
              this.chiaveDettaglioComunicazione.equals(other.getChiaveDettaglioComunicazione()))) &&
            ((this.chiaveTestataComunicazione==null && other.getChiaveTestataComunicazione()==null) || 
             (this.chiaveTestataComunicazione!=null &&
              this.chiaveTestataComunicazione.equals(other.getChiaveTestataComunicazione()))) &&
            ((this.chiaveTipologiaSoggetto==null && other.getChiaveTipologiaSoggetto()==null) || 
             (this.chiaveTipologiaSoggetto!=null &&
              this.chiaveTipologiaSoggetto.equals(other.getChiaveTipologiaSoggetto()))) &&
            ((this.flagEsenzione==null && other.getFlagEsenzione()==null) || 
             (this.flagEsenzione!=null &&
              this.flagEsenzione.equals(other.getFlagEsenzione()))) &&
            ((this.chiaveFasciaTariffa==null && other.getChiaveFasciaTariffa()==null) || 
             (this.chiaveFasciaTariffa!=null &&
              this.chiaveFasciaTariffa.equals(other.getChiaveFasciaTariffa()))) &&
            ((this.importoFasciaTariffa==null && other.getImportoFasciaTariffa()==null) || 
             (this.importoFasciaTariffa!=null &&
              this.importoFasciaTariffa.equals(other.getImportoFasciaTariffa()))) &&
            ((this.numeroGiorniPermanenzaTotale==null && other.getNumeroGiorniPermanenzaTotale()==null) || 
             (this.numeroGiorniPermanenzaTotale!=null &&
              this.numeroGiorniPermanenzaTotale.equals(other.getNumeroGiorniPermanenzaTotale()))) &&
            ((this.numeroGiorniPermanenzaPagamento==null && other.getNumeroGiorniPermanenzaPagamento()==null) || 
             (this.numeroGiorniPermanenzaPagamento!=null &&
              this.numeroGiorniPermanenzaPagamento.equals(other.getNumeroGiorniPermanenzaPagamento()))) &&
            ((this.numeroPersone==null && other.getNumeroPersone()==null) || 
             (this.numeroPersone!=null &&
              this.numeroPersone.equals(other.getNumeroPersone()))) &&
            ((this.importoDaPagare==null && other.getImportoDaPagare()==null) || 
             (this.importoDaPagare!=null &&
              this.importoDaPagare.equals(other.getImportoDaPagare()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento()))) &&
            ((this.chiaveTariffa==null && other.getChiaveTariffa()==null) || 
             (this.chiaveTariffa!=null &&
              this.chiaveTariffa.equals(other.getChiaveTariffa()))) &&
            ((this.descrizioneTipoSoggetto==null && other.getDescrizioneTipoSoggetto()==null) || 
             (this.descrizioneTipoSoggetto!=null &&
              this.descrizioneTipoSoggetto.equals(other.getDescrizioneTipoSoggetto())));
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
        if (getChiaveDettaglioComunicazione() != null) {
            _hashCode += getChiaveDettaglioComunicazione().hashCode();
        }
        if (getChiaveTestataComunicazione() != null) {
            _hashCode += getChiaveTestataComunicazione().hashCode();
        }
        if (getChiaveTipologiaSoggetto() != null) {
            _hashCode += getChiaveTipologiaSoggetto().hashCode();
        }
        if (getFlagEsenzione() != null) {
            _hashCode += getFlagEsenzione().hashCode();
        }
        if (getChiaveFasciaTariffa() != null) {
            _hashCode += getChiaveFasciaTariffa().hashCode();
        }
        if (getImportoFasciaTariffa() != null) {
            _hashCode += getImportoFasciaTariffa().hashCode();
        }
        if (getNumeroGiorniPermanenzaTotale() != null) {
            _hashCode += getNumeroGiorniPermanenzaTotale().hashCode();
        }
        if (getNumeroGiorniPermanenzaPagamento() != null) {
            _hashCode += getNumeroGiorniPermanenzaPagamento().hashCode();
        }
        if (getNumeroPersone() != null) {
            _hashCode += getNumeroPersone().hashCode();
        }
        if (getImportoDaPagare() != null) {
            _hashCode += getImportoDaPagare().hashCode();
        }
        if (getDataUltimoAggiornamento() != null) {
            _hashCode += getDataUltimoAggiornamento().hashCode();
        }
        if (getOperatoreUltimoAggiornamento() != null) {
            _hashCode += getOperatoreUltimoAggiornamento().hashCode();
        }
        if (getChiaveTariffa() != null) {
            _hashCode += getChiaveTariffa().hashCode();
        }
        if (getDescrizioneTipoSoggetto() != null) {
            _hashCode += getDescrizioneTipoSoggetto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioComunicazioneImpostaSoggiorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioComunicazioneImpostaSoggiorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveDettaglioComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveDettaglioComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTipologiaSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTipologiaSoggetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagEsenzione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagEsenzione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveFasciaTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveFasciaTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoFasciaTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "importoFasciaTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroGiorniPermanenzaTotale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroGiorniPermanenzaTotale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroGiorniPermanenzaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroGiorniPermanenzaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPersone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroPersone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoDaPagare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "importoDaPagare"));
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
        elemField.setFieldName("chiaveTariffa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTariffa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipoSoggetto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipoSoggetto"));
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
