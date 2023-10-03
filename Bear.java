public class Bear extends Animal{
    public Bear(){
        numOfBear++;
    }
    private static int numOfBear = 0;
    public int getNumOfBear(){
        return numOfBear;
    }
}
