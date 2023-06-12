package assignment;



import java.util.Scanner;

public class CurrencyConvert {

    public static void main(String[] args) {

        //declaring constant keyword final variable.Number is fixed
        final double USD_TO_GBP = 0.80d;// British pound
        final double USD_TO_EUR = 0.93d;//Euro
        final double USD_TO_JPY = 139.03d;//Yen

        //Prompt the user to input dollar amt
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dollar amount: ");
        double dollar = in.nextDouble();
        //Condition if the amount is negative and again prompt to enter dollar amt
        if (dollar < 0) {
            try {
                System.out.println("Amount entered invalid,please enter again: ");
                System.out.println("Enter dollar amount above zero: ");
                dollar = in.nextDouble();
                // user enters other than numeric values
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());


            }

        }

        // To British Pounds conversion

        double gbpAmount;
        gbpAmount = dollar * USD_TO_GBP;
        System.out.println("Equivalent British pounds:  " + gbpAmount);
        //  To Euro conversion
        double eurAmount;
        eurAmount = dollar * USD_TO_EUR;
        System.out.println("Equivalent Euro: " + eurAmount);
        //  To Yen conversion
        double jpyAmount;
        jpyAmount = dollar * USD_TO_JPY;
        System.out.println("Equivalent Yen: " + jpyAmount);


    }
}
