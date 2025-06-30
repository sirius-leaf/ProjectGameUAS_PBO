import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossHealthBarFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossHealthBarFrame extends Actor
{
    Alien alien;
    
    /**
     * Act - do whatever the BossHealthBarFrame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!getWorld().getObjects(Alien.class).isEmpty()) {
            alien = getWorld().getObjects(Alien.class).get(0);
            
            setLocation(alien.getX() + 80, alien.getY());
        } else {
            getWorld().removeObject(this);
        }
    }
}
