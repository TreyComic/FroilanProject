package froilanfarms;


public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;
    private static int id = 1;
    private int uniqueID;
    public Chicken(boolean fertilized){
        setHasBeenFertilized(fertilized);
        uniqueID = id++;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void yield(){}
}
