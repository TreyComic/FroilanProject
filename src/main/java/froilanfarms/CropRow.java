package froilanfarms;
public class CropRow
{
    Crop[] rowCrops;
    public void fertilize()
    {
        for (Crop thisCrop:rowCrops)
            thisCrop.fertilize();
    }
    public EdibleObject[] harvest()
    {
        EdibleObject[] yield = new EdibleObject[rowCrops.length];
        int counter = 0;
        for (Crop thisCrop:rowCrops)
        {
            yield[counter] = thisCrop.harvest();
            counter++;
        }
        return yield;
    }
}
