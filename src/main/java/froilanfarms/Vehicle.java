package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{

    @Override
    public abstract void makeNoise();

//    @Override
//    public void ride() {
//        System.out.println("You are riding the vehicle!!");
//    }
}
