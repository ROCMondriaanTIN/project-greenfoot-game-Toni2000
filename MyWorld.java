
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class MyWorld extends World {
    private CollisionEngine ce;
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        
        int[][] map = {
                {17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,},
                {16,16,16,16,16,16,16,16,16,16,16,16,17,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,},
                {17,16,17,16,17,17,17,17,17,17,17,16,17,16,17,17,17,16,17,17,17,17,17,17,17,17,16,16,16,17,},
                {17,16,17,16,16,16,16,16,16,16,17,16,17,16,16,16,17,16,17,16,16,16,16,16,16,17,16,17,16,17,},
                {17,16,17,16,17,17,17,17,17,16,17,16,17,16,17,17,17,16,17,17,17,17,17,16,16,17,16,17,16,17,},
                {17,16,17,16,17,16,16,16,16,16,17,16,17,16,16,16,16,16,16,16,16,16,17,16,16,17,16,17,16,17,},
                {17,16,17,16,17,17,17,17,17,17,17,16,17,17,17,17,17,17,17,17,16,16,17,16,17,17,16,17,16,17,},
                {17,16,17,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,16,16,17,16,17,16,16,17,16,17,},
                {17,16,17,16,17,17,17,17,17,17,17,17,17,16,16,16,17,16,16,17,16,16,17,16,17,16,17,17,16,17,},
                {17,16,17,16,16,16,16,16,16,17,17,16,17,17,16,16,17,16,16,17,16,16,17,16,17,17,16,16,16,17,},
                {17,16,17,17,17,17,17,17,16,16,16,16,16,16,16,16,17,16,16,17,16,16,17,16,16,16,16,17,16,17,},
                {17,16,16,16,16,16,16,16,16,17,17,17,17,17,16,16,17,16,16,16,16,16,17,16,16,17,17,17,16,17,},
                {17,16,17,17,17,17,17,16,16,17,17,16,16,17,16,17,17,17,17,17,16,16,17,17,16,16,17,17,16,17,},
                {17,16,17,16,16,16,17,16,16,16,16,16,16,17,16,17,16,16,16,16,16,16,16,17,16,16,17,16,16,17,},
                {17,16,17,16,16,16,17,16,16,17,17,17,17,17,16,17,16,17,17,17,17,17,16,17,16,16,17,17,17,17,},
                {17,16,17,16,16,16,17,16,17,17,16,16,16,16,16,17,16,17,16,16,16,17,16,17,16,16,16,16,16,17,},
                {17,16,17,16,16,16,17,16,17,16,17,17,16,17,16,17,16,16,17,16,16,17,16,16,17,17,17,16,16,17,},
                {17,16,16,16,16,16,17,16,17,16,17,16,16,17,16,17,16,17,16,17,16,17,16,17,17,16,17,16,16,17,},
                {17,16,17,17,17,17,17,16,17,16,17,16,16,17,16,17,17,16,16,17,16,17,16,16,16,16,17,16,16,17,},
                {17,16,16,17,17,17,17,16,17,16,17,16,16,17,16,16,16,16,17,17,16,17,17,17,17,17,17,16,16,17,},
                {17,17,16,16,16,16,17,17,17,16,16,16,16,17,17,17,17,16,17,16,16,17,16,16,16,16,17,16,16,17,},
                {17,17,17,16,16,16,16,16,16,16,16,16,16,17,16,16,16,16,16,16,16,16,16,16,16,16,17,16,16,16,},
                {17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,},
        };

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 70, 70, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();
        Star star = new Star();
        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);
        
        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 30, 105);
        addObject(new Letters('J'),385,385);
        addObject(new Letters('U'),665,1155);
        addObject(new Letters('M'),1085,245);
        addObject(new Letters('P'),1925,945);
        addObject(star, 245, 660);
        //addObject(new Enemy(), 1170, 410);
        
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        
    @Override
    public void act() {
        ce.update();
    }
}
