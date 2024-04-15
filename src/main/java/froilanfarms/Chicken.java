package froilanfarms;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;
    private static int id = 1;
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
            return  egg;
        }
        return null;
    }


    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }
}
