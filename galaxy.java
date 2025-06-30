import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class galaxy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class galaxy extends World
{
    private int nyawa = 5;
    public static int score = 0;
    
    
    /**
     * Constructor for objects of class galaxy.
     * 
     */
    public galaxy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        tampilNyawa();
        tampilScore();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        roket roket = new roket();
        addObject(roket,70,296);
        roket.setRotation(90);
        asteroid asteroid = new asteroid();
        addObject(asteroid,1160,141);
        asteroid asteroid2 = new asteroid();
        addObject(asteroid2,1168,344);
        asteroid asteroid3 = new asteroid();
        addObject(asteroid3,1157,255);
        asteroid2.setLocation(1165,586);
        asteroid3.setLocation(1168,581);
        asteroid.setLocation(1174,577);
        alien2 alien2 = new alien2();
        addObject(alien2,1173,93);
        alien2 alien22 = new alien2();
        addObject(alien22,1143,335);
        alien2 alien23 = new alien2();
        addObject(alien23,1080,464);
        alien2 alien24 = new alien2();
        addObject(alien24,19,576);
        alien2 alien25 = new alien2();
        addObject(alien25,18,28);
        alien alien = new alien();
        addObject(alien,1119,87);
    }
    
    public int getNyawa() {
        return nyawa;
    }
    
    public void setNyawa(int value) {
        nyawa = value;
    }
    
    public void tampilNyawa() {
        this.showText("Life : " + nyawa, 100, 100);
    }
    
    public void addScoore (int points) {
        this.score += points;
        this.tampilScore();
    }
    
    public void resetScore() {
        score = 0;
    }
    
    public void tampilScore() {
        showText("Score : " + score, 100, 50);
    }
}
