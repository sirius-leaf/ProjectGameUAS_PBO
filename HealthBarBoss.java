import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBarBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBarBoss extends Actor
{
    GreenfootImage img = new GreenfootImage("healt_bar.png");
    Alien alien;
    
    /**
     * Act - do whatever the HealthBarBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (!getWorld().getObjects(Alien.class).isEmpty()) {
            alien = getWorld().getObjects(Alien.class).get(0);
        
            img.scale(10, (int)(80 * (alien.health / 30.0)));
            setImage(img);
            
            setLocation(alien.getX() + 80, alien.getY());
        } else {
            getWorld().removeObject(this);
        }
    }
}
