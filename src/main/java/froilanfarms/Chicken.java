package froilanfarms;

<<<<<<< HEAD
public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;

=======

public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;
    private static int id = 1;
    private int uniqueID;
    public Chicken(boolean fertilized){
        setHasBeenFertilized(fertilized);
        uniqueID = id++;
    }

>>>>>>> 4972cc33bd358456495f8e5a67800855b56d5fe3
    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

<<<<<<< HEAD
    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public EdibleObject yield() {
        return null;
=======
    public void yield(){}

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

>>>>>>> 4972cc33bd358456495f8e5a67800855b56d5fe3
    }
}
