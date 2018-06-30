package comit;

import java.util.Scanner;

/**
 * Class 08
 * 
 * 2 - Write an algorithm (Vehicles.java) that, 
 * from reading and storing in vectors the commercial value of 20 vehicles and 
 * the type (family (1), public transportation (2), load (3)), 
 * 
 * calculate the value based on: 
 * • For vehicles with a value greater than 100 million, charge VAT of 20%, for others VAT is 16% 
 * • For vehicles type 1, with value up to 50 million, apply a discount equivalent to 50% of the VAT charged 
 * • For vehicles type 2 and 3, with a value higher than 80 million, apply an additional cost of 5% 
 * • For all vehicles, if the final value is less than 80 million, apply an additional discount of 5% of the commercial value
 */
public class Vehicles {
	
	private final static byte IDX_VALUE = 0;
	private final static byte IDX_TYPE = 1;
	
	public static void example() {
		int[][] vehicles = new int[3][2];
		
		vehiclesReadData(vehicles);
		
		vehiclesCalculateValue(vehicles);
	}
	
	private static void vehiclesReadData(int[][] vehicles) {
		Scanner myScanner = new Scanner(System.in);
		
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("Vehicle " + (i+1) + " :");
			System.out.println("Enter its value: ");
			vehicles[i][IDX_VALUE] = myScanner.nextInt();
			System.out.println("Enter its type: ");
			vehicles[i][IDX_TYPE] = myScanner.nextInt();
		}
	}

	/**
	 * calculate the value based on: 
	 * • For vehicles with a value greater than 100 million, charge VAT of 20%, for others VAT is 16% 
	 * • For vehicles type 1, with value up to 50 million, apply a discount equivalent to 50% of the VAT charged 
	 * • For vehicles type 2 and 3, with a value higher than 80 million, apply an additional cost of 5% 
	 * • For all vehicles, if the final value is less than 80 million, apply an additional discount of 5% of the commercial value
	 */
	private static void vehiclesCalculateValue(int[][] vehicles) {
		int vatCost;
		int vatDiscount;
		int additionalCost;
		int additionalDiscount;
		int totalValue;
		
		for (int i = 0; i < vehicles.length; i++) {
			vatCost = 0;
			vatDiscount = 0;
			additionalCost = 0;
			additionalDiscount = 0;			
			totalValue = 0;
			
			if(vehicles[i][IDX_VALUE] > 100000000)
			{
				vatCost = (vehicles[i][IDX_VALUE] * 20) / 100; 
			}
			else
			{
				vatCost = (vehicles[i][IDX_VALUE] * 16) / 100;
			}
			
			if(vehicles[i][IDX_TYPE] == 1 && vehicles[i][IDX_VALUE] <= 50000000)
			{
				vatDiscount = (vatCost * 50) / 100; 
			}
			if((vehicles[i][IDX_TYPE] == 2 || vehicles[i][IDX_TYPE] == 3) && vehicles[i][IDX_VALUE] > 80000000)
			{
				additionalCost = (vehicles[i][IDX_VALUE] * 5) / 100; 
			}
			
			totalValue = vehicles[i][IDX_VALUE] + vatCost - vatDiscount + additionalCost;
			
			if(totalValue < 80000000)
				additionalDiscount = (vehicles[i][IDX_VALUE] * 5) / 100;
			
			totalValue -= additionalDiscount;
			
			System.out.println("Vehicle" + (i+1) + " :");
			System.out.println("Commercial value: " + vehicles[i][IDX_VALUE]);
			System.out.println("VAT: " + vatCost);
			System.out.println("VAT discount: " + vatDiscount);
			System.out.println("Additional cost: " + additionalCost);
			System.out.println("Additional discount: " + additionalDiscount);
			System.out.println("TOTAL VALUE: " + totalValue);			
		}
	}
}
