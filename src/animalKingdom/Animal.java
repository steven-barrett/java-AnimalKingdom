package animalKingdom;

public abstract class Animal
{
    public static int maxID = 0;
    public int id;
    public String name;
    public int yearDiscovered;


    public Animal(String name, int yearDiscovered)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public String consumesFood()
    {
        return "Yes";
    }
}