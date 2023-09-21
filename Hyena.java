public class Hyena extends Animal implements Fetch{ //fetch is bonus
    public static int numOfHyena = 0;

    //constructor
    public Hyena(){
        numOfHyena++;
    }

    String lol;
    String hyenaHouse;
    @Override
    public void fetch(){
        System.out.println("I got stick.");
    }
    public void laugh(){
        System.out.println("HEHEHEHEHHE");
    }
}
