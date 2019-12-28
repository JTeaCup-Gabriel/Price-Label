package application;

import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Product product = new Product("Notebook", 1100.0);

		System.out.println(product.priceTag());

	}

}
