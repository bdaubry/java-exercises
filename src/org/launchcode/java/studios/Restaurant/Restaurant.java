package org.launchcode.java.studios.Restaurant;

//import java.util.Scanner;

public class Restaurant {

    //Scanner input = new Scanner(System.in);
    static Menu lunch = new Menu("lunch");

    public static void main(String[] args){
        MenuItem chickenNoodleSoup = new MenuItem(
                "Chicken Noodle Soup",
                3.50,
                "appetizer",
                "Classic chicken noodle soup");

        MenuItem tomatoSoup = new MenuItem(
                "Tomato Soup",
                2.50,
                "appetizer",
                "Classic homemade tomato soup with basil and oregano");

        lunch.addDish(tomatoSoup);
        lunch.addDish(chickenNoodleSoup);

        System.out.println(lunch);

    }

}
