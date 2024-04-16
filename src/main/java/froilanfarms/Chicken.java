package froilanfarms;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;
    private static int id = 0;
    private int uniqueID;
    private Egg egg;

    public Chicken(boolean fertilized) {
        setHasBeenFertilized(fertilized);
        uniqueID = id++;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    @Override
    public EdibleObject yield() {
        if(getHasBeenFertilized() == false) {
            EdibleObject egg = new Egg();
            return egg;
        }
        return null;
    }


    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println("Eats corn");
    }

    @Override
    public void makeNoise() {
        System.out.println("cluck cluck");
    }
}
