import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Animal zoo program");
        //call the static method to create a list of names
        Hyena.myListofHyenaNames();

        //look at animalnames
        //call inputHyenaNames
        Hyena.inputHyenaNames();

        //create animal
        Animal animal1 = new Animal();
        animal1.name = "Goblin";
        animal1.makeNoise();
        //animal count
        System.out.println("You have " + animal1.getNumOfAnimals()+ " animals.");

        //new hyena
        Hyena hyena1 = new Hyena();
        hyena1.laugh();
        hyena1.Fetch();
        System.out.println("You have " + animal1.getNumOfAnimals()+ " animals.");
        System.out.println("\nYou have " + hyena1.getNumOfHyenas() + " hyena."); //error printing two hyena

        Hyena anotherHyena = new Hyena();
        System.out.println("You have " + animal1.getNumOfAnimals()+ " animals.");
        System.out.println("\nYou have " + anotherHyena.getNumOfHyenas() + " hyena."); //error printing two hyena

    }
}

/*
public protected and private
 */

/*

 */