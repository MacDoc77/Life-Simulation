public class Egg
{
    private int nutrition;
    private double hatchTime;
    private Hitbox box;
    private Point pos;
    private int xlocation, ylocation, length, width;

    /**
     * Constructor for objects of class Egg
     */
    public Egg(int nutrition, double hatchTime, Point pos)
    {
        this.nutrition = nutrition;
        this.hatchTime = hatchTime;
        this.pos = pos;
        box = new Hitbox(pos.x - 1, pos.y - 1, 3, 3);
    }
}
