package animalKingdom;

public class Fish extends Animal
{
    public Fish(String name,int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Swims";
    }
    @Override
    public String breath()
    {
        return "Gills";
    }
    @Override
    public String reproduce()
    {
        return "Eggs";
    }

}