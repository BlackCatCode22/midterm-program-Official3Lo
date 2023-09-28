import java.util.*;
import java.io.*;

import static java.lang.System.in;
//import java.

public class Main {// create list of object and report

    //creating the gen unique id access
    public static String generateUniqueID(String theSpecies, int numOfSpecies) {
        String prefix = "";
        int suffix = numOfSpecies + 1;
        if(theSpecies.contains("hyena")){
            prefix = "Hy";
        }
        String newID = Main.generateUniqueID("Hyena", 8);
        System.out.println("This is unique id"+ this.newID);
        return prefix + Integer.valueOf(suffix);
    }

    public static void main(String[] args){
        Animal anim1 = new Animal();
        anim1.name1 = "goblin";
        System.out.println("You got " + Animal.getNumOfAnimal() + " animals");
        Scanner sc = new Scanner(in);
        Hyena hy01 = new Hyena();
        Hyena doggo = new Hyena();
        //doggo.setAnimalID("hy09");
        doggo.setColor();
        doggo.setGender();
        doggo.setBirthDate();
        doggo.setWeight();
        doggo.setArrivingFrom();
        Hyena.generateRandomName();
        System.out.println("This is doggo's ID: " + doggo.getAnimalID() + " hyena");


        int currentNumOfHyena = Hyena.getNumOfHyena();
                System.out.println("You got " + currentNumOfHyena + " hyena");


    }
}

/*
generate unique id method and generator name method ?
static method
constructor
initialize - give starting value
 */