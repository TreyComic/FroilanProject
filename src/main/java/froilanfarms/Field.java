package froilanfarms;

public class Field 
{
    private CropRow[] cropRows;
    public void setCropRows(CropRow[] cropRows) 
    {
        this.cropRows = cropRows;
    }
    public Field()
    {
        this.cropRows = new CropRow[8];
    }
    public CropRow[] getCropRows()
    {
        return cropRows;
    }
}
