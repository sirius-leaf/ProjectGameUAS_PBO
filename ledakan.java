import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    /**
     * Act - do whatever the ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;
    public void act()
    {
        delay++;
        if(delay==50)
        getWorld().removeObject(this);
    }
}
