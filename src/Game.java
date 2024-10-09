
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.util.ArrayList;


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key, x, y;
	private ArrayList<Characters> charList;
	private String screen;
	private Characters player;



	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
		x=0;
		y=0;
		charList = setCharList();
		screen = "start";
		System.out.println(charList.get(0));


		
	
	}

	public ArrayList<Characters> setCharList(){
		ArrayList<Characters> temp = new ArrayList<Characters>();
		temp.add(new Milam(100,100));
		temp.add(new Aarav(200,200));
		temp.add(new Holden(300,300));
		return temp;
	}

	public void drawScreens (Graphics g2d){
		switch(screen){
			case "start":
				for(Characters c : charList){
					System.out.println(c);
				}
				break;
			case "selection":
				drawSelectScreen(g2d);
		}
	}

	public void drawSelectScreen(Graphics g2d){
		player.drawChar(g2d);
		g2d.drawString("You picked"+player.toString(),100,100);
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
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
	
		g2d.setFont( new Font("Broadway", Font.BOLD, 50));
		
		g2d.drawString("Hello!" , x, y);
		
		
	
		twoDgraph.drawImage(back, null, 0, 0);

	}

	



	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		if(key==32){
			screen="selection";
			player=charList.get(0);
		}

		
		
		
	
	}


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}



	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x=arg0.getX();
		y=arg0.getY();
	}



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//check screen
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("entered");
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("exited");
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("you clicked at"+ arg0.getY());
		x=arg0.getX();
		y=arg0.getY();
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	
}
