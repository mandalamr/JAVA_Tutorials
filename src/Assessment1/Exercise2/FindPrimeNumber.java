package Assessment1.Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        // prime number is the number that is divisable only by 1 and itself

        int count = 0;// to count how many times the number is divisable
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int primeNum = in.nextInt();
        // To check negative numbers
        if (primeNum < 1) {

            try {

                System.out.println("Values entered invalid:");
                System.out.println("Enter number again ");
                primeNum = in.nextInt();

            }
            // Validate other than integer
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        // suppose number is 7; 1,2,3,4,5,6,7, if count ==2 then it is prime
        // If count more than 2 then it is not prime

        for (int i = 1; i <= primeNum; i++) {
            if (primeNum % i == 0) {

                count++;

            }
        }

        if (count == 2) {
            System.out.println(+primeNum +" is  a prime number");
        } else {

            System.out.println(+primeNum + " is not a prime number");
        }
    }
}

