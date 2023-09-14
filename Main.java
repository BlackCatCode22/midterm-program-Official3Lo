import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //create my first cat object using the constructor w/ an empty field
        Cat myCat = new Cat();

        //Assign values to the cat object fields.
        myCat.name = "Belle";
        myCat.age = 3;
        myCat.catSound = "*ROAR*"; //new cat sound
        //myCat.meow();

        //My cats name and her meow
        System.out.println("My new cat's name is: " + myCat.name);
        System.out.println("My cat sounds like: " + myCat.catSound);;

        //Create an ArrayList of 5 Cats
        ArrayList<Cat> catList = new ArrayList<>();

        //Use for-loop to create 5 cat object and add them to the arraylist
        for (int i = 1;i<=5;i++){
            Cat cat = new Cat("Cat"+ (i+1));
            catList.add(cat);
        }

        //Cats in TOTAL
        System.out.println("I have x" + Cat.getCatCount() + " cats.");
    }
}

/*
obj: create an arraylist of cats
-keep it straight and static?
1. Create 2 classes Main and Cat
2. Can create by passing a String or leaving it blank?
3. Create arraylist
4. add different attribute to the cats
 5. know how many animals in the zoo
 6. hyena class= static(belong to the class)
 7. multiple options to design my zoo
 8. use inheritance for animals?
 9.
 bonus: create an arraylist of 19 cats
 */