import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LetterLos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterLos extends Actor
{
    public static int teller;
    protected char letter;
    public LetterLos(char letter){
        this.letter = letter;
        setImage("L_" + letter + ".png");
    }
}