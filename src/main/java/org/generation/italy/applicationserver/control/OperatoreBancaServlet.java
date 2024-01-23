package org.generation.italy.applicationserver.control;

import java.util.Map;

public class OperatoreBancaServlet {
	
//	Creare la classe servlet che, nell'ambito della web-application 'banca', gestisce le azioni 
//	dedicate all'attore-utente 'operatore-banca'.
//
//	In particolare si implementi la gestione della URL seguente:
//
//	-------------------- Url per azioni svolte dall'attore operatore-banca ---------------------
//	1) apre conto per un cliente
//	http://localhost:8081/banca/operatore-banca/apri-conto-cliente?iban=ESaa0123456789012345678901234567&codice-fiscale=MRRGVN0123456789&valuta=EUR
//
//	NOTA: l'implementazione parte dal richiamo della servlet opportuno nell'ambito del metodo webAppServiceManager 
//	deifnito nella classe HttpserverSocket.
	
	public static byte[] executeAction(String actionName, Map<String, String> paramaterValueCollection) 
		throws BancaControlException {
		
		byte[] htmlContentPage = "".getBytes();
		
		switch (actionName) {
		
			case "apri-conto-cliente":
			htmlContentPage = actionApriContoCliente(paramaterValueCollection);
			break;



	}
		
		return htmlContentPage;
	}
	
	private
	static
	byte[] actionApriContoCliente(Map<String, String> parameterValueCollection) {
					//throws CalcolatriceControlException	{
		byte[] htmlContentPage = "".getBytes();
		
		String ibanString = parameterValueCollection.get("iban");
		String codiceFiscaleString = parameterValueCollection.get("codice-fiscale");
		String valutaString = parameterValueCollection.get("valuta");
		
		
		return htmlContentPage;
	}
}
