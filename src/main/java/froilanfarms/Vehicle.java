package froilanfarms;

public abstract class Vehicle implements NoiseMaker, Rideable{
    private boolean isMounted;
    private boolean isBeingRidden;

    private static int id = 0;
    private int uniqueID;

    public void setMounted(boolean isMounted) {
        if (Rider.mount()){
            isMounted = true;
        } else {isMounted = false;}
        this.isMounted = isMounted;

    }

    public void setBeingRidden(boolean isBeingRidden) {
        if (Rider.dismount()) {
            isBeingRidden = false;
        } else {isBeingRidden = true;}
        this.isBeingRidden = isBeingRidden;
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
