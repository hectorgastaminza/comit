package comit;

/**
 * Question 2 - Create an Account class with the following attributes:
 * accountNumber
 * balance
 * owner (the owner is a Person class)
 * 
 * Create a constructor with parameters for all the attributes, 
 * and another constructor without parameters
 * Create access methods for all the members for both the Account class, 
 * as well as a toString method.
 * 
 * In the Account class, create the following functions:
 * Withdraw - Removes a specified amount from the balance, as long as the account does not go below zero.
 * Deposit - Adds a specified amount to the balance.
 * 
 * In your main class, create two accounts belonging to two different people. 
 * Make a deposit and a withdrawal in each account. Print the names of both people, 
 * as well as the information about their accounts.
 * 
 * @author USER
 *
 */
public class Account {
	private int accountNumber;
	private double balance;
	private Person owner;
	
	public Account()
	{		
		this(0, 0, null);
	}
	
	public Account(int accountNumber, int balance, Person owner)
	{
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setOwner(owner);
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setOwner(Person owner)	{
		this.owner = owner;
	}
	
	public double withdraw(double amount)
	{
		double retval = (amount < balance ) ? amount : balance;
		balance -= retval;
		return retval;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public String toString() {
		return "Account: " + accountNumber + ". " + owner.toString() + ". Balance: " + String.format("%.2f", balance);
	}
}
