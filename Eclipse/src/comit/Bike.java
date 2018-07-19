package comit;

public class Bike {
	private static int count = 0;
	private int id = 0;
	private int speed = 0;
	
	public Bike() 
	{
		this(0);
	}
	
	public Bike(int initialSpeed)
	{
		id = ++count;
		accelerate(initialSpeed);
	}
	
	public void accelerate(int additionalSpeed) {
		
		if(additionalSpeed>0)
			speed += additionalSpeed;
	}
	
	public String toString() {
		return String.valueOf(speed);
	}
	
	public int getId()
	{
		return id;
	}
	
	public boolean equalsTo(Bike bike)
	{
		return (this.id == bike.id);
	}
	
	public static int getCountOfBikesCreated() {
		return count;
	}
}
