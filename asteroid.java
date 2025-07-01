import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    int turnSpeed;
    int[] moveSpeed = new int[2];
    
    public asteroid() {
        turnSpeed = 3 - Greenfoot.getRandomNumber(5);
        moveSpeed[0] = Greenfoot.getRandomNumber(3);
        moveSpeed[1] = 3 + Greenfoot.getRandomNumber(2);
    }
    
    /**
     * Act - do whatever the asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=1;
    public void act()
    {
        setLocation(getX() - moveSpeed[0], getY() + moveSpeed[1]);
        
        if(getX() <= 0 || getX() >= getWorld().getWidth() - 1) 
        {
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
        }
        
        turn(turnSpeed);
        
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
            Greenfoot.playSound("smallExplode.wav");
            getWorld().removeObject(this);
        }
    
    }
}
