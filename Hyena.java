import java.util.*;
import java.io.*;

public class Hyena extends Animal{
    //getter
    public Hyena(){
        numOfHyena++;
    }
    private static List<String> names;
    private static int numOfHyena = 0;
    public static int getNumOfHyena(){

        return numOfHyena;
    }
    public static void generateName() {
        String fileName = "C:\\Users\\BE218\\IdeaProjects\\x\\src\\animalNames.txt";
        names = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                String[] nameArray = line.split(",");
                for (String name : nameArray) {
                    names.add(name);
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String generateRandomName() {
        Random rand = new Random();
        return names.get(rand.nextInt(names.size()));
    }
    public static void addName(String name) {
        names.add(name);
    }
    public static void displayNames() {
        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }


    // generate unique id method here
    // req: need to know species and #ofspecie
}
//"C:\Users\BE218\IdeaProjects\x\src\animalNames.txt"
//"C:\Users\BE218\IdeaProjects\x\src\arrivingAnimals.txt"
    /*
    generator name method ?
     */