public class Tiger extends Animal{
    public Tiger(){
        numOfTiger++;
    }
    private static int numOfTiger = 0;
    public int  getNumOfTiger(){
        return numOfTiger;
    }


}
