package org.lessons.java.shop;


public class ProdottoMetodi {

//creo l'istanza di un prodotto casuale	
public static void main(String [] args) {
	
	Prodotto newProdotto = new Prodotto();
	
	newProdotto.name = "Airpod Pro 3th gen";
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
}


}
