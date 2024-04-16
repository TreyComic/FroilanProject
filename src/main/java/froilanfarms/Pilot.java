package froilanfarms;

public class Pilot extends Person{
    public Pilot(CropDuster cropDuster){

    }
    @Override
    public void eat() {
        System.out.println("Pilot is eating");
    }

    @Override
    public void makeNoise() {
        System.out.println("Pilot is talking.");
    }
}
