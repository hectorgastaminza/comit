package comit;

public class Average {
	
	/**
	 * Calculates the average value between two integers
	 * @param value1 Integer 1
	 * @param value2 Integer 2
	 * @return Average
	 */
	public static int average(int value1, int value2)
	{
		int retval = 0;
		
		retval = (value1 + value2) / 2;
		
		return retval;
	}
}
