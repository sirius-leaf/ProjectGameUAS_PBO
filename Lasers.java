import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lasers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lasers extends Actor
{
    /**
     * Act - do whatever the Lasers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {}
    
    protected void removeLaserAtEdge() {
        if(isAtEdge()) getWorld().removeObject(this);
    }
}
