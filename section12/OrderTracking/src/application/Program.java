package application;

import java.util.Scanner;
import java.util.Locale;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;
import entities.Product;
import entities.OrderItem;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
			String name = sc.nextLine();
		System.out.print("Email: ");
			String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
			Date birthDate = sdf.parse(sc.next());
			Client client = new Client(name, email, birthDate);
			
		System.out.println("Enter order data:");
		System.out.print("Status: ");
			OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order: ");
			int n = sc.nextInt();
			Order order = new Order(new Date(), orderStatus, client);
			
		for(int i=0; i<n; i++) {
			System.out.printf("Enter #%d item data:\n", i+1);
			System.out.print("Product name: ");
				String productName = sc.next();
			System.out.print("Product price: ");
				Double price = sc.nextDouble();
			System.out.print("Quantity: ");
				int quantity = sc.nextInt();
				
				Product product = new Product(productName, price);
				OrderItem orderItem = new OrderItem(product, price, quantity);
				order.addItem(orderItem);
		}
		
		System.out.println("");
		System.out.println(order);
		
		sc.close();
	}

}