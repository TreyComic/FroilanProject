package froilanfarms;

abstract class Crop
{
    boolean isFertilized;
    boolean isHarvested;
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
    public EdibleObject yield();
}
