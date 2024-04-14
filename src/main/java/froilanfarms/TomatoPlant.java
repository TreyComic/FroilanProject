package froilanfarms;

public class TomatoPlant extends Crop
{
    public TomatoPlant()
    {
        super();
    }
    @Override
    public EdibleObject yield()
    {
        if((super.isHarvested() && super.isFertilized()))
        {
            return new Tomato();
        }
        else
            return null;
    }
}
