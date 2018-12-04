package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        String search;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word to search for:");
        search = input.next();

        if (text.toLowerCase().contains(search.toLowerCase())){
            System.out.println("That word is found");
        } else {
            System.out.println("That word is not found");
        }

    }
}
