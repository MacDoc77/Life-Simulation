
/**
 * Write a description of class Hitbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hitbox
{
    private Rectangle box;
    public Hitbox(int xlocation, int ylocation, int length, int width)
    {
        this.xlocation = xlocation;
        this.ylocation = ylocation;
        this.length = length; 
        this.width = width;
        box = new Rectangle (xlocation, ylocation, length, width);
    }
    
    public Rectangle getBox(){
        return box;
    }
}
