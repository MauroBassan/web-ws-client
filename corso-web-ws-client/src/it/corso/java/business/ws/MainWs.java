package it.corso.java.business.ws;

import java.rmi.RemoteException;

public class MainWs {

	public static void main(String[] args) throws RemoteException {
		
		CorsoWebSerivceBeanProxy c = new CorsoWebSerivceBeanProxy();
		
		String saluto = c.salutami("mro", "bsn");
		
		System.out.println(saluto);

	}

}
