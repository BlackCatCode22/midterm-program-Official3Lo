
public class Main {
    public static void main(String[] args) {
            System.out.println("My Zoo program");
            Animal myAnimal = new Animal();
            Animal mySecondAnimal = new Animal("Some Name", "hyena");

            String aName = mySecondAnimal.name;
        System.out.println("the animal name is  " +aName);

        //create hyena
            Hyena myHyena = new Hyena();

            //look at new hyena object
        System.out.println("hyena name is "+ myHyena.name);

        //create hyena with name and species with constructor
        Hyena aNewHyena = new Hyena("Zig", "hyena");
        System.out.println("the name of hyena is "+ aNewHyena.name);


            Bear myBear = new Bear();
            Lion myLion =new Lion();
            Tiger myTiger = new Tiger();
        System.out.println("animal count is " +myAnimal.getNumOfAnimal());


        }
    }



    /*
    Report:
    Hyena: Hy01, 4yr, bd: 3/2116, tan, from, date arrive
    Lions: li01
     */
    /*
    1. Animal static numofanimal property traits:
    name, species, weight, id, origin, bd, gender, dataarived
    2.tiger static numoftiger
    3.bear static numofbear
    4.lion static numoflion
    5. Hyena static numofhyena all animal in hyena
    6.
     */

/*
each new class = incrament for hyena
create a method
generate uniqueid(hy01), birthday, animal name, zoo, and habitat
where to put the generate code? anywhere in classes main, animal, or species.
open and read information in main then parse it to the other species
how to do the uniqueid? place in main: Ti(00) # of tigers = 1 then ti01
create tiger class my new tiger then get static then incrament.
access numoftiger the static propertie then create unique id have switch statement(else if)
get information then return uniqueid
assign animal to species
function

in main, generateuniqueid(String, species, <animal>){ lions, hyena string method substring? (will be in main and return a string)
    String id =
    //examine species class
    //use numof<animal>
}
return id

names arraylist
comes from the file animalnames text file
in java use the arraylist create a arraylist of names put into main
four types of name in animalnames listofhyena names
remove an element from arraylist
list for animal names into species class
how to access in class? hyena accessing static variable load class into names and access public accesser get then remove
store code into species
animal names vectors?

generate birthday date time module (import date times)
2023;10;03 date object
birthdate: 2016;06;01 then get age 7.5 year ok subtract both date to get age
pass in string done in main module
birth season birthdate add subtract

generate habitat (into species hyena)

 */

/*inheritance and constructors
create a new mammal object
int weight
string haircolor
publicmamal{
this.weight = weight;
this.haircolor = haircolor;
}
 */