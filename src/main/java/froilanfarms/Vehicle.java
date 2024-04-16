package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{
    

    public boolean getIsInUse() {
        return isInUse;
    }

    public void setIsInUse(boolean inUse) {
        isInUse = inUse;
    }

    @Override
    public abstract void makeNoise();

//    @Override
//    public void ride() {
//        System.out.println("You are riding the vehicle!!");
//    }
}
