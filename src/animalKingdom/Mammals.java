package animalKingdom;

public class Mammals extends Animal
{
    public Mammals(String name,int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Walks";
    }
    @Override
    public String breath()
    {
        return "Lungs";
    }
    @Override
    public String reproduce()
    {
        return "Live Births";
    }
}