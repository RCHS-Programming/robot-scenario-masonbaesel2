import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (mason baesel) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    /**
     * Act - do whatever the robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
        detectWallCollision();
        detectblockCollision();
        detecthouseCollision();
        eatPizza();
    }    
    public void robotMovement()
    {
        if (Greenfoot.isKeyDown("up"))
        setLocation(getX(), getY()-5);
    
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        
    }
    public void detectWallCollision()
    {
        if (isTouching(wall.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectblockCollision()
    {
        if (isTouching(block.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detecthouseCollision()
    {
        if (isTouching(house.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(pizza.class);
        }
    }
}
