import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossHealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossHealthBar extends Actor
{
    Alien alien;
    
    /**
     * Act - do whatever the BossHealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {}
    
    public void MoveWithAlien() {
        setLocation(alien.getX() + 80, alien.getY());
    }
}
