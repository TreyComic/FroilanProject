package froilanfarms;

public class CropDuster extends Aircraft implements FarmVehicle{
    public boolean fertilize(CropRow cropRow) {
        return true;
    }

    @Override
    public void operate(Farm farm) {
        System.out.println("Now operating crop duster on " + farm);
    }
    @Override
    public void makeNoise() {
        System.out.println("Crop duster engine noise");
    }
    @Override
    public void fly(Pilot pilot) {
        System.out.println("The crop duster is flying");
    }
}
