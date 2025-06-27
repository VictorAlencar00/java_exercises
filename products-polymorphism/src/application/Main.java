package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> productsList = new ArrayList<Product>();

		System.out.print("Enter number of products: ");
		int amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Product name: ");
			String name = sc.next();

			System.out.print("Product price: ");
			double price = sc.nextDouble();

			System.out.print("Common, used or imported? (c/u/i)");
			char productType = sc.next().charAt(0);

			if (productType == 'u') {
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.next());
				UsedProduct product = new UsedProduct(price, name, manufactureDate);
				productsList.add(product);

			} else if (productType == 'i') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				ImportedProduct product = new ImportedProduct(price, name, customFee);
				productsList.add(product);
			} else {
				Product product = new Product(price, name);
				productsList.add(product);
			}
		}
		
		for(Product product: productsList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
