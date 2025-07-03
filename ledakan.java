import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ledakan extends Actor
{
    int mode = 0;
    
    public ledakan() {}
    
    public ledakan(int mode) {
        this.mode = mode;
    }
    
    GreenfootImage[][] frame = {
        {
            new GreenfootImage("explosion01.png"),
            new GreenfootImage("explosion02.png"),
            new GreenfootImage("explosion03.png"),
            new GreenfootImage("explosion04.png")
        },
        {
            new GreenfootImage("PlayerExplosion1.png"),
            new GreenfootImage("PlayerExplosion2.png"),
            new GreenfootImage("PlayerExplosion3.png"),
            new GreenfootImage("PlayerExplosion4.png")
        },
        {
            new GreenfootImage("BossExplosion1.png"),
            new GreenfootImage("BossExplosion2.png"),
            new GreenfootImage("BossExplosion3.png"),
            new GreenfootImage("BossExplosion4.png")
        }
    };
    
    int lifeTime = 20;
    int delay=0;
    
    /**
     * Act - do whatever the ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(delay++ >= lifeTime) {
            getWorld().removeObject(this);
        } else {
            setImage(frame[mode][(int)Math.min(Math.floor(delay / 5.0), 3)]);
        }
    }
}
