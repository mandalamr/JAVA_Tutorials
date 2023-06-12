package assignment;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        //Prompt user to input length and width of a rectangle.
        int length;
        int width;
        int area;
        int perimeter;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and width: ");
        length=in.nextInt();
        width=in.nextInt();
        area=length*width;
        perimeter= 2*(length+width);

        System.out.println("Area of a rectangle: "+ area);
        System.out.println("Perimeter of a rectangle: "+ perimeter);



    }
}


