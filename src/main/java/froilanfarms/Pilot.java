package froilanfarms;

public class Pilot extends Person{
    public Pilot(String name, CropDuster cropDuster){
        super(name);
        this.setCropDuster = cropDuster;
    }
    @Override
    public void eat(EdibleObject edibleObject) {
        System.out.println("Pilot is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Pilot is talking.");
    }
}
