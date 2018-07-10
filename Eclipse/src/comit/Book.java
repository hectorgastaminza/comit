package comit;

public class Book {
	private String name;
	private String author;
	private int pages = 1;
	private int copies = 0;
	private int copiesLent = 0;
	
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
	
	public Book(String name, String author, int copies)
	{
		this.name = name;
		this.author = author;
		this.copies = copies;
	}
	
	public boolean loanBook() {
		boolean retval = false;
		
		if(copies > copiesLent)
		{
			copiesLent++;
			retval = true;
		}
		
		return (retval);
	}
	
	public boolean returnBook() {
		boolean retval = false;
		
		if(copiesLent > 0)
		{
			copiesLent--;
			retval = true;
		}
		
		return (retval);
	}
	
	public int getPages()
	{
		return this.pages;
	}
	
	public int sheetsNeededToPrintIt() {
		return ((pages+1)/2);
	}
	
	/**
	 * <Title>, by <Author>. <Number lent> copies lent out from <Number of copies> total.
	 */
	public String toString()
	{
		return (this.name + ", by " + this.author + ". " + this.copiesLent + " copies lent out from " + this.copies + " total.");
	}
}
