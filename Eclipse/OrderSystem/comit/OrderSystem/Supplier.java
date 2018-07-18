package comit.OrderSystem;

public class Supplier extends Person {
	
	public Supplier(int numberId, String name) {
		super(numberId, name);
	}
	
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append("Supplier Id: " + String.valueOf(numberId) + "%n");
		strBuilder.append("Name: " + name + "%n");
		/*
		strBuilder.append("Purchase orders: %n");
		strBuilder.append(ordersToString());
		*/
		
		return strBuilder.toString();
	}

}
