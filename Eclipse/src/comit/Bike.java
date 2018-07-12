package comit;

public class Bike {
	private int speed = 0;
	
	public Bike() {}
	
	public Bike(int initialSpeed)
	{
		accelerate(initialSpeed);
	}
	
	public void accelerate(int additionalSpeed) {
		
		if(additionalSpeed>0)
			speed += additionalSpeed;
	}
	
	public String toString() {
		return String.valueOf(speed);
	}
}
