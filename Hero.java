
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
        drag = 0.8;
        setImage("p12.png");
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
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -8;
        } 
        else if (Greenfoot.isKeyDown("d")) {
            velocityX = 8;
        }
        else if (Greenfoot.isKeyDown("w")) {
            velocityY = 8;
        }
        else if (Greenfoot.isKeyDown("a")) {
            velocityY = -8;
        }
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
