/**
 * CorsowebLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.corso.java.business.ws;

public class CorsowebLocator extends org.apache.axis.client.Service implements it.corso.java.business.ws.Corsoweb {

    public CorsowebLocator() {
    }


    public CorsowebLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CorsowebLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CorsoWebSerivceBeanPort
    private java.lang.String CorsoWebSerivceBeanPort_address = "http://localhost:8080/webapps/webservices/CorsoWebSerivceBean";

    public java.lang.String getCorsoWebSerivceBeanPortAddress() {
        return CorsoWebSerivceBeanPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CorsoWebSerivceBeanPortWSDDServiceName = "CorsoWebSerivceBeanPort";

    public java.lang.String getCorsoWebSerivceBeanPortWSDDServiceName() {
        return CorsoWebSerivceBeanPortWSDDServiceName;
    }

    public void setCorsoWebSerivceBeanPortWSDDServiceName(java.lang.String name) {
        CorsoWebSerivceBeanPortWSDDServiceName = name;
    }

    public it.corso.java.business.ws.CorsoWebSerivceBean getCorsoWebSerivceBeanPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CorsoWebSerivceBeanPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCorsoWebSerivceBeanPort(endpoint);
    }

    public it.corso.java.business.ws.CorsoWebSerivceBean getCorsoWebSerivceBeanPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.corso.java.business.ws.CorsowebSoapBindingStub _stub = new it.corso.java.business.ws.CorsowebSoapBindingStub(portAddress, this);
            _stub.setPortName(getCorsoWebSerivceBeanPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCorsoWebSerivceBeanPortEndpointAddress(java.lang.String address) {
        CorsoWebSerivceBeanPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.corso.java.business.ws.CorsoWebSerivceBean.class.isAssignableFrom(serviceEndpointInterface)) {
                it.corso.java.business.ws.CorsowebSoapBindingStub _stub = new it.corso.java.business.ws.CorsowebSoapBindingStub(new java.net.URL(CorsoWebSerivceBeanPort_address), this);
                _stub.setPortName(getCorsoWebSerivceBeanPortWSDDServiceName());
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
        if ("CorsoWebSerivceBeanPort".equals(inputPortName)) {
            return getCorsoWebSerivceBeanPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.business.java.corso.it/", "corsoweb");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.business.java.corso.it/", "CorsoWebSerivceBeanPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CorsoWebSerivceBeanPort".equals(portName)) {
            setCorsoWebSerivceBeanPortEndpointAddress(address);
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
