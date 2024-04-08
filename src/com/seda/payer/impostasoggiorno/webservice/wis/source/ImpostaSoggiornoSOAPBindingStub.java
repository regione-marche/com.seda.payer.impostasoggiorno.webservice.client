/**
 * ImpostaSoggiornoSOAPBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.source;

public class ImpostaSoggiornoSOAPBindingStub extends org.apache.axis.client.Stub implements com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[28];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("verificaAutorizzazioneStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "VerificaAutorizzazioneStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAutorizzazioneStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAutorizzazioneStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "VerificaAutorizzazioneStrutturaResponse"));
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
        oper.setName("saveAnagraficaToHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "SaveAnagraficaToHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveAnagraficaToHostRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveAnagraficaToHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "SaveAnagraficaToHostResponse"));
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
        oper.setName("recuperaListaTipologieStrutture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologieStruttureRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieStruttureRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieStruttureResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologieStruttureResponse"));
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
        oper.setName("recuperaListaTipologieSoggettiBelf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologieSoggettiBelfRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieSoggettiBelfRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieSoggettiBelfResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaTipologieSoggettiBelfResponse"));
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
        oper.setName("recuperaTariffaImpostaSoggiornoStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffaImpostaSoggiornoStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaImpostaSoggiornoStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaImpostaSoggiornoStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaTariffaImpostaSoggiornoStrutturaResponse"));
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
        oper.setName("inserisciComunicazione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "InserisciComunicazioneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciComunicazioneRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciComunicazioneResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "InserisciComunicazioneResponse"));
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
        oper.setName("aggiornaComunicazione");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "AggiornaComunicazioneRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaComunicazioneRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaComunicazioneResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "AggiornaComunicazioneResponse"));
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
        oper.setName("recuperaListaComunicazioni");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniResponse"));
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
        oper.setName("verificaAbilitazioneRIDHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "VerificaAbilitazioneRIDHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAbilitazioneRIDHostRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAbilitazioneRIDHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "VerificaAbilitazioneRIDHostResponse"));
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
        oper.setName("recuperaDettaglioComunicazioneAggregato");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettaglioComunicazioneAggregatoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioComunicazioneAggregatoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioComunicazioneAggregatoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettaglioComunicazioneAggregatoResponse"));
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
        oper.setName("stampaAvvisoComunicazionePdf");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "StampaAvvisoComunicazionePdfRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">StampaAvvisoComunicazionePdfRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">StampaAvvisoComunicazionePdfResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "StampaAvvisoComunicazionePdfResponse"));
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
        oper.setName("saveComunicazioneToHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "SaveComunicazioneToHostRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveComunicazioneToHostRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveComunicazioneToHostResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "SaveComunicazioneToHostResponse"));
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
        oper.setName("inserisciCompilazioneDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "InserisciCompilazioneDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciCompilazioneDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciCompilazioneDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "InserisciCompilazioneDiarioResponse"));
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
        oper.setName("aggiornaCompilazioneDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "AggiornaCompilazioneDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaCompilazioneDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaCompilazioneDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "AggiornaCompilazioneDiarioResponse"));
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
        oper.setName("eliminaCompilazioneDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "EliminaCompilazioneDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">EliminaCompilazioneDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">EliminaCompilazioneDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "EliminaCompilazioneDiarioResponse"));
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
        oper.setName("controllaOverlayPeriodoDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ControllaOverlayPeriodoDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaOverlayPeriodoDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaOverlayPeriodoDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ControllaOverlayPeriodoDiarioResponse"));
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
        oper.setName("recuperaListaCompilazioniDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaCompilazioniDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaCompilazioniDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaCompilazioniDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaCompilazioniDiarioResponse"));
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
        oper.setName("recuperaDettagliAggregatiDiario");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettagliAggregatiDiarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettagliAggregatiDiarioRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettagliAggregatiDiarioResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettagliAggregatiDiarioResponse"));
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
        oper.setName("recuperaDettaglioDiarioCompleto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettaglioDiarioCompletoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaDettaglioDiarioCompletoResponse"));
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
        oper.setName("recuperaListaFasceTariffa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaFasceTariffaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaFasceTariffaResponse"));
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
        oper.setName("recuperaListaComunicazioniSecondarie");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniSecondarieRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniSecondarieRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniSecondarieResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListaComunicazioniSecondarieResponse"));
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
        oper.setName("controllaComunicazioniSecondarie");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ControllaComunicazioniSecondarieRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaComunicazioniSecondarieRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaComunicazioniSecondarieResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "ControllaComunicazioniSecondarieResponse"));
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
        oper.setName("getDatiBollettino");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "GetDatiBollettinoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "GetDatiBollettinoResponse"));
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
        oper.setName("getBollettinoCumulativo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "GetBollettinoCumulativoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetBollettinoCumulativoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetBollettinoCumulativoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "GetBollettinoCumulativoResponse"));
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
        oper.setName("getDdlAlloggi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "DdlAlloggiRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">DdlAlloggiRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">DdlAlloggiResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "DdlAlloggiResponse"));
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
        oper.setName("getRiepilogoIS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RiepilogoImpostaSoggiornoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RiepilogoImpostaSoggiornoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RiepilogoImpostaSoggiornoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RiepilogoImpostaSoggiornoResponse"));
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
        oper.setName("recuperaListTariffeImpostaSoggiornoStruttura");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListTariffeImpostaSoggiornoStrutturaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListTariffeImpostaSoggiornoStrutturaRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListTariffeImpostaSoggiornoStrutturaResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "RecuperaListTariffeImpostaSoggiornoStrutturaResponse"));
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
        oper.setName("checkComunicazioniBollettinoCumulativo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "CheckComunicazioniBollettinoCumulativoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">CheckComunicazioniBollettinoCumulativoRequest"), com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">CheckComunicazioniBollettinoCumulativoResponse"));
        oper.setReturnClass(com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", "CheckComunicazioniBollettinoCumulativoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "Fault"),
                      "com.seda.payer.impostasoggiorno.webservice.srv.FaultType",
                      new javax.xml.namespace.QName("http://srv.webservice.impostasoggiorno.payer.seda.com", "FaultType"), 
                      true
                     ));
        _operations[27] = oper;

    }

    public ImpostaSoggiornoSOAPBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ImpostaSoggiornoSOAPBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ImpostaSoggiornoSOAPBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", ">AnagraficaStrutturaRicettiva>flagSubentro");
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

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioComunicazioneImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.DettaglioComunicazioneImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "DettaglioDiarioImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.DettaglioDiarioImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "ModalitaPagamento");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.ModalitaPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TestataDiarioImpostaSoggiorno");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TestataDiarioImpostaSoggiorno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipoComunicazione");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TipoComunicazione.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.webservice.impostasoggiorno.payer.seda.com", "TipologiaStrutturaRicettiva");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.dati.TipologiaStrutturaRicettiva.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaCompilazioneDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaCompilazioneDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaComunicazioneResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>AggiornaComunicazioneResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>CheckComunicazioniBollettinoCumulativoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>CheckComunicazioniBollettinoCumulativoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>ControllaComunicazioniSecondarieResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>ControllaComunicazioniSecondarieResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>ControllaOverlayPeriodoDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>ControllaOverlayPeriodoDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>DdlAlloggiResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>DdlAlloggiResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>EliminaCompilazioneDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>EliminaCompilazioneDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>GetBollettinoCumulativoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>GetBollettinoCumulativoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>GetDatiBollettinoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>GetDatiBollettinoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>InserisciCompilazioneDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>InserisciCompilazioneDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>InserisciComunicazioneResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>InserisciComunicazioneResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettagliAggregatiDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettagliAggregatiDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettaglioComunicazioneAggregatoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettaglioComunicazioneAggregatoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettaglioDiarioCompletoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaDettaglioDiarioCompletoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaCompilazioniDiarioResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaCompilazioniDiarioResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaComunicazioniResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaComunicazioniResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaComunicazioniSecondarieResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaComunicazioniSecondarieResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaFasceTariffaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaFasceTariffaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologieSoggettiBelfResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologieSoggettiBelfResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologieStruttureResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListaTipologieStruttureResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListTariffeImpostaSoggiornoStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaListTariffeImpostaSoggiornoStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTariffaImpostaSoggiornoStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RecuperaTariffaImpostaSoggiornoStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RiepilogoImpostaSoggiornoResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>RiepilogoImpostaSoggiornoResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveAnagraficaToHostRequest>tipoRichiesta");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequestTipoRichiesta.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveAnagraficaToHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveAnagraficaToHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveComunicazioneToHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>SaveComunicazioneToHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>StampaAvvisoComunicazionePdfResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>StampaAvvisoComunicazionePdfResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>VerificaAbilitazioneRIDHostResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>VerificaAbilitazioneRIDHostResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>VerificaAutorizzazioneStrutturaResponse>retCode");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">>VerificaAutorizzazioneStrutturaResponse>retMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaCompilazioneDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaCompilazioneDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaComunicazioneRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">AggiornaComunicazioneResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">CheckComunicazioniBollettinoCumulativoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">CheckComunicazioniBollettinoCumulativoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaComunicazioniSecondarieRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaComunicazioniSecondarieResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaOverlayPeriodoDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">ControllaOverlayPeriodoDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">DdlAlloggiRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">DdlAlloggiResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);
            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">EliminaCompilazioneDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">EliminaCompilazioneDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetBollettinoCumulativoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetBollettinoCumulativoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">GetDatiBollettinoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciCompilazioneDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciCompilazioneDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciComunicazioneRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">InserisciComunicazioneResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettagliAggregatiDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettagliAggregatiDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioComunicazioneAggregatoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioComunicazioneAggregatoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaDettaglioDiarioCompletoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaCompilazioniDiarioRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaCompilazioniDiarioResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniSecondarieRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaComunicazioniSecondarieResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaFasceTariffaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieSoggettiBelfRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfRequest.class;
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
            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieSoggettiBelfResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieStruttureRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListaTipologieStruttureResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListTariffeImpostaSoggiornoStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaListTariffeImpostaSoggiornoStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaImpostaSoggiornoStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RecuperaTariffaImpostaSoggiornoStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RiepilogoImpostaSoggiornoRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">RiepilogoImpostaSoggiornoResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveAnagraficaToHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveAnagraficaToHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveComunicazioneToHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">SaveComunicazioneToHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">StampaAvvisoComunicazionePdfRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">StampaAvvisoComunicazionePdfResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAbilitazioneRIDHostRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAbilitazioneRIDHostResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAutorizzazioneStrutturaRequest");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://dati.wis.webservice.impostasoggiorno.payer.seda.com", ">VerificaAutorizzazioneStrutturaResponse");
            cachedSerQNames.add(qName);
            cls = com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse.class;
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse verificaAutorizzazioneStruttura(com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaAutorizzazioneStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAutorizzazioneStrutturaResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse saveAnagraficaToHost(com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "saveAnagraficaToHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveAnagraficaToHostResponse.class);
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
 finally {
		System.out.println("saveAnagraficaToHost - requestXML: " + _call.getMessageContext().getRequestMessage().getSOAPPartAsString());
	    System.out.println("saveAnagraficaToHost - responseXML: " + _call.getMessageContext().getResponseMessage().getSOAPPartAsString());
		//20190129 CT - fine
	  }  
 }
 

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse recuperaListaTipologieStrutture(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaTipologieStrutture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieStruttureResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse recuperaListaTipologieSoggettiBelf(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaTipologieSoggettiBelf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaTipologieSoggettiBelfResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse recuperaTariffaImpostaSoggiornoStruttura(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaTariffaImpostaSoggiornoStruttura")); 

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaTariffaImpostaSoggiornoStrutturaResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse inserisciComunicazione(com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciComunicazione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciComunicazioneResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse aggiornaComunicazione(com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaComunicazione"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaComunicazioneResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse recuperaListaComunicazioni(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse verificaAbilitazioneRIDHost(com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "verificaAbilitazioneRIDHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.VerificaAbilitazioneRIDHostResponse.class);
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
 finally {
		System.out.println("verificaAbilitazioneRIDHost - requestXML: " + _call.getMessageContext().getRequestMessage().getSOAPPartAsString());
	    System.out.println("verificaAbilitazioneRIDHost - responseXML: " + _call.getMessageContext().getResponseMessage().getSOAPPartAsString());
		//20190129 CT - fine
	  }  
}

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse recuperaDettaglioComunicazioneAggregato(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaDettaglioComunicazioneAggregato"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioComunicazioneAggregatoResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse stampaAvvisoComunicazionePdf(com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "stampaAvvisoComunicazionePdf"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.StampaAvvisoComunicazionePdfResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse saveComunicazioneToHost(com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "saveComunicazioneToHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.SaveComunicazioneToHostResponse.class);
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
 finally {
		System.out.println("saveComunicazioneToHost - requestXML: " + _call.getMessageContext().getRequestMessage().getSOAPPartAsString());
	    System.out.println("saveComunicazioneToHost - responseXML: " + _call.getMessageContext().getResponseMessage().getSOAPPartAsString());
		//20190129 CT - fine
	  }  
}


    public com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse inserisciCompilazioneDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "inserisciCompilazioneDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.InserisciCompilazioneDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse aggiornaCompilazioneDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "aggiornaCompilazioneDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.AggiornaCompilazioneDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse eliminaCompilazioneDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "eliminaCompilazioneDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.EliminaCompilazioneDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse controllaOverlayPeriodoDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "controllaOverlayPeriodoDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaOverlayPeriodoDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse recuperaListaCompilazioniDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaCompilazioniDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaCompilazioniDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse recuperaDettagliAggregatiDiario(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaDettagliAggregatiDiario"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettagliAggregatiDiarioResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse recuperaDettaglioDiarioCompleto(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaDettaglioDiarioCompleto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaDettaglioDiarioCompletoResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse recuperaListaFasceTariffa(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaFasceTariffaResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse recuperaListaComunicazioniSecondarie(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListaComunicazioniSecondarie"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListaComunicazioniSecondarieResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse controllaComunicazioniSecondarie(com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "controllaComunicazioniSecondarie"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.ControllaComunicazioniSecondarieResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse getDatiBollettino(com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDatiBollettino"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.GetDatiBollettinoResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse getBollettinoCumulativo(com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getBollettinoCumulativo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.GetBollettinoCumulativoResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse getDdlAlloggi(com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getDdlAlloggi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.DdlAlloggiResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse getRiepilogoIS(com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "getRiepilogoIS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RiepilogoImpostaSoggiornoResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse recuperaListTariffeImpostaSoggiornoStruttura(com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "recuperaListTariffeImpostaSoggiornoStruttura"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.RecuperaListTariffeImpostaSoggiornoStrutturaResponse.class);
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

    public com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse checkComunicazioniBollettinoCumulativo(com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoRequest in) throws java.rmi.RemoteException, com.seda.payer.impostasoggiorno.webservice.srv.FaultType {
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
        _call.setOperationName(new javax.xml.namespace.QName("", "checkComunicazioniBollettinoCumulativo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seda.payer.impostasoggiorno.webservice.wis.dati.CheckComunicazioniBollettinoCumulativoResponse.class);
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
