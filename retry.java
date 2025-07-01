import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class retry extends Actor
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage retry;
    private GreenfootImage retyClicked;
    public retry() {
        // Ambil gambar dan ubah ukurannya
        GreenfootImage img = getImage();
        img.scale(200, 200); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    public void act()
    {
        animateRetry();
    }
    public void animateRetry()
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
