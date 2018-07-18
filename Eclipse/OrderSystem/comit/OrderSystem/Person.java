package comit.OrderSystem;

import java.util.ArrayList;

import comit.Item;

public class Person {
	protected int numberId;
	protected String name;
	//private ArrayList<Order> orders;

	public Person(int numberId, String name) {
		this.numberId = numberId;
		this.name = name;
		//orders = new ArrayList<>();
	}
	
	/*
	public void addOrder(Order newOrder) {
		orders.add(newOrder);
	}
	*/
	
	public String toString() {
		
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("Name: " + name + "%n");
		strBuilder.append("Id: " + String.valueOf(numberId) + "%n");
		/*
		strBuilder.append("Orders: /n");
		strBuilder.append(ordersToString());
		*/
		return strBuilder.toString();
	}
	
	public boolean equals(Person person) {
		return (this.numberId == person.numberId);
	}
	
	/*
	protected String ordersToString() {
		StringBuilder strBuilder = new StringBuilder();
		
		for (Order order : orders) {
			strBuilder.append(order.toString());
		}
		
		return strBuilder.toString();
	}
	*/
}
