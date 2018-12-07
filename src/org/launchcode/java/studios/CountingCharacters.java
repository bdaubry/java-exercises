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
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char character : charsInStr){
            if (charCounts.containsKey(character)){
                charCounts.put(character, charCounts.get(character) + 1);
            } else {
                charCounts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charCounts.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
