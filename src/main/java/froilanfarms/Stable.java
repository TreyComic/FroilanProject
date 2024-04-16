package froilanfarms;

public class Stable {
    private Horse[] horses;
    private int StaticID;
    private final int UniqueID;

    public Horse[] getHorses() {
        return horses;
    }

    public int getUniqueID() {
        return UniqueID;
    }

    public Stable(){
        this.horses = new Horse[4];
        UniqueID = StaticID;
        StaticID++;
    }
}
