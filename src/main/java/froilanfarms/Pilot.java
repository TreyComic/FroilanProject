package froilanfarms;

public class Pilot extends Person implements Rider{
    public Pilot(String name){
        super(name);
    }
    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println("Pilot is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Pilot is talking.");
    }

    @Override
    public void mount(Rideable rideable){
        ((Vehicle)rideable).setMounted(true);
    }

    @Override
    public void dismount(Rideable rideable) {
        ((Vehicle)rideable).setBeingRidden(true);
    }
}
