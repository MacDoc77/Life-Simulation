public class Herbivore extends Organism
{
    Hitbox box;
    public Herbivore(int size, double angle, double speed, double eggTime, double evolutionRate, boolean living, Hitbox hitbox)
    {
        super(size, angle, speed, eggTime, evolutionRate, living, hitbox);
        box = new Hitbox(pos.x - 4, pos.y - 4, 8, 8);
    }
    
    public void eat (Food food, int i){
        food.remove(i);
    }
    
    public Egg placeEgg(Point pos){
        return new Egg (/*hatchtime variable*/, pos);
    }
    
    public void evolve(){
    }
    
    public boolean hitBoxCheck(Rectangle rec2){
        if ((box.getBox).intersects(rec2))
            return true;
        else 
            return false;
    }
    
    public void die(int i){
        drawArea.herbivores.remove(i);
    }
}
