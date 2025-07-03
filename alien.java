import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends AlienShip
{
    int delay = 0;
    int speed = 5;
    int winDelay = 0;
    
    public Alien() {
        super(30);
        GreenfootImage img = getImage();
        img.scale(147, 162); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getX() > 1000) move(-10);
        
        // Menggerakkan objek ke atas atau ke bawah
        setLocation(getX(), getY() + speed);

        // Jika mencapai batas bawah, balik arah
        if (getY() >= getWorld().getHeight() - 1 || getY() <= 0) 
        {
            speed *= -1; // Gerak ke atas
        }
        
        if (!HealthIsZero()) {
            HitCheck();
            shooting();
        } else {
            Death();
        }
    }
    
    public void shooting()
    {
        if(delay++ >= 100) // kecepatan nembak alien
        {
            getWorld().addObject(new laser2(),getX()+100,getY());
            
            Greenfoot.playSound("laserShootBoss.wav");
            
            delay=0;
        }
    }
    
    boolean isAlive = true;    
    public void Death() {
        setImage("blank.png");
        
        if (isAlive) {
            getWorld().addObject(new ledakan(2),getX(),getY());
            
            isAlive = false;
        }
        
        if (winDelay++ > 50) {
            Roket player = getWorld().getObjects(Roket.class).get(0);
            player.bgm.stop();
            Greenfoot.setWorld(new Win());
        }
    }
}
