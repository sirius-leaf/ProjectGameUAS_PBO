import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    GreenfootImage img = new GreenfootImage("ledakan.png");
    
    /**
     * Act - do whatever the ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay=0;
    public void act()
    {
        if(delay >= 50) {
            getWorld().removeObject(this);
        } else {
            delay++;
            
            /*int imgScale = (int)(70 * ((50 - delay) / 50.0));
            img.scale(imgScale, imgScale);
            setImage(img);*/
        }
    }
}
