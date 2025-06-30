import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        start start = new start();
        addObject(start,572,452);
        start.setLocation(660,461);
        start.setLocation(584,466);
        start.setLocation(608,503);
        start.setLocation(593,461);
        start.setLocation(590,474);
        start.setLocation(644,480);
        start.setLocation(592,472);
    }
}
