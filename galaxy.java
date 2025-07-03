import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class galaxy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class galaxy extends World
{
    public int score = 0;
    
    
    /**
     * Constructor for objects of class galaxy.
     * 
     */
    public galaxy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1);
        tampilScore();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        score = 0;

        WorldManager worldManager = new WorldManager();
        addObject(worldManager,0,0);

        Background background = new Background();
        addObject(background, 1200, 300);

        Roket roket = new Roket();
        addObject(roket,70,296);

        for (int i = 0; i < 3; i++) {
            alien2 alien2 = new alien2();
            addObject(alien2, Greenfoot.getRandomNumber(getWidth() - 500) + 500, Greenfoot.getRandomNumber(getHeight()));
        }
        
        PlayerHealthBar playerHealthBar = new PlayerHealthBar();
        addObject(playerHealthBar,107,46);
        
        PlayerHealthBarFrame playerHealthBarFrame = new PlayerHealthBarFrame();
        addObject(playerHealthBarFrame,107,46);
    }
    
    public void addScore (int points) {
        this.score += points;
        this.tampilScore();
    }
    
    public void resetScore() {
        score = 0;
    }
    
    public void tampilScore() {
        showText("Score : " + score, 600, 40);
    }
    
    public void SpawnBoss() {
        Alien alien = new Alien();
        addObject(alien, 1200, 98);

        HealthBarBoss healthBarBoss = new HealthBarBoss();
        addObject(healthBarBoss,0,0);

        BossHealthBarFrame bossHealthBarFrame = new BossHealthBarFrame();
        addObject(bossHealthBarFrame,0,0);
    }
    
    public void SpawnAsteroid(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            asteroid asteroid = new asteroid();
            addObject(asteroid, Greenfoot.getRandomNumber(getWidth() - 200) + 200, 0);

        }
    }
}
