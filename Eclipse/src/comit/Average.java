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
	
	public static int averageArray(int[] values)
	{
		int average = 0;
		
		for (int i = 0; i < values.length; i++) {
			average += values[i];
		}
		average /= values.length;
		
		return average;
	}
	
	public static int valuesAboveAverage(int[] values, int average)
	{
		int count = 0;
		
		for (int i = 0; i < values.length; i++) {
			if(values[i] > average)
				count++;
		}
		
		return count;
	}
	
	public static int valuesBelowAverage(int[] values, int average)
	{
		int count = 0;
		
		for (int i = 0; i < values.length; i++) {
			if(values[i] < average)
				count++;
		}
		
		return count;
	}	
}
