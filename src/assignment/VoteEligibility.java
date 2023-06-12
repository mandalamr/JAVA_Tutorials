package assignment;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args){
        int age;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age for vote eligibility: ");
        age=in.nextInt();
        if (age< 0 ) {
            try {
                System.out.println("Age  entered invalid,please enter again: ");
                System.out.println("Enter the age:  ");
                age = in.nextInt();

                // user enters other than numeric values
            } catch ( NumberFormatException e) {
                System.out.println(e.getMessage());

            }

        }
        if(age>=18){
            System.out.println("You are eligible to vote. ");
        }
        else{
            System.out.println("You are not eligible to vote. ");
        }
    }
}
