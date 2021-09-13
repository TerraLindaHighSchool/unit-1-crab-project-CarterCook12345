import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class Ocean extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public Ocean() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fish crab = new Fish();
        addObject(crab,263,189);
        FishFood worm = new FishFood();
        addObject(worm,142,66);
        FishFood worm2 = new FishFood();
        addObject(worm2,415,94);
        FishFood worm3 = new FishFood();
        addObject(worm3,469,227);
        FishFood worm4 = new FishFood();
        addObject(worm4,354,358);
        FishFood worm5 = new FishFood();
        addObject(worm5,192,465);
        FishFood worm6 = new FishFood();
        addObject(worm6,46,387);
        FishFood worm7 = new FishFood();
        addObject(worm7,87,285);
        FishFood worm8 = new FishFood();
        addObject(worm8,214,334);
        MeanFish lobster = new MeanFish();
        addObject(lobster,77,64);
        MeanFish2 meanFish2 = new MeanFish2();
        addObject(meanFish2,279,402);
        FishFood fishFood9 = new FishFood();
        addObject(fishFood9,428,504);
        MeanFish3 meanFish3 = new MeanFish3();
        addObject(meanFish3,399,174);
        MeanFish4 meanFish4 = new MeanFish4();
        addObject(meanFish4,109,319);
        for(int i = 0; i < 3; i++)
        {
            Bomb bomb = new Bomb();
            int imageWidth = bomb.getImage().getWidth();
            int imageHeight = bomb.getImage().getHeight();
            int xpos = imageWidth + Greenfoot.getRandomNumber(getWidth() - 2 * imageWidth);
            int ypos = imageHeight + Greenfoot.getRandomNumber(getHeight() - 2 * imageHeight);
            addObject(bomb,xpos,ypos);    
        }
    }
}