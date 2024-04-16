package froilanfarms;
public class FarmHouse 
{
    private Person[] people;
    private int count = 0;
    public FarmHouse(int size) 
    {
        this.people = new Person[size];
    }
    public void addPerson(Person person) 
    {
        if (count < people.length) 
        {
          people[count] = person;
          count++;
        }
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
