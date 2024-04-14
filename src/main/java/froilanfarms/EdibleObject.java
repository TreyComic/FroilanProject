package froilanfarms;

public abstract class EdibleObject
{
    int numberOf;
    public EdibleObject()
    {
       this.numberOf=1;
    }
    public EdibleObject(int numberOf)
    {
        this.numberOf=numberOf;
    }
    public int getNumber()
    {
        return numberOf;
    }
    public void setNumber(int setta){this.numberOf=setta;}
    public void AddPiles(EdibleObject addPile)
    {
        int addInt=addPile.getNumber();
        this.numberOf = this.numberOf+addInt;
        addPile.setNumber(0);
    }
    public int subtractPile(int subtractNumber)
    {
        if(this.numberOf<subtractNumber)
        {
            int returnValue = subtractNumber -this.numberOf;
            this.numberOf=0;
            return returnValue;
            // returnValue is the remainder from the subtracted number. Only if you're trying to subtract more than the
            // pile has
        }
        else
        {
            this.numberOf = this.numberOf - subtractNumber;
            return 0;
        }
    }
    public static void main(String[] args)
    {
        EarCorn edibleObjectTest = new EarCorn(3);
        EarCorn edibleObjectTest2 = new EarCorn(3);
        edibleObjectTest.AddPiles(edibleObjectTest2);

    }
}
