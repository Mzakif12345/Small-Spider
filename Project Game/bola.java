import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (5);
        if(getY()<=5 || getY() >= getWorld().getHeight() -5)
        turn(180);
        Actor spider = getOneObjectAtOffset(0,0, spider.class);
        if(spider != null){
            removeTouching(spider.class);
            Greenfoot.stop();
            getWorld().addObject(new kalah(), 300, 200);
        }
    }    
}
