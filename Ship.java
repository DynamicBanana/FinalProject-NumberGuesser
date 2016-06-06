package unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -



/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(0,0,0);
	}

	public Ship(int x, int y)
	{
		this(x,y,0);
		setSpeed(5);
	}

	public Ship(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("src/unit17/ship.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("argh!");
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed =s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
