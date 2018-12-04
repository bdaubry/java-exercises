package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        double height;
        double width;
        double area;
        double perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the rectangle?");
        height = input.nextDouble();
        System.out.println("What is the width of the rectange?");
        width = input.nextDouble();

        area = height * width;

        System.out.println("A rectangle of height " + height + " and width " + width + " is " + area);

    }

}
