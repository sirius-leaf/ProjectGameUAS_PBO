import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldManager extends Actor
{
    boolean spawnBoss = true;
    boolean spawnAsteroid = true;
    
    /**
     * Act - do whatever the WorldManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        galaxy world = (galaxy) getWorld();
        
        if (world.score >= 150 && spawnAsteroid) {
            world.SpawnAsteroid(2);
            
            spawnAsteroid = false;
        }
        
        if (world.score >= 300 && spawnBoss) {
            world.SpawnBoss();
            
            spawnBoss = false;
        }
    }
}
