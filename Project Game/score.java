import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int fly = 0;
    public void act() 
    {
        // Add your action code here.
        GreenfootImage Image = new GreenfootImage("Jumlah fly = " +fly, 25, Color.RED, null);
        setImage (Image);
    }    
}
