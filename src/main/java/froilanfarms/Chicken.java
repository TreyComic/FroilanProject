package froilanfarms;

public class Chicken extends Animal implements Produce {
    private boolean hasBeenFertilized;
    private static int id = 0;
    private int uniqueID;
    public Chicken() {
        this.hasBeenFertilized = true;
        this.uniqueID = id;
        id++;
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
            return new Egg();
        }
        return null;
    }


    @Override
    public void eat() {
        System.out.println("Eats corn");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cluck cluck!");
    }
}
