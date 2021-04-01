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
        }
    }
}
