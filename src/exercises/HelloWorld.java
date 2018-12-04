package exercises;

//import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        String name;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("What is your name?");
        name = input.next();
        System.out.println("Hello, " + name);

    }
}