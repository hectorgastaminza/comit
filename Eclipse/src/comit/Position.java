package comit;

/**
 * Question 1 - Implement the class Position that represents a coordinate (x, y). 
 * 
 * Each position is defined by two integer values ​​x and y. Available operations are:
 * Default constructor, corresponds to the position (0,0).
 * Constructor with initial values ​​of X and Y 
 * Methods for modifying and querying (set / get) the attributes of the class.
 * Methods for increasing and decreasing the values ​​of each of the position coordinates (incX, incY, decX, decY).
 * A method for setting coordinate values ​​(setXY).
 * 
 * @author USER
 *
 */

public class Position {
	private int x;
	private int y;
	
	public Position(int x, int y)
	{
		setXY(x,y);
	}
	
	public Position()
	{
		this(0, 0);
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void incX(int inc)
	{
		x += inc;		
	}
	
	public void decX(int dec)
	{
		x -= dec;
	}
		
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void incY(int inc)
	{
		y += inc;		
	}
	
	public void decY(int dec)
	{
		y -= dec;
	}	
	
	public void setXY(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public String toString()
	{
		return  "[ " + x + " , " + y + " ]";
	}
}
