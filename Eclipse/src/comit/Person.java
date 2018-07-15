package comit;

/**
 * Question 2 - Create a Person class with the following attributes:
 * First name
 * Last name
 * Phone number (Ensure that the phone field only accepts 10 digits).
 * 
 * Create a constructor with parameters for all the attributes, 
 * and another constructor without parameters
 * Create access methods for all the members for both the Person class, 
 * as well as a toString method.
 * 
 * In your main class, create two accounts belonging to two different people. 
 * Make a deposit and a withdrawal in each account. Print the names of both people, 
 * as well as the information about their accounts.
 * 
 * @author USER
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, String phoneNumber)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.matches("[0-9]{10}")) // regular expression
		{
			this.phoneNumber = phoneNumber;
		}
		else
		{
			System.out.println("ERROR: wrong phone number, only accepts 10 digits.");
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ". Phone: " + phoneNumber;
	}
}
