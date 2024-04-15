package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{
    private boolean isInUse;

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    @Override
    public void makeNoise() {
        System.out.println("Vehicle is making noise!!");
    }

    @Override
    public void ride() {
        System.out.println("You are riding the vehicle!!");
    }
}
