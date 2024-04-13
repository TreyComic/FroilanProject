package froilanfarms;
public class CropRow
{
    Crop[] rowCrops;
    public void fertilize()
    {
        for (Crop thisCrop:rowCrops)
            thisCrop.fertilize();
    }
    public void harvest()
    {
        for (Crop thisCrop:rowCrops)
            thisCrop.harvest();
    }
}
