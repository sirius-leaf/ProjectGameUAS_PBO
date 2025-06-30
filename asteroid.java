import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=1;
    public void act()
    {
        setLocation(getX()-x, getY()+5);
        if(getX() <= 0 || getX() >= getWorld().getWidth() - 1) 
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
        
        if(getY() >= getWorld().getHeight() - 1) 
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }

        if(isTouching(laser.class))
        {
            removeTouching(laser.class);
            getWorld().addObject(new ledakan(),getX(),getY());
            asteroid newasteroid = new asteroid();
            getWorld().addObject(newasteroid, getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            getWorld().removeObject(this);
        }
    
    }
}
