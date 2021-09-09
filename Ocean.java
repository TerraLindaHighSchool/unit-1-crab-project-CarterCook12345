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
        Bomb bomb = new Bomb();
        addObject(bomb,444,395);
        Bomb bomb2 = new Bomb();
        addObject(bomb2,92,452);
        Bomb bomb3 = new Bomb();
        addObject(bomb3,283,56);
        MeanFish2 meanFish2 = new MeanFish2();
        addObject(meanFish2,279,402);
        FishFood fishFood9 = new FishFood();
        addObject(fishFood9,428,504);
    }
}