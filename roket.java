import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roket extends Actor
{
    public int health = 5;
    int delay = 0;
    boolean isShooting = false;
    boolean justStarted = true;
    
    public GreenfootSound bgm = new GreenfootSound("bgm.wav");
    
    GreenfootImage[] frame = {
        new GreenfootImage("player (1).png"),
        new GreenfootImage("player (2).png"),
        new GreenfootImage("player (3).png"),
    };
    
    int[] frameTime = {0, 0};
    
    /**
     * Act - do whatever the roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (justStarted) {
            bgm.playLoop();
            
            justStarted = false;
        }
        
        if (health > 0) {
            Animate();
            checkKeyPress();
            facingMouse();
            checkCollision();
        } else {
            Death();
        }
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-5);
        }else if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            setLocation(getX()-5, getY());
        }else if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            setLocation(getX()+5, getY());
        }
    }
    
    public void shooting()
    {
        int bulletOriginDistance = 100;
        int playerRotation = getRotation();
        
        delay++;
        if(delay==15) // kecepatan nembak roket
        {
            getWorld().addObject(new laser(playerRotation), getX() + (int)(bulletOriginDistance * Math.cos(playerRotation * (Math.PI / 180.0))), getY() + (int)(bulletOriginDistance * Math.sin(playerRotation * (Math.PI / 180.0))));
            Greenfoot.playSound("laserShootPlayer.wav");
            
            delay=0;
        }
    }
    
    public void facingMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if (mouse != null) {
            int rotation = (int) (Math.atan2(mouse.getY() - getY(), mouse.getX() - getX()) * (180.0 / Math.PI));
            setRotation(rotation);
            
            if (Greenfoot.mousePressed(null)) {
                isShooting = true;
            } else if (Greenfoot.mouseClicked(null)) {
                isShooting = false;
            }
            
            if (isShooting) shooting();
        }
    }
    
    public void checkCollision() {
        galaxy scene = (galaxy)getWorld();
        
        Actor alien = getOneIntersectingObject(Alien.class);
        if (alien != null) {
            health--;
        }
        
        Actor asteroid = getOneIntersectingObject(asteroid.class);
        if (asteroid != null) {
            health--;
            getWorld().addObject(new ledakan(),getX(),getY());
            getWorld().removeObject(asteroid);
            getWorld().addObject(new asteroid(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        
        Actor alien2 = getOneIntersectingObject(alien2.class);
        if (alien2 != null) {
            health--;
            getWorld().addObject(new ledakan(),getX(),getY());
            getWorld().removeObject(alien2);
            getWorld().addObject(new alien2(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        
        Actor laser2 = getOneIntersectingObject(laser2.class);
        if (laser2 != null) {
            health--;
            getWorld().addObject(new ledakan(),getX(),getY());
            getWorld().removeObject(laser2);
        }
    }
    
    int deathDelay = 0;
    boolean isAlive = true;
    public void Death() {
        setImage("blank.png");
        
        if (isAlive) {
            getWorld().addObject(new ledakan(1),getX(),getY());
            
            isAlive = false;
        }
        
        if (deathDelay++ > 40) {
            Greenfoot.delay(5);
            bgm.stop();
            Greenfoot.setWorld(new gameOver());
        }
    }
    
    public void Animate() {
        if (frameTime[0]++ > 2) {
            setImage(frame[frameTime[1]++ % 3]);
            
            frameTime[0] = 0;
        }
    }
}
