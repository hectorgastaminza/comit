package comit;

public class Convert {
	public static double convertCurrency(double value, double rate) {
		double result = 0;
		
		result = value * rate;
		
		return result;
	}
	
	/**
	 * Converts from canadian dollars to US dollars. 
	 * You will receive a decimal number corresponding to the amount in CAD and will answer with the corresponding amount in US dollars. 
	 * Takes the quotation of the dollar today.
	 * @param cad
	 * @return usd 
	 */
	public static double convertCADtoUSD(double cad)
	{
		final double rate = 0.750835F;
		
		return convertCurrency(cad, rate);
	}

}
