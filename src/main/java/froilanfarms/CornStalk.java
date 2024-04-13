package froilanfarms;

public class CornStalk extends Crop
{
    @Override
    public EdibleObject yield()
    {
        if ((super.isHarvested() && super.isFertilized()))
            return new EarCorn();
        else
            return null;
    }
}
