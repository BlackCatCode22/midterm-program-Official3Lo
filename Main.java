public class Main {
    public static void main(String[] main){
        System.out.println("Welcome to my Animal Program");

        //animal counter
        System.out.println("Before we use 'new...'" + "We have: " + Animal.numOfAnimals ); //reference a static attribute(field of animal class)

        Animal myAnimal = new Animal();
        myAnimal.name = "goblin";

        System.out.println("Name of my new animal specie is: " + myAnimal.name);


        //create hyena
        Hyena myHyena = new Hyena();
        Hyena hyenaTwo = new Hyena();
        Hyena hyenaThree = new Hyena();

        //hyena counter
        System.out.println("We have: " + Hyena.numOfHyena + " hyenas.");

        //hyena name
        myHyena.name = "Suzy";
        System.out.println("My new hyena's name is: " + myHyena.name);

        //hyena age
        myHyena.age = 2;

        //hyena sound
        myHyena.makeNoise();
        myHyena.laugh(); //unique
        myHyena.lol = "HEE HEE HEE";
        System.out.println("Name of my new animal specie is: " + myHyena.lol);

        //the house
        myHyena.hyenaHouse = "Savanna";


        //
        myHyena.fetch(); //inheritance

    }
}


/*
born stats
physical stats
environment stats

public static numofanimals
public class hyena from animal class
public class animal
public makenoise

create animal
different and unique each animal

 increment static animal count
 animal.numOfAnimals++;

fill object data field
anyoldanimal.desc = myArray [0]

 */

/*
java programmer exclude multiple inheritance
attribute a field describe object eg name, age
cat class is subclass to main
multiple inheritance nmi -> cat and dogs ->(no) cog ambiguous
interface - a contract requirement before using?
must be declare abstract class to use implement fetch
 */