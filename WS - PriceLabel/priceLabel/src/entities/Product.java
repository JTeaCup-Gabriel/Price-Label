package entities;

import java.text.DecimalFormat;

public class Product {

	private static DecimalFormat df = new DecimalFormat("0.00");
	protected String name;
	protected Double price;
	// ------------------------------------------------------------------------ >

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// ------------------------------------------------------------------------ >
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// ------------------------------------------------------------------------ >

	public String priceTag() {

		StringBuilder sb = new StringBuilder();

		sb.append(name + " $ " + df.format(price));

		return sb.toString();
	}
}
