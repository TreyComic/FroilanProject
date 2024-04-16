package froilanfarms;

public class CropDuster extends Aircraft implements FarmVehicle{


    public void fertilize() {
        System.out.println("Crop duster is fertilizing crop row");
    }

    @Override
    public void operate() {
        System.out.println("Now operating crop duster on ");
    }
    @Override
    public void makeNoise() {
        System.out.println("Crop duster engine noise");
    }
    @Override
    public void fly() {
        System.out.println("The crop duster is flying and ready to fertilize");
    }
    @Override
    public void ride() {
        System.out.println("Crop duster is being flown over the field.");
    }
}
