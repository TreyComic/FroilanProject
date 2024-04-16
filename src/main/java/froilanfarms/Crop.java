package froilanfarms;

public abstract class Crop
{

    private String cropType;
    private boolean isFertilized;
    private boolean isHarvested;
    public Crop() {
        boolean isFertilized = false;
        boolean isHarvested = false;
    }
    public abstract EdibleObject yield();

    public boolean isFertilized() {
        return isFertilized;
    }

    public boolean isHarvested() {
        return isHarvested;
    }

    public void setHarvested(boolean harvested) {
        isHarvested = harvested;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }
}
