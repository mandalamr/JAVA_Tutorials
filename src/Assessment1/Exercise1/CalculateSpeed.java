package Assessment1.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateSpeed {

    public static void main(String[] args) {

        // To get input from user using scanner

        Scanner in = new Scanner(System.in);
        int distance;
        int time;

        System.out.println("Enter distance in kms and time in hrs : ");
        distance = in.nextInt();
        time = in.nextInt();
        // Condition using if else for validating negative number
        if (distance <= 0 || time <= 0) {
            System.out.println("Values entered invalid:");


            try {

                //System.out.println("Values entered invalid:");
                System.out.println("Enter distance in Kms and time in hours: ");
                distance = in.nextInt();
                time = in.nextInt();
            }
            // Validate other than integer
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("Finally executed ");
            }
        } else {

            int averagespeed;
            averagespeed = distance / time;
            System.out.println("Average Speed: " + averagespeed + "km/h");

        }


    }

}








