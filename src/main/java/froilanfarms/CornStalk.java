package froilanfarms;

public class CornStalk extends Crop
{
    private boolean isFertilized;
    private boolean isHarvested;
        @Override
    public EdibleObject yield()
    {
        return new EarCorn();
    }
}
