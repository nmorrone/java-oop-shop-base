package org.lessons.java.shop;

import java.util.Random;

public class ProdottoFixed {
	
	//definisco la classe del prodotto
	int code;
	String name;
	String description;
	double price;
	double fullPrice;
	double taxes;
	String fullName;
	
	Random codeGenerator = new Random();

	//definisco il costruttore per i valori di default
	ProdottoFixed (){
		code = codeGenerator.nextInt(1 + 100000);
		fullPrice = price * 1.22;
		taxes = fullPrice - price;
		fullName = String.valueOf(code) + name;
	}
	
}

