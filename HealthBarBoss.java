import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBarBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBarBoss extends BossHealthBar
{
    GreenfootImage img = new GreenfootImage("healt_bar.png");
    
    /**
     * Act - do whatever the HealthBarBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        alien = getWorld().getObjects(Alien.class).get(0);
        
        MoveWithAlien();
        
        img.scale(10, Math.max((int)(80 * (alien.health / 30.0)), 1));
        setImage(img);
        
        if (alien.health <= 0) {
            getWorld().removeObject(this);
        }
    }
}
