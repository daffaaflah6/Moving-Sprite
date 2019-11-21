package id.ac.its.syarif.gui2movingsprites;

public class Missile extends Sprite {
    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    public Missile(int x, int y) {
        super(x, y);
        
        initMissile();
    }
    
    private void initMissile() {
        loadImage("C:/Users/NURHADI/eclipse-workspace/GUI2MovingSprites/resource/missile.png",40,20);  
        getImageDimensions();
    }

    public void move() {
        
        x += MISSILE_SPEED;
        
        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}
