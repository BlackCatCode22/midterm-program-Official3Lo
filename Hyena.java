import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
public class Hyena extends Animal implements Fetch {
    public static List<String> myListofHyenaNames = new ArrayList<>();

//Create a static number variable keep track of hyena
private static int numOfHyenas = 0;//public static int numOfHyenas = 0;

//constructor to keep track # of hyena
public Hyena(){
    System.out.println("a new hyena object is created");
    numOfHyenas++;
}

//Write a getter
public int getNumOfHyenas() {
    return numOfHyenas;
}
String hyenaHouse;
public void laugh(){
    System.out.println("*heeheehee*");
}

    @Override
    public void Fetch() {
        System.out.println("i got stick.");
    }

    //creates a method that inputs hyena names from a file name: animalnames.txt
    public static void inputHyenaNames(){
        String FilePath = "C:\\Users\\BE218\\IdeaProjects\\x\\src\\animalNames.txt";
        int lineNum =1;
        try
        {
            FileReader fileReader = new FileReader("C:\\Users\\BE218\\IdeaProjects\\x\\src\\animalNames.txt"); // Replace with your file path
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a new hyena name");
            sc.nextLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Assuming you want to print each line
            }
            String userInput = sc.nextLine();
            lineNum++;

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("final");
        }
    }
}