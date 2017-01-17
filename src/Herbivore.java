public class Herbivore extends Organism
{
    Hitbox box;
    public Herbivore(double eggTime, double angle, double evolutionRate, boolean living, Hitbox hitbox)
    {
        super(eggTime, angle, evolutionRate, living, hitbox);
        box = new Hitbox(pos.x - 4, pos.y - 4, 8, 8);
    }
    
    public void eat(Food food){
        //eats food
    }
    
    public void egg(){
    }
    
    public void evolve(){
    }
    
    public boolean hitBoxCheck (Rectangle rec2){
    }
}
