package unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private int num;
	private boolean correct;
	private int go;
	//private Alien alienOne;
	//private Alien alienTwo;

	/* uncomment once you are ready for this part
	 *
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);
		
		keys = new boolean[5];

		//instantiate other stuff
		
		num=22;
		num = (int)(Math.random()*10);
		
		
		ship = new Ship(100,100,5);
		this.addKeyListener(this);
		new Thread(this).start();
		ArrayList ammos = new ArrayList<Ammo>();
		setVisible(true);
		System.out.println("Try to guess the one digit number!");
		Scanner attempt = new Scanner(System.in);
		go = attempt.nextInt();
		if(go==num){
			correct=true;
		}
	}

   public void update(Graphics window)
   {
	   if(!correct){
	   System.out.println("Try to guess the one digit number!");
		Scanner attempt = new Scanner(System.in);
		go = attempt.nextInt();
		if(go==num){
			correct=true;
		}
	  }
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		Graphics graphToBack = back.createGraphics();

		
		
		
				
		graphToBack.setColor(Color.YELLOW);
		graphToBack.fillRect(0,0,800,600);
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("Guesserino Game, Guess a One digit number.\n"
				+ " Made by John Berry", 25, 50 );
		
		
		graphToBack.setColor(Color.red);
		graphToBack.fillRect(250,250,100,100);
		graphToBack.fillRect(450,250,100,100);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString(go+"", 300, 300);
		
		if(correct)
		graphToBack.drawString(num+"", 500, 300);
		else{
			graphToBack.drawString("?", 500, 300);
		}
		//graphToBack.drawString(num+"", 500, 200);

		//correct =true;
		
		if(correct){
			graphToBack.drawString("SUCCESS!",395,20);
			
		}
		
		//add code to move stuff


		//add in collision detection

		//ship.draw(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
		

	}


	public void keyPressed(KeyEvent e)
	{
		
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

