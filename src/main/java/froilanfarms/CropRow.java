package froilanfarms;
public class CropRow{
    private Crop[] cropRow;

    private int id = 0;

    public static int uniqueID;

    public int getId(){
        return id;
    }

    public void setCropRow(Crop[] cropRow) {
        this.cropRow = cropRow;
    }
     public CropRow(){
         this.cropRow = new Crop[10];
         uniqueID++;
         id = uniqueID;
     }

}
