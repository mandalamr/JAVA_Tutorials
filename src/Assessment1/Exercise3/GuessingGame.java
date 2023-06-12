package Assessment1.Exercise3;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    //creating integer variable to store final response
    //An instance of java Random class is used to generate random numbers.
    // This class provides several methods to generate random numbers of type integer, double, long, float etc
//Random instance
    public static void main(String args[]) {


        Random randSecretNumber = new Random();
        int max = 100;
        //max=100; it takes 0-99 so add 1
        int secretNumber = randSecretNumber.nextInt(max)+1;
        int numGuesses = 0;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        int guess;
       System.out.println("Guess number between 1 and 100: ");
       guess = in.nextInt();
        numGuesses++;
        while (guess!=secretNumber) {
            System.out.println("You guess incorrectly, Try again: ");
            System.out.println("Guess number between 1 and 100: ");
            guess = in.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                //System.out.println("You guesses correctly: ");
                flag = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again. ");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again. ");
            }


        }
        System.out.println("Congratulations! You guessed the correct number in "+numGuesses+" guesses");

    }

}

