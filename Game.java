

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

public class Game extends Applet implements Runnable, KeyListener{
	
	private Image main,food,water,land;
	private URL base;
	private Background bg1;
	
	@Override
	public void init(){
		setSize(600,600);
		setBackground(Color.white);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("TheHotnessOfGalenIsBlinding");
		try {
			base = getDocumentBase();
		} catch (Exception e) {	
		}

	}

	@Override
	public void start(){
		bg1= new Background();
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void stop() {
		
	}

	@Override
	public void destroy() {

	}
	

	@Override
	public void run() {
		while(true){
			
			
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
	
		
	}


	@Override
	public void keyReleased(KeyEvent e) {

		
	}


	@Override
	public void keyTyped(KeyEvent e) {

		
	}
	
	@Override
	public void paint(Graphics g) {

		
		g.drawImage(bg1.getImages(),200 , 200, this);
		//g.drawImage(bg1.getImage(),bg1.getSpot(), bg1.getSpot(), this);
//		g.drawImage(background, bg2.getBgX(), bg2.getBgY(), this);
//		g.drawImage(currentSprite, robot.getCenterX() - 61,
//				robot.getCenterY() - 63, this);
//		g.drawImage(heliboy, hb1.getCenterX(),hb1.getCenterY(),this);
//		g.drawImage(heliboy, hb2.getCenterX(),hb2.getCenterY(),this);
//		
	}

	


}
