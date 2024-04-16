package froilanfarms;

public class Farmer extends Person implements Botanist, Rider{
    private Farm farm;
    public Farm getFarm() {
        return farm;
    }

    public Farmer(Farm farm){
        this.farm = farm;
    }
    public void buildFarm(){}
    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println();
    }
    @Override
    public void mount(Rideable rideable) {
        if(rideable instanceof Vehicle) {
            ((Vehicle) rideable).setInUse(true);
        }
        rideable.ride();
        System.out.println("This " + rideable + " is in use");
    }

    @Override
    public void dismount(Rideable rideable) {
        if(rideable instanceof Vehicle) {
            ((Vehicle) rideable).setInUse(false);
        }
        System.out.println("This " + rideable + " is free to use");
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
