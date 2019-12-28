package entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static DecimalFormat df = new DecimalFormat("0.00");

	private Date manufactureDate;
	// ------------------------------------------------------------------------ >
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	// ------------------------------------------------------------------------ >
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	// ------------------------------------------------------------------------ >
	
	@Override
	public String priceTag() {
		
		// Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)

		StringBuilder sb = new StringBuilder();

		sb.append(name + "(used) $ " + df.format(price) +" (Manufacture date: " + sdf.format(manufactureDate) + ")");

		return sb.toString();
	}

}
