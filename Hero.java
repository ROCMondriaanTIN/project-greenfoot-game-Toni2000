
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double acc;
    private final double drag;

    public Hero() {
        super();
        acc = 0.6;
        drag = 0.4;
        setImage("p1.png");
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2/4;
        int myNewWidth = (int)myImage.getWidth()*2/4;
        myImage.scale(myNewWidth,myNewHeight);
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY *= drag;
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        for (Actor Letters : getIntersectingObjects(Letters.class)) {
            if (Letters != null) {
                getWorld().removeObject(Letters);
                break;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            velocityX = -14;
        } 
        else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            velocityX = 14;
        }
        else if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")) {
            velocityY = -14;
        }
        else if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")) {
            velocityY = 14;
        }
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
