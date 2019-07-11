package animalKingdom;

public abstract class Animal
{
    //#region Public Variables
    public static int maxID = 0;
    public int id;
    public String name;
    public int yearDiscovered;
    //#endregion

    //#region Constructor
    public Animal(String name, int yearDiscovered)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }
    //#endregion

    //#region Abstract Methods
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    //#endregion

    //#region Public Methods
    public String consumesFood()
    {
        return "Yes";
    }
    //#endregion
}