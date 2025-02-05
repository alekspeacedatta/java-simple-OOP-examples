import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Dog dog1 = new Dog("jojka", "pochka");
        System.out.println(dog1.get());

        Dog dog2 = new Dog("sheixsha", "york");
        System.out.println(dog2.get());


        dog1.setName("aleksa");
        dog2.setBreed("rotveler");

        System.out.println(dog1.get());
        System.out.println(dog2.get());
    }
}