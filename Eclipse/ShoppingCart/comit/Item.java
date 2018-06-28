package comit;

import java.util.Scanner;

public class Item {
	private String name;
	private double price;
	private double tax;
	
	public Item() {
		
	}
	
	public void requestInformation(){
		java.util.Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the item name: ");
		name = scanner.next();
		System.out.println("Please enter the item price: ");
		price = scanner.nextDouble();
		System.out.println("Please enter the item tax: ");
		tax = scanner.nextDouble();
	}
	
	public void showInformation() {
		System.out.println("The item name is: " + name);
		System.out.println(name + " price is: " + price);
		System.out.println(name + " tax is: " + tax);
		System.out.println(name + " amount is: " + totalAmount());
	}
	
	public double totalAmount() {
		return (price * (1+tax));
	}
}
