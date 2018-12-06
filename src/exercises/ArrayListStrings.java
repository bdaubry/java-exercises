package exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListStrings {
    public static void main(String[] args){
        String input;
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter words or press enter to continue:");

        do {
            input = in.nextLine();
            words.add(input);
        } while (!input.equals(""));

        for (String word : words){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }
}
