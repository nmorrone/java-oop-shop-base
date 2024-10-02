package org.lessons.java.shop;

import java.util.Random;

//definisco la classe con le sue caratteristiche
public class Prodotto {
			int code;
			String name;
			String description;
			double price;
			double iva = (price * 22) / 100;
			double fullPrice;

Random generatore = new Random();

//creo metodo per assegnare un codice random di tot cifre ad un prodotto
int generatoreCodice() {
	int uniqueCode = generatore.nextInt(1+ 100000);
	code = uniqueCode;
	return code;
}

//definisco il metodo per calcolare l'iva
//restituirà nel prodotto la variabile calcolata
double ivaProdotto(double price) {
	
	iva = (price * 22) / 100;
	return iva;
	
}

//definisco il metodo per calcolare l'intero prezzo del protto
//lo salvo in una variabile
double priceCalculator (double price, double iva) {
	
	fullPrice = price + iva;
	return fullPrice;
}

}