package org.lessons.java.shop;


public class ProdottoMetodi {

	
public static void main(String [] args) {
	
	Prodotto newProdotto = new Prodotto();
	
	newProdotto.code= 0;
	
	System.out.println(newProdotto.code);
	
	newProdotto.generatoreCodice();
	
	System.out.println(newProdotto.code);
	
}


}
