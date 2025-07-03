import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerHealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerHealthBar extends Actor
{
    GreenfootImage img = new GreenfootImage("playerHealthBar.png");
    Roket player;
    
    /**
     * Act - do whatever the PlayerHealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (!getWorld().getObjects(Roket.class).isEmpty()) {
            player = getWorld().getObjects(Roket.class).get(0);
            
            img.scale(Math.max((int)(165 * (player.health / 5.0)), 1), 42);
            setImage(img);
            
            setLocation((int)(107 - 82.5 * ((5 - player.health) / 5.0)), getY());
        }
    }
}
