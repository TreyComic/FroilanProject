package froilanfarms;

public class Farmer extends Person implements Botanist, Rider{
    private Farm farm;
    public Farm getFarm() {
        return farm;
    }

    public Farmer(Farm farm){
        this.farm = farm;
    }
    public void buildFarm(Farm farm){
    }

    @Override
    public void eat() {
        System.out.println("Farmer is eating.");
    }
    @Override
    public void mount(Rideable rideable) {
        System.out.println("This " + rideable + " has been mounted");
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("This " + rideable + " has been dismounted");
    }

    @Override
    public void makeNoise() {
        System.out.println("Farmer is speaking.");

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
