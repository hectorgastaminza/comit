package comit;

public class Book {
	public String name;
	public int pages;
	
	public Book()
	{
		this.name = "Blank";
		this.pages = 1;
	}
	
	public Book(String name, int pages)
	{
		this.name = name;
		this.pages = pages;
	}
	
	public int sheetsNeededToPrintIt() {
		return ((pages+1)/2);
	}
	
	public String toString()
	{
		return (this.name + ". It has " + this.pages + " pages.");
	}
}
