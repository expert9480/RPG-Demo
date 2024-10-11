
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
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


		
	
	}

	public ArrayList<Characters> setCharList(){
		ArrayList<Characters> temp = new ArrayList<Characters>();
		temp.add(new Character1(100,100));
		temp.add(new Character2(100,100));
		temp.add(new Character3(100,100));
		temp.add(new Character4(100,100));
		return temp;
	}

	public void drawScreens (Graphics g2d){
		switch(screen){
			case "start":
				g2d.drawString("Press space to start",100,100);
			break;
			case "selection":
				drawSelectScreen(g2d);
			break;
			case "charInfo":
				drawCharInfo(g2d);
			break;
			case "game":
				g2d.drawString("Game",100,100);
		}
	}

	public void drawSelectScreen(Graphics g2d){
//		System.out.println(player);
		g2d.drawString("Select your character",100,100);
		for(int i=0; i<charList.size(); i++){
			g2d.drawString((i+1)+": "+charList.get(i).getType(),100,200+(i*100));
		}
		//drawCharInfo(g2d);
	}

	public void drawCharInfo(Graphics g2d){
		if (player != null) {
			g2d.drawString("You picked"+player.getType(),100,100);
			g2d.drawString("You picked"+player.getHealth(),100,150);
			g2d.drawString("You picked"+player.getSpeed(),100,200);
			g2d.drawString("You picked"+player.getDamage(),100,250);
			g2d.drawString("You picked"+player.getStam(),100,300);
			player.setX(200);
			player.setY(350);
			player.setW(200);
			player.setH(200);
			player.drawChar(g2d);
			g2d.drawString("Press space to start",100,600);
			g2d.drawString("Press esc to go back",100,650);
		}
		else {
			g2d.drawString("No character selected", 100, 100);
		}
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
		g2d.setFont( new Font("Broadway", Font.BOLD, 40));
//		g2d.drawString("Hello!" , x, y);

		drawScreens(g2d);

	
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
		if((key==32) && (screen == "start")){
			screen="selection";
		}
		if ((key==49 && (screen == "selection"))){
			player=charList.get(0);
			screen="charInfo";
		}
		if ((key==50) && (screen == "selection")){
			player=charList.get(1);
			screen="charInfo";
		}
		if ((key==51) && (screen == "selection")){
			player=charList.get(2);
			screen="charInfo";
		}
		if ((key==52) && (screen == "selection")){
			player=charList.get(3);
			screen="charInfo";
		}
		if ((key==27) && (screen == "charInfo")){
			screen = "selection";
		}
		if((key==32) && (screen == "charInfo")){
			screen = "game";
		}

		// if (key == 87 && (screen == "game")) {
		//     //-1
		//     player.setDy(-1);
		////     player.setPic(new ImageIcon("assets/farmer/walkUp.gif"));
		//     player.getPic().getImage().flush();
		// }
		// if (key == 83 && (screen == "game")) {
		//     player.setDy(1);
		////     player.setPic(new ImageIcon("assets/farmer/walkDown.gif"));
		//     player.getPic().getImage().flush();
		// }
		// if (key == 65 && (screen == "game")) {
		//     //-1
		//     player.setDx(-1);
		////     player.setPic(new ImageIcon("assets/farmer/walkLeft.gif"));
		//     player.getPic().getImage().flush();
		// }
		// if (key == 68 && (screen == "game")) {
		//     player.setDx(1);
		////     player.setPic(new ImageIcon("assets/farmer/walkRight.gif"));
		//     player.getPic().getImage().flush();
		// }

		// //-1
		// if ((sprint) && player.getDX() == -1 && (screen == "game")) {
		//     player.setDx(-2*1);
		//     //1
		// } else if ((sprint) && player.getDX() == 1 && (screen == "game")) {
		//     player.setDx(2*1);
		// } else if ((sprint) && player.getDY() == -1 && (screen == "game")) {
		//     player.setDy(-2*1);
		// } else if ((sprint) && player.getDY() == 1 && (screen == "game")) {
		//     player.setDy(2*1);
		// }


		
		
		
	
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
