import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeanFish2 here.
 * A different mean fish, that moves in a different direction than the others
 * Carter Cook 
 * @version (a version number or a date)
 */
public class MeanFish2 extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        turnAtEdge();
    }
//Turns the Crab at the edge
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(-50);
        }
    }
}
