package froilanfarms;

public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public EdibleObject yield() {
        return null;
    }
}
