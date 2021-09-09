import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Fish extends Actor
{
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    //Turns the Crab at the edge
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(50);
        }
    }
    //Checks for user key prsses so user can turn the Crab
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
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
    }
}    