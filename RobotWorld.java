import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new robot(), 50, 50);
        addObject(new wall(), 55, 155);
        addObject(new wall(), 162, 155);
        addObject(new wall(), 269, 155);
        addObject(new wall(), 747, 155);
        addObject(new wall(), 641, 155);
        addObject(new block(), 452, 156);
        addObject(new house(), 756, 554);
        addObject(new ScorePanel(), 89, 548);
        addObject(new pizza(), 697, 58);
        addObject(new pizza(), 227, 58);
        addObject(new pizza(), 112, 378);
        addObject(new pizza(), 457, 382);
        addObject(new pizza(), 467, 555);
        
        
    }
}
