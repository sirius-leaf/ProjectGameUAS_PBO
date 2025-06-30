import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien2 extends Actor
{
    /**
     * Act - do whatever the alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-10, getY()); //arah gerakan alien2
        
        if (getX() <= 0) 
        {
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()) + 50);
        }
        
        if (getY() >= getWorld().getHeight() - 1) 
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), -50);
        }
    
        if(isTouching(laser.class)) 
        {
           removeTouching(laser.class);
           getWorld().addObject(new ledakan(),getX(),getY());
           alien2 newalien2 = new alien2();
            getWorld().addObject(newalien2, getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
           getWorld().removeObject(this);
        }
    }
}
