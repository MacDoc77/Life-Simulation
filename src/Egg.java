public class Egg
{
    private double hatchTime;
    private Point pos;
    private boolean parent;

    /**
     * Constructor for objects of class Egg
     */
    public Egg(double hatchTime, Point pos, boolean parent)
    {
        this.hatchTime = hatchTime;
        this.pos = pos;
        this.parent = parent;
    }
    
    public void hatch(int i){
        if (parent){
            drawArea.eggs.remove(i);
            Carnivore baby = new Carnivore(1, /*angle, speed, eggTime, evolutionRate,*/pos);
            drawArea.carnivores.add(baby);
        }
        else{
            drawArea.eggs.remove(i);
            Herbivore baby = new Herbivore(1, /*angle, speed, eggTime, evolutionRate,*/pos);
            drawArea.herbivores.add(baby);
        }
    }
}
