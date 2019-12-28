package entities;

import java.text.DecimalFormat;

public class ImportedProduct extends Product {
	private static DecimalFormat df = new DecimalFormat("0.00");	

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {

		return price + customsFee;
	}

	@Override
	public String priceTag() {


		StringBuilder sb = new StringBuilder();

		sb.append(name + " $ " + df.format(totalPrice()) + " (Customs fee: $ " + df.format(customsFee) +")");

		return sb.toString();
	}

}
