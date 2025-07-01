import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends AlienShip
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int speed = 5;

    public void act()
    {
        if (justStarted) {
            health = 30;
            
            justStarted = false;
        }
        
        // Menggerakkan objek ke atas atau ke bawah
        setLocation(getX(), getY() + speed);

        // Jika mencapai batas bawah, balik arah ke atas
        if (getY() >= getWorld().getHeight() - 1 || getY() <= 0) 
        {
            speed *= -1; // Gerak ke atas
        }
        
        HitCheck();
        
        if (HealthIsZero()) {
            getWorld().removeObject(this);
        }
        
        shooting();
    }
    
    public void shooting()
    {
        delay++;
        if(delay==100) // kecepatan nembak alien
        {
            getWorld().addObject(new laser2(),getX()+100,getY());
            
            Greenfoot.playSound("laserShootBoss.wav");
            
            delay=0;
        }
    }
}
