package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,5,8));
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
