package comit.OrderSystem;

public class Customer extends Person{

	public Customer(int numberId, String name) {
		super(numberId, name);
	}
	
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("Customer Id: " + String.valueOf(numberId) + "%n");
		strBuilder.append("Name: " + name + "%n");
		/*
		strBuilder.append("Invoices: %n");
		strBuilder.append(ordersToString());
		*/
		
		return strBuilder.toString();
	}

}
