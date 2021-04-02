import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class robot here.
 * 
 * @author (mason baesel) 
 * @version (a version number or a date)
 */
public class robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    private int lives = 5;
    private int score;
    private int pizzaEaten;
    private GreenfootImage robotimage= new GreenfootImage("gameover.png");
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
        {
        setLocation(getX(), getY()-5);
        animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
            animate();
        }
        
    }
    public void detectWallCollision()
    {
        if (isTouching(wall.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectblockCollision()
    {
        if (isTouching(block.class))
        {
            setLocation(50, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detecthouseCollision()
    {
        if (isTouching(house.class))
        {
            setLocation(50, 50);
            if (pizzaEaten == 5)
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(pizza.class);
            pizzaEaten += 1;
        }
    }
    public void animate()
    {
        if (getImage() == robotimage1)
        {
            setImage (robotimage2);
        }
        else
        {
            setImage (robotimage1);
        }
    }
    public void removeLife()
    {
        lives -= 1;
        testEndGame();
    }
    public void testEndGame()
    {
        if (lives <= 0)
        {
            Greenfoot.stop();
            setImage ("gameover.png");
        }
    }
}
