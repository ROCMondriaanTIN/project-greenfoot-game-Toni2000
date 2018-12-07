import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letters extends Mover
{
    public static int teller;
    protected char letter;
    public Letters (char letter)
    {
        this.letter = letter;
        setImage("L_" + letter + ".png");
    }
    public void update()
    {
        
    }
    public void act() 
    {
        applyVelocity();
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                getWorld().addObject(new LetterLos(this.letter), 100+(teller*100), 700);
                getWorld().removeObject(this);
                teller++;
                break;
            }
        }
    }
}
    