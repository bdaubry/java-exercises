package exercises;

import java.util.Scanner;

public class milesPerGallon {

    public static void main(String[] args){

        int miles;
        double gallons;
        double mpg;

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        miles = input.nextInt();

        System.out.println("How many gallons of gas did you consume?");
        gallons = input.nextDouble();

        mpg = miles / gallons;

        System.out.println("Your MPG was " + mpg);

    }

}
