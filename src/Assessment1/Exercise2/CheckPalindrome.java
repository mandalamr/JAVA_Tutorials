package Assessment1.Exercise2;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        /*Write a Java program that prompts the user to enter an integer and checks if it is a palindrome number.
         *  A palindrome number is a number that remains the same when its digits are reversed.
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer number: ");

        int number = in.nextInt();
        int reverse = 0, originalNumber, reminder;
        //Assigning user input number to original number
        originalNumber = number;

        //using while loop to do reversing the number
        //user input number is greater than 0 then below steps will execute
        //1.Number%10= gives the reminder and storing reminder value in variable reminder
        //2.reverse multiplying with 10 and adding with the reminder .Storing the value in the reverse.
        //3.number is divided by10 and gives quotient and store it in number
        //4.Till number is not zero it loops, once number reaches 0 then it come out of the loop

        while (number > 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        //once come of the loop it checks original number is equal to the numbers stored in reverse
        //then decides it is palindome or not

        if (originalNumber == reverse) {
            System.out.println("Number is Palindrome: " + reverse);

        } else {
            System.out.println("Number is not Palindrome: " + reverse);
        }


    }
}


