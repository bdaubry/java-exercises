package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Integer input;
        int size;

        System.out.println("Enter the number of numbers to go into the list:");

        size = in.nextInt();

        System.out.println("Enter your numbers");

        for (int i = 0; i < size; i++){
            input = in.nextInt();
            numbers.add(input);
        }

        int sum = 0;

        for (int number : numbers){
            if (number % 2 == 0){
                sum = sum + number;
            }
        }

        System.out.println("The sum of the even numbers in your list is " + sum);
    }
}
