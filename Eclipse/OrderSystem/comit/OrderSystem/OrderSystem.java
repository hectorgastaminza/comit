package comit.OrderSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {
	private ArrayList<Customer> customers;
	private ArrayList<Supplier> suppliers;
	private Taxes manitobaTaxes;
	
	public void launchApp()
	{
		customers = new ArrayList<>();
		suppliers = new ArrayList<>();
		manitobaTaxes = new Taxes(0.05, 0.08);
		
		menu();
	}
	
	private void menu() {
		int option = -1;
		Scanner myScanner = new Scanner(System.in);
		
		while (option != 0) {
			System.out.printf("%n%n");
			System.out.println("--------------------------");
			System.out.println("Create orders");
			System.out.println("--------------------------");
			System.out.println("1. Create invoice");
			System.out.println("2. Create purchase");
			System.out.println("0. Exit");
			System.out.println("--------------------------");
			
			option = myScanner.nextInt();
			
			switch (option) {
				case 1:
					createInvoice(manitobaTaxes);
					break;
				case 2:
					createPurchase(manitobaTaxes);
					break;
				default:
					break;
			}
		}
	}
	
	private void createPurchase(Taxes taxes) {
		System.out.printf("%n");
		System.out.println("--------------------------");
		System.out.println("Create Purchase");
		System.out.println("--------------------------");
		
		Supplier person = addPerson("Supplier", suppliers);
		
		Order order = createOrder(person, taxes);
		
		System.out.printf(order.toString());
		
	}

	private void createInvoice(Taxes taxes) {	
		System.out.printf("%n");
		System.out.println("--------------------------");
		System.out.println("Create invoice");
		System.out.println("--------------------------");
		
		Customer person = addPerson("Customer", customers);
		
		Order order = createOrder(person, taxes);
		
		System.out.printf(order.toString());
	}
	
	private <T extends Person> T addPerson(String type, ArrayList<T> list)
	{
		T customer = (T) createPerson(type);
		boolean newPerson = true;
		
		for (T var : list) {
			if(var.equals(customer))
			{
				System.out.println("Error. A current " + type + " has the same id.");
				System.out.printf("%n" + var.toString());
				System.out.printf("%n" + customer.toString());
				customer = var;
				newPerson = false;
				break;
			}
		}
		
		if(newPerson)
			list.add(customer);
		
		return customer;
	}
	

	private Person createPerson(String type) {
		Scanner myScanner = new Scanner(System.in);
		String name;
		int id;
		
		System.out.printf("%n");
		System.out.println("--------------------------");
		System.out.println("Create " + type);
		System.out.println("Enter name: ");
		name = myScanner.nextLine();
		System.out.println("Enter id: ");
		id = myScanner.nextInt();
		System.out.println("--------------------------");
		
		return PersonFactory.getPerson(type, id, name);
	}
	
	private Order createOrder(Person person, Taxes taxes) {
		Scanner myScanner = new Scanner(System.in);
		Order order;
		int id;
		
		System.out.printf("%n");
		System.out.println("--------------------------");
		System.out.println("Enter order id: ");
		id = myScanner.nextInt();
		
		order = new Order(id, person, taxes);
		
		chargeItemsToOrder(order);
		
		return order;
	}
	
	private void chargeItemsToOrder(Order order)
	{
		int option = -1;
		Scanner myScanner = new Scanner(System.in);
		
		while(order.isAllowAddMoreItems() && (option != 0))
		{
			System.out.printf("%n");
			System.out.println("--------------------------");
			System.out.println("1. Add item");
			System.out.println("0. No more items to add");
			System.out.println("--------------------------");
			option = myScanner.nextInt();
			
			if(option == 1)
			{
				order.addItem(CreateItem());
			}
		}
	}
	
	private Item CreateItem()
	{
		Scanner myScanner = new Scanner(System.in);
		String description;
		double price;
		System.out.printf("%n");
		System.out.println("--------------------------");
		System.out.println("Create Item: ");
		System.out.println("Enter description: ");
		description = myScanner.nextLine();
		System.out.println("Enter price: ");
		price = myScanner.nextDouble();
		
		return new Item(description, price);
	}
	
	
}
