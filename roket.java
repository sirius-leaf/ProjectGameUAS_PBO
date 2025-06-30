import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roket extends Actor
{
    /**
     * Act - do whatever the roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int delayTembak = 0;
    public void act()
    {
        checkKeyPress();
        //tembak();
        shooting();
        //checkCollision();
        //if (getWorld() == null) return;
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
    }
    
    /*public void tembak() {
        if (delayTembak > 0) {
            delayTembak--;
            return;
        }
        
        if (Greenfoot.mouseClicked(null)) {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            int targetX = mouse.getX();
                int targetY = mouse.getY();

                int dx = targetX - getX();
                int dy = targetY - getY();
                double angle = Math.toDegrees(Math.atan2(dy, dx));

                laser laser = new laser();
                getWorld().addObject(laser, getX(), getY());
                laser.setRotation((int) angle);
                delayTembak= 15;// arah tembakan
            }
        }
    }*/

    
    public void shooting()
    {
        delay++;
        if(delay==15) // kecepatan nembak roket
        {
            getWorld().addObject(new laser(),getX()+100,getY());
            delay=0;
        }
    }
    
    
    public void checkCollision() {
        Actor alien = getOneIntersectingObject(alien.class);
        if (alien != null) {
            getWorld().removeObject(this);
        }
        
        Actor asteroid = getOneIntersectingObject(asteroid.class);
        if (asteroid != null) {
            getWorld().removeObject(this);
        }
        
        Actor alien2 = getOneIntersectingObject(alien2.class);
        if (alien2 != null) {
            getWorld().removeObject(this);
        }
        
        Actor laser2 = getOneIntersectingObject(laser2.class);
        if (laser2 != null) {
            getWorld().removeObject(this);
        }
    }
    
    
}
