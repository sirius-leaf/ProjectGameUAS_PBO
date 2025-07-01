import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgain extends Actor
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage playAgain;
    private GreenfootImage PlayAgainClicked;
    public playAgain() {
        // Ambil gambar dan ubah ukurannya
        GreenfootImage img = getImage();
        img.scale(300, 300); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    public void act()
    {
        animatePlayAgain();
    }
    public void animatePlayAgain()
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
