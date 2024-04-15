package froilanfarms;

public class TomatoPlant extends Crop
{
    private boolean isFertilized;
    private boolean isHarvested;



    @Override
    public EdibleObject yield()
    {
            return new Tomato();
    }
}
