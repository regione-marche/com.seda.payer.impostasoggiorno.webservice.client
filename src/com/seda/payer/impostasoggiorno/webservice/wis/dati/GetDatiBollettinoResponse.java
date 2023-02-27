/**
 * GetDatiBollettinoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.dati;

public class GetDatiBollettinoResponse  implements java.io.Serializable {
    private java.math.BigDecimal importoTotale;

    private java.lang.String codiceFreccia;

    //inizio LP PG200230
    private java.lang.String descrizioneEnte;

    private java.lang.String tipoCC;

    private java.lang.String numeroCC;

    private java.lang.String intestazioneCC;

    private java.lang.String autorizzazioneCC;

    private java.lang.String codiceFiscaleEnte;

    private java.lang.String codiceCBill;

    private java.lang.String barcodePagoPA;

    private java.lang.String qrCodePagoPA;

    private java.lang.String causaleDocumento;

    private java.lang.String descrizioneUfficio;

    private java.lang.String descrizioneTipoServizio;

    private java.lang.String descrizioneImpostaServizio;

    private java.lang.String numeroAvvisoPagoPA;

    private java.lang.String codiceIUV;
    //fine LP PG200230

    private java.lang.String retCode;

    private java.lang.String retMessage;

    public GetDatiBollettinoResponse() {
    }

    public GetDatiBollettinoResponse(
           java.math.BigDecimal importoTotale,
           java.lang.String codiceFreccia,
           //inizio LP PG200230
           java.lang.String descrizioneEnte,
           java.lang.String tipoCC,
           java.lang.String numeroCC,
           java.lang.String intestazioneCC,
           java.lang.String autorizzazioneCC,
           java.lang.String codiceFiscaleEnte,
           java.lang.String codiceCBill,
           java.lang.String barcodePagoPA,
           java.lang.String qrCodePagoPA,
           java.lang.String causaleDocumento,
           java.lang.String descrizioneUfficio,
           java.lang.String descrizioneTipoServizio,
           java.lang.String descrizioneImpostaServizio,
           java.lang.String numeroAvvisoPagoPA,
           java.lang.String codiceIUV,
           //fine LP PG200230
           java.lang.String retCode,
           java.lang.String retMessage) {
           this.importoTotale = importoTotale;
           this.codiceFreccia = codiceFreccia;
           //inizio LP PG200230
           this.descrizioneEnte = descrizioneEnte;
           this.tipoCC = tipoCC;
           this.numeroCC = numeroCC;
           this.intestazioneCC = intestazioneCC;
           this.autorizzazioneCC = autorizzazioneCC;
           this.codiceFiscaleEnte = codiceFiscaleEnte;
           this.codiceCBill = codiceCBill;
           this.barcodePagoPA = barcodePagoPA;
           this.qrCodePagoPA = qrCodePagoPA;
           this.causaleDocumento = causaleDocumento;
           this.descrizioneUfficio = descrizioneUfficio;
           this.descrizioneTipoServizio = descrizioneTipoServizio;
           this.descrizioneImpostaServizio = descrizioneImpostaServizio;
           this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
           this.codiceIUV = codiceIUV;
           //fine LP PG200230
           this.retCode = retCode;
           this.retMessage = retMessage;
    }


    /**
     * Gets the importoTotale value for this GetDatiBollettinoResponse.
     * 
     * @return importoTotale
     */
    public java.math.BigDecimal getImportoTotale() {
        return importoTotale;
    }


    /**
     * Sets the importoTotale value for this GetDatiBollettinoResponse.
     * 
     * @param importoTotale
     */
    public void setImportoTotale(java.math.BigDecimal importoTotale) {
        this.importoTotale = importoTotale;
    }


    /**
     * Gets the codiceFreccia value for this GetDatiBollettinoResponse.
     * 
     * @return codiceFreccia
     */
    public java.lang.String getCodiceFreccia() {
        return codiceFreccia;
    }


    /**
     * Sets the codiceFreccia value for this GetDatiBollettinoResponse.
     * 
     * @param codiceFreccia
     */
    public void setCodiceFreccia(java.lang.String codiceFreccia) {
        this.codiceFreccia = codiceFreccia;
    }


    //inizio LP PG200230
    /**
     * Gets the descrizioneEnte value for this GetDatiBollettinoResponse.
     * 
     * @return descrizioneEnte
     */
    public java.lang.String getDescrizioneEnte() {
        return descrizioneEnte;
    }


    /**
     * Sets the descrizioneEnte value for this GetDatiBollettinoResponse.
     * 
     * @param descrizioneEnte
     */
    public void setDescrizioneEnte(java.lang.String descrizioneEnte) {
        this.descrizioneEnte = descrizioneEnte;
    }


    /**
     * Gets the tipoCC value for this GetDatiBollettinoResponse.
     * 
     * @return tipoCC
     */
    public java.lang.String getTipoCC() {
        return tipoCC;
    }


    /**
     * Sets the tipoCC value for this GetDatiBollettinoResponse.
     * 
     * @param tipoCC
     */
    public void setTipoCC(java.lang.String tipoCC) {
        this.tipoCC = tipoCC;
    }


    /**
     * Gets the numeroCC value for this GetDatiBollettinoResponse.
     * 
     * @return numeroCC
     */
    public java.lang.String getNumeroCC() {
        return numeroCC;
    }


    /**
     * Sets the numeroCC value for this GetDatiBollettinoResponse.
     * 
     * @param numeroCC
     */
    public void setNumeroCC(java.lang.String numeroCC) {
        this.numeroCC = numeroCC;
    }


    /**
     * Gets the intestazioneCC value for this GetDatiBollettinoResponse.
     * 
     * @return intestazioneCC
     */
    public java.lang.String getIntestazioneCC() {
        return intestazioneCC;
    }


    /**
     * Sets the intestazioneCC value for this GetDatiBollettinoResponse.
     * 
     * @param intestazioneCC
     */
    public void setIntestazioneCC(java.lang.String intestazioneCC) {
        this.intestazioneCC = intestazioneCC;
    }


    /**
     * Gets the autorizzazioneCC value for this GetDatiBollettinoResponse.
     * 
     * @return autorizzazioneCC
     */
    public java.lang.String getAutorizzazioneCC() {
        return autorizzazioneCC;
    }


    /**
     * Sets the autorizzazioneCC value for this GetDatiBollettinoResponse.
     * 
     * @param autorizzazioneCC
     */
    public void setAutorizzazioneCC(java.lang.String autorizzazioneCC) {
        this.autorizzazioneCC = autorizzazioneCC;
    }


    /**
     * Gets the codiceFiscaleEnte value for this GetDatiBollettinoResponse.
     * 
     * @return codiceFiscaleEnte
     */
    public java.lang.String getCodiceFiscaleEnte() {
        return codiceFiscaleEnte;
    }


    /**
     * Sets the codiceFiscaleEnte value for this GetDatiBollettinoResponse.
     * 
     * @param codiceFiscaleEnte
     */
    public void setCodiceFiscaleEnte(java.lang.String codiceFiscaleEnte) {
        this.codiceFiscaleEnte = codiceFiscaleEnte;
    }


    /**
     * Gets the codiceCBill value for this GetDatiBollettinoResponse.
     * 
     * @return codiceCBill
     */
    public java.lang.String getCodiceCBill() {
        return codiceCBill;
    }


    /**
     * Sets the codiceCBill value for this GetDatiBollettinoResponse.
     * 
     * @param codiceCBill
     */
    public void setCodiceCBill(java.lang.String codiceCBill) {
        this.codiceCBill = codiceCBill;
    }


    /**
     * Gets the barcodePagoPA value for this GetDatiBollettinoResponse.
     * 
     * @return barcodePagoPA
     */
    public java.lang.String getBarcodePagoPA() {
        return barcodePagoPA;
    }


    /**
     * Sets the barcodePagoPA value for this GetDatiBollettinoResponse.
     * 
     * @param barcodePagoPA
     */
    public void setBarcodePagoPA(java.lang.String barcodePagoPA) {
        this.barcodePagoPA = barcodePagoPA;
    }


    /**
     * Gets the qrCodePagoPA value for this GetDatiBollettinoResponse.
     * 
     * @return qrCodePagoPA
     */
    public java.lang.String getQrCodePagoPA() {
        return qrCodePagoPA;
    }


    /**
     * Sets the qrCodePagoPA value for this GetDatiBollettinoResponse.
     * 
     * @param qrCodePagoPA
     */
    public void setQrCodePagoPA(java.lang.String qrCodePagoPA) {
        this.qrCodePagoPA = qrCodePagoPA;
    }


    /**
     * Gets the causaleDocumento value for this GetDatiBollettinoResponse.
     * 
     * @return causaleDocumento
     */
    public java.lang.String getCausaleDocumento() {
        return causaleDocumento;
    }


    /**
     * Sets the causaleDocumento value for this GetDatiBollettinoResponse.
     * 
     * @param causaleDocumento
     */
    public void setCausaleDocumento(java.lang.String causaleDocumento) {
        this.causaleDocumento = causaleDocumento;
    }


    /**
     * Gets the descrizioneUfficio value for this GetDatiBollettinoResponse.
     * 
     * @return descrizioneUfficio
     */
    public java.lang.String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }


    /**
     * Sets the descrizioneUfficio value for this GetDatiBollettinoResponse.
     * 
     * @param descrizioneUfficio
     */
    public void setDescrizioneUfficio(java.lang.String descrizioneUfficio) {
        this.descrizioneUfficio = descrizioneUfficio;
    }


    /**
     * Gets the descrizioneTipoServizio value for this GetDatiBollettinoResponse.
     * 
     * @return descrizioneTipoServizio
     */
    public java.lang.String getDescrizioneTipoServizio() {
        return descrizioneTipoServizio;
    }


    /**
     * Sets the descrizioneTipoServizio value for this GetDatiBollettinoResponse.
     * 
     * @param descrizioneTipoServizio
     */
    public void setDescrizioneTipoServizio(java.lang.String descrizioneTipoServizio) {
        this.descrizioneTipoServizio = descrizioneTipoServizio;
    }


    /**
     * Gets the descrizioneImpostaServizio value for this GetDatiBollettinoResponse.
     * 
     * @return descrizioneImpostaServizio
     */
    public java.lang.String getDescrizioneImpostaServizio() {
        return descrizioneImpostaServizio;
    }


    /**
     * Sets the descrizioneImpostaServizio value for this GetDatiBollettinoResponse.
     * 
     * @param descrizioneImpostaServizio
     */
    public void setDescrizioneImpostaServizio(java.lang.String descrizioneImpostaServizio) {
        this.descrizioneImpostaServizio = descrizioneImpostaServizio;
    }


    /**
     * Gets the numeroAvvisoPagoPA value for this GetDatiBollettinoResponse.
     * 
     * @return numeroAvvisoPagoPA
     */
    public java.lang.String getNumeroAvvisoPagoPA() {
        return numeroAvvisoPagoPA;
    }


    /**
     * Sets the numeroAvvisoPagoPA value for this GetDatiBollettinoResponse.
     * 
     * @param numeroAvvisoPagoPA
     */
    public void setNumeroAvvisoPagoPA(java.lang.String numeroAvvisoPagoPA) {
        this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
    }


    /**
     * Gets the codiceIUV value for this GetDatiBollettinoResponse.
     * 
     * @return codiceIUV
     */
    public java.lang.String getCodiceIUV() {
        return codiceIUV;
    }


    /**
     * Sets the codiceIUV value for this GetDatiBollettinoResponse.
     * 
     * @param codiceIUV
     */
    public void setCodiceIUV(java.lang.String codiceIUV) {
        this.codiceIUV = codiceIUV;
    }
    //fine LP PG200230

    /**
     * Gets the retCode value for this GetDatiBollettinoResponse.
     * 
     * @return retCode
     */
    public java.lang.String getRetCode() {
        return retCode;
    }


    /**
     * Sets the retCode value for this GetDatiBollettinoResponse.
     * 
     * @param retCode
     */
    public void setRetCode(java.lang.String retCode) {
        this.retCode = retCode;
    }


    /**
     * Gets the retMessage value for this GetDatiBollettinoResponse.
     * 
     * @return retMessage
     */
    public java.lang.String getRetMessage() {
        return retMessage;
    }


    /**
     * Sets the retMessage value for this GetDatiBollettinoResponse.
     * 
     * @param retMessage
     */
    public void setRetMessage(java.lang.String retMessage) {
        this.retMessage = retMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDatiBollettinoResponse)) return false;
        GetDatiBollettinoResponse other = (GetDatiBollettinoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.importoTotale==null && other.getImportoTotale()==null) || 
             (this.importoTotale!=null &&
              this.importoTotale.equals(other.getImportoTotale()))) &&
            ((this.codiceFreccia==null && other.getCodiceFreccia()==null) || 
             (this.codiceFreccia!=null &&
              this.codiceFreccia.equals(other.getCodiceFreccia()))) &&
            //inizio LP PG200230
            ((this.descrizioneEnte==null && other.getDescrizioneEnte()==null) || 
             (this.descrizioneEnte!=null &&
              this.descrizioneEnte.equals(other.getDescrizioneEnte()))) &&
            ((this.tipoCC==null && other.getTipoCC()==null) || 
             (this.tipoCC!=null &&
              this.tipoCC.equals(other.getTipoCC()))) &&
            ((this.numeroCC==null && other.getNumeroCC()==null) || 
             (this.numeroCC!=null &&
              this.numeroCC.equals(other.getNumeroCC()))) &&
            ((this.intestazioneCC==null && other.getIntestazioneCC()==null) || 
             (this.intestazioneCC!=null &&
              this.intestazioneCC.equals(other.getIntestazioneCC()))) &&
            ((this.autorizzazioneCC==null && other.getAutorizzazioneCC()==null) || 
             (this.autorizzazioneCC!=null &&
              this.autorizzazioneCC.equals(other.getAutorizzazioneCC()))) &&
            ((this.codiceFiscaleEnte==null && other.getCodiceFiscaleEnte()==null) || 
             (this.codiceFiscaleEnte!=null &&
              this.codiceFiscaleEnte.equals(other.getCodiceFiscaleEnte()))) &&
            ((this.codiceCBill==null && other.getCodiceCBill()==null) || 
             (this.codiceCBill!=null &&
              this.codiceCBill.equals(other.getCodiceCBill()))) &&
            ((this.barcodePagoPA==null && other.getBarcodePagoPA()==null) || 
             (this.barcodePagoPA!=null &&
              this.barcodePagoPA.equals(other.getBarcodePagoPA()))) &&
            ((this.qrCodePagoPA==null && other.getQrCodePagoPA()==null) || 
             (this.qrCodePagoPA!=null &&
              this.qrCodePagoPA.equals(other.getQrCodePagoPA()))) &&
            ((this.causaleDocumento==null && other.getCausaleDocumento()==null) || 
             (this.causaleDocumento!=null &&
              this.causaleDocumento.equals(other.getCausaleDocumento()))) &&
            ((this.descrizioneUfficio==null && other.getDescrizioneUfficio()==null) || 
             (this.descrizioneUfficio!=null &&
              this.descrizioneUfficio.equals(other.getDescrizioneUfficio()))) &&
            ((this.descrizioneTipoServizio==null && other.getDescrizioneTipoServizio()==null) || 
             (this.descrizioneTipoServizio!=null &&
              this.descrizioneTipoServizio.equals(other.getDescrizioneTipoServizio()))) &&
            ((this.descrizioneImpostaServizio==null && other.getDescrizioneImpostaServizio()==null) || 
             (this.descrizioneImpostaServizio!=null &&
              this.descrizioneImpostaServizio.equals(other.getDescrizioneImpostaServizio()))) &&
            ((this.numeroAvvisoPagoPA==null && other.getNumeroAvvisoPagoPA()==null) || 
             (this.numeroAvvisoPagoPA!=null &&
              this.numeroAvvisoPagoPA.equals(other.getNumeroAvvisoPagoPA()))) &&
            ((this.codiceIUV==null && other.getCodiceIUV()==null) || 
             (this.codiceIUV!=null &&
              this.codiceIUV.equals(other.getCodiceIUV()))) &&
            //fine LP PG200230
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
        if (getImportoTotale() != null) {
            _hashCode += getImportoTotale().hashCode();
        }
        if (getCodiceFreccia() != null) {
            _hashCode += getCodiceFreccia().hashCode();
        }
        //inizio LP PG200230
        if (getDescrizioneEnte() != null) {
            _hashCode += getDescrizioneEnte().hashCode();
        }
        if (getTipoCC() != null) {
            _hashCode += getTipoCC().hashCode();
        }
        if (getNumeroCC() != null) {
            _hashCode += getNumeroCC().hashCode();
        }
        if (getIntestazioneCC() != null) {
            _hashCode += getIntestazioneCC().hashCode();
        }
        if (getAutorizzazioneCC() != null) {
            _hashCode += getAutorizzazioneCC().hashCode();
        }
        if (getCodiceFiscaleEnte() != null) {
            _hashCode += getCodiceFiscaleEnte().hashCode();
        }
        if (getCodiceCBill() != null) {
            _hashCode += getCodiceCBill().hashCode();
        }
        if (getBarcodePagoPA() != null) {
            _hashCode += getBarcodePagoPA().hashCode();
        }
        if (getQrCodePagoPA() != null) {
            _hashCode += getQrCodePagoPA().hashCode();
        }
        if (getCausaleDocumento() != null) {
            _hashCode += getCausaleDocumento().hashCode();
        }
        if (getDescrizioneUfficio() != null) {
            _hashCode += getDescrizioneUfficio().hashCode();
        }
        if (getDescrizioneTipoServizio() != null) {
            _hashCode += getDescrizioneTipoServizio().hashCode();
        }
        if (getDescrizioneImpostaServizio() != null) {
            _hashCode += getDescrizioneImpostaServizio().hashCode();
        }
        if (getNumeroAvvisoPagoPA() != null) {
            _hashCode += getNumeroAvvisoPagoPA().hashCode();
        }
        if (getCodiceIUV() != null) {
            _hashCode += getCodiceIUV().hashCode();
        }
        //fine LP PG200230
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
        new org.apache.axis.description.TypeDesc(GetDatiBollettinoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importoTotale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "importoTotale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceFreccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        //inizio LP PG200230
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "descrizioneEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "tipoCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "numeroCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestazioneCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "intestazioneCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizzazioneCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "autorizzazioneCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceFiscaleEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceCBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceCBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodePagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "barcodePagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qrCodePagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "qrCodePagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "causaleDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "descrizioneUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipoServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipoServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneImpostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "descrizioneImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "numeroAvvisoPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIUV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "codiceIUV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        //fine LP PG200230
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
