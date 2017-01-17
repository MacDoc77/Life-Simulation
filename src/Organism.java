public abstract class Organism
{
    // instance variables - replace the example below with your own
    private Hitbox hitbox;
    private Point pos;
    private int size;
    private double angle, speed;
    private double eggTime, evolutionRate;
    public Organism(int size, double angle, double speed, double eggTime, double evolutionRate, Point pos)
    {
        this.size = size;
        this.angle = angle;
        this.speed = speed;
        this.eggTime = eggTime;
        this.evolutionRate = evolutionRate;
        this.pos = pos;
    }
    
    public int getSize(){
        return size;
    }
    
    public double getAngle(){
        return angle;
    }
    
    abstract void eat(){
    }
    
    abstract Egg placeEgg(Point pos){
    }

    abstract void evolve(){
    }
    
    abstract void die(){
    }
}

