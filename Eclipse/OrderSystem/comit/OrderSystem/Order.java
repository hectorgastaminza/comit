package comit.OrderSystem;

import java.util.ArrayList;

public class Order {
	private int numberId;
	private Taxes taxes;
	private ArrayList<Item> items;
	private Person person;
	
	public Order(int numberId, Person person, Taxes taxes) {
		this.numberId = numberId;
		this.taxes = taxes;
		this.person = person;
		items = new ArrayList<>();		
	}
	
	public boolean isAllowAddMoreItems() {
		return (items.size() < 10);
	}
	
	public boolean addItem(Item item) {
		boolean retval = false;
		if(isAllowAddMoreItems())
		{
			items.add(item);
			retval = true;
		}
		return retval;
	}
	
	public String toString() {
		
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("%nOrder Id: " + String.valueOf(numberId) + "%n");
		strBuilder.append(person.toString() + "%n");
		strBuilder.append("Items: %n");
		strBuilder.append(itemsToString());
		
		return strBuilder.toString();
	}
	
	public boolean equals(Order order) {
		return (this.numberId == order.numberId);
	}
	
	private String itemsToString() {
		StringBuilder strBuilder = new StringBuilder();
		double amountItems = 0;
		
		for (Item item : items) {
			strBuilder.append(item.toString() + "%n");
			amountItems += item.getPrice();
		}
		
		strBuilder.append("NET amount: " + String.format("%.2f", amountItems) + "%n");
		strBuilder.append("GST amount: " + String.format("%.2f", taxes.calculateGST(amountItems)) + "%n");
		strBuilder.append("PST amount: " + String.format("%.2f", taxes.calculatePST(amountItems)) + "%n");
		strBuilder.append("Total amount: " + String.format("%.2f", amountItems + taxes.calculateTaxes(amountItems)) + "%n");
		
		return strBuilder.toString();
	}
}
