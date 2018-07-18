package comit.OrderSystem;

public class PersonFactory {
	
	public static Person getPerson(String type, int numberId, String name){
		
		if("Customer".equalsIgnoreCase(type)) return new Customer(numberId, name);
		else if("Supplier".equalsIgnoreCase(type)) return new Supplier(numberId, name);

		return null;
	}
}
