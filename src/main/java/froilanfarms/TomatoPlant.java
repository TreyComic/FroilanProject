package froilanfarms;

public class TomatoPlant extends Crop {
    public TomatoPlant() {
        super();
    }
    @Override
    public EdibleObject yield() {
        if (this.isFertilized() && this.isHarvested() == false) {
            this.setHarvested(true);
            return new Tomato();
        } else {
            return null;
        }
    }
}
