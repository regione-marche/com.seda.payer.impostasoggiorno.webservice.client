/**
 * ImpostaSoggiornoConfigSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.configurazione.source;

public class ImpostaSoggiornoConfigSOAPBindingStub extends org.apache.axis.client.Stub implements com.seda.payer.impostasoggiorno.webservice.configurazione.source.ImpostaSoggiornoConfigInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[47];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaAnagraficaStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaAnagraficaStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaAnagraficaStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaAnagraficaStrutturaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciAnagraficaStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciAnagraficaStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciAnagraficaStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciAnagraficaStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciAnagraficaStrutturaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaAnagraficaStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaAnagraficaStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaAnagraficaStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaAnagraficaStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaAnagraficaStrutturaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaAnagraficaStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaAnagraficaStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaAnagraficaStrutturaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaAnagraficaStrutturaCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaAnagraficaStrutturaCatMerceologica");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaCatMerceologicaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCatMerceologicaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCatMerceologicaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaAnagraficaStrutturaCatMerceologicaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaConfigurazioneImpostaSoggiorno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaConfigurazioneImpostaSoggiornoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaConfigurazioneImpostaSoggiornoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaConfigurazioneImpostaSoggiornoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaConfigurazioneImpostaSoggiornoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTipologiaStrutturaRicettiva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaStrutturaRicettivaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaStrutturaRicettivaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaTestataComunicazione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTestataComunicazioneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTestataComunicazioneRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTestataComunicazioneResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTestataComunicazioneResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaTipologiaStrutturaRicettiva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologiaStrutturaRicettivaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaStrutturaRicettivaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaStrutturaRicettivaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologiaStrutturaRicettivaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaTipologiaStrutturaRicettiva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTipologiaStrutturaRicettivaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaStrutturaRicettivaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaStrutturaRicettivaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTipologiaStrutturaRicettivaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciTipologiaStrutturaRicettiva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTipologiaStrutturaRicettivaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaStrutturaRicettivaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaStrutturaRicettivaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTipologiaStrutturaRicettivaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaTipologiaStrutturaRicettiva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTipologiaStrutturaRicettivaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaStrutturaRicettivaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaStrutturaRicettivaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTipologiaStrutturaRicettivaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTipologiaStrutturaRicettivaCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaStrutturaRicettivaCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaStrutturaRicettivaCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaTipologiaSoggetto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologiaSoggettoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaSoggettoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaSoggettoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologiaSoggettoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaTipologiaSoggetto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTipologiaSoggettoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaSoggettoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaSoggettoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTipologiaSoggettoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciTipologiaSoggetto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTipologiaSoggettoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaSoggettoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaSoggettoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTipologiaSoggettoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaTipologiaSoggetto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTipologiaSoggettoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaSoggettoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaSoggettoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTipologiaSoggettoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTipologiaSoggetto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaSoggettoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettoRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaSoggettoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTipologiaSoggettiCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaSoggettiCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettiCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettiCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTipologiaSoggettiCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaAnagraficaStrutturaToHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaAnagraficaStrutturaToHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaToHostRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaToHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaAnagraficaStrutturaToHostResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaConfigurazioneImpSogg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaConfigurazioneImpSoggRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaConfigurazioneImpSoggRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaConfigurazioneImpSoggResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaConfigurazioneImpSoggResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaConfigurazioneImpSoggToHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaConfigurazioneImpSoggToHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaConfigurazioneImpSoggToHostRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaConfigurazioneImpSoggToHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaConfigurazioneImpSoggToHostResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciConfigurazioneImpSoggToHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciConfigurazioneImpSoggToHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciConfigurazioneImpSoggToHostRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciConfigurazioneImpSoggToHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciConfigurazioneImpSoggToHostResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaConfigurazioneImpSogg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaConfigurazioneImpSoggRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaConfigurazioneImpSoggRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaConfigurazioneImpSoggResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaConfigurazioneImpSoggResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaEntiImposta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaEntiImpostaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaEntiImpostaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaEntiImpostaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaEntiImpostaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaAnagraficaContribuenti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "VerificaAnagraficaContribuentiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaAnagraficaContribuentiRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaAnagraficaContribuentiResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "VerificaAnagraficaContribuentiResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allineaPagamenti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AllineaPagamentiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaPagamentiRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaPagamentiResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AllineaPagamentiResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allineaComunicazioni");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AllineaComunicazioniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaComunicazioniRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaComunicazioniResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AllineaComunicazioniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaTariffaComunicazioni");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "VerificaTariffaComunicazioniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaTariffaComunicazioniRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaTariffaComunicazioniResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "VerificaTariffaComunicazioniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaTariffeCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffeCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffeCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffeCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffeCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaComunicazioni");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaComunicazioniCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProgressivoComunicazione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "GetProgressivoComunicazioneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">GetProgressivoComunicazioneRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">GetProgressivoComunicazioneResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "GetProgressivoComunicazioneResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaListaFasceTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaFasceTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaFasceTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaFasciaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaFasciaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasciaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasciaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaFasciaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inserisciFasciaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciFasciaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciFasciaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciFasciaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "InserisciFasciaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("aggiornaFasciaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaFasciaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaFasciaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaFasciaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "AggiornaFasciaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancellaFasciaTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaFasciaTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaFasciaTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaFasciaTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "CancellaFasciaTariffaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("recuperaFasceTariffeCsv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaFasceTariffeCsvRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasceTariffeCsvRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasceTariffeCsvResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaFasceTariffeCsvResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecuperaListaAnagraficheAlloggiPIva");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaAnagraficheAlloggiPIvaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficheAlloggiPIvaRequest"), com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficheAlloggiPIvaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaAnagraficheAlloggiPIvaResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[46] = oper;

    }

    public ImpostaSoggiornoConfigSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ImpostaSoggiornoConfigSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ImpostaSoggiornoConfigSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaAnagraficaStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaAnagraficaStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaAnagraficaStrutturaToHostRequest>tipoRichiesta");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostRequestTipoRichiesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaAnagraficaStrutturaToHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaAnagraficaStrutturaToHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaConfigurazioneImpSoggToHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaConfigurazioneImpSoggToHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTestataComunicazioneResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTestataComunicazioneResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTipologiaSoggettoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTipologiaSoggettoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTipologiaStrutturaRicettivaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaTipologiaStrutturaRicettivaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaAnagraficaStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaAnagraficaStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaConfigurazioneImpSoggResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaConfigurazioneImpSoggResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaTipologiaSoggettoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaTipologiaSoggettoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaTipologiaStrutturaRicettivaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>CancellaTipologiaStrutturaRicettivaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>GetProgressivoComunicazioneRequest>chiave");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciAnagraficaStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciAnagraficaStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciConfigurazioneImpSoggToHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciConfigurazioneImpSoggToHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciTipologiaSoggettoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciTipologiaSoggettoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciTipologiaStrutturaRicettivaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>InserisciTipologiaStrutturaRicettivaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaAnagraficaStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaAnagraficaStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaConfigurazioneImpostaSoggiornoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaConfigurazioneImpostaSoggiornoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaAnagraficaStrutturaResponse>pageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponsePageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaConfigurazioneImpSoggResponse>pageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponsePageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologiaSoggettoResponse>pageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponsePageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologiaStrutturaRicettivaResponse>pageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponsePageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTipologiaSoggettoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTipologiaSoggettoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTipologiaStrutturaRicettivaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTipologiaStrutturaRicettivaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaToHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaAnagraficaStrutturaToHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaConfigurazioneImpSoggToHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaConfigurazioneImpSoggToHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaFasciaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaFasciaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTestataComunicazioneRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTestataComunicazioneResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaSoggettoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaSoggettoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaStrutturaRicettivaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AggiornaTipologiaStrutturaRicettivaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaComunicazioniRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaComunicazioniResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaPagamentiRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">AllineaPagamentiResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaAnagraficaStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaAnagraficaStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaConfigurazioneImpSoggRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaConfigurazioneImpSoggResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaFasciaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaFasciaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaSoggettoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaSoggettoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaStrutturaRicettivaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">CancellaTipologiaStrutturaRicettivaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">GetProgressivoComunicazioneRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">GetProgressivoComunicazioneResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciAnagraficaStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciAnagraficaStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciConfigurazioneImpSoggToHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciConfigurazioneImpSoggToHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciFasciaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciFasciaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaSoggettoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaSoggettoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaStrutturaRicettivaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">InserisciTipologiaStrutturaRicettivaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCatMerceologicaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCatMerceologicaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaAnagraficaStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaConfigurazioneImpostaSoggiornoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaConfigurazioneImpostaSoggiornoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasceTariffeCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasceTariffeCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasciaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaFasciaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficaStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficheAlloggiPIvaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaAnagraficheAlloggiPIvaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaConfigurazioneImpSoggRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaConfigurazioneImpSoggResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaEntiImpostaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaEntiImpostaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaSoggettoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaSoggettoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaStrutturaRicettivaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologiaStrutturaRicettivaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffeCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffeCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettiCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettiCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaSoggettoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaCsvRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaCsvResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTipologiaStrutturaRicettivaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaAnagraficaContribuentiRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaAnagraficaContribuentiResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaTariffaComunicazioniRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.configurazione.webservice.impostasoggiorno.payer.seda.com", ">VerificaTariffaComunicazioniResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", ">AnagraficaStrutturaRicettiva>flagSubentro");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", ">ResponseType>retCode");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.ResponseTypeRetCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", ">ResponseType>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "AnagraficaStrutturaRicettiva");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.AnagraficaStrutturaRicettiva.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ConfigurazioneImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.ConfigurazioneImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "FasciaTariffaImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.FasciaTariffaImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ModalitaPagamento");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "PageInfo");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.PageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "Paginazione");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.Paginazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ResponseType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "StatoComunicazione");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.StatoComunicazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "StatoDocumento");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.StatoDocumento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TariffaImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TariffaImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataComunicazioneImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TestataComunicazioneImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipoComunicazione");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaSoggetto");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TipologiaSoggetto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaStrutturaRicettiva");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.srv.FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse recuperaAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaAnagraficaStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse aggiornaAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaAnagraficaStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse inserisciAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciAnagraficaStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciAnagraficaStrutturaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse cancellaAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaAnagraficaStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaAnagraficaStrutturaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse recuperaListaAnagraficaStruttura(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaAnagraficaStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficaStrutturaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse recuperaAnagraficaStrutturaCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaAnagraficaStrutturaCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse recuperaAnagraficaStrutturaCatMerceologica(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaAnagraficaStrutturaCatMerceologica"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaAnagraficaStrutturaCatMerceologicaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse recuperaConfigurazioneImpostaSoggiorno(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaConfigurazioneImpostaSoggiorno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaConfigurazioneImpostaSoggiornoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse recuperaTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTipologiaStrutturaRicettiva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse aggiornaTestataComunicazione(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaTestataComunicazione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTestataComunicazioneResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse recuperaListaTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaTipologiaStrutturaRicettiva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaStrutturaRicettivaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse aggiornaTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaTipologiaStrutturaRicettiva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaStrutturaRicettivaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse inserisciTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciTipologiaStrutturaRicettiva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaStrutturaRicettivaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse cancellaTipologiaStrutturaRicettiva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaTipologiaStrutturaRicettiva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaStrutturaRicettivaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse recuperaTipologiaStrutturaRicettivaCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTipologiaStrutturaRicettivaCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaStrutturaRicettivaCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse recuperaListaTipologiaSoggetto(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaTipologiaSoggetto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTipologiaSoggettoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse aggiornaTipologiaSoggetto(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaTipologiaSoggetto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTipologiaSoggettoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse inserisciTipologiaSoggetto(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciTipologiaSoggetto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTipologiaSoggettoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse cancellaTipologiaSoggetto(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaTipologiaSoggetto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTipologiaSoggettoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse recuperaTipologiaSoggetto(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTipologiaSoggetto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse recuperaTipologiaSoggettiCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTipologiaSoggettiCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTipologiaSoggettiCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse aggiornaAnagraficaStrutturaToHost(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaAnagraficaStrutturaToHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaAnagraficaStrutturaToHostResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse recuperaListaConfigurazioneImpSogg(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaConfigurazioneImpSogg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaConfigurazioneImpSoggResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse aggiornaConfigurazioneImpSoggToHost(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaConfigurazioneImpSoggToHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaConfigurazioneImpSoggToHostResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse inserisciConfigurazioneImpSoggToHost(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciConfigurazioneImpSoggToHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciConfigurazioneImpSoggToHostResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse cancellaConfigurazioneImpSogg(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaConfigurazioneImpSogg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaConfigurazioneImpSoggResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse recuperaListaEntiImposta(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaEntiImposta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaEntiImpostaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse verificaAnagraficaContribuenti(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaAnagraficaContribuenti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaAnagraficaContribuentiResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse allineaPagamenti(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "allineaPagamenti"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaPagamentiResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse allineaComunicazioni(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "allineaComunicazioni"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AllineaComunicazioniResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse recuperaListaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse aggiornaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse inserisciTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse cancellaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse recuperaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse verificaTariffaComunicazioni(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaTariffaComunicazioni"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.VerificaTariffaComunicazioniResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse recuperaTariffeCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTariffeCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaTariffeCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse recuperaListaComunicazioni(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaComunicazioni"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse recuperaListaComunicazioniCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaComunicazioniCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaComunicazioniCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse getProgressivoComunicazione(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getProgressivoComunicazione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.GetProgressivoComunicazioneResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse recuperaListaFasceTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaFasceTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaFasceTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse recuperaFasciaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaFasciaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasciaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse inserisciFasciaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciFasciaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.InserisciFasciaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse aggiornaFasciaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaFasciaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.AggiornaFasciaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse cancellaFasciaTariffa(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancellaFasciaTariffa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.CancellaFasciaTariffaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse recuperaFasceTariffeCsv(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaFasceTariffeCsv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaFasceTariffeCsvResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse recuperaListaAnagraficheAlloggiPIva(com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RecuperaListaAnagraficheAlloggiPIva"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.configurazione.dati.RecuperaListaAnagraficheAlloggiPIvaResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.seda.payer.impostasoggiorno.webservice.srv.FaultType) {
              throw (com.seda.payer.impostasoggiorno.webservice.srv.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
