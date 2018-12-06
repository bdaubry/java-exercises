package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {



    public static void main(String[] args) {

        double pi = 3.14159;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        radius = input.nextDouble();

        while (radius < 0) {
            System.out.println("Radius can't be negative");
            System.out.println("What is the radius of the circle?");
            radius = input.nextDouble();
        }

        area = pi * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);

    }

}