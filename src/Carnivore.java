public class Carnivore extends Organism
{
    private Hitbox box;
    public Carnivore(int size, double angle, double eggTime, double evolutionRate, boolean living, Point pos)
    {
        super(size, angle, eggTime, evolutionRate, living, pos);
        box = new Hitbox(pos.x - 4, pos.y - 4, 8, 8);
    }

    public Hitbox getHitbox(){
        return box;
    }
    
    public void eat(Herbivore org2){
        if (size >= org2.getSize())
            //eats organism
        else{
        }
            //thing passes through, doesn't eat
    }
    
    public void eat (Food food){
        
    }
    
    public void eat (Egg egg){
    }
    
    public void egg(){
    }
    
    public void evolve(){
    }
    
    public boolean hitBoxCheck(Rectangle rec2){
        if 
    }
}
