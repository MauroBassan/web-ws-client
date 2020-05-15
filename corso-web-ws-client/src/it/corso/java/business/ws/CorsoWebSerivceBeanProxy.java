package it.corso.java.business.ws;

public class CorsoWebSerivceBeanProxy implements it.corso.java.business.ws.CorsoWebSerivceBean {
  private String _endpoint = null;
  private it.corso.java.business.ws.CorsoWebSerivceBean corsoWebSerivceBean = null;
  
  public CorsoWebSerivceBeanProxy() {
    _initCorsoWebSerivceBeanProxy();
  }
  
  public CorsoWebSerivceBeanProxy(String endpoint) {
    _endpoint = endpoint;
    _initCorsoWebSerivceBeanProxy();
  }
  
  private void _initCorsoWebSerivceBeanProxy() {
    try {
      corsoWebSerivceBean = (new it.corso.java.business.ws.CorsowebLocator()).getCorsoWebSerivceBeanPort();
      if (corsoWebSerivceBean != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)corsoWebSerivceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)corsoWebSerivceBean)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (corsoWebSerivceBean != null)
      ((javax.xml.rpc.Stub)corsoWebSerivceBean)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.corso.java.business.ws.CorsoWebSerivceBean getCorsoWebSerivceBean() {
    if (corsoWebSerivceBean == null)
      _initCorsoWebSerivceBeanProxy();
    return corsoWebSerivceBean;
  }
  
  public java.lang.String salutami(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (corsoWebSerivceBean == null)
      _initCorsoWebSerivceBeanProxy();
    return corsoWebSerivceBean.salutami(arg0, arg1);
  }
  
  
}