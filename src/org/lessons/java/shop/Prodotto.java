package org.lessons.java.shop;

import java.util.Random;

//definisco la classe con le sue caratteristiche
public class Prodotto {
			int code;
			String name;
			String description;
			float price;
			float iva = price + (price * 100 / 22);

Random generatore = new Random();

int generatoreCodice() {
	int uniqueCode = generatore.nextInt(1+ 100000);
	code = uniqueCode;
	return code;
}

}