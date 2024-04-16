package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{
    private boolean isMounted;
    private boolean isBeingRidden;

    private static int id = 0;
    private int uniqueID;

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }

    public void setBeingRidden(boolean beingRidden) {
        isBeingRidden = beingRidden;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public boolean isBeingRidden() {
        return isBeingRidden;
    }

    public Vehicle(){
        this.uniqueID = id;
        id++;
    }

}
