package froilanfarms;

public class Tractor extends Vehicle implements FarmVehicle{
    public void harvest(Crop crop) {
        System.out.println("Harvesting " + crop.getClass());
        crop.setHarvested(true);
    }

    @Override
    public void operate(Farm farm) {
        System.out.println("now operating tractor on " + farm);
    }

    @Override
    public void makeNoise() {
        System.out.println("Tractor noise!");
    }
}
