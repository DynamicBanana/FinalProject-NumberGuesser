package unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private int x,y;
	private Image image;

	public Ammo()
	{
		this(0,0,0);
		try
		{
			image = ImageIO.read(new File("src/unit17/travs.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("argh!");
			//feel free to do something here
		}
	}

	public Ammo(int x, int y)
	{
		//add code
		setX(x);
		setY(y);
		setSpeed(7);
		try
		{
			image = ImageIO.read(new File("src/unit17/travs.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("argh!");
			//feel free to do something here
		}
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		setX(x);
		setY(y);
		setSpeed(s);
		try
		{
			image = ImageIO.read(new File("src/unit17/travs.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("argh!");
			//feel free to do something here
		}
	}
	public void move(){
		while(y>=0){
			
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
		window.drawImage(image,getX(),getY(),80,80,null);
		
	}

	public String toString()
	{
		return "";
	}
}
