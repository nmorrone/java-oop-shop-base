package org.lessons.java.shop;


//definisco la classe con le sue caratteristiche
public class Prodotto {
			String code;
			String name;
			String description;
			float price;
			float iva = price + (price * 100 / 22);
	}

