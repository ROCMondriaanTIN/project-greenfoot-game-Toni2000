
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letters extends Mover
{
    public Letters()
    {
        
    }
    /**
     * Act - do whatever the Letters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        makeWord();
    }
    public void changeLetter(int letter)
    {
        switch(letter)
        {
            case 0:
                setImage("L_A.png"); 
                break;
            case 1:
                setImage("L_B.png"); 
                break;
            case 2:
                setImage("L_C.png"); 
                break;
            case 3:
                setImage("L_D.png"); 
                break;
            case 4:
                setImage("L_E.png"); 
                break;
            case 5:
                setImage("L_F.png"); 
                break;
            case 6:
                setImage("L_G.png"); 
                break;
            case 7:
                setImage("L_H.png"); 
                break;
            case 8:
                setImage("L_I.png"); 
                break;
            case 9:
                setImage("L_J.png"); 
                break;
            case 10:
                setImage("L_K.png"); 
                break;
            case 11:
                setImage("L_L.png"); 
                break;
            case 12:
                setImage("L_M.png"); 
                break;
            case 13:
                setImage("L_N.png"); 
                break;
            case 14:
                setImage("L_O.png"); 
                break;
            case 15:
                setImage("L_P.png"); 
                break;
            case 16:
                setImage("L_Q.png"); 
                break;
            case 17:
                setImage("L_R.png"); 
                break;
            case 18:
                setImage("L_S.png"); 
                break;
            case 19:
                setImage("L_T.png"); 
                break;
            case 20:
                setImage("L_U.png"); 
                break;
            case 21:
                setImage("L_V.png"); 
                break;
            case 22:
                setImage("L_W.png"); 
                break;
            case 23:
                setImage("L_X.png"); 
                break;
            case 24:
                setImage("L_Y.png"); 
                break;
            case 25:
                setImage("L_Z.png"); 
                break;
            default:
                setImage("Grass.png");
                break;
        }
    }
    public void makeWord()
    {
        World world = getWorld();
        changeLetter(17);
        world.addObject(new Letters(), 385, 385);
    }
}
