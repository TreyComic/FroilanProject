package froilanfarms;

public class CornStalk extends Crop
{
    @Override
    public EdibleObject yield()
    {
        return new EarCorn();
    }
}
