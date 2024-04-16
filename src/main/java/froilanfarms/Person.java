package froilanfarms;
public class Person implements Eater, NoiseMaker 
{
    private String name;

    public Person(String name) 
    {
        this.name = name;
    }
    @Override
    public void eat(EdibleObject edibleObject) 
    {
        System.out.println(name + " is eating " + edibleObject.getDescription());
    }

    @Override
    public void makeNoise()
    {
        System.out.println(name + " says hello!");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
