public class Class05
{
    public static void main(String[] args)
    {
    	String text = "abcd efgh";//ReadText.readText('.');
    	int count = CountWords.countWords(text);
    	
    	System.out.printf("Text is: " + text + "\n");
    	System.out.printf("Text is: " + InvertString.invertString(text) + "\n");
    	System.out.printf("And it has " + count + " words");
    }
}
