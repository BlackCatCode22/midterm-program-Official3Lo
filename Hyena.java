public class Hyena extends Animal{ //implements <interfacename >
    //create constructor for name and species
    public Hyena(String someVar1, String someVar2){
        super(someVar1,someVar2);
    }
    public Hyena(){
        numOfHyena++;
    }
    private static int numOfHyena = 0;

    public int getNumOfHyena(){
        return numOfHyena;
    }
}
