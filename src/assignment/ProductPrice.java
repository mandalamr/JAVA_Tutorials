package assignment;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        final double Taxrate=0.08;
        double originalprice, taxamount,discountpercentage, finalprice;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Original price and discount percentage: ");
        originalprice=in.nextDouble();
        discountpercentage=in.nextDouble();
        if (originalprice < 0 || discountpercentage<0) {
            try {

                System.out.println("Amount entered invalid,please enter again: ");
                System.out.println("Enter Original price and discount percentage: ");
                originalprice = in.nextDouble();
                discountpercentage = in.nextDouble();
                // user enters other than numeric values
            } catch ( NumberFormatException e) {
                System.out.println(e.getMessage());

            }

        }
        taxamount=originalprice*Taxrate;
        double discountamount=(originalprice*discountpercentage)/100;
        finalprice=(originalprice+taxamount)-discountamount;
        System.out.println("Tax Amount: "+ "$"+taxamount);
        System.out.println("Discount Amount: "+ "$"+ discountamount);
        System.out.println("Final Price: "+ "$"+finalprice);


    }
}

