package comit;

public class Student {
	
	private String name;
	private String lastname;
	private int grade;
	
	public Student(String name, String lastname)
	{
		this.setName(name);
		this.setLastname(lastname);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	
	public boolean equals(Student student)
	{
		return (this.name.equals(student.name) && this.lastname.equals(student.lastname));
	}
	
	public String toString()
	{
		return this.name + " " + this.lastname;
	}
}
