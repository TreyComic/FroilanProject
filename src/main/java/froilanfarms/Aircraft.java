package froilanfarms;

public abstract class Aircraft extends Vehicle{
    public abstract void fly(Pilot pilot);
    @Override
    public void makeNoise() {
        System.out.println("Aircraft noise!");
    }
}
