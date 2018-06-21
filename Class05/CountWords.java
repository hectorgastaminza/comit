public class CountWords
{
	public static int countWords(String text)
	{
		int count = 0;
		char previousCharacter = ' ';
		char character;
		
		for (int i = 0; i < text.length(); i++) 
		{
			character = text.charAt(i);
			if(previousCharacter == ' ' && character != ' ')
			{
				count++;
			}
			previousCharacter = character;
		}
		
		return count;
	}
}
