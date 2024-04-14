package froilanfarms;

public abstract class Farmer extends Person implements Botanist, Rider{
    private Farm farm;
    public Farm getFarm() {
        return farm;
    }

    public Farmer(Farm farm){
        this.farm = farm;
    }
    public abstract void buildFarm();
}
