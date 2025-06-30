import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        addScore();
        move(10); //arah dan kecepatan tembakan laser
        if(isAtEdge())
            getWorld().removeObject(this);
    }
    
    public void addScore() {
        galaxy m = (galaxy) getWorld();
        if (m != null) {
        }
    }
}
