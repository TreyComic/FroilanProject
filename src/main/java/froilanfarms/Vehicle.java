package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{
    private boolean isInUse;

    @Override
    public void makeNoise() {
        System.out.println("Vehicle is making noise!!");
    }

    @Override
    public void ride() {
        System.out.println("You are riding the vehicle!!");
    }
}
