import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Fish extends Actor
{
    public void act()
    {
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    //Turns the Crab at the edge
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            Greenfoot.playSound("au.wav");
        }
    }
    //Checks for user key prsses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
        }
    }
    //Checks for collisions with other objects
    private void onCollision()
        {
            if(isTouching(FishFood.class))
        {
            removeTouching(FishFood.class);
            Greenfoot.playSound("slurp.wav");
            //Winning the game
            if(getWorld().getObjects(FishFood.class).size()==0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
            if(isTouching(MeanFish.class))
        {
                Greenfoot.playSound("au.wav");
                Greenfoot.setWorld(new LoseSplash());
                Greenfoot.stop();
        }    if(isTouching(Bomb.class))
        {
                Greenfoot.playSound("au.wav");
                Greenfoot.setWorld(new LoseSplash());
                Greenfoot.stop();
        
        }    if(isTouching(MeanFish2.class))
        {
                Greenfoot.playSound("au.wav");
                Greenfoot.setWorld(new LoseSplash());
                Greenfoot.stop();
        }
            if(isTouching(MeanFish3.class))
        {
                Greenfoot.playSound("au.wav");
                Greenfoot.setWorld(new LoseSplash());
                Greenfoot.stop();
        }
            if(isTouching(MeanFish4.class))
        {
                Greenfoot.playSound("au.wav");
                Greenfoot.setWorld(new LoseSplash());
                Greenfoot.stop();
        }
    }
}    