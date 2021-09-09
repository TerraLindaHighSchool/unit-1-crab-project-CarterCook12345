import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeanFish here.
 * A mean fish that turns around the world, ends the game if touched by player
 * Carter Cook 
 * @version (a version number or a date)
 */
public class MeanFish extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turnAtEdge();
    }
//Turns the Crab at the edge
    private void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(50);
        }
    }
}
