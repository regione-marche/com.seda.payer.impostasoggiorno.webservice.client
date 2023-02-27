/**
 * TestataComunicazioneImpostaSoggiorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class TestataComunicazioneImpostaSoggiorno  implements java.io.Serializable {
    private java.lang.String chiaveTestataComunicazione;

    private java.lang.String chiaveAnagraficaStrutturaRicettiva;

    private java.lang.String codiceSocieta;

    private java.lang.String codiceUtente;

    private java.lang.String chiaveEnte;

    private java.util.Calendar dataInserimentoComunicazione;

    private java.util.Date dataInizioComunicazione;

    private java.util.Date dataFineComunicazione;

    private java.lang.Integer numeroGiorniPeriodoPermanenzaTotale;

    private com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione tipoComunicazione;

    private java.lang.String chiaveTariffaImpostaSoggiorno;

    private java.lang.String noteAggiuntive;

    private java.util.Date dataScadenzaComunicazione;

    private com.seda.payer.impostasoggiorno.webservice.dati.StatoComunicazione statoComunicazione;

    private com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento modalitaPagamento;

    private java.lang.String codiceRID;

    private java.lang.String numeroDocumentoGestionaleEntrate;

    private java.lang.String codiceBollettino;

    private com.seda.payer.impostasoggiorno.webservice.dati.StatoDocumento statoDocumento;

    private java.util.Date dataPagamento;

    private java.lang.String usernameUtenteUltimoAggiornamento;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    private java.util.Calendar dataConfermaComunicazione;

    private java.lang.String codiceFreccia;
//inizio LP PG190010_002_LP
//inseriti gli attributi per la generazione dell'avviso PagoPA
//con le conseguente introduzione di set e get e modifiche ai 
//metodi della classe
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
//fine LP PG190010_002_LP
    
    //PG190300 - inizio
    private java.util.Date dataLimiteComunicazione;
    private java.lang.String chiaveAnagraficaStrutturaRicettivaPrincipale;
    private java.lang.String numeroBollettinoCumulativo;
    //PG190300 - fine
    
    private java.lang.String noteOperatore;

    //inizio LP PG200230
    private java.lang.String barcodePagoPACumulativo;

    private java.lang.String qrCodePagoPACumulativo;

    private java.lang.String numeroAvvisoPagoPACumulativo;

    private java.lang.String codiceIUVCumulativo;
    //fine LP PG200230

    public TestataComunicazioneImpostaSoggiorno() {
    }

    //inizio LP PG200230
    //Nota. il costruttore con i 4 attributi nuovi non dovrebbe servire
    //      lascio la vecchia versione per retrocompatibilita'
    //fine LP PG200230
    public TestataComunicazioneImpostaSoggiorno(
           java.lang.String chiaveTestataComunicazione,
           java.lang.String chiaveAnagraficaStrutturaRicettiva,
           java.lang.String codiceSocieta,
           java.lang.String codiceUtente,
           java.lang.String chiaveEnte,
           java.util.Calendar dataInserimentoComunicazione,
           java.util.Date dataInizioComunicazione,
           java.util.Date dataFineComunicazione,
           java.lang.Integer numeroGiorniPeriodoPermanenzaTotale,
           com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione tipoComunicazione,
           java.lang.String chiaveTariffaImpostaSoggiorno,
           java.lang.String noteAggiuntive,
           java.util.Date dataScadenzaComunicazione,
           com.seda.payer.impostasoggiorno.webservice.dati.StatoComunicazione statoComunicazione,
           com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento modalitaPagamento,
           java.lang.String codiceRID,
           java.lang.String numeroDocumentoGestionaleEntrate,
           java.lang.String codiceBollettino,
           com.seda.payer.impostasoggiorno.webservice.dati.StatoDocumento statoDocumento,
           java.util.Date dataPagamento,
           java.lang.String usernameUtenteUltimoAggiornamento,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento,
           java.util.Calendar dataConfermaComunicazione,
           java.lang.String codiceFreccia,
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
           java.util.Date dataLimiteComunicazione,
           java.lang.String chiaveAnagraficaStrutturaRicettivaPrincipale,
           java.lang.String numeroBollettinoCumulativo,
           java.lang.String noteOperatore) {
           this.chiaveTestataComunicazione = chiaveTestataComunicazione;
           this.chiaveAnagraficaStrutturaRicettiva = chiaveAnagraficaStrutturaRicettiva;
           this.codiceSocieta = codiceSocieta;
           this.codiceUtente = codiceUtente;
           this.chiaveEnte = chiaveEnte;
           this.dataInserimentoComunicazione = dataInserimentoComunicazione;
           this.dataInizioComunicazione = dataInizioComunicazione;
           this.dataFineComunicazione = dataFineComunicazione;
           this.numeroGiorniPeriodoPermanenzaTotale = numeroGiorniPeriodoPermanenzaTotale;
           this.tipoComunicazione = tipoComunicazione;
           this.chiaveTariffaImpostaSoggiorno = chiaveTariffaImpostaSoggiorno;
           this.noteAggiuntive = noteAggiuntive;
           this.dataScadenzaComunicazione = dataScadenzaComunicazione;
           this.statoComunicazione = statoComunicazione;
           this.modalitaPagamento = modalitaPagamento;
           this.codiceRID = codiceRID;
           this.numeroDocumentoGestionaleEntrate = numeroDocumentoGestionaleEntrate;
           this.codiceBollettino = codiceBollettino;
           this.statoDocumento = statoDocumento;
           this.dataPagamento = dataPagamento;
           this.usernameUtenteUltimoAggiornamento = usernameUtenteUltimoAggiornamento;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
           this.dataConfermaComunicazione = dataConfermaComunicazione;
           this.codiceFreccia = codiceFreccia;
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
           this.dataLimiteComunicazione = dataLimiteComunicazione;
           this.chiaveAnagraficaStrutturaRicettivaPrincipale = chiaveAnagraficaStrutturaRicettivaPrincipale;
           this.numeroBollettinoCumulativo = numeroBollettinoCumulativo;
           this.noteOperatore = noteOperatore;
    }


    /**
     * Gets the chiaveTestataComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveTestataComunicazione
     */
    public java.lang.String getChiaveTestataComunicazione() {
        return chiaveTestataComunicazione;
    }


    /**
     * Sets the chiaveTestataComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveTestataComunicazione
     */
    public void setChiaveTestataComunicazione(java.lang.String chiaveTestataComunicazione) {
        this.chiaveTestataComunicazione = chiaveTestataComunicazione;
    }


    /**
     * Gets the chiaveAnagraficaStrutturaRicettiva value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveAnagraficaStrutturaRicettiva
     */
    public java.lang.String getChiaveAnagraficaStrutturaRicettiva() {
        return chiaveAnagraficaStrutturaRicettiva;
    }


    /**
     * Sets the chiaveAnagraficaStrutturaRicettiva value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveAnagraficaStrutturaRicettiva
     */
    public void setChiaveAnagraficaStrutturaRicettiva(java.lang.String chiaveAnagraficaStrutturaRicettiva) {
        this.chiaveAnagraficaStrutturaRicettiva = chiaveAnagraficaStrutturaRicettiva;
    }


    /**
     * Gets the codiceSocieta value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceSocieta
     */
    public java.lang.String getCodiceSocieta() {
        return codiceSocieta;
    }


    /**
     * Sets the codiceSocieta value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceSocieta
     */
    public void setCodiceSocieta(java.lang.String codiceSocieta) {
        this.codiceSocieta = codiceSocieta;
    }


    /**
     * Gets the codiceUtente value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the chiaveEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveEnte
     */
    public java.lang.String getChiaveEnte() {
        return chiaveEnte;
    }


    /**
     * Sets the chiaveEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveEnte
     */
    public void setChiaveEnte(java.lang.String chiaveEnte) {
        this.chiaveEnte = chiaveEnte;
    }


    /**
     * Gets the dataInserimentoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataInserimentoComunicazione
     */
    public java.util.Calendar getDataInserimentoComunicazione() {
        return dataInserimentoComunicazione;
    }


    /**
     * Sets the dataInserimentoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataInserimentoComunicazione
     */
    public void setDataInserimentoComunicazione(java.util.Calendar dataInserimentoComunicazione) {
        this.dataInserimentoComunicazione = dataInserimentoComunicazione;
    }


    /**
     * Gets the dataInizioComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataInizioComunicazione
     */
    public java.util.Date getDataInizioComunicazione() {
        return dataInizioComunicazione;
    }


    /**
     * Sets the dataInizioComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataInizioComunicazione
     */
    public void setDataInizioComunicazione(java.util.Date dataInizioComunicazione) {
        this.dataInizioComunicazione = dataInizioComunicazione;
    }


    /**
     * Gets the dataFineComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataFineComunicazione
     */
    public java.util.Date getDataFineComunicazione() {
        return dataFineComunicazione;
    }


    /**
     * Sets the dataFineComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataFineComunicazione
     */
    public void setDataFineComunicazione(java.util.Date dataFineComunicazione) {
        this.dataFineComunicazione = dataFineComunicazione;
    }


    /**
     * Gets the numeroGiorniPeriodoPermanenzaTotale value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroGiorniPeriodoPermanenzaTotale
     */
    public java.lang.Integer getNumeroGiorniPeriodoPermanenzaTotale() {
        return numeroGiorniPeriodoPermanenzaTotale;
    }


    /**
     * Sets the numeroGiorniPeriodoPermanenzaTotale value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroGiorniPeriodoPermanenzaTotale
     */
    public void setNumeroGiorniPeriodoPermanenzaTotale(java.lang.Integer numeroGiorniPeriodoPermanenzaTotale) {
        this.numeroGiorniPeriodoPermanenzaTotale = numeroGiorniPeriodoPermanenzaTotale;
    }


    /**
     * Gets the tipoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return tipoComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione getTipoComunicazione() {
        return tipoComunicazione;
    }


    /**
     * Sets the tipoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param tipoComunicazione
     */
    public void setTipoComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione tipoComunicazione) {
        this.tipoComunicazione = tipoComunicazione;
    }


    /**
     * Gets the chiaveTariffaImpostaSoggiorno value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveTariffaImpostaSoggiorno
     */
    public java.lang.String getChiaveTariffaImpostaSoggiorno() {
        return chiaveTariffaImpostaSoggiorno;
    }


    /**
     * Sets the chiaveTariffaImpostaSoggiorno value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveTariffaImpostaSoggiorno
     */
    public void setChiaveTariffaImpostaSoggiorno(java.lang.String chiaveTariffaImpostaSoggiorno) {
        this.chiaveTariffaImpostaSoggiorno = chiaveTariffaImpostaSoggiorno;
    }


    /**
     * Gets the noteAggiuntive value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return noteAggiuntive
     */
    public java.lang.String getNoteAggiuntive() {
        return noteAggiuntive;
    }


    /**
     * Sets the noteAggiuntive value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param noteAggiuntive
     */
    public void setNoteAggiuntive(java.lang.String noteAggiuntive) {
        this.noteAggiuntive = noteAggiuntive;
    }


    /**
     * Gets the dataScadenzaComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataScadenzaComunicazione
     */
    public java.util.Date getDataScadenzaComunicazione() {
        return dataScadenzaComunicazione;
    }


    /**
     * Sets the dataScadenzaComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataScadenzaComunicazione
     */
    public void setDataScadenzaComunicazione(java.util.Date dataScadenzaComunicazione) {
        this.dataScadenzaComunicazione = dataScadenzaComunicazione;
    }


    /**
     * Gets the statoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return statoComunicazione
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.StatoComunicazione getStatoComunicazione() {
        return statoComunicazione;
    }


    /**
     * Sets the statoComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param statoComunicazione
     */
    public void setStatoComunicazione(com.seda.payer.impostasoggiorno.webservice.dati.StatoComunicazione statoComunicazione) {
        this.statoComunicazione = statoComunicazione;
    }


    /**
     * Gets the modalitaPagamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return modalitaPagamento
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento getModalitaPagamento() {
        return modalitaPagamento;
    }


    /**
     * Sets the modalitaPagamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param modalitaPagamento
     */
    public void setModalitaPagamento(com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento modalitaPagamento) {
        this.modalitaPagamento = modalitaPagamento;
    }


    /**
     * Gets the codiceRID value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceRID
     */
    public java.lang.String getCodiceRID() {
        return codiceRID;
    }


    /**
     * Sets the codiceRID value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceRID
     */
    public void setCodiceRID(java.lang.String codiceRID) {
        this.codiceRID = codiceRID;
    }


    /**
     * Gets the numeroDocumentoGestionaleEntrate value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroDocumentoGestionaleEntrate
     */
    public java.lang.String getNumeroDocumentoGestionaleEntrate() {
        return numeroDocumentoGestionaleEntrate;
    }


    /**
     * Sets the numeroDocumentoGestionaleEntrate value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroDocumentoGestionaleEntrate
     */
    public void setNumeroDocumentoGestionaleEntrate(java.lang.String numeroDocumentoGestionaleEntrate) {
        this.numeroDocumentoGestionaleEntrate = numeroDocumentoGestionaleEntrate;
    }


    /**
     * Gets the codiceBollettino value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceBollettino
     */
    public java.lang.String getCodiceBollettino() {
        return codiceBollettino;
    }


    /**
     * Sets the codiceBollettino value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceBollettino
     */
    public void setCodiceBollettino(java.lang.String codiceBollettino) {
        this.codiceBollettino = codiceBollettino;
    }


    /**
     * Gets the statoDocumento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return statoDocumento
     */
    public com.seda.payer.impostasoggiorno.webservice.dati.StatoDocumento getStatoDocumento() {
        return statoDocumento;
    }


    /**
     * Sets the statoDocumento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param statoDocumento
     */
    public void setStatoDocumento(com.seda.payer.impostasoggiorno.webservice.dati.StatoDocumento statoDocumento) {
        this.statoDocumento = statoDocumento;
    }


    /**
     * Gets the dataPagamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataPagamento
     */
    public java.util.Date getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.util.Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the usernameUtenteUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return usernameUtenteUltimoAggiornamento
     */
    public java.lang.String getUsernameUtenteUltimoAggiornamento() {
        return usernameUtenteUltimoAggiornamento;
    }


    /**
     * Sets the usernameUtenteUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param usernameUtenteUltimoAggiornamento
     */
    public void setUsernameUtenteUltimoAggiornamento(java.lang.String usernameUtenteUltimoAggiornamento) {
        this.usernameUtenteUltimoAggiornamento = usernameUtenteUltimoAggiornamento;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the dataConfermaComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataConfermaComunicazione
     */
    public java.util.Calendar getDataConfermaComunicazione() {
        return dataConfermaComunicazione;
    }


    /**
     * Sets the dataConfermaComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataConfermaComunicazione
     */
    public void setDataConfermaComunicazione(java.util.Calendar dataConfermaComunicazione) {
        this.dataConfermaComunicazione = dataConfermaComunicazione;
    }


    /**
     * Gets the codiceFreccia value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceFreccia
     */
    public java.lang.String getCodiceFreccia() {
        return codiceFreccia;
    }


    /**
     * Sets the codiceFreccia value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceFreccia
     */
    public void setCodiceFreccia(java.lang.String codiceFreccia) {
        this.codiceFreccia = codiceFreccia;
    }


    /**
     * Gets the descrizioneEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return descrizioneEnte
     */
    public java.lang.String getDescrizioneEnte() {
        return descrizioneEnte;
    }


    /**
     * Sets the descrizioneEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param descrizioneEnte
     */
    public void setDescrizioneEnte(java.lang.String descrizioneEnte) {
        this.descrizioneEnte = descrizioneEnte;
    }


    /**
     * Gets the tipoCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return tipoCC
     */
    public java.lang.String getTipoCC() {
        return tipoCC;
    }


    /**
     * Sets the tipoCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param tipoCC
     */
    public void setTipoCC(java.lang.String tipoCC) {
        this.tipoCC = tipoCC;
    }


    /**
     * Gets the numeroCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroCC
     */
    public java.lang.String getNumeroCC() {
        return numeroCC;
    }


    /**
     * Sets the numeroCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroCC
     */
    public void setNumeroCC(java.lang.String numeroCC) {
        this.numeroCC = numeroCC;
    }


    /**
     * Gets the intestazioneCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return intestazioneCC
     */
    public java.lang.String getIntestazioneCC() {
        return intestazioneCC;
    }


    /**
     * Sets the intestazioneCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param intestazioneCC
     */
    public void setIntestazioneCC(java.lang.String intestazioneCC) {
        this.intestazioneCC = intestazioneCC;
    }


    /**
     * Gets the autorizzazioneCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return autorizzazioneCC
     */
    public java.lang.String getAutorizzazioneCC() {
        return autorizzazioneCC;
    }


    /**
     * Sets the autorizzazioneCC value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param autorizzazioneCC
     */
    public void setAutorizzazioneCC(java.lang.String autorizzazioneCC) {
        this.autorizzazioneCC = autorizzazioneCC;
    }


    /**
     * Gets the codiceFiscaleEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceFiscaleEnte
     */
    public java.lang.String getCodiceFiscaleEnte() {
        return codiceFiscaleEnte;
    }


    /**
     * Sets the codiceFiscaleEnte value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceFiscaleEnte
     */
    public void setCodiceFiscaleEnte(java.lang.String codiceFiscaleEnte) {
        this.codiceFiscaleEnte = codiceFiscaleEnte;
    }


    /**
     * Gets the codiceCBill value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceCBill
     */
    public java.lang.String getCodiceCBill() {
        return codiceCBill;
    }


    /**
     * Sets the codiceCBill value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceCBill
     */
    public void setCodiceCBill(java.lang.String codiceCBill) {
        this.codiceCBill = codiceCBill;
    }


    /**
     * Gets the barcodePagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return barcodePagoPA
     */
    public java.lang.String getBarcodePagoPA() {
        return barcodePagoPA;
    }


    /**
     * Sets the barcodePagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param barcodePagoPA
     */
    public void setBarcodePagoPA(java.lang.String barcodePagoPA) {
        this.barcodePagoPA = barcodePagoPA;
    }


    /**
     * Gets the qrCodePagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return qrCodePagoPA
     */
    public java.lang.String getQrCodePagoPA() {
        return qrCodePagoPA;
    }


    /**
     * Sets the qrCodePagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param qrCodePagoPA
     */
    public void setQrCodePagoPA(java.lang.String qrCodePagoPA) {
        this.qrCodePagoPA = qrCodePagoPA;
    }


    /**
     * Gets the causaleDocumento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return causaleDocumento
     */
    public java.lang.String getCausaleDocumento() {
        return causaleDocumento;
    }


    /**
     * Sets the causaleDocumento value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param causaleDocumento
     */
    public void setCausaleDocumento(java.lang.String causaleDocumento) {
        this.causaleDocumento = causaleDocumento;
    }


    /**
     * Gets the descrizioneUfficio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return descrizioneUfficio
     */
    public java.lang.String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }


    /**
     * Sets the descrizioneUfficio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param descrizioneUfficio
     */
    public void setDescrizioneUfficio(java.lang.String descrizioneUfficio) {
        this.descrizioneUfficio = descrizioneUfficio;
    }


    /**
     * Gets the descrizioneTipoServizio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return descrizioneTipoServizio
     */
    public java.lang.String getDescrizioneTipoServizio() {
        return descrizioneTipoServizio;
    }


    /**
     * Sets the descrizioneTipoServizio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param descrizioneTipoServizio
     */
    public void setDescrizioneTipoServizio(java.lang.String descrizioneTipoServizio) {
        this.descrizioneTipoServizio = descrizioneTipoServizio;
    }


    /**
     * Gets the descrizioneImpostaServizio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return descrizioneImpostaServizio
     */
    public java.lang.String getDescrizioneImpostaServizio() {
        return descrizioneImpostaServizio;
    }


    /**
     * Sets the descrizioneImpostaServizio value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param descrizioneImpostaServizio
     */
    public void setDescrizioneImpostaServizio(java.lang.String descrizioneImpostaServizio) {
        this.descrizioneImpostaServizio = descrizioneImpostaServizio;
    }


    /**
     * Gets the numeroAvvisoPagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroAvvisoPagoPA
     */
    public java.lang.String getNumeroAvvisoPagoPA() {
        return numeroAvvisoPagoPA;
    }


    /**
     * Sets the numeroAvvisoPagoPA value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroAvvisoPagoPA
     */
    public void setNumeroAvvisoPagoPA(java.lang.String numeroAvvisoPagoPA) {
        this.numeroAvvisoPagoPA = numeroAvvisoPagoPA;
    }


    /**
     * Gets the codiceIUV value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceIUV
     */
    public java.lang.String getCodiceIUV() {
        return codiceIUV;
    }


    /**
     * Sets the codiceIUV value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceIUV
     */
    public void setCodiceIUV(java.lang.String codiceIUV) {
        this.codiceIUV = codiceIUV;
    }
    
    //PG190300 - inizio
    /**
     * Gets the dataLimiteComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return dataLimiteComunicazione
     */
    public java.util.Date getDataLimiteComunicazione() {
        return dataLimiteComunicazione;
    }


    /**
     * Sets the dataLimiteComunicazione value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param dataLimiteComunicazione
     */
    public void setDataLimiteComunicazione(java.util.Date dataLimiteComunicazione) {
        this.dataLimiteComunicazione = dataLimiteComunicazione;
    }


    /**
     * Gets the chiaveAnagraficaStrutturaRicettivaPrincipale value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return chiaveAnagraficaStrutturaRicettivaPrincipale
     */
    public java.lang.String getChiaveAnagraficaStrutturaRicettivaPrincipale() {
        return chiaveAnagraficaStrutturaRicettivaPrincipale;
    }


    /**
     * Sets the chiaveAnagraficaStrutturaRicettivaPrincipale value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param chiaveAnagraficaStrutturaRicettivaPrincipale
     */
    public void setChiaveAnagraficaStrutturaRicettivaPrincipale(java.lang.String chiaveAnagraficaStrutturaRicettivaPrincipale) {
        this.chiaveAnagraficaStrutturaRicettivaPrincipale = chiaveAnagraficaStrutturaRicettivaPrincipale;
    }


    /**
     * Gets the numeroBollettinoCumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroBollettinoCumulativo
     */
    public java.lang.String getNumeroBollettinoCumulativo() {
        return numeroBollettinoCumulativo;
    }


    /**
     * Sets the numeroBollettinoCumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroBollettinoCumulativo
     */
    public void setNumeroBollettinoCumulativo(java.lang.String numeroBollettinoCumulativo) {
        this.numeroBollettinoCumulativo = numeroBollettinoCumulativo;
    }

    /**
     * Gets the noteOperatore value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return noteOperatore
     */
    public java.lang.String getNoteOperatore() {
        return noteOperatore;
    }


    /**
     * Sets the noteOperatore value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param noteOperatore
     */
    public void setNoteOperatore(java.lang.String noteOperatore) {
        this.noteOperatore = noteOperatore;
    }

    //inizio LP PG200230
    /**
     * Gets the barcodePagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return barcodePagoPACumulativo
     */
    public java.lang.String getBarcodePagoPACumulativo() {
        return barcodePagoPACumulativo;
    }


    /**
     * Sets the barcodePagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param barcodePagoPACumulativo
     */
    public void setBarcodePagoPACumulativo(java.lang.String barcodePagoPACumulativo) {
        this.barcodePagoPACumulativo = barcodePagoPACumulativo;
    }


    /**
     * Gets the qrCodePagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return qrCodePagoPACumulativo
     */
    public java.lang.String getQrCodePagoPACumulativo() {
        return qrCodePagoPACumulativo;
    }


    /**
     * Sets the qrCodePagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param qrCodePagoPACumulativo
     */
    public void setQrCodePagoPACumulativo(java.lang.String qrCodePagoPACumulativo) {
        this.qrCodePagoPACumulativo = qrCodePagoPACumulativo;
    }


    /**
     * Gets the numeroAvvisoPagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return numeroAvvisoPagoPACumulativo
     */
    public java.lang.String getNumeroAvvisoPagoPACumulativo() {
        return numeroAvvisoPagoPACumulativo;
    }


    /**
     * Sets the numeroAvvisoPagoPACumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param numeroAvvisoPagoPACumulativo
     */
    public void setNumeroAvvisoPagoPACumulativo(java.lang.String numeroAvvisoPagoPACumulativo) {
        this.numeroAvvisoPagoPACumulativo = numeroAvvisoPagoPACumulativo;
    }


    /**
     * Gets the codiceIUVCumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @return codiceIUVCumulativo
     */
    public java.lang.String getCodiceIUVCumulativo() {
        return codiceIUVCumulativo;
    }


    /**
     * Sets the codiceIUVCumulativo value for this TestataComunicazioneImpostaSoggiorno.
     * 
     * @param codiceIUVCumulativo
     */
    public void setCodiceIUVCumulativo(java.lang.String codiceIUVCumulativo) {
        this.codiceIUVCumulativo = codiceIUVCumulativo;
    }
    //fine LP PG200230

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestataComunicazioneImpostaSoggiorno)) return false;
        TestataComunicazioneImpostaSoggiorno other = (TestataComunicazioneImpostaSoggiorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveTestataComunicazione==null && other.getChiaveTestataComunicazione()==null) || 
             (this.chiaveTestataComunicazione!=null &&
              this.chiaveTestataComunicazione.equals(other.getChiaveTestataComunicazione()))) &&
            ((this.chiaveAnagraficaStrutturaRicettiva==null && other.getChiaveAnagraficaStrutturaRicettiva()==null) || 
             (this.chiaveAnagraficaStrutturaRicettiva!=null &&
              this.chiaveAnagraficaStrutturaRicettiva.equals(other.getChiaveAnagraficaStrutturaRicettiva()))) &&
            ((this.codiceSocieta==null && other.getCodiceSocieta()==null) || 
             (this.codiceSocieta!=null &&
              this.codiceSocieta.equals(other.getCodiceSocieta()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.chiaveEnte==null && other.getChiaveEnte()==null) || 
             (this.chiaveEnte!=null &&
              this.chiaveEnte.equals(other.getChiaveEnte()))) &&
            ((this.dataInserimentoComunicazione==null && other.getDataInserimentoComunicazione()==null) || 
             (this.dataInserimentoComunicazione!=null &&
              this.dataInserimentoComunicazione.equals(other.getDataInserimentoComunicazione()))) &&
            ((this.dataInizioComunicazione==null && other.getDataInizioComunicazione()==null) || 
             (this.dataInizioComunicazione!=null &&
              this.dataInizioComunicazione.equals(other.getDataInizioComunicazione()))) &&
            ((this.dataFineComunicazione==null && other.getDataFineComunicazione()==null) || 
             (this.dataFineComunicazione!=null &&
              this.dataFineComunicazione.equals(other.getDataFineComunicazione()))) &&
            ((this.numeroGiorniPeriodoPermanenzaTotale==null && other.getNumeroGiorniPeriodoPermanenzaTotale()==null) || 
             (this.numeroGiorniPeriodoPermanenzaTotale!=null &&
              this.numeroGiorniPeriodoPermanenzaTotale.equals(other.getNumeroGiorniPeriodoPermanenzaTotale()))) &&
            ((this.tipoComunicazione==null && other.getTipoComunicazione()==null) || 
             (this.tipoComunicazione!=null &&
              this.tipoComunicazione.equals(other.getTipoComunicazione()))) &&
            ((this.chiaveTariffaImpostaSoggiorno==null && other.getChiaveTariffaImpostaSoggiorno()==null) || 
             (this.chiaveTariffaImpostaSoggiorno!=null &&
              this.chiaveTariffaImpostaSoggiorno.equals(other.getChiaveTariffaImpostaSoggiorno()))) &&
            ((this.noteAggiuntive==null && other.getNoteAggiuntive()==null) || 
             (this.noteAggiuntive!=null &&
              this.noteAggiuntive.equals(other.getNoteAggiuntive()))) &&
            ((this.dataScadenzaComunicazione==null && other.getDataScadenzaComunicazione()==null) || 
             (this.dataScadenzaComunicazione!=null &&
              this.dataScadenzaComunicazione.equals(other.getDataScadenzaComunicazione()))) &&
            ((this.statoComunicazione==null && other.getStatoComunicazione()==null) || 
             (this.statoComunicazione!=null &&
              this.statoComunicazione.equals(other.getStatoComunicazione()))) &&
            ((this.modalitaPagamento==null && other.getModalitaPagamento()==null) || 
             (this.modalitaPagamento!=null &&
              this.modalitaPagamento.equals(other.getModalitaPagamento()))) &&
            ((this.codiceRID==null && other.getCodiceRID()==null) || 
             (this.codiceRID!=null &&
              this.codiceRID.equals(other.getCodiceRID()))) &&
            ((this.numeroDocumentoGestionaleEntrate==null && other.getNumeroDocumentoGestionaleEntrate()==null) || 
             (this.numeroDocumentoGestionaleEntrate!=null &&
              this.numeroDocumentoGestionaleEntrate.equals(other.getNumeroDocumentoGestionaleEntrate()))) &&
            ((this.codiceBollettino==null && other.getCodiceBollettino()==null) || 
             (this.codiceBollettino!=null &&
              this.codiceBollettino.equals(other.getCodiceBollettino()))) &&
            ((this.statoDocumento==null && other.getStatoDocumento()==null) || 
             (this.statoDocumento!=null &&
              this.statoDocumento.equals(other.getStatoDocumento()))) &&
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.usernameUtenteUltimoAggiornamento==null && other.getUsernameUtenteUltimoAggiornamento()==null) || 
             (this.usernameUtenteUltimoAggiornamento!=null &&
              this.usernameUtenteUltimoAggiornamento.equals(other.getUsernameUtenteUltimoAggiornamento()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento()))) &&
            ((this.dataConfermaComunicazione==null && other.getDataConfermaComunicazione()==null) || 
             (this.dataConfermaComunicazione!=null &&
              this.dataConfermaComunicazione.equals(other.getDataConfermaComunicazione()))) &&
            ((this.codiceFreccia==null && other.getCodiceFreccia()==null) || 
             (this.codiceFreccia!=null &&
              this.codiceFreccia.equals(other.getCodiceFreccia()))) &&
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
            //PG190300 - inizio  
            ((this.dataLimiteComunicazione==null && other.getDataLimiteComunicazione()==null) || 
             (this.dataLimiteComunicazione!=null &&
              this.dataLimiteComunicazione.equals(other.getDataLimiteComunicazione()))) &&
            ((this.chiaveAnagraficaStrutturaRicettivaPrincipale==null && other.getChiaveAnagraficaStrutturaRicettivaPrincipale()==null) || 
             (this.chiaveAnagraficaStrutturaRicettivaPrincipale!=null &&
              this.chiaveAnagraficaStrutturaRicettivaPrincipale.equals(other.getChiaveAnagraficaStrutturaRicettivaPrincipale()))) &&
            ((this.numeroBollettinoCumulativo==null && other.getNumeroBollettinoCumulativo()==null) || 
             (this.numeroBollettinoCumulativo!=null &&
              this.numeroBollettinoCumulativo.equals(other.getNumeroBollettinoCumulativo()))) &&
            ((this.noteOperatore==null && other.getNoteOperatore()==null) || 
             (this.noteOperatore!=null &&
              this.noteOperatore.equals(other.getNoteOperatore()))) &&
            //inizio LP PG200230
            ((this.barcodePagoPACumulativo==null && other.getBarcodePagoPACumulativo()==null) || 
             (this.barcodePagoPACumulativo!=null &&
              this.barcodePagoPACumulativo.equals(other.getBarcodePagoPACumulativo()))) &&
            ((this.qrCodePagoPACumulativo==null && other.getQrCodePagoPACumulativo()==null) || 
             (this.qrCodePagoPACumulativo!=null &&
              this.qrCodePagoPACumulativo.equals(other.getQrCodePagoPACumulativo()))) &&
            ((this.numeroAvvisoPagoPACumulativo==null && other.getNumeroAvvisoPagoPACumulativo()==null) || 
             (this.numeroAvvisoPagoPACumulativo!=null &&
              this.numeroAvvisoPagoPACumulativo.equals(other.getNumeroAvvisoPagoPACumulativo()))) &&
            ((this.codiceIUVCumulativo==null && other.getCodiceIUVCumulativo()==null) || 
             (this.codiceIUVCumulativo!=null &&
              this.codiceIUVCumulativo.equals(other.getCodiceIUVCumulativo())));
        	//fine LP PG200230
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
        if (getChiaveTestataComunicazione() != null) {
            _hashCode += getChiaveTestataComunicazione().hashCode();
        }
        if (getChiaveAnagraficaStrutturaRicettiva() != null) {
            _hashCode += getChiaveAnagraficaStrutturaRicettiva().hashCode();
        }
        if (getCodiceSocieta() != null) {
            _hashCode += getCodiceSocieta().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getChiaveEnte() != null) {
            _hashCode += getChiaveEnte().hashCode();
        }
        if (getDataInserimentoComunicazione() != null) {
            _hashCode += getDataInserimentoComunicazione().hashCode();
        }
        if (getDataInizioComunicazione() != null) {
            _hashCode += getDataInizioComunicazione().hashCode();
        }
        if (getDataFineComunicazione() != null) {
            _hashCode += getDataFineComunicazione().hashCode();
        }
        if (getNumeroGiorniPeriodoPermanenzaTotale() != null) {
            _hashCode += getNumeroGiorniPeriodoPermanenzaTotale().hashCode();
        }
        if (getTipoComunicazione() != null) {
            _hashCode += getTipoComunicazione().hashCode();
        }
        if (getChiaveTariffaImpostaSoggiorno() != null) {
            _hashCode += getChiaveTariffaImpostaSoggiorno().hashCode();
        }
        if (getNoteAggiuntive() != null) {
            _hashCode += getNoteAggiuntive().hashCode();
        }
        if (getDataScadenzaComunicazione() != null) {
            _hashCode += getDataScadenzaComunicazione().hashCode();
        }
        if (getStatoComunicazione() != null) {
            _hashCode += getStatoComunicazione().hashCode();
        }
        if (getModalitaPagamento() != null) {
            _hashCode += getModalitaPagamento().hashCode();
        }
        if (getCodiceRID() != null) {
            _hashCode += getCodiceRID().hashCode();
        }
        if (getNumeroDocumentoGestionaleEntrate() != null) {
            _hashCode += getNumeroDocumentoGestionaleEntrate().hashCode();
        }
        if (getCodiceBollettino() != null) {
            _hashCode += getCodiceBollettino().hashCode();
        }
        if (getStatoDocumento() != null) {
            _hashCode += getStatoDocumento().hashCode();
        }
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getUsernameUtenteUltimoAggiornamento() != null) {
            _hashCode += getUsernameUtenteUltimoAggiornamento().hashCode();
        }
        if (getDataUltimoAggiornamento() != null) {
            _hashCode += getDataUltimoAggiornamento().hashCode();
        }
        if (getOperatoreUltimoAggiornamento() != null) {
            _hashCode += getOperatoreUltimoAggiornamento().hashCode();
        }
        if (getDataConfermaComunicazione() != null) {
            _hashCode += getDataConfermaComunicazione().hashCode();
        }
        if (getCodiceFreccia() != null) {
            _hashCode += getCodiceFreccia().hashCode();
        }
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
        //PG190300 - inizio
        if (getDataLimiteComunicazione() != null) {
            _hashCode += getDataLimiteComunicazione().hashCode();
        }
        if (getChiaveAnagraficaStrutturaRicettivaPrincipale() != null) {
            _hashCode += getChiaveAnagraficaStrutturaRicettivaPrincipale().hashCode();
        }
        if (getNumeroBollettinoCumulativo() != null) {
            _hashCode += getNumeroBollettinoCumulativo().hashCode();
        }
        if (getNoteOperatore() != null) {
            _hashCode += getNoteOperatore().hashCode();
        }
        //inizio LP PG200230
        if (getBarcodePagoPACumulativo() != null) {
            _hashCode += getBarcodePagoPACumulativo().hashCode();
        }
        if (getQrCodePagoPACumulativo() != null) {
            _hashCode += getQrCodePagoPACumulativo().hashCode();
        }
        if (getNumeroAvvisoPagoPACumulativo() != null) {
            _hashCode += getNumeroAvvisoPagoPACumulativo().hashCode();
        }
        if (getCodiceIUVCumulativo() != null) {
            _hashCode += getCodiceIUVCumulativo().hashCode();
        }
        //fine LP PG200230
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestataComunicazioneImpostaSoggiorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataComunicazioneImpostaSoggiorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTestataComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTestataComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveAnagraficaStrutturaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveAnagraficaStrutturaRicettiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceSocieta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceSocieta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceUtente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceUtente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInserimentoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataInserimentoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInizioComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataInizioComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFineComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataFineComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroGiorniPeriodoPermanenzaTotale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroGiorniPeriodoPermanenzaTotale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "tipoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipoComunicazione"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveTariffaImpostaSoggiorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveTariffaImpostaSoggiorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteAggiuntive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "noteAggiuntive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataScadenzaComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataScadenzaComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "statoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "StatoComunicazione"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalitaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "modalitaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ModalitaPagamento"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumentoGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroDocumentoGestionaleEntrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceBollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceBollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "statoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "StatoDocumento"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usernameUtenteUltimoAggiornamento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "usernameUtenteUltimoAggiornamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("dataConfermaComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataConfermaComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFreccia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceFreccia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "tipoCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestazioneCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "intestazioneCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizzazioneCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "autorizzazioneCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceFiscaleEnte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceFiscaleEnte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceCBill");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceCBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodePagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "barcodePagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qrCodePagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "qrCodePagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causaleDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "causaleDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneUfficio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneUfficio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneTipoServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneTipoServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrizioneImpostaServizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "descrizioneImpostaServizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroAvvisoPagoPA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIUV");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceIUV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLimiteComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataLimiteComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveAnagraficaStrutturaRicettivaPrincipale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveAnagraficaStrutturaRicettivaPrincipale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroBollettinoCumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroBollettinoCumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteOperatore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "noteOperatore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        //inizio LP PG200230
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodePagoPACumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "barcodePagoPACumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qrCodePagoPACumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "qrCodePagoPACumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAvvisoPagoPACumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numeroAvvisoPagoPACumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIUVCumulativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceIUVCumulativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        //fine LP PG200230
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
