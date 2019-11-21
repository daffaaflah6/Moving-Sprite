package id.ac.its.syarif.gui2movingsprites;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {
    private int dx;
	private int dy;
    private List<Missile> missiles;
    
    public SpaceShip(int x, int y) {
        super(x,y);
    	
    	initSpaceShip();
    }
    
    public void initSpaceShip() {
    	missiles = new ArrayList<>();
    	
    	loadImage("C:/Users/NURHADI/eclipse-workspace/GUI2MovingSprites/resource/spaceship.png",60,120);
    	getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;
    }
    
    public List<Missile> getMissiles() {
    	return missiles;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT) dx = -2;
        else if(key == KeyEvent.VK_RIGHT) dx = 2;
        else if(key == KeyEvent.VK_UP) dy = -2;
        else if(key == KeyEvent.VK_DOWN) dy = 2;
        else if(key == KeyEvent.VK_SPACE) fire();
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT) dx = 0;
        else if(key == KeyEvent.VK_RIGHT) dx = 0;
        else if(key == KeyEvent.VK_UP) dy = 0;
        else if(key == KeyEvent.VK_DOWN) dy = 0;
    }
    
    public void fire() {
    	missiles.add(new Missile(x + w + 120, y + h / 2));
    }
}
