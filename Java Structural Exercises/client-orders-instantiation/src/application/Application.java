package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data:");

		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");

		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		System.out.print("How many items to this order? ");
		int itemsQuantity = sc.nextInt();

		Order order = new Order(client, new Date(), status);

		for (int i = 0; i < itemsQuantity; i++) {
			System.out.println();
			System.out.println("Enter #" + i + 1 + " item data: ");
			System.out.print("Name: ");
			String productName = sc.next();

			System.out.print("Price: ");
			double productPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();

			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(product, productQuantity);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("Order Summary: ");
		System.out.println(order);

		sc.close();
	}

}
