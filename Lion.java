public class Lion extends Animal{
    public Lion(){
        numOfLion++;
    }
    private static int numOfLion = 0;
    public int getNumOfLion(){
        return numOfLion;
    }

}
