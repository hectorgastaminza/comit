package comit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create an application that will ask the user for the following information:
 * Item name
 * Item price
 * Tax rate
 * 
 * The application will print the following information:
 * The name of the item
 * The price of the item
 * The amount of tax for the item
 * The total amount owed
 * 
 * The application will then ask for how much money the user is giving the cashier.
 * If the amount is less than what is owed for the bill, the application will say 
 * insufficient funds and ask again.
 * 
 * The application will then print the following information:
 * The amount of money received
 * The amount of change owed by the cashier
 * Thank you for visiting the store.
 */
public class ShoppingCart {
		
	public static void buy() {
		java.util.Scanner scanner = new Scanner(System.in);
		ArrayList<Item> listProducts = new ArrayList<>();
		int numberProducts;
		double totalAmount = 0;
		double payment;
		
		System.out.println("Please enter the number of products: ");
		numberProducts = scanner.nextInt();
		
		for (int i = 0; i < numberProducts; i++) {
			Item myItem = new Item();
			myItem.requestInformation();
			listProducts.add(myItem);
		}
		
		for (Item item : listProducts) {
			totalAmount += item.totalAmount();
			item.showInformation();
		}
		
		System.out.println("Total amount of shopping cart is: " + String.format("%.2f", totalAmount));
		
		System.out.println("Please enter the amount of money received: ");
		payment = scanner.nextDouble();
		
		while(totalAmount > payment)
		{
			System.out.println("Insufficient funds. Ask for " + String.format("%.2f", totalAmount) + " at least");
			System.out.println("Please enter the amount of money received: ");
			payment = scanner.nextDouble();		
		}
		
		System.out.println("Give to the customer: " + String.format("%.2f", payment - totalAmount));
		
		System.out.println("Thank you for visiting the store.");
	}
	
	
	
	
}