package animalKingdom;

import java.util.*;

public class Main
{
    //#region Public Methods
    public static void printAnimals(ArrayList<Animal> animals, SortAnimals tester)
    {
        for(Animal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println("(Name: " + a.name + ")---(Moves by: " + a.move() + ")---(Reproduction: " + a.reproduce() + ")---(Discovered: " + a.yearDiscovered + ")");
            }
        }
    }
    //#endregion
    public static void main(String[] args)
    {
        //#region Create the animals and add them to the list
        ArrayList<Animal> arrList = new ArrayList<>();

        // Mammals
        Mammals panda = new Mammals("Panda", 1869);
        arrList.add(panda);
        Mammals zebra = new Mammals("Zebra", 1778);
        arrList.add(zebra);
        Mammals koala = new Mammals("Koala", 1816);
        arrList.add(koala);
        Mammals sloth = new Mammals("Sloth", 1804);
        arrList.add(sloth);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        arrList.add(armadillo);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        arrList.add(raccoon);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
        arrList.add(bigfoot);

        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        arrList.add(pigeon);
        Birds Peacock = new Birds("Peacock", 1821);
        arrList.add(Peacock);
        Birds Toucan = new Birds("Toucan", 1758);
        arrList.add(Toucan);
        Birds parrot = new Birds("Parrot", 1824);
        arrList.add(parrot);
        Birds swan = new Birds("Swan", 1758);
        arrList.add(swan);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        arrList.add(salmon);
        Fish catfish = new Fish("Catfish", 1817);
        arrList.add(catfish);
        Fish perch = new Fish("Perch", 1758);
        arrList.add(perch);
        //#endregion

        //#region Testing

        // Year discovered decending
        System.out.println("Year discovered decending:");
        arrList.sort((o1, o2) -> o2.yearDiscovered - o1.yearDiscovered);
        printAnimals(arrList, a -> a.id > 0);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        // Alphabetically
        System.out.println("Alphabetically:");
        arrList.sort((o1, o2) -> o1.name.compareToIgnoreCase(o2.name));
        printAnimals(arrList, a -> a.id > 0);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        // How they move
        System.out.println("How they move:");
        arrList.sort((o1, o2) -> o1.move().compareToIgnoreCase(o2.move()));
        printAnimals(arrList, a -> a.id > 0);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("Breath with lungs:");
        printAnimals(arrList, a -> a.breath() == "Lungs");

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("Breath with lungs and named in 1758:");
        printAnimals(arrList, a -> (a.breath() == "Lungs") && (a.yearDiscovered == 1758));

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("Breath with lungs and lay eggs:");
        printAnimals(arrList, a -> (a.breath() == "Lungs") && (a.reproduce() == "Eggs"));
        // OR
        System.out.println("OR:---------------");
        printAnimals(arrList, a -> a instanceof Birds);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("alphabetically and those that were named in 1758:");
        arrList.sort((o1, o2) -> o1.name.compareToIgnoreCase(o2.name));
        printAnimals(arrList, a -> a.yearDiscovered == 1758);
        //#endregion
    }
}