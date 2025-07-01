import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    GreenfootImage[] frame = {
        new GreenfootImage("explosion01.png"),
        new GreenfootImage("explosion02.png"),
        new GreenfootImage("explosion03.png"),
        new GreenfootImage("explosion04.png"),
    };
    
    int lifeTime = 20;
    int delay=0;
    
    /**
     * Act - do whatever the ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(delay++ >= lifeTime) {
            getWorld().removeObject(this);
        } else {
            setImage(frame[(int)Math.clamp(Math.floor(delay / 5.0), 0, 3)]);
        }
    }
}
