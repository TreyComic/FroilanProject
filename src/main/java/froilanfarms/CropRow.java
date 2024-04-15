package froilanfarms;
public class CropRow
{
    Crop[] rowCrops;
    public CropRow(Crop[] rowCrops)
    {
        this.rowCrops=rowCrops;
    }
    public void fertilize()
    {
        for (Crop thisCrop:rowCrops)
            thisCrop.fertilize();
    }
    public void harvest()
    {
        for (Crop thisCrop:rowCrops)
        {
            thisCrop.harvest();
        }
    }
}
