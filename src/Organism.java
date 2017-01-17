public abstract class Organism
{
    // instance variables - replace the example below with your own
    private Hitbox hitbox;
    private Point pos;
    private int size;
    private double angle;
    private double eggTime, evolutionRate;
    private boolean living, diet;
    public Organism(int size, double angle, double eggTime, double evolutionRate, boolean living, Point pos)
    {
        this.size = size;
        this.angle = angle;
        this.eggTime = eggTime;
        this.evolutionRate = evolutionRate;
        this.living = living;
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
    
    abstract void egg(){
    }

    abstract void evolve(){
    }
  
    abstract void hitBoxCheck(Rectangle rec2){
    }
}
