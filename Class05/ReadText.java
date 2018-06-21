import java.util.Scanner;

public class ReadText
{
	public static String readText(char endText)
	{
		String retval = "";
		char character = ' ';
		Scanner input = new Scanner( System.in );

		while(character != endText)
		{
			System.out.print( "Enter character: " );
			character = input.next().charAt(0);
			retval += character;
		}

		return retval;
	}
}
