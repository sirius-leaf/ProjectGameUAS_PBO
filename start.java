import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Buttons
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public start() {
        // Ambil gambar dan ubah ukurannya
        GreenfootImage img = getImage();
        img.scale(300, 300); // atur ke ukuran yang diinginkan
        setImage(img);
    }
    
    public void act()
    {
        buttonBehavior(new galaxy());
    }
}
