package froilanfarms;
public class FarmHouse 
{
    private Person[] people;
    public FarmHouse()
    {
        this.people = new Person[2];
    }

    public Person[] getPeople() 
    {
        return people;
    }

    public void setPeople(Person[] people) 
    {
        this.people = people;
    }
}
