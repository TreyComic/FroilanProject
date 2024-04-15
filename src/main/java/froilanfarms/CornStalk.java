package froilanfarms;

public class CornStalk extends Crop {
    @Override
    public EdibleObject yield() {
        if (this.isFertilized() && this.isHarvested() == false) {
            this.setHarvested(true);
            return new EarCorn();
        } else {
            return null;
        }
    }
}
