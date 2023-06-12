package Assessment1.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsFinder {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int arraySize1 = in.nextInt();
        System.out.println("Enter the size of the second array: ");
        int arraySize2 = in.nextInt();

        //Input array1 elements and

        System.out.println("Enter the elements of array1: ");
        int array1[] = new int[arraySize1];
        for (int i = 0; i < arraySize1; i++) {
            System.out.println("Element First array:"+i );
            array1[i] = in.nextInt();
        }

        //Size and array of 2nd elements

        System.out.println("Enter the elements of array2: ");
        int array2[] = new int[arraySize2];
        for (int j = 0; j < arraySize2; j++) {
            System.out.println("Element First array:"+j );
            array2[j] = in.nextInt();
        }

        ArrayList<Integer> s1 = new ArrayList<>();

        //Iterating first array1-outerloop
        for (int i = 0; i < array1.length; i++) {

            //Iterating second array-Innerloop
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    s1.add(array1[i]);


                }
            }
        }
//for each loop
        for (int e : s1) {

            System.out.println(+e);

        }
    }

}


