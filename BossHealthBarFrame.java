import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossHealthBarFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossHealthBarFrame extends BossHealthBar
{
    /**
     * Act - do whatever the BossHealthBarFrame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        alien = getWorld().getObjects(Alien.class).get(0);
        
        MoveWithAlien();
        
        if (alien.health <= 0) {
            getWorld().removeObject(this);
        }
    }
}
