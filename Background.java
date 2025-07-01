import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends Actor
{
    public Background() {
        GreenfootImage img = getImage();
        img.scale(2400, 600); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        if (getX() <= 0) setLocation(1200, getY());
    }
}
