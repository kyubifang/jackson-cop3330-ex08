/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 8 - Pizza Party

        Division isn’t always exact, and sometimes you’ll write programs that will need to deal with the leftovers as a whole number instead of a decimal.

        Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.
        Example Output

        How many people? 8
        How many pizzas do you have? 2
        How many slices per pizza? 8
        8 people with 2 pizzas (16 slices)
        Each person gets 2 pieces of pizza.
        There are 0 leftover pieces.

        Challenges

        Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
        Alter the output so it handles pluralization properly, for example: "Each person gets 2 pieces of pizza." or "Each person gets 1 piece of pizza." Handle the output for leftover pieces appropriately as well.
        Create a variant of the program that prompts for the number of people and the number of pieces each person wants, and calculate how many full pizzas you need to purchase.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int people = myApp.countPeople();
        int pizzas = myApp.countPizzas();
        int slices = myApp.countSlices();
        int pizzaSlices = myApp.slicesPerPizza(pizzas, slices);
        int split = myApp.splitSlices(people, pizzaSlices);
        int left = myApp.leftovers(people, slices);
        String outputString = myApp.generateOutputString(people, pizzas, pizzaSlices, split, left);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public int countPeople() {
        System.out.println("How many people? ");
        return in.nextInt();
    }

    public int countPizzas() {
        System.out.println("How many pizzas do you have? ");
        return in.nextInt();
    }

    public int countSlices() {
        System.out.println("How many slices per pizza? ");
        return in.nextInt();
    }

    public int slicesPerPizza(int pizzas, int slices) {
        return pizzas * slices;
    }

    public int splitSlices(int people, int pizzaSlices) {
        return pizzaSlices / people;
    }

    public int leftovers(int people, int slices) {
        return slices % people;
    }

    public String generateOutputString(int people, int pizzas, int pizzaSlices, int split, int left) {
        return people + " people with " + pizzas + " pizzas (" + pizzaSlices + " slices)\n" +
                "Each person gets " + split + " pieces of pizza.\n" +
                "There are " + left + " leftover pieces.";
    }
}
