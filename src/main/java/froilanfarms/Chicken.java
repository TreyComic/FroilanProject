package froilanfarms;

public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;
    private static int id = 1;
    private int uniqueID;
    public Chicken(){
        uniqueID = id++;
    }

    public void yield(){}
}
