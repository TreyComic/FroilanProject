package froilanfarms;

public abstract class Aircraft extends Vehicle{
    public void fly(Pilot pilot) {
        System.out.println(pilot + " is flying the aircraft!!");
    }
    @Override
    public void makeNoise() {
        System.out.println("Aircraft noise!");
    }
}
