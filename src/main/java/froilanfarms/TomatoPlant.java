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
        return new Tomato();
    }
}
