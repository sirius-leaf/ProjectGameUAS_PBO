import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienShip extends Actor
{
    public int health;
    boolean justStarted = true;
    
    public AlienShip() {}
    
    public AlienShip(int health) {
        this.health = health;
    }
    
    /**
     * Act - do whatever the AlienShip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void HitCheck() {
        if(isTouching(laser.class)) 
        {
            removeTouching(laser.class);
            health--;
        }
    }
    
    public boolean HealthIsZero() {
        return (health <= 0) ? true : false;
    }
    
    public void Death(Actor ship) {
        if(HealthIsZero()) 
        {
            getWorld().addObject(new ledakan(),getX(),getY());
            getWorld().addObject(ship, getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            
            Greenfoot.playSound("smallExplode.wav");
            
            getWorld().removeObject(this);
        }
    }
}
