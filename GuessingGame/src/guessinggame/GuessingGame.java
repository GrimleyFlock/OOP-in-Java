package guessinggame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numGuesses = 0;
        int randomNumber = new Random() .nextInt(10) + 1;
        
        System.out.println("    ************    ");
        System.out.println("Welcome to the Guessing Game");
        System.out.println("    ************    ");
        
        System.out.println("Enter an integer number from 1 to 10: ");
        int inputNumber = input.nextInt();
        numGuesses++;
        
        while (inputNumber != randomNumber){
            System.out.println();
            System.out.println("Try again... ");
            System.out.println("Enter an integer number from 1 to 10: ");
            inputNumber = input.nextInt();
            numGuesses++;
        }
        
        System.out.println("You win after " + numGuesses + " guesses.");
        
    }
}
