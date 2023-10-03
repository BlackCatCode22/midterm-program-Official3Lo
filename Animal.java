public class Animal {
    public Animal(){
        numOfAnimal++;
    }
    public Animal(String theName, String theSpecies){
        this.name = theName;
        this.species = theSpecies;
    }
    private static int numOfAnimal = 0;
    public int getNumOfAnimal(){
        return numOfAnimal;
    }
    String name;
    String species;
    float weight;
    String origin;
    String birthday;
    String gender;


}
