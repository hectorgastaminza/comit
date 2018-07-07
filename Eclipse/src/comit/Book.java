package comit;

public class Book {
	public String name;
	public int pages;
	
	public Book(String nameValue, int pagesValue)
	{
		name = nameValue;
		pages = pagesValue;
	}
	
	public int sheetsNeededToPrintIt() {
		return ((pages+1)/2);
	}
}
