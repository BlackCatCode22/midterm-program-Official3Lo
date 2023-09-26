public class Animal {// implementation (parent class) // You can define properties and methods common to all animals here.
    private static int numOfAnimals = 0;
    //create a getter
    //What type of method is this? is it static and belong to class or..
    //is this method used with objects
    public int getNumOfAnimals(){
        return numOfAnimals;
    }
    public Animal() {
        System.out.println("new animal is created.");
    numOfAnimals++;
}
    String name;
    int age;
    String specie;
    String birthday;
    String origin1;
    String origin2;

    public void makeNoise(){
        System.out.println("*Noise*");
    }
}