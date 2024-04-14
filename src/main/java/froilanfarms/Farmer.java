package froilanfarms;

public abstract class Farmer extends Person implements Botanist, Rider{
    private Farm farm;
    public abstract void buildFarm();
}
