import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {}
    
    protected void buttonBehavior(World nextWorld) {
        if (Greenfoot.mousePressed(this)) {
            int newWidth = (int) Math.round(getImage().getWidth() * 0.9);
            int newHeight = (int) Math.round(getImage().getHeight() * 0.9);
            getImage().scale(newWidth, newHeight);
            Greenfoot.delay(5);
            Greenfoot.setWorld(new galaxy());
        }
    }
}
