package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			System.out.println("Product #" + i + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().toLowerCase().charAt(0);

			sc.nextLine();

			System.out.print("Name: ");
			String productName = sc.nextLine();

			System.out.print("Price: ");
			double productPrice = sc.nextDouble();

			int cx = (type == 'c') ? 1 : ((type == 'u') ? 2 : ((type == 'i') ? 3 : 0));
			switch (cx) {

			case 1:

				Product product = new Product(productName, productPrice);
				list.add(product);

				break;

			case 2:

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date productDate = sdf.parse(sc.next());

				Product used = new UsedProduct(productName, productPrice, productDate);
				list.add(used);

				break;

			case 3:

				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				Product imp = new ImportedProduct(productName, productPrice, customsFee);
				list.add(imp);

			}

		}

		System.out.println("\nPRICE TAGS:");

		for (Product p : list) {

			System.out.println(p.priceTag());

		}

		sc.close();

	}

}
