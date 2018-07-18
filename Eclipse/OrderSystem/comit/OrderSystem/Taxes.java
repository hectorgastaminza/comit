package comit.OrderSystem;

public class Taxes {
	private double gst;
	private double pst;
	
	public Taxes(double gst, double pst) {
		this.gst = gst;
		this.pst = pst;
	}
	
	public double calculateGST(double amount)
	{
		return (amount * gst);
	}
	
	public double calculatePST(double amount)
	{
		return (amount * pst);
	}
	
	public double calculateTaxes(double amount)
	{
		return calculateGST(amount) + calculatePST(amount);
	}
}
