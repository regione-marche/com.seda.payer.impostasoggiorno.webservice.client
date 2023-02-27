/**
 * AnagraficaStrutturaRicettiva.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.dati;

public class AnagraficaStrutturaRicettiva  implements java.io.Serializable {
    private java.lang.String chiaveStrutturaRicettiva;

    private java.lang.String codiceBelfiore;

    private java.lang.String codiceAutorizzazione;

    private java.lang.String partitaIVAStruttura;

    private java.lang.String ragioneSocialeStruttura;

    private java.lang.String insegnaStruttura;

    private java.lang.String anagraficaTitolare;

    private java.lang.String codFiscaleTitolare;

    private java.lang.String indirizzoStruttura;

    private java.lang.String capStruttura;

    private java.lang.String chiaveTipologiaStruttura;

    private java.lang.String email;

    private java.lang.String flagPrimoAccesso;

    private java.lang.String codiceUtente;

    private java.lang.String codiceEnteGestionaleEntrate;

    private java.lang.String impostaServizioGestionaleEntrate;

    private java.lang.String codiceContribuenteGestionaleEntrate;

    private java.util.Calendar dataUltimoAggiornamento;

    private java.lang.String operatoreUltimoAggiornamento;

    private java.lang.String emailPec;

    private java.lang.String flagSubentro;

    private java.util.Calendar dataValiditaInizio;

    private java.util.Calendar dataValiditaFine;

    private java.util.Calendar dataObbligoComunicazioneInizio;

    private java.util.Calendar dataObbligoComunicazioneFine;

    private java.lang.String note;

    private java.lang.String codiceAutorizzazionePrincipale;

    private java.lang.String telefono;

    private java.util.Calendar dataNascitaTitolare;

    private java.lang.String provinciaTitolare;

    private java.lang.String comuneTitolare;

    private java.util.Calendar dataNascitaGestore;

    private java.lang.String provinciaGestore;

    private java.lang.String comuneGestore;

    private java.lang.String codFiscaleGestore;

    private java.lang.String anagraficaGestore;

    private java.lang.String pinCodeMail;

    private java.lang.String pinCodeMailPec;

    private java.lang.String flagValidazioneMail;

    private java.lang.String flagValidazioneMailPec;

    private java.lang.String flagPrincipale;

    private java.lang.String comuneCatastale;

    private java.lang.String particellaEdificiale;

    private java.lang.String subalterno;

    private java.math.BigDecimal superficie;

    private java.lang.Integer postiLetto;

    private java.lang.String piano;
    
    private java.lang.Integer numAlloggiTotali;

    private java.lang.Integer numAlloggiAttivi;

    private java.lang.String statoComunicazione;

    private java.lang.String codiceIstat;

    public AnagraficaStrutturaRicettiva() {
    }

    public AnagraficaStrutturaRicettiva(
           java.lang.String chiaveStrutturaRicettiva,
           java.lang.String codiceBelfiore,
           java.lang.String codiceAutorizzazione,
           java.lang.String partitaIVAStruttura,
           java.lang.String ragioneSocialeStruttura,
           java.lang.String insegnaStruttura,
           java.lang.String anagraficaTitolare,
           java.lang.String codFiscaleTitolare,
           java.lang.String indirizzoStruttura,
           java.lang.String capStruttura,
           java.lang.String chiaveTipologiaStruttura,
           java.lang.String email,
           java.lang.String flagPrimoAccesso,
           java.lang.String codiceUtente,
           java.lang.String codiceEnteGestionaleEntrate,
           java.lang.String impostaServizioGestionaleEntrate,
           java.lang.String codiceContribuenteGestionaleEntrate,
           java.util.Calendar dataUltimoAggiornamento,
           java.lang.String operatoreUltimoAggiornamento,
           java.lang.String emailPec,
           java.lang.String flagSubentro,
           java.util.Calendar dataValiditaInizio,
           java.util.Calendar dataValiditaFine,
           java.util.Calendar dataObbligoComunicazioneInizio,
           java.util.Calendar dataObbligoComunicazioneFine,
           java.lang.String note,
           java.lang.String codiceAutorizzazionePrincipale,
           java.lang.String telefono,
           java.util.Calendar dataNascitaTitolare,
           java.lang.String provinciaTitolare,
           java.lang.String comuneTitolare,
           java.util.Calendar dataNascitaGestore,
           java.lang.String provinciaGestore,
           java.lang.String comuneGestore,
           java.lang.String codFiscaleGestore,
           java.lang.String anagraficaGestore,
           java.lang.String pinCodeMail,
           java.lang.String pinCodeMailPec,
           java.lang.String flagValidazioneMail,
           java.lang.String flagValidazioneMailPec,
           java.lang.String flagPrincipale,
           java.lang.String comuneCatastale,
           java.lang.String particellaEdificiale,
           java.lang.String subalterno,
           java.math.BigDecimal superficie,
           java.lang.Integer postiLetto,
           java.lang.String piano) {
           this.chiaveStrutturaRicettiva = chiaveStrutturaRicettiva;
           this.codiceBelfiore = codiceBelfiore;
           this.codiceAutorizzazione = codiceAutorizzazione;
           this.partitaIVAStruttura = partitaIVAStruttura;
           this.ragioneSocialeStruttura = ragioneSocialeStruttura;
           this.insegnaStruttura = insegnaStruttura;
           this.anagraficaTitolare = anagraficaTitolare;
           this.codFiscaleTitolare = codFiscaleTitolare;
           this.indirizzoStruttura = indirizzoStruttura;
           this.capStruttura = capStruttura;
           this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
           this.email = email;
           this.flagPrimoAccesso = flagPrimoAccesso;
           this.codiceUtente = codiceUtente;
           this.codiceEnteGestionaleEntrate = codiceEnteGestionaleEntrate;
           this.impostaServizioGestionaleEntrate = impostaServizioGestionaleEntrate;
           this.codiceContribuenteGestionaleEntrate = codiceContribuenteGestionaleEntrate;
           this.dataUltimoAggiornamento = dataUltimoAggiornamento;
           this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
           this.emailPec = emailPec;
           this.flagSubentro = flagSubentro;
           this.dataValiditaInizio = dataValiditaInizio;
           this.dataValiditaFine = dataValiditaFine;
           this.dataObbligoComunicazioneInizio = dataObbligoComunicazioneInizio;
           this.dataObbligoComunicazioneFine = dataObbligoComunicazioneFine;
           this.note = note;
           this.codiceAutorizzazionePrincipale = codiceAutorizzazionePrincipale;
           this.telefono = telefono;
           this.dataNascitaTitolare = dataNascitaTitolare;
           this.provinciaTitolare = provinciaTitolare;
           this.comuneTitolare = comuneTitolare;
           this.dataNascitaGestore = dataNascitaGestore;
           this.provinciaGestore = provinciaGestore;
           this.comuneGestore = comuneGestore;
           this.codFiscaleGestore = codFiscaleGestore;
           this.anagraficaGestore = anagraficaGestore;
           this.pinCodeMail = pinCodeMail;
           this.pinCodeMailPec = pinCodeMailPec;
           this.flagValidazioneMail = flagValidazioneMail;
           this.flagValidazioneMailPec = flagValidazioneMailPec;
           this.flagPrincipale = flagPrincipale;
           this.comuneCatastale = comuneCatastale;
           this.particellaEdificiale = particellaEdificiale;
           this.subalterno = subalterno;
           this.superficie = superficie;
           this.postiLetto = postiLetto;
           this.piano = piano;
    }


    /**
     * Gets the chiaveStrutturaRicettiva value for this AnagraficaStrutturaRicettiva.
     * 
     * @return chiaveStrutturaRicettiva
     */
    public java.lang.String getChiaveStrutturaRicettiva() {
        return chiaveStrutturaRicettiva;
    }


    /**
     * Sets the chiaveStrutturaRicettiva value for this AnagraficaStrutturaRicettiva.
     * 
     * @param chiaveStrutturaRicettiva
     */
    public void setChiaveStrutturaRicettiva(java.lang.String chiaveStrutturaRicettiva) {
        this.chiaveStrutturaRicettiva = chiaveStrutturaRicettiva;
    }


    /**
     * Gets the codiceBelfiore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceBelfiore
     */
    public java.lang.String getCodiceBelfiore() {
        return codiceBelfiore;
    }


    /**
     * Sets the codiceBelfiore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceBelfiore
     */
    public void setCodiceBelfiore(java.lang.String codiceBelfiore) {
        this.codiceBelfiore = codiceBelfiore;
    }


    /**
     * Gets the codiceAutorizzazione value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceAutorizzazione
     */
    public java.lang.String getCodiceAutorizzazione() {
        return codiceAutorizzazione;
    }


    /**
     * Sets the codiceAutorizzazione value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceAutorizzazione
     */
    public void setCodiceAutorizzazione(java.lang.String codiceAutorizzazione) {
        this.codiceAutorizzazione = codiceAutorizzazione;
    }


    /**
     * Gets the partitaIVAStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return partitaIVAStruttura
     */
    public java.lang.String getPartitaIVAStruttura() {
        return partitaIVAStruttura;
    }


    /**
     * Sets the partitaIVAStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param partitaIVAStruttura
     */
    public void setPartitaIVAStruttura(java.lang.String partitaIVAStruttura) {
        this.partitaIVAStruttura = partitaIVAStruttura;
    }


    /**
     * Gets the ragioneSocialeStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return ragioneSocialeStruttura
     */
    public java.lang.String getRagioneSocialeStruttura() {
        return ragioneSocialeStruttura;
    }


    /**
     * Sets the ragioneSocialeStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param ragioneSocialeStruttura
     */
    public void setRagioneSocialeStruttura(java.lang.String ragioneSocialeStruttura) {
        this.ragioneSocialeStruttura = ragioneSocialeStruttura;
    }


    /**
     * Gets the insegnaStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return insegnaStruttura
     */
    public java.lang.String getInsegnaStruttura() {
        return insegnaStruttura;
    }


    /**
     * Sets the insegnaStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param insegnaStruttura
     */
    public void setInsegnaStruttura(java.lang.String insegnaStruttura) {
        this.insegnaStruttura = insegnaStruttura;
    }


    /**
     * Gets the anagraficaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @return anagraficaTitolare
     */
    public java.lang.String getAnagraficaTitolare() {
        return anagraficaTitolare;
    }


    /**
     * Sets the anagraficaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @param anagraficaTitolare
     */
    public void setAnagraficaTitolare(java.lang.String anagraficaTitolare) {
        this.anagraficaTitolare = anagraficaTitolare;
    }


    /**
     * Gets the codFiscaleTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codFiscaleTitolare
     */
    public java.lang.String getCodFiscaleTitolare() {
        return codFiscaleTitolare;
    }


    /**
     * Sets the codFiscaleTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codFiscaleTitolare
     */
    public void setCodFiscaleTitolare(java.lang.String codFiscaleTitolare) {
        this.codFiscaleTitolare = codFiscaleTitolare;
    }


    /**
     * Gets the indirizzoStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return indirizzoStruttura
     */
    public java.lang.String getIndirizzoStruttura() {
        return indirizzoStruttura;
    }


    /**
     * Sets the indirizzoStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param indirizzoStruttura
     */
    public void setIndirizzoStruttura(java.lang.String indirizzoStruttura) {
        this.indirizzoStruttura = indirizzoStruttura;
    }


    /**
     * Gets the capStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return capStruttura
     */
    public java.lang.String getCapStruttura() {
        return capStruttura;
    }


    /**
     * Sets the capStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param capStruttura
     */
    public void setCapStruttura(java.lang.String capStruttura) {
        this.capStruttura = capStruttura;
    }


    /**
     * Gets the chiaveTipologiaStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @return chiaveTipologiaStruttura
     */
    public java.lang.String getChiaveTipologiaStruttura() {
        return chiaveTipologiaStruttura;
    }


    /**
     * Sets the chiaveTipologiaStruttura value for this AnagraficaStrutturaRicettiva.
     * 
     * @param chiaveTipologiaStruttura
     */
    public void setChiaveTipologiaStruttura(java.lang.String chiaveTipologiaStruttura) {
        this.chiaveTipologiaStruttura = chiaveTipologiaStruttura;
    }


    /**
     * Gets the email value for this AnagraficaStrutturaRicettiva.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AnagraficaStrutturaRicettiva.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the flagPrimoAccesso value for this AnagraficaStrutturaRicettiva.
     * 
     * @return flagPrimoAccesso
     */
    public java.lang.String getFlagPrimoAccesso() {
        return flagPrimoAccesso;
    }


    /**
     * Sets the flagPrimoAccesso value for this AnagraficaStrutturaRicettiva.
     * 
     * @param flagPrimoAccesso
     */
    public void setFlagPrimoAccesso(java.lang.String flagPrimoAccesso) {
        this.flagPrimoAccesso = flagPrimoAccesso;
    }


    /**
     * Gets the codiceUtente value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceUtente
     */
    public java.lang.String getCodiceUtente() {
        return codiceUtente;
    }


    /**
     * Sets the codiceUtente value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceUtente
     */
    public void setCodiceUtente(java.lang.String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }


    /**
     * Gets the codiceEnteGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceEnteGestionaleEntrate
     */
    public java.lang.String getCodiceEnteGestionaleEntrate() {
        return codiceEnteGestionaleEntrate;
    }


    /**
     * Sets the codiceEnteGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceEnteGestionaleEntrate
     */
    public void setCodiceEnteGestionaleEntrate(java.lang.String codiceEnteGestionaleEntrate) {
        this.codiceEnteGestionaleEntrate = codiceEnteGestionaleEntrate;
    }


    /**
     * Gets the impostaServizioGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @return impostaServizioGestionaleEntrate
     */
    public java.lang.String getImpostaServizioGestionaleEntrate() {
        return impostaServizioGestionaleEntrate;
    }


    /**
     * Sets the impostaServizioGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @param impostaServizioGestionaleEntrate
     */
    public void setImpostaServizioGestionaleEntrate(java.lang.String impostaServizioGestionaleEntrate) {
        this.impostaServizioGestionaleEntrate = impostaServizioGestionaleEntrate;
    }


    /**
     * Gets the codiceContribuenteGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceContribuenteGestionaleEntrate
     */
    public java.lang.String getCodiceContribuenteGestionaleEntrate() {
        return codiceContribuenteGestionaleEntrate;
    }


    /**
     * Sets the codiceContribuenteGestionaleEntrate value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceContribuenteGestionaleEntrate
     */
    public void setCodiceContribuenteGestionaleEntrate(java.lang.String codiceContribuenteGestionaleEntrate) {
        this.codiceContribuenteGestionaleEntrate = codiceContribuenteGestionaleEntrate;
    }


    /**
     * Gets the dataUltimoAggiornamento value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataUltimoAggiornamento
     */
    public java.util.Calendar getDataUltimoAggiornamento() {
        return dataUltimoAggiornamento;
    }


    /**
     * Sets the dataUltimoAggiornamento value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataUltimoAggiornamento
     */
    public void setDataUltimoAggiornamento(java.util.Calendar dataUltimoAggiornamento) {
        this.dataUltimoAggiornamento = dataUltimoAggiornamento;
    }


    /**
     * Gets the operatoreUltimoAggiornamento value for this AnagraficaStrutturaRicettiva.
     * 
     * @return operatoreUltimoAggiornamento
     */
    public java.lang.String getOperatoreUltimoAggiornamento() {
        return operatoreUltimoAggiornamento;
    }


    /**
     * Sets the operatoreUltimoAggiornamento value for this AnagraficaStrutturaRicettiva.
     * 
     * @param operatoreUltimoAggiornamento
     */
    public void setOperatoreUltimoAggiornamento(java.lang.String operatoreUltimoAggiornamento) {
        this.operatoreUltimoAggiornamento = operatoreUltimoAggiornamento;
    }


    /**
     * Gets the emailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @return emailPec
     */
    public java.lang.String getEmailPec() {
        return emailPec;
    }


    /**
     * Sets the emailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @param emailPec
     */
    public void setEmailPec(java.lang.String emailPec) {
        this.emailPec = emailPec;
    }


    /**
     * Gets the flagSubentro value for this AnagraficaStrutturaRicettiva.
     * 
     * @return flagSubentro
     */
    public java.lang.String getFlagSubentro() {
        return flagSubentro;
    }


    /**
     * Sets the flagSubentro value for this AnagraficaStrutturaRicettiva.
     * 
     * @param flagSubentro
     */
    public void setFlagSubentro(java.lang.String flagSubentro) {
        this.flagSubentro = flagSubentro;
    }


    /**
     * Gets the dataValiditaInizio value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataValiditaInizio
     */
    public java.util.Calendar getDataValiditaInizio() {
        return dataValiditaInizio;
    }


    /**
     * Sets the dataValiditaInizio value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataValiditaInizio
     */
    public void setDataValiditaInizio(java.util.Calendar dataValiditaInizio) {
        this.dataValiditaInizio = dataValiditaInizio;
    }


    /**
     * Gets the dataValiditaFine value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataValiditaFine
     */
    public java.util.Calendar getDataValiditaFine() {
        return dataValiditaFine;
    }


    /**
     * Sets the dataValiditaFine value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataValiditaFine
     */
    public void setDataValiditaFine(java.util.Calendar dataValiditaFine) {
        this.dataValiditaFine = dataValiditaFine;
    }


    /**
     * Gets the dataObbligoComunicazioneInizio value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataObbligoComunicazioneInizio
     */
    public java.util.Calendar getDataObbligoComunicazioneInizio() {
        return dataObbligoComunicazioneInizio;
    }


    /**
     * Sets the dataObbligoComunicazioneInizio value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataObbligoComunicazioneInizio
     */
    public void setDataObbligoComunicazioneInizio(java.util.Calendar dataObbligoComunicazioneInizio) {
        this.dataObbligoComunicazioneInizio = dataObbligoComunicazioneInizio;
    }


    /**
     * Gets the dataObbligoComunicazioneFine value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataObbligoComunicazioneFine
     */
    public java.util.Calendar getDataObbligoComunicazioneFine() {
        return dataObbligoComunicazioneFine;
    }


    /**
     * Sets the dataObbligoComunicazioneFine value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataObbligoComunicazioneFine
     */
    public void setDataObbligoComunicazioneFine(java.util.Calendar dataObbligoComunicazioneFine) {
        this.dataObbligoComunicazioneFine = dataObbligoComunicazioneFine;
    }


    /**
     * Gets the note value for this AnagraficaStrutturaRicettiva.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AnagraficaStrutturaRicettiva.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the codiceAutorizzazionePrincipale value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceAutorizzazionePrincipale
     */
    public java.lang.String getCodiceAutorizzazionePrincipale() {
        return codiceAutorizzazionePrincipale;
    }


    /**
     * Sets the codiceAutorizzazionePrincipale value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceAutorizzazionePrincipale
     */
    public void setCodiceAutorizzazionePrincipale(java.lang.String codiceAutorizzazionePrincipale) {
        this.codiceAutorizzazionePrincipale = codiceAutorizzazionePrincipale;
    }


    /**
     * Gets the telefono value for this AnagraficaStrutturaRicettiva.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this AnagraficaStrutturaRicettiva.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the dataNascitaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataNascitaTitolare
     */
    public java.util.Calendar getDataNascitaTitolare() {
        return dataNascitaTitolare;
    }


    /**
     * Sets the dataNascitaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataNascitaTitolare
     */
    public void setDataNascitaTitolare(java.util.Calendar dataNascitaTitolare) {
        this.dataNascitaTitolare = dataNascitaTitolare;
    }


    /**
     * Gets the provinciaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @return provinciaTitolare
     */
    public java.lang.String getProvinciaTitolare() {
        return provinciaTitolare;
    }


    /**
     * Sets the provinciaTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @param provinciaTitolare
     */
    public void setProvinciaTitolare(java.lang.String provinciaTitolare) {
        this.provinciaTitolare = provinciaTitolare;
    }


    /**
     * Gets the comuneTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @return comuneTitolare
     */
    public java.lang.String getComuneTitolare() {
        return comuneTitolare;
    }


    /**
     * Sets the comuneTitolare value for this AnagraficaStrutturaRicettiva.
     * 
     * @param comuneTitolare
     */
    public void setComuneTitolare(java.lang.String comuneTitolare) {
        this.comuneTitolare = comuneTitolare;
    }


    /**
     * Gets the dataNascitaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return dataNascitaGestore
     */
    public java.util.Calendar getDataNascitaGestore() {
        return dataNascitaGestore;
    }


    /**
     * Sets the dataNascitaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param dataNascitaGestore
     */
    public void setDataNascitaGestore(java.util.Calendar dataNascitaGestore) {
        this.dataNascitaGestore = dataNascitaGestore;
    }


    /**
     * Gets the provinciaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return provinciaGestore
     */
    public java.lang.String getProvinciaGestore() {
        return provinciaGestore;
    }


    /**
     * Sets the provinciaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param provinciaGestore
     */
    public void setProvinciaGestore(java.lang.String provinciaGestore) {
        this.provinciaGestore = provinciaGestore;
    }


    /**
     * Gets the comuneGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return comuneGestore
     */
    public java.lang.String getComuneGestore() {
        return comuneGestore;
    }


    /**
     * Sets the comuneGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param comuneGestore
     */
    public void setComuneGestore(java.lang.String comuneGestore) {
        this.comuneGestore = comuneGestore;
    }


    /**
     * Gets the codFiscaleGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codFiscaleGestore
     */
    public java.lang.String getCodFiscaleGestore() {
        return codFiscaleGestore;
    }


    /**
     * Sets the codFiscaleGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codFiscaleGestore
     */
    public void setCodFiscaleGestore(java.lang.String codFiscaleGestore) {
        this.codFiscaleGestore = codFiscaleGestore;
    }


    /**
     * Gets the anagraficaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @return anagraficaGestore
     */
    public java.lang.String getAnagraficaGestore() {
        return anagraficaGestore;
    }


    /**
     * Sets the anagraficaGestore value for this AnagraficaStrutturaRicettiva.
     * 
     * @param anagraficaGestore
     */
    public void setAnagraficaGestore(java.lang.String anagraficaGestore) {
        this.anagraficaGestore = anagraficaGestore;
    }


    /**
     * Gets the pinCodeMail value for this AnagraficaStrutturaRicettiva.
     * 
     * @return pinCodeMail
     */
    public java.lang.String getPinCodeMail() {
        return pinCodeMail;
    }


    /**
     * Sets the pinCodeMail value for this AnagraficaStrutturaRicettiva.
     * 
     * @param pinCodeMail
     */
    public void setPinCodeMail(java.lang.String pinCodeMail) {
        this.pinCodeMail = pinCodeMail;
    }


    /**
     * Gets the pinCodeMailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @return pinCodeMailPec
     */
    public java.lang.String getPinCodeMailPec() {
        return pinCodeMailPec;
    }


    /**
     * Sets the pinCodeMailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @param pinCodeMailPec
     */
    public void setPinCodeMailPec(java.lang.String pinCodeMailPec) {
        this.pinCodeMailPec = pinCodeMailPec;
    }


    /**
     * Gets the flagValidazioneMail value for this AnagraficaStrutturaRicettiva.
     * 
     * @return flagValidazioneMail
     */
    public java.lang.String getFlagValidazioneMail() {
        return flagValidazioneMail;
    }


    /**
     * Sets the flagValidazioneMail value for this AnagraficaStrutturaRicettiva.
     * 
     * @param flagValidazioneMail
     */
    public void setFlagValidazioneMail(java.lang.String flagValidazioneMail) {
        this.flagValidazioneMail = flagValidazioneMail;
    }


    /**
     * Gets the flagValidazioneMailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @return flagValidazioneMailPec
     */
    public java.lang.String getFlagValidazioneMailPec() {
        return flagValidazioneMailPec;
    }


    /**
     * Sets the flagValidazioneMailPec value for this AnagraficaStrutturaRicettiva.
     * 
     * @param flagValidazioneMailPec
     */
    public void setFlagValidazioneMailPec(java.lang.String flagValidazioneMailPec) {
        this.flagValidazioneMailPec = flagValidazioneMailPec;
    }


    /**
     * Gets the flagPrincipale value for this AnagraficaStrutturaRicettiva.
     * 
     * @return flagPrincipale
     */
    public java.lang.String getFlagPrincipale() {
        return flagPrincipale;
    }


    /**
     * Sets the flagPrincipale value for this AnagraficaStrutturaRicettiva.
     * 
     * @param flagPrincipale
     */
    public void setFlagPrincipale(java.lang.String flagPrincipale) {
        this.flagPrincipale = flagPrincipale;
    }


    /**
     * Gets the comuneCatastale value for this AnagraficaStrutturaRicettiva.
     * 
     * @return comuneCatastale
     */
    public java.lang.String getComuneCatastale() {
        return comuneCatastale;
    }


    /**
     * Sets the comuneCatastale value for this AnagraficaStrutturaRicettiva.
     * 
     * @param comuneCatastale
     */
    public void setComuneCatastale(java.lang.String comuneCatastale) {
        this.comuneCatastale = comuneCatastale;
    }


    /**
     * Gets the particellaEdificiale value for this AnagraficaStrutturaRicettiva.
     * 
     * @return particellaEdificiale
     */
    public java.lang.String getParticellaEdificiale() {
        return particellaEdificiale;
    }


    /**
     * Sets the particellaEdificiale value for this AnagraficaStrutturaRicettiva.
     * 
     * @param particellaEdificiale
     */
    public void setParticellaEdificiale(java.lang.String particellaEdificiale) {
        this.particellaEdificiale = particellaEdificiale;
    }


    /**
     * Gets the subalterno value for this AnagraficaStrutturaRicettiva.
     * 
     * @return subalterno
     */
    public java.lang.String getSubalterno() {
        return subalterno;
    }


    /**
     * Sets the subalterno value for this AnagraficaStrutturaRicettiva.
     * 
     * @param subalterno
     */
    public void setSubalterno(java.lang.String subalterno) {
        this.subalterno = subalterno;
    }


    /**
     * Gets the superficie value for this AnagraficaStrutturaRicettiva.
     * 
     * @return superficie
     */
    public java.math.BigDecimal getSuperficie() {
        return superficie;
    }


    /**
     * Sets the superficie value for this AnagraficaStrutturaRicettiva.
     * 
     * @param superficie
     */
    public void setSuperficie(java.math.BigDecimal superficie) {
        this.superficie = superficie;
    }


    /**
     * Gets the postiLetto value for this AnagraficaStrutturaRicettiva.
     * 
     * @return postiLetto
     */
    public java.lang.Integer getPostiLetto() {
        return postiLetto;
    }


    /**
     * Sets the postiLetto value for this AnagraficaStrutturaRicettiva.
     * 
     * @param postiLetto
     */
    public void setPostiLetto(java.lang.Integer postiLetto) {
        this.postiLetto = postiLetto;
    }


    /**
     * Gets the piano value for this AnagraficaStrutturaRicettiva.
     * 
     * @return piano
     */
    public java.lang.String getPiano() {
        return piano;
    }


    /**
     * Sets the piano value for this AnagraficaStrutturaRicettiva.
     * 
     * @param piano
     */
    public void setPiano(java.lang.String piano) {
        this.piano = piano;
    }


    /**
     * Gets the numAlloggiTotali value for this AnagraficaStrutturaRicettiva.
     * 
     * @return numAlloggiTotali
     */
    public java.lang.Integer getNumAlloggiTotali() {
        return numAlloggiTotali;
    }


    /**
     * Sets the numAlloggiTotali value for this AnagraficaStrutturaRicettiva.
     * 
     * @param numAlloggiTotali
     */
    public void setNumAlloggiTotali(java.lang.Integer numAlloggiTotali) {
        this.numAlloggiTotali = numAlloggiTotali;
    }


    /**
     * Gets the numAlloggiAttivi value for this AnagraficaStrutturaRicettiva.
     * 
     * @return numAlloggiAttivi
     */
    public java.lang.Integer getNumAlloggiAttivi() {
        return numAlloggiAttivi;
    }


    /**
     * Sets the numAlloggiAttivi value for this AnagraficaStrutturaRicettiva.
     * 
     * @param numAlloggiAttivi
     */
    public void setNumAlloggiAttivi(java.lang.Integer numAlloggiAttivi) {
        this.numAlloggiAttivi = numAlloggiAttivi;
    }


    /**
     * Gets the statoComunicazione value for this AnagraficaStrutturaRicettiva.
     * 
     * @return statoComunicazione
     */
    public java.lang.String getStatoComunicazione() {
        return statoComunicazione;
    }


    /**
     * Sets the statoComunicazione value for this AnagraficaStrutturaRicettiva.
     * 
     * @param statoComunicazione
     */
    public void setStatoComunicazione(java.lang.String statoComunicazione) {
        this.statoComunicazione = statoComunicazione;
    }


    /**
     * Gets the codiceIstat value for this AnagraficaStrutturaRicettiva.
     * 
     * @return codiceIstat
     */
    public java.lang.String getCodiceIstat() {
        return codiceIstat;
    }


    /**
     * Sets the codiceIstat value for this AnagraficaStrutturaRicettiva.
     * 
     * @param codiceIstat
     */
    public void setCodiceIstat(java.lang.String codiceIstat) {
        this.codiceIstat = codiceIstat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnagraficaStrutturaRicettiva)) return false;
        AnagraficaStrutturaRicettiva other = (AnagraficaStrutturaRicettiva) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chiaveStrutturaRicettiva==null && other.getChiaveStrutturaRicettiva()==null) || 
             (this.chiaveStrutturaRicettiva!=null &&
              this.chiaveStrutturaRicettiva.equals(other.getChiaveStrutturaRicettiva()))) &&
            ((this.codiceBelfiore==null && other.getCodiceBelfiore()==null) || 
             (this.codiceBelfiore!=null &&
              this.codiceBelfiore.equals(other.getCodiceBelfiore()))) &&
            ((this.codiceAutorizzazione==null && other.getCodiceAutorizzazione()==null) || 
             (this.codiceAutorizzazione!=null &&
              this.codiceAutorizzazione.equals(other.getCodiceAutorizzazione()))) &&
            ((this.partitaIVAStruttura==null && other.getPartitaIVAStruttura()==null) || 
             (this.partitaIVAStruttura!=null &&
              this.partitaIVAStruttura.equals(other.getPartitaIVAStruttura()))) &&
            ((this.ragioneSocialeStruttura==null && other.getRagioneSocialeStruttura()==null) || 
             (this.ragioneSocialeStruttura!=null &&
              this.ragioneSocialeStruttura.equals(other.getRagioneSocialeStruttura()))) &&
            ((this.insegnaStruttura==null && other.getInsegnaStruttura()==null) || 
             (this.insegnaStruttura!=null &&
              this.insegnaStruttura.equals(other.getInsegnaStruttura()))) &&
            ((this.anagraficaTitolare==null && other.getAnagraficaTitolare()==null) || 
             (this.anagraficaTitolare!=null &&
              this.anagraficaTitolare.equals(other.getAnagraficaTitolare()))) &&
            ((this.codFiscaleTitolare==null && other.getCodFiscaleTitolare()==null) || 
             (this.codFiscaleTitolare!=null &&
              this.codFiscaleTitolare.equals(other.getCodFiscaleTitolare()))) &&
            ((this.indirizzoStruttura==null && other.getIndirizzoStruttura()==null) || 
             (this.indirizzoStruttura!=null &&
              this.indirizzoStruttura.equals(other.getIndirizzoStruttura()))) &&
            ((this.capStruttura==null && other.getCapStruttura()==null) || 
             (this.capStruttura!=null &&
              this.capStruttura.equals(other.getCapStruttura()))) &&
            ((this.chiaveTipologiaStruttura==null && other.getChiaveTipologiaStruttura()==null) || 
             (this.chiaveTipologiaStruttura!=null &&
              this.chiaveTipologiaStruttura.equals(other.getChiaveTipologiaStruttura()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.flagPrimoAccesso==null && other.getFlagPrimoAccesso()==null) || 
             (this.flagPrimoAccesso!=null &&
              this.flagPrimoAccesso.equals(other.getFlagPrimoAccesso()))) &&
            ((this.codiceUtente==null && other.getCodiceUtente()==null) || 
             (this.codiceUtente!=null &&
              this.codiceUtente.equals(other.getCodiceUtente()))) &&
            ((this.codiceEnteGestionaleEntrate==null && other.getCodiceEnteGestionaleEntrate()==null) || 
             (this.codiceEnteGestionaleEntrate!=null &&
              this.codiceEnteGestionaleEntrate.equals(other.getCodiceEnteGestionaleEntrate()))) &&
            ((this.impostaServizioGestionaleEntrate==null && other.getImpostaServizioGestionaleEntrate()==null) || 
             (this.impostaServizioGestionaleEntrate!=null &&
              this.impostaServizioGestionaleEntrate.equals(other.getImpostaServizioGestionaleEntrate()))) &&
            ((this.codiceContribuenteGestionaleEntrate==null && other.getCodiceContribuenteGestionaleEntrate()==null) || 
             (this.codiceContribuenteGestionaleEntrate!=null &&
              this.codiceContribuenteGestionaleEntrate.equals(other.getCodiceContribuenteGestionaleEntrate()))) &&
            ((this.dataUltimoAggiornamento==null && other.getDataUltimoAggiornamento()==null) || 
             (this.dataUltimoAggiornamento!=null &&
              this.dataUltimoAggiornamento.equals(other.getDataUltimoAggiornamento()))) &&
            ((this.operatoreUltimoAggiornamento==null && other.getOperatoreUltimoAggiornamento()==null) || 
             (this.operatoreUltimoAggiornamento!=null &&
              this.operatoreUltimoAggiornamento.equals(other.getOperatoreUltimoAggiornamento()))) &&
            ((this.emailPec==null && other.getEmailPec()==null) || 
             (this.emailPec!=null &&
              this.emailPec.equals(other.getEmailPec()))) &&
            ((this.flagSubentro==null && other.getFlagSubentro()==null) || 
             (this.flagSubentro!=null &&
              this.flagSubentro.equals(other.getFlagSubentro()))) &&
            ((this.dataValiditaInizio==null && other.getDataValiditaInizio()==null) || 
             (this.dataValiditaInizio!=null &&
              this.dataValiditaInizio.equals(other.getDataValiditaInizio()))) &&
            ((this.dataValiditaFine==null && other.getDataValiditaFine()==null) || 
             (this.dataValiditaFine!=null &&
              this.dataValiditaFine.equals(other.getDataValiditaFine()))) &&
            ((this.dataObbligoComunicazioneInizio==null && other.getDataObbligoComunicazioneInizio()==null) || 
             (this.dataObbligoComunicazioneInizio!=null &&
              this.dataObbligoComunicazioneInizio.equals(other.getDataObbligoComunicazioneInizio()))) &&
            ((this.dataObbligoComunicazioneFine==null && other.getDataObbligoComunicazioneFine()==null) || 
             (this.dataObbligoComunicazioneFine!=null &&
              this.dataObbligoComunicazioneFine.equals(other.getDataObbligoComunicazioneFine()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.codiceAutorizzazionePrincipale==null && other.getCodiceAutorizzazionePrincipale()==null) || 
             (this.codiceAutorizzazionePrincipale!=null &&
              this.codiceAutorizzazionePrincipale.equals(other.getCodiceAutorizzazionePrincipale()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.dataNascitaTitolare==null && other.getDataNascitaTitolare()==null) || 
             (this.dataNascitaTitolare!=null &&
              this.dataNascitaTitolare.equals(other.getDataNascitaTitolare()))) &&
            ((this.provinciaTitolare==null && other.getProvinciaTitolare()==null) || 
             (this.provinciaTitolare!=null &&
              this.provinciaTitolare.equals(other.getProvinciaTitolare()))) &&
            ((this.comuneTitolare==null && other.getComuneTitolare()==null) || 
             (this.comuneTitolare!=null &&
              this.comuneTitolare.equals(other.getComuneTitolare()))) &&
            ((this.dataNascitaGestore==null && other.getDataNascitaGestore()==null) || 
             (this.dataNascitaGestore!=null &&
              this.dataNascitaGestore.equals(other.getDataNascitaGestore()))) &&
            ((this.provinciaGestore==null && other.getProvinciaGestore()==null) || 
             (this.provinciaGestore!=null &&
              this.provinciaGestore.equals(other.getProvinciaGestore()))) &&
            ((this.comuneGestore==null && other.getComuneGestore()==null) || 
             (this.comuneGestore!=null &&
              this.comuneGestore.equals(other.getComuneGestore()))) &&
            ((this.codFiscaleGestore==null && other.getCodFiscaleGestore()==null) || 
             (this.codFiscaleGestore!=null &&
              this.codFiscaleGestore.equals(other.getCodFiscaleGestore()))) &&
            ((this.anagraficaGestore==null && other.getAnagraficaGestore()==null) || 
             (this.anagraficaGestore!=null &&
              this.anagraficaGestore.equals(other.getAnagraficaGestore()))) &&
            ((this.pinCodeMail==null && other.getPinCodeMail()==null) || 
             (this.pinCodeMail!=null &&
              this.pinCodeMail.equals(other.getPinCodeMail()))) &&
            ((this.pinCodeMailPec==null && other.getPinCodeMailPec()==null) || 
             (this.pinCodeMailPec!=null &&
              this.pinCodeMailPec.equals(other.getPinCodeMailPec()))) &&
            ((this.flagValidazioneMail==null && other.getFlagValidazioneMail()==null) || 
             (this.flagValidazioneMail!=null &&
              this.flagValidazioneMail.equals(other.getFlagValidazioneMail()))) &&
            ((this.flagValidazioneMailPec==null && other.getFlagValidazioneMailPec()==null) || 
             (this.flagValidazioneMailPec!=null &&
              this.flagValidazioneMailPec.equals(other.getFlagValidazioneMailPec()))) &&
            ((this.flagPrincipale==null && other.getFlagPrincipale()==null) || 
             (this.flagPrincipale!=null &&
              this.flagPrincipale.equals(other.getFlagPrincipale()))) &&
            ((this.comuneCatastale==null && other.getComuneCatastale()==null) || 
             (this.comuneCatastale!=null &&
              this.comuneCatastale.equals(other.getComuneCatastale()))) &&
            ((this.particellaEdificiale==null && other.getParticellaEdificiale()==null) || 
             (this.particellaEdificiale!=null &&
              this.particellaEdificiale.equals(other.getParticellaEdificiale()))) &&
            ((this.subalterno==null && other.getSubalterno()==null) || 
             (this.subalterno!=null &&
              this.subalterno.equals(other.getSubalterno()))) &&
            ((this.superficie==null && other.getSuperficie()==null) || 
             (this.superficie!=null &&
              this.superficie.equals(other.getSuperficie()))) &&
            ((this.postiLetto==null && other.getPostiLetto()==null) || 
             (this.postiLetto!=null &&
              this.postiLetto.equals(other.getPostiLetto()))) &&
            ((this.piano==null && other.getPiano()==null) || 
             (this.piano!=null &&
              this.piano.equals(other.getPiano()))) &&
            ((this.numAlloggiTotali==null && other.getNumAlloggiTotali()==null) || 
             (this.numAlloggiTotali!=null &&
              this.numAlloggiTotali.equals(other.getNumAlloggiTotali()))) &&
            ((this.numAlloggiAttivi==null && other.getNumAlloggiAttivi()==null) || 
             (this.numAlloggiAttivi!=null &&
              this.numAlloggiAttivi.equals(other.getNumAlloggiAttivi()))) &&
            ((this.statoComunicazione==null && other.getStatoComunicazione()==null) || 
             (this.statoComunicazione!=null &&
              this.statoComunicazione.equals(other.getStatoComunicazione()))) &&
            ((this.codiceIstat==null && other.getCodiceIstat()==null) || 
             (this.codiceIstat!=null &&
              this.codiceIstat.equals(other.getCodiceIstat())));
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
        if (getChiaveStrutturaRicettiva() != null) {
            _hashCode += getChiaveStrutturaRicettiva().hashCode();
        }
        if (getCodiceBelfiore() != null) {
            _hashCode += getCodiceBelfiore().hashCode();
        }
        if (getCodiceAutorizzazione() != null) {
            _hashCode += getCodiceAutorizzazione().hashCode();
        }
        if (getPartitaIVAStruttura() != null) {
            _hashCode += getPartitaIVAStruttura().hashCode();
        }
        if (getRagioneSocialeStruttura() != null) {
            _hashCode += getRagioneSocialeStruttura().hashCode();
        }
        if (getInsegnaStruttura() != null) {
            _hashCode += getInsegnaStruttura().hashCode();
        }
        if (getAnagraficaTitolare() != null) {
            _hashCode += getAnagraficaTitolare().hashCode();
        }
        if (getCodFiscaleTitolare() != null) {
            _hashCode += getCodFiscaleTitolare().hashCode();
        }
        if (getIndirizzoStruttura() != null) {
            _hashCode += getIndirizzoStruttura().hashCode();
        }
        if (getCapStruttura() != null) {
            _hashCode += getCapStruttura().hashCode();
        }
        if (getChiaveTipologiaStruttura() != null) {
            _hashCode += getChiaveTipologiaStruttura().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFlagPrimoAccesso() != null) {
            _hashCode += getFlagPrimoAccesso().hashCode();
        }
        if (getCodiceUtente() != null) {
            _hashCode += getCodiceUtente().hashCode();
        }
        if (getCodiceEnteGestionaleEntrate() != null) {
            _hashCode += getCodiceEnteGestionaleEntrate().hashCode();
        }
        if (getImpostaServizioGestionaleEntrate() != null) {
            _hashCode += getImpostaServizioGestionaleEntrate().hashCode();
        }
        if (getCodiceContribuenteGestionaleEntrate() != null) {
            _hashCode += getCodiceContribuenteGestionaleEntrate().hashCode();
        }
        if (getDataUltimoAggiornamento() != null) {
            _hashCode += getDataUltimoAggiornamento().hashCode();
        }
        if (getOperatoreUltimoAggiornamento() != null) {
            _hashCode += getOperatoreUltimoAggiornamento().hashCode();
        }
        if (getEmailPec() != null) {
            _hashCode += getEmailPec().hashCode();
        }
        if (getFlagSubentro() != null) {
            _hashCode += getFlagSubentro().hashCode();
        }
        if (getDataValiditaInizio() != null) {
            _hashCode += getDataValiditaInizio().hashCode();
        }
        if (getDataValiditaFine() != null) {
            _hashCode += getDataValiditaFine().hashCode();
        }
        if (getDataObbligoComunicazioneInizio() != null) {
            _hashCode += getDataObbligoComunicazioneInizio().hashCode();
        }
        if (getDataObbligoComunicazioneFine() != null) {
            _hashCode += getDataObbligoComunicazioneFine().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getCodiceAutorizzazionePrincipale() != null) {
            _hashCode += getCodiceAutorizzazionePrincipale().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getDataNascitaTitolare() != null) {
            _hashCode += getDataNascitaTitolare().hashCode();
        }
        if (getProvinciaTitolare() != null) {
            _hashCode += getProvinciaTitolare().hashCode();
        }
        if (getComuneTitolare() != null) {
            _hashCode += getComuneTitolare().hashCode();
        }
        if (getDataNascitaGestore() != null) {
            _hashCode += getDataNascitaGestore().hashCode();
        }
        if (getProvinciaGestore() != null) {
            _hashCode += getProvinciaGestore().hashCode();
        }
        if (getComuneGestore() != null) {
            _hashCode += getComuneGestore().hashCode();
        }
        if (getCodFiscaleGestore() != null) {
            _hashCode += getCodFiscaleGestore().hashCode();
        }
        if (getAnagraficaGestore() != null) {
            _hashCode += getAnagraficaGestore().hashCode();
        }
        if (getPinCodeMail() != null) {
            _hashCode += getPinCodeMail().hashCode();
        }
        if (getPinCodeMailPec() != null) {
            _hashCode += getPinCodeMailPec().hashCode();
        }
        if (getFlagValidazioneMail() != null) {
            _hashCode += getFlagValidazioneMail().hashCode();
        }
        if (getFlagValidazioneMailPec() != null) {
            _hashCode += getFlagValidazioneMailPec().hashCode();
        }
        if (getFlagPrincipale() != null) {
            _hashCode += getFlagPrincipale().hashCode();
        }
        if (getComuneCatastale() != null) {
            _hashCode += getComuneCatastale().hashCode();
        }
        if (getParticellaEdificiale() != null) {
            _hashCode += getParticellaEdificiale().hashCode();
        }
        if (getSubalterno() != null) {
            _hashCode += getSubalterno().hashCode();
        }
        if (getSuperficie() != null) {
            _hashCode += getSuperficie().hashCode();
        }
        if (getPostiLetto() != null) {
            _hashCode += getPostiLetto().hashCode();
        }
        if (getPiano() != null) {
            _hashCode += getPiano().hashCode();
        }
        if (getNumAlloggiTotali() != null) {
            _hashCode += getNumAlloggiTotali().hashCode();
        }
        if (getNumAlloggiAttivi() != null) {
            _hashCode += getNumAlloggiAttivi().hashCode();
        }
        if (getStatoComunicazione() != null) {
            _hashCode += getStatoComunicazione().hashCode();
        }
        if (getCodiceIstat() != null) {
            _hashCode += getCodiceIstat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnagraficaStrutturaRicettiva.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chiaveStrutturaRicettiva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "chiaveStrutturaRicettiva"));
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
        elemField.setFieldName("codiceAutorizzazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceAutorizzazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitaIVAStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "partitaIVAStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ragioneSocialeStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ragioneSocialeStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insegnaStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "insegnaStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaTitolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "anagraficaTitolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFiscaleTitolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codFiscaleTitolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indirizzoStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "indirizzoStruttura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capStruttura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "capStruttura"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagPrimoAccesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagPrimoAccesso"));
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
        elemField.setFieldName("codiceEnteGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceEnteGestionaleEntrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostaServizioGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "impostaServizioGestionaleEntrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceContribuenteGestionaleEntrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceContribuenteGestionaleEntrate"));
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
        elemField.setFieldName("emailPec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "emailPec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagSubentro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagSubentro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValiditaInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataValiditaInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValiditaFine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataValiditaFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataObbligoComunicazioneInizio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataObbligoComunicazioneInizio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataObbligoComunicazioneFine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataObbligoComunicazioneFine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceAutorizzazionePrincipale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceAutorizzazionePrincipale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascitaTitolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataNascitaTitolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaTitolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "provinciaTitolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuneTitolare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "comuneTitolare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascitaGestore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "dataNascitaGestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinciaGestore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "provinciaGestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuneGestore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "comuneGestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFiscaleGestore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codFiscaleGestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anagraficaGestore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "anagraficaGestore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinCodeMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "pinCodeMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinCodeMailPec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "pinCodeMailPec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagValidazioneMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagValidazioneMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagValidazioneMailPec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagValidazioneMailPec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagPrincipale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "flagPrincipale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comuneCatastale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "comuneCatastale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particellaEdificiale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "particellaEdificiale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subalterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "subalterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superficie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "superficie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postiLetto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "postiLetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "piano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAlloggiTotali");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numAlloggiTotali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAlloggiAttivi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "numAlloggiAttivi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statoComunicazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "statoComunicazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiceIstat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "codiceIstat"));
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
