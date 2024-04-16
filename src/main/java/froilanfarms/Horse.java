package froilanfarms;

public class Horse extends Animal implements Rideable{
    static int id = 1;
    int uniqueID;
    public Horse(){
        uniqueID = id++;
    }

    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println("Eats grains and oats.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}
