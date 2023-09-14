import java.io.*;
import java.util.*;
public class Cat {
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;
    String catSound;

    public void meow(){
        System.out.println("*mew mew*");
    }
    public Cat(String someName){
        this.name = someName;
    }
    public Cat(){
        catCount++;
        livesRemaining = MAX_LIVES;
        this.name = "[Not Named]";
    }
    public static int getCatCount(){
        return catCount;
    }


}