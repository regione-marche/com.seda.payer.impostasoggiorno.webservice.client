/**
 * ImpostaSoggiornoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.payer.impostasoggiorno.webservice.wis.source;

public class ImpostaSoggiornoServiceLocator extends org.apache.axis.client.Service implements com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoService {

    public ImpostaSoggiornoServiceLocator() {
    }


    public ImpostaSoggiornoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImpostaSoggiornoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImpostaSoggiornoPort
    private java.lang.String ImpostaSoggiornoPort_address = "http://10.10.80.6:9999/ImpostaSoggiornoService/impostasoggiorno";

    public java.lang.String getImpostaSoggiornoPortAddress() {
        return ImpostaSoggiornoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImpostaSoggiornoPortWSDDServiceName = "ImpostaSoggiornoPort";

    public java.lang.String getImpostaSoggiornoPortWSDDServiceName() {
        return ImpostaSoggiornoPortWSDDServiceName;
    }

    public void setImpostaSoggiornoPortWSDDServiceName(java.lang.String name) {
        ImpostaSoggiornoPortWSDDServiceName = name;
    }

    public com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoInterface getImpostaSoggiornoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImpostaSoggiornoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImpostaSoggiornoPort(endpoint);
    }

    public com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoInterface getImpostaSoggiornoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoSOAPBindingStub _stub = new com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoSOAPBindingStub(portAddress, this);
            _stub.setPortName(getImpostaSoggiornoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImpostaSoggiornoPortEndpointAddress(java.lang.String address) {
        ImpostaSoggiornoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoSOAPBindingStub _stub = new com.seda.payer.impostasoggiorno.webservice.wis.source.ImpostaSoggiornoSOAPBindingStub(new java.net.URL(ImpostaSoggiornoPort_address), this);
                _stub.setPortName(getImpostaSoggiornoPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImpostaSoggiornoPort".equals(inputPortName)) {
            return getImpostaSoggiornoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.wis.webservice.impostasoggiorno.payer.seda.com", "ImpostaSoggiornoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.wis.webservice.impostasoggiorno.payer.seda.com", "ImpostaSoggiornoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImpostaSoggiornoPort".equals(portName)) {
            setImpostaSoggiornoPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
