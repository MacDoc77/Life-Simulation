

/**
 * Write a description of class Carnivore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carnivore extends Organism
{
    private Hitbox box;
    public Carnivore(int size, double angle, double speed, double eggTime, double evolutionRate, Point pos)
    {
        super(size, angle, speed, eggTime, evolutionRate, pos);
        box = new Hitbox(pos.x - 4, pos.y - 4, 8, 8);
    }

    public Hitbox getHitbox(){
        return box;
    }
    
    public void eat(Herbivore org2, int i){
        org2.die(i);
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
        drawArea.carnivores.remove(i);
    }
}
