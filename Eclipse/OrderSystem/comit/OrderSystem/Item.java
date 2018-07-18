package comit.OrderSystem;

public class Item {
	private String description;
	private double price;
	
	public Item(String description, double price)
	{
		this.description = description;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString()
	{
		return description + " : " + String.format("%.2f", price);
	}
}
