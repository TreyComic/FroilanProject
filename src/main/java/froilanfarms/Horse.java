package froilanfarms;

public class Horse extends Animal implements Rideable{
    static int id = 1;
    int uniqueID;
    public Horse(){
        uniqueID = id++;
    }

    @Override
    public void ride() {
        System.out.println("I'm riding a horse!");
    }

    @Override
    public void eat() {
        System.out.println("Eats grains and oats.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
}
