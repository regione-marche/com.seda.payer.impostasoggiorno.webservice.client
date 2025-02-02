/**
 * RecuperaListaComunicazioniRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.dati;

public class RecuperaListaComunicazioniRequest  implements java.io.Serializable {
    private java.lang.String siglaProvincia;

    private java.lang.String codiceBelfiore;

    private java.lang.String numeroAutorizzazione;

    private java.lang.String dataInserimentoDa;

    private java.lang.String dataInserimentoA;

    private java.lang.String dataComunicazioneDa;

    private java.lang.String dataComunicazioneA;

    private java.lang.String tipoComunicazione;

    private java.lang.String statoComunicazione;

    private java.lang.String numeroDocumento;

    private java.lang.String statoPagamento;

    private java.lang.String usernameOperatore;

    private java.lang.String codiceTipologiaStruttura;

    private java.lang.String insegna;

    private java.lang.String dataConfermaDa;

    private java.lang.String dataConfermaA;

    private int rowsPerPage;

    private int pageNumber;

    private java.lang.String order;

    public RecuperaListaComunicazioniRequest() {
    }

    public RecuperaListaComunicazioniRequest(
           java.lang.String siglaProvincia,
           java.lang.String codiceBelfiore,
           java.lang.String numeroAutorizzazione,
           java.lang.String dataInserimentoDa,
           java.lang.String dataInserimentoA,
           java.lang.String dataComunicazioneDa,
           java.lang.String dataComunicazioneA,
           java.lang.String tipoComunicazione,
           java.lang.String statoComunicazione,
           java.lang.String numeroDocumento,
           java.lang.String statoPagamento,
           java.lang.String usernameOperatore,
           java.lang.String codiceTipologiaStruttura,
           java.lang.String insegna,
           java.lang.String dataConfermaDa,
           java.lang.String dataConfermaA,
           int rowsPerPage,
           int pageNumber,
           java.lang.String order) {
           this.siglaProvincia = siglaProvincia;
           this.codiceBelfiore = codiceBelfiore;
           this.numeroAutorizzazione = numeroAutorizzazione;
           this.dataInserimentoDa = dataInserimentoDa;
           this.dataInserimentoA = dataInserimentoA;
           this.dataComunicazioneDa = dataComunicazioneDa;
           this.dataComunicazioneA = dataComunicazioneA;
           this.tipoComunicazione = tipoComunicazione;
           this.statoComunicazione = statoComunicazione;
           this.numeroDocumento = numeroDocumento;
           this.statoPagamento = statoPagamento;
           this.usernameOperatore = usernameOperatore;
           this.codiceTipologiaStruttura = codiceTipologiaStruttura;
           this.insegna = insegna;
           this.dataConfermaDa = dataConfermaDa;
           this.dataConfermaA = dataConfermaA;
           this.rowsPerPage = rowsPerPage;
           this.pageNumber = pageNumber;
           this.order = order;
    }


    /**
     * Gets the siglaProvincia value for this RecuperaListaComunicazioniRequest.
     * 
     * @return siglaProvincia
     */
    public java.lang.String getSiglaProvincia() {
        return siglaProvincia;
    }


    /**
     * Sets the siglaProvincia value for this RecuperaListaComunicazioniRequest.
     * 
     * @param siglaProvincia
     */
    public void setSiglaProvincia(java.lang.String siglaProvincia) {
        this.siglaProvincia = siglaProvincia;
    }


    /**
     * Gets the codiceBelfiore value for this RecuperaListaComunicazioniRequest.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this RecuperaListaComunicazioniRequest.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the numeroAutorizzazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @return numeroAutorizzazione
     */
    public java.lang.String getNumeroAutorizzazione() {
        return numeroAutorizzazione;
    }


    /**
     * Sets the numeroAutorizzazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @param numeroAutorizzazione
     */
    public void setNumeroAutorizzazione(java.lang.String numeroAutorizzazione) {
        this.numeroAutorizzazione = numeroAutorizzazione;
    }


    /**
     * Gets the dataInserimentoDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataInserimentoDa
     */
    public java.lang.String getDataInserimentoDa() {
        return dataInserimentoDa;
    }


    /**
     * Sets the dataInserimentoDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataInserimentoDa
     */
    public void setDataInserimentoDa(java.lang.String dataInserimentoDa) {
        this.dataInserimentoDa = dataInserimentoDa;
    }


    /**
     * Gets the dataInserimentoA value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataInserimentoA
     */
    public java.lang.String getDataInserimentoA() {
        return dataInserimentoA;
    }


    /**
     * Sets the dataInserimentoA value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataInserimentoA
     */
    public void setDataInserimentoA(java.lang.String dataInserimentoA) {
        this.dataInserimentoA = dataInserimentoA;
    }


    /**
     * Gets the dataComunicazioneDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataComunicazioneDa
     */
    public java.lang.String getDataComunicazioneDa() {
        return dataComunicazioneDa;
    }


    /**
     * Sets the dataComunicazioneDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataComunicazioneDa
     */
    public void setDataComunicazioneDa(java.lang.String dataComunicazioneDa) {
        this.dataComunicazioneDa = dataComunicazioneDa;
    }


    /**
     * Gets the dataComunicazioneA value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataComunicazioneA
     */
    public java.lang.String getDataComunicazioneA() {
        return dataComunicazioneA;
    }


    /**
     * Sets the dataComunicazioneA value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataComunicazioneA
     */
    public void setDataComunicazioneA(java.lang.String dataComunicazioneA) {
        this.dataComunicazioneA = dataComunicazioneA;
    }


    /**
     * Gets the tipoComunicazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @return tipoComunicazione
     */
    public java.lang.String getTipoComunicazione() {
        return tipoComunicazione;
    }


    /**
     * Sets the tipoComunicazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @param tipoComunicazione
     */
    public void setTipoComunicazione(java.lang.String tipoComunicazione) {
        this.tipoComunicazione = tipoComunicazione;
    }


    /**
     * Gets the statoComunicazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @return statoComunicazione
     */
    public java.lang.String getStatoComunicazione() {
        return statoComunicazione;
    }


    /**
     * Sets the statoComunicazione value for this RecuperaListaComunicazioniRequest.
     * 
     * @param statoComunicazione
     */
    public void setStatoComunicazione(java.lang.String statoComunicazione) {
        this.statoComunicazione = statoComunicazione;
    }


    /**
     * Gets the numeroDocumento value for this RecuperaListaComunicazioniRequest.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this RecuperaListaComunicazioniRequest.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the statoPagamento value for this RecuperaListaComunicazioniRequest.
     * 
     * @return statoPagamento
     */
    public java.lang.String getStatoPagamento() {
        return statoPagamento;
    }


    /**
     * Sets the statoPagamento value for this RecuperaListaComunicazioniRequest.
     * 
     * @param statoPagamento
     */
    public void setStatoPagamento(java.lang.String statoPagamento) {
        this.statoPagamento = statoPagamento;
    }


    /**
     * Gets the usernameOperatore value for this RecuperaListaComunicazioniRequest.
     * 
     * @return usernameOperatore
     */
    public java.lang.String getUsernameOperatore() {
        return usernameOperatore;
    }


    /**
     * Sets the usernameOperatore value for this RecuperaListaComunicazioniRequest.
     * 
     * @param usernameOperatore
     */
    public void setUsernameOperatore(java.lang.String usernameOperatore) {
        this.usernameOperatore = usernameOperatore;
    }


    /**
     * Gets the codiceTipologiaStruttura value for this RecuperaListaComunicazioniRequest.
     * 
     * @return codiceTipologiaStruttura
     */
    public java.lang.String getCodiceTipologiaStruttura() {
        return codiceTipologiaStruttura;
    }


    /**
     * Sets the codiceTipologiaStruttura value for this RecuperaListaComunicazioniRequest.
     * 
     * @param codiceTipologiaStruttura
     */
    public void setCodiceTipologiaStruttura(java.lang.String codiceTipologiaStruttura) {
        this.codiceTipologiaStruttura = codiceTipologiaStruttura;
    }


    /**
     * Gets the insegna value for this RecuperaListaComunicazioniRequest.
     * 
     * @return insegna
     */
    public java.lang.String getInsegna() {
        return insegna;
    }


    /**
     * Sets the insegna value for this RecuperaListaComunicazioniRequest.
     * 
     * @param insegna
     */
    public void setInsegna(java.lang.String insegna) {
        this.insegna = insegna;
    }


    /**
     * Gets the dataConfermaDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataConfermaDa
     */
    public java.lang.String getDataConfermaDa() {
        return dataConfermaDa;
    }


    /**
     * Sets the dataConfermaDa value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataConfermaDa
     */
    public void setDataConfermaDa(java.lang.String dataConfermaDa) {
        this.dataConfermaDa = dataConfermaDa;
    }


    /**
     * Gets the dataConfermaA value for this RecuperaListaComunicazioniRequest.
     * 
     * @return dataConfermaA
     */
    public java.lang.String getDataConfermaA() {
        return dataConfermaA;
    }


    /**
     * Sets the dataConfermaA value for this RecuperaListaComunicazioniRequest.
     * 
     * @param dataConfermaA
     */
    public void setDataConfermaA(java.lang.String dataConfermaA) {
        this.dataConfermaA = dataConfermaA;
    }


    /**
     * Gets the rowsPerPage value for this RecuperaListaComunicazioniRequest.
     * 
     * @return rowsPerPage
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }


    /**
     * Sets the rowsPerPage value for this RecuperaListaComunicazioniRequest.
     * 
     * @param rowsPerPage
     */
    public void setRowsPerPage(int rowsPerPage) {
        this.rowsPerPage = rowsPerPage;
    }


    /**
     * Gets the pageNumber value for this RecuperaListaComunicazioniRequest.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this RecuperaListaComunicazioniRequest.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the order value for this RecuperaListaComunicazioniRequest.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this RecuperaListaComunicazioniRequest.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaListaComunicazioniRequest)) return false;
        RecuperaListaComunicazioniRequest other = (RecuperaListaComunicazioniRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siglaProvincia==null && other.getSiglaProvincia()==null) || 
             (this.siglaProvincia!=null &&
              this.siglaProvincia.equals(other.getSiglaProvincia()))) &&
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.numeroAutorizzazione==null && other.getNumeroAutorizzazione()==null) || 
             (this.numeroAutorizzazione!=null &&
              this.numeroAutorizzazione.equals(other.getNumeroAutorizzazione()))) &&
            ((this.dataInserimentoDa==null && other.getDataInserimentoDa()==null) || 
             (this.dataInserimentoDa!=null &&
              this.dataInserimentoDa.equals(other.getDataInserimentoDa()))) &&
            ((this.dataInserimentoA==null && other.getDataInserimentoA()==null) || 
             (this.dataInserimentoA!=null &&
              this.dataInserimentoA.equals(other.getDataInserimentoA()))) &&
            ((this.dataComunicazioneDa==null && other.getDataComunicazioneDa()==null) || 
             (this.dataComunicazioneDa!=null &&
              this.dataComunicazioneDa.equals(other.getDataComunicazioneDa()))) &&
            ((this.dataComunicazioneA==null && other.getDataComunicazioneA()==null) || 
             (this.dataComunicazioneA!=null &&
              this.dataComunicazioneA.equals(other.getDataComunicazioneA()))) &&
            ((this.tipoComunicazione==null && other.getTipoComunicazione()==null) || 
             (this.tipoComunicazione!=null &&
              this.tipoComunicazione.equals(other.getTipoComunicazione()))) &&
            ((this.statoComunicazione==null && other.getStatoComunicazione()==null) || 
             (this.statoComunicazione!=null &&
              this.statoComunicazione.equals(other.getStatoComunicazione()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.statoPagamento==null && other.getStatoPagamento()==null) || 
             (this.statoPagamento!=null &&
              this.statoPagamento.equals(other.getStatoPagamento()))) &&
            ((this.usernameOperatore==null && other.getUsernameOperatore()==null) || 
             (this.usernameOperatore!=null &&
              this.usernameOperatore.equals(other.getUsernameOperatore()))) &&
            ((this.codiceTipologiaStruttura==null && other.getCodiceTipologiaStruttura()==null) || 
             (this.codiceTipologiaStruttura!=null &&
              this.codiceTipologiaStruttura.equals(other.getCodiceTipologiaStruttura()))) &&
            ((this.insegna==null && other.getInsegna()==null) || 
             (this.insegna!=null &&
              this.insegna.equals(other.getInsegna()))) &&
            ((this.dataConfermaDa==null && other.getDataConfermaDa()==null) || 
             (this.dataConfermaDa!=null &&
              this.dataConfermaDa.equals(other.getDataConfermaDa()))) &&
            ((this.dataConfermaA==null && other.getDataConfermaA()==null) || 
             (this.dataConfermaA!=null &&
              this.dataConfermaA.equals(other.getDataConfermaA()))) &&
            this.rowsPerPage == other.getRowsPerPage() &&
            this.pageNumber == other.getPageNumber() &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder())));
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
        if (getSiglaProvincia() != null) {
            _hashCode += getSiglaProvincia().hashCode();
        }
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getNumeroAutorizzazione() != null) {
            _hashCode += getNumeroAutorizzazione().hashCode();
        }
        if (getDataInserimentoDa() != null) {
            _hashCode += getDataInserimentoDa().hashCode();
        }
        if (getDataInserimentoA() != null) {
            _hashCode += getDataInserimentoA().hashCode();
        }
        if (getDataComunicazioneDa() != null) {
            _hashCode += getDataComunicazioneDa().hashCode();
        }
        if (getDataComunicazioneA() != null) {
            _hashCode += getDataComunicazioneA().hashCode();
        }
        if (getTipoComunicazione() != null) {
            _hashCode += getTipoComunicazione().hashCode();
        }
        if (getStatoComunicazione() != null) {
            _hashCode += getStatoComunicazione().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getStatoPagamento() != null) {
            _hashCode += getStatoPagamento().hashCode();
        }
        if (getUsernameOperatore() != null) {
            _hashCode += getUsernameOperatore().hashCode();
        }
        if (getCodiceTipologiaStruttura() != null) {
            _hashCode += getCodiceTipologiaStruttura().hashCode();
        }
        if (getInsegna() != null) {
            _hashCode += getInsegna().hashCode();
        }
        if (getDataConfermaDa() != null) {
            _hashCode += getDataConfermaDa().hashCode();
        }
        if (getDataConfermaA() != null) {
            _hashCode += getDataConfermaA().hashCode();
        }
        _hashCode += getRowsPerPage();
        _hashCode += getPageNumber();
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaListaComunicazioniRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "siglaProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBelfiore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codiceBelfiore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAutorizzazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "numeroAutorizzazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInserimentoDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataInserimentoDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInserimentoA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataInserimentoA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataComunicazioneDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataComunicazioneDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataComunicazioneA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataComunicazioneA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "tipoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "statoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "statoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usernameOperatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "usernameOperatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceTipologiaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "codiceTipologiaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insegna");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "insegna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConfermaDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataConfermaDa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataConfermaA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "dataConfermaA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "rowsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "order"));
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
