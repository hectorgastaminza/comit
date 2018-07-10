package comit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	
	private List<Book> myBooks;
	
	public Library() {
	}
	
	/**
	 * 
	 * Options:
	 * 1 - Quit
	 * 2 - Create a book
	 * 3 - Take out a book
	 * 4 - Return a book
	 * 5 - List all books
	 * 
	 */
	public void launcher() {
		int option = 0;
		myBooks = new ArrayList<Book>();
		Scanner myScanner = new Scanner(System.in);
		
		while (option != 1)
		{
			showOptions();
			option = myScanner.nextInt();
			processOption(option);
		}
	}
	
	private void showOptions() {
		System.out.println("\nOptions:");
		System.out.println("1 - Quit");
		System.out.println("2 - Create a book");
		System.out.println("3 - Take out a book");
		System.out.println("4 - Return a book");
		System.out.println("5 - List all books");
		System.out.print("\nEnter your option: ");
	}
	
	private void processOption(int option)
	{
		switch (option) {
		case 2:
			createBook();
			break;
		case 3:
			loanBook();
			break;
		case 4:
			returnBook();
			break;
		case 5:
			listBooks();
			break;
		default:
			break;
		}
	}
	
	private void listBooks() {
		System.out.println("\nList of books");
		for (int i = 0; i < myBooks.size(); i++) {
			System.out.println(i + " - " + myBooks.get(i).toString());
		}
	}

	private void returnBook() {
		Scanner myScanner = new Scanner(System.in);
		boolean retval = false;
		
		System.out.println("Return book");			
		System.out.println("Enter the book id:");
		int id = myScanner.nextInt();
		if(id < myBooks.size())
		{
			retval =  myBooks.get(id).returnBook();
			if(retval)
			{
				System.out.println("Thanks for return your copy.");
			}
			else
			{
				System.out.println("You cannot return that book.");
			}
		}
		else
		{
			System.out.println("Incorrect ID");
		}
	}

	private void loanBook() {
		Scanner myScanner = new Scanner(System.in);
		boolean retval = false;
		
		System.out.println("Loan book");			
		System.out.println("Enter the book id:");
		int id = myScanner.nextInt();
		if(id < myBooks.size())
		{
			retval =  myBooks.get(id).loanBook();
			if(retval)
			{
				System.out.println("It's done. Enjoy your copy.");
			}
			else
			{
				System.out.println("You cannot get that book.");
			}
		}
		else
		{
			System.out.println("Incorrect ID");
		}
	}

	private void createBook()
	{
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Create book");			
		System.out.println("Enter the book name:");
		String name = myScanner.next();
		System.out.println("Enter the author:");
		String author = myScanner.next();
		System.out.println("Enter the number of copies:");
		int copies = myScanner.nextInt();
		
		myBooks.add(new Book(name, author, copies));
	}

}
