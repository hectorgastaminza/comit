public class InvertString
{
	public static String invertString(String text)
	{
		char[] retval = text.toCharArray();
		int length = text.length();

		for (int i = 0; i < (length/2); i++)
		{
			retval[i] = text.charAt((length-1)-i);
			retval[(length-1)-i] = text.charAt(i); 
		}

		return String.valueOf(retval);
	}
}
