package froilanfarms;

public class Froilan extends Farmer{
    @Override
    public void buildFarm() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("This " + rideable + " is in use");
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("This " + rideable + " is free to use");
    }

    @Override
    public void makeNoise() {
        System.out.println("Froilan is speaking.");

    }
}
