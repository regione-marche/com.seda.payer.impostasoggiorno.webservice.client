/**
 * DettaglioDiarioImpostaSoggiorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class DettaglioDiarioImpostaSoggiorno  implements java.io.Serializable {
    private java.lang.String chiaveDettaglioCompilazione;

    private java.lang.String chiaveTestataCompilazione;

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

    public DettaglioDiarioImpostaSoggiorno() {
    }

    public DettaglioDiarioImpostaSoggiorno(
           java.lang.String chiaveDettaglioCompilazione,
           java.lang.String chiaveTestataCompilazione,
           java.lang.String chiaveTipologiaSoggetto,
           java.lang.String flagEsenzione,
           java.lang.Integer chiaveFasciaTariffa,
           java.math.BigDecimal importoFasciaTariffa,
           java.lang.Integer numeroGiorniPermanenzaTotale,
           java.lang.Integer numeroGiorniPermanenzaPagamento,
           java.lang.Integer numeroPersone,
           java.math.BigDecimal importoDaPagare,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento) {
           this.chiaveDettaglioCompilazione = chiaveDettaglioCompilazione;
           this.chiaveTestataCompilazione = chiaveTestataCompilazione;
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
    }


    /**
     * Gets the chiaveDettaglioCompilazione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return chiaveDettaglioCompilazione
     */
    public java.lang.String getChiaveDettaglioCompilazione() {
        return chiaveDettaglioCompilazione;
    }


    /**
     * Sets the chiaveDettaglioCompilazione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param chiaveDettaglioCompilazione
     */
    public void setChiaveDettaglioCompilazione(java.lang.String chiaveDettaglioCompilazione) {
        this.chiaveDettaglioCompilazione = chiaveDettaglioCompilazione;
    }


    /**
     * Gets the chiaveTestataCompilazione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return chiaveTestataCompilazione
     */
    public java.lang.String getChiaveTestataCompilazione() {
        return chiaveTestataCompilazione;
    }


    /**
     * Sets the chiaveTestataCompilazione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param chiaveTestataCompilazione
     */
    public void setChiaveTestataCompilazione(java.lang.String chiaveTestataCompilazione) {
        this.chiaveTestataCompilazione = chiaveTestataCompilazione;
    }


    /**
     * Gets the chiaveTipologiaSoggetto value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return chiaveTipologiaSoggetto
     */
    public java.lang.String getChiaveTipologiaSoggetto() {
        return chiaveTipologiaSoggetto;
    }


    /**
     * Sets the chiaveTipologiaSoggetto value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param chiaveTipologiaSoggetto
     */
    public void setChiaveTipologiaSoggetto(java.lang.String chiaveTipologiaSoggetto) {
        this.chiaveTipologiaSoggetto = chiaveTipologiaSoggetto;
    }


    /**
     * Gets the flagEsenzione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return flagEsenzione
     */
    public java.lang.String getFlagEsenzione() {
        return flagEsenzione;
    }


    /**
     * Sets the flagEsenzione value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param flagEsenzione
     */
    public void setFlagEsenzione(java.lang.String flagEsenzione) {
        this.flagEsenzione = flagEsenzione;
    }


    /**
     * Gets the chiaveFasciaTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return chiaveFasciaTariffa
     */
    public java.lang.Integer getChiaveFasciaTariffa() {
        return chiaveFasciaTariffa;
    }


    /**
     * Sets the chiaveFasciaTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param chiaveFasciaTariffa
     */
    public void setChiaveFasciaTariffa(java.lang.Integer chiaveFasciaTariffa) {
        this.chiaveFasciaTariffa = chiaveFasciaTariffa;
    }


    /**
     * Gets the importoFasciaTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return importoFasciaTariffa
     */
    public java.math.BigDecimal getImportoFasciaTariffa() {
        return importoFasciaTariffa;
    }


    /**
     * Sets the importoFasciaTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param importoFasciaTariffa
     */
    public void setImportoFasciaTariffa(java.math.BigDecimal importoFasciaTariffa) {
        this.importoFasciaTariffa = importoFasciaTariffa;
    }


    /**
     * Gets the numeroGiorniPermanenzaTotale value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return numeroGiorniPermanenzaTotale
     */
    public java.lang.Integer getNumeroGiorniPermanenzaTotale() {
        return numeroGiorniPermanenzaTotale;
    }


    /**
     * Sets the numeroGiorniPermanenzaTotale value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param numeroGiorniPermanenzaTotale
     */
    public void setNumeroGiorniPermanenzaTotale(java.lang.Integer numeroGiorniPermanenzaTotale) {
        this.numeroGiorniPermanenzaTotale = numeroGiorniPermanenzaTotale;
    }


    /**
     * Gets the numeroGiorniPermanenzaPagamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return numeroGiorniPermanenzaPagamento
     */
    public java.lang.Integer getNumeroGiorniPermanenzaPagamento() {
        return numeroGiorniPermanenzaPagamento;
    }


    /**
     * Sets the numeroGiorniPermanenzaPagamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param numeroGiorniPermanenzaPagamento
     */
    public void setNumeroGiorniPermanenzaPagamento(java.lang.Integer numeroGiorniPermanenzaPagamento) {
        this.numeroGiorniPermanenzaPagamento = numeroGiorniPermanenzaPagamento;
    }


    /**
     * Gets the numeroPersone value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return numeroPersone
     */
    public java.lang.Integer getNumeroPersone() {
        return numeroPersone;
    }


    /**
     * Sets the numeroPersone value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param numeroPersone
     */
    public void setNumeroPersone(java.lang.Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
    }


    /**
     * Gets the importoDaPagare value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return importoDaPagare
     */
    public java.math.BigDecimal getImportoDaPagare() {
        return importoDaPagare;
    }


    /**
     * Sets the importoDaPagare value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param importoDaPagare
     */
    public void setImportoDaPagare(java.math.BigDecimal importoDaPagare) {
        this.importoDaPagare = importoDaPagare;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }
    
    /**
     * Gets the chiaveTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @return chiaveTariffa
     */
    public java.lang.String getChiaveTariffa() {
        return chiaveTariffa;
    }


    /**
     * Sets the chiaveTariffa value for this DettaglioDiarioImpostaSoggiorno.
     * 
     * @param chiaveTariffa
     */
    public void setChiaveTariffa(java.lang.String chiaveTariffa) {
        this.chiaveTariffa = chiaveTariffa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DettaglioDiarioImpostaSoggiorno)) return false;
        DettaglioDiarioImpostaSoggiorno other = (DettaglioDiarioImpostaSoggiorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveDettaglioCompilazione==null && other.getChiaveDettaglioCompilazione()==null) || 
             (this.chiaveDettaglioCompilazione!=null &&
              this.chiaveDettaglioCompilazione.equals(other.getChiaveDettaglioCompilazione()))) &&
            ((this.chiaveTestataCompilazione==null && other.getChiaveTestataCompilazione()==null) || 
             (this.chiaveTestataCompilazione!=null &&
              this.chiaveTestataCompilazione.equals(other.getChiaveTestataCompilazione()))) &&
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
              this.chiaveTariffa.equals(other.getChiaveTariffa())));
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
        if (getChiaveDettaglioCompilazione() != null) {
            _hashCode += getChiaveDettaglioCompilazione().hashCode();
        }
        if (getChiaveTestataCompilazione() != null) {
            _hashCode += getChiaveTestataCompilazione().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DettaglioDiarioImpostaSoggiorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioDiarioImpostaSoggiorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveDettaglioCompilazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveDettaglioCompilazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataCompilazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataCompilazione"));
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
