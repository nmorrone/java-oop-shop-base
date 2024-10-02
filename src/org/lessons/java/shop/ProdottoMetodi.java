package org.lessons.java.shop;


public class ProdottoMetodi {

//creo l'istanza di un prodotto casuale	
public static void main(String [] args) {
	
	Prodotto newProdotto = new Prodotto();
	
	newProdotto.name = "AirpodsPro-3th-Gen";
	newProdotto.description = "Wireless professional in-ear speakers for iphone and ios devices, 3th generation with the last and modern utilities";
	newProdotto.price = 299.00;
	
	//metodo codice prodotto
	newProdotto.generatoreCodice();
	//verifico funzionamento
	System.out.println(newProdotto.code);
	
	//metodo iva prodotto
	newProdotto.ivaProdotto(newProdotto.price);
	//verifico funzionamento
	System.out.println(newProdotto.iva);
	
	//metodo prezzo completo
	newProdotto.priceCalculator(newProdotto.price, newProdotto.iva);
	//verifico funzionamento
	System.out.println(newProdotto.fullPrice);
	
	//metodo fullname
	newProdotto.getName(String.valueOf(newProdotto.code), newProdotto.name);
	//verifico funzionamento
	System.out.println(newProdotto.fullName);
	
	
	//creo nuova istanza prodotto per prezzo dafault
	Prodotto newProdotto2 = new Prodotto();
	
	newProdotto2.name = "AppleWatch-2th-Gen";
	newProdotto2.description = "The ultimate smartest SmartWatch in the World, with the lastest tchnologies"
			+ " witht this new Generation";
	System.out.println(newProdotto2.price);
	newProdotto2.getDefaultPrice();
	//uso metodo prezzo default
	System.out.println(newProdotto2.price);

}



}
