package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet " +
                "suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        char[] charsInStr = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        // for every character in our character list we made
        for (char character : charsInStr){
            // if our hashmap contains that character as a key already
            if (charCount.containsKey(character)){
                // add 1 to the value of that key. I used put (it rewrites the value technically, but it works)
                charCount.put(character, charCount.get(character) + 1);
            } else {
                // else we add the character to the hashmap and initialize it with a value of 1, because it was found the first time
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> character : charCount.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
