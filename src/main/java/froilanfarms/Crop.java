package froilanfarms;

abstract class Crop
{
    private boolean isFertilized;
    private boolean isHarvested;
    public Crop()
    {
        boolean isFertilized = false;
        boolean isHarvested = false;
    }
    public void fertilize()
    {
        this.isFertilized = true;
    }
    public void harvest()
    {
        this.isHarvested = true;
    }
    public abstract EdibleObject yield();

    public boolean isFertilized() {
        return isFertilized;
    }

    public boolean isHarvested() {
        return isHarvested;
    }
}
