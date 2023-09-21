public class Animal {
    public static int numOfAnimals = 0;

    //create a constructor
    public Animal(){ //new animal how code work before this
        numOfAnimals++;//incrament
    }

    String name;
    String birthSeason;
    String color;
    int age;

    //String diet;

    public void makeNoise(){
        System.out.print("roar");
    }
    public String makeNoise02(){
        return "This is a String return from a method in my animal class";
    }

}
