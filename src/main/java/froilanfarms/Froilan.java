package froilanfarms;

public class Froilan extends Farmer{
    public Froilan(Farm farm) {
        super(farm);
    }

    @Override
    public void buildFarm() {

    }

    @Override
    public void eat() {

    }
    @Override
    public void mount(Rideable rideable) {
        System.out.println("This " + rideable + " is in use");
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("This " + rideable + " is free to use");
    }

    @Override
    public void makeNoise() {
        System.out.println("Froilan is speaking.");

    }

    @Override
    public void plant(Crop crop, CropRow croprow) {
        for(int i = 0; i < croprow.rowCrops.length; i++) {
            if (croprow.rowCrops[i] == null) {
                croprow.rowCrops[i] = crop;
            }
        }

    }

}
