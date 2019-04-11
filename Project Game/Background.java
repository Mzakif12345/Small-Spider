import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends MyWorld
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        fly fly = new fly();
        addObject(fly,245,114);
        score score = new score();
        addObject(score,420,50);
        bola bola = new bola();
        addObject(bola,517,51);
        spider spider = new spider();
        addObject(spider,65,229);
    }
}
