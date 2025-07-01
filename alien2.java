import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alien2 extends AlienShip
{
    /**
     * Act - do whatever the alien2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (justStarted) {
            health = 1;
            
            justStarted = false;
        }
        
        HitCheck();
        
        setLocation(getX()-10, getY()); //arah gerakan alien2
        
        if (getX() <= 0) 
        {
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        
        alien2 newAlien2 = new alien2();
        
        galaxy world = (galaxy) getWorld();
        if(HealthIsZero())
        {
            world.addScore(10);
        }
        
        Death(newAlien2);
    }
}
