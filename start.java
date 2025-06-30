import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage Start;
    private GreenfootImage StartClicked;
    public start() {
        // Ambil gambar dan ubah ukurannya
        GreenfootImage img = getImage();
        img.scale(300, 300); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    public void act()
    {
        animateStart();
    }
    public void animateStart()
    {
        if (Greenfoot.mousePressed(this)) {
                int newWidth = (int) Math.round(getImage().getWidth() * 0.9);
                int newHeight = (int) Math.round(getImage().getHeight() * 0.9);
                getImage().scale(newWidth, newHeight);
            } 
        
        if (Greenfoot.mousePressed(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new galaxy());
        }
    }
}
