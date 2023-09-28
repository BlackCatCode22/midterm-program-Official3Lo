public class Animal {
    //getter
    public Animal() {
        numOfAnimal++;
    }

    private static int numOfAnimal = 0;

    public static int getNumOfAnimal() {
        return numOfAnimal;
    }

    //Integers
    String name1;
    private String animalID;
    private String animalName;
    private int age;
    private int animalAge;
    private String birthDate;
    private String color;
    private float weight;
    private char gender;
    private String arrivingFrom;

    //getter and setter
    public void setAnimalID() {
        this.animalID = animalID;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName() {
        this.animalName = animalName;
    }

    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate() {
        this.birthDate = birthDate;
    }

    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight() {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }
    public void setGender() {
        this.gender = gender;
    }

    public String getArrivingFrom() {
        return arrivingFrom;
    }
    public void setArrivingFrom() {
        this.arrivingFrom = arrivingFrom;
    }
    //unique id throw in specie and number id generator what static generate


}
/* parse-to make sense of / make all attributes private
String to store Hy01
name? animID
animal name
4 years old
animalAge (current)
calculate age
age
birthdate date
color
weight float how to handle unit weight
gender char
origin 1, 2, and 3 arriving from

 */