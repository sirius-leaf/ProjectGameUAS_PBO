import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser2 extends Actor
{
    /**
     * Act - do whatever the laser2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-20, getY()); // arah & kecepatan tembakan laser
        if(isAtEdge())
            getWorld().removeObject(this);
    }
}
