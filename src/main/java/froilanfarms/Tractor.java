package froilanfarms;

public class Tractor extends Vehicle implements FarmVehicle{
    public boolean harvest(Crop crop) {
        return true;
    }

    @Override
    public void operate(Farm farm) {
        System.out.println("now operating tractor on " + farm);
    }
}
