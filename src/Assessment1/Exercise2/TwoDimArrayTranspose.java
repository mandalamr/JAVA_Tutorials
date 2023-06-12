package Assessment1.Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayTranspose {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("please enter the number of columns: ");
        int columns = in.nextInt();

        int matrix[][] = new int[rows][columns];
        int transpose[][] = new int[columns][rows];

        System.out.println("Enter the data of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Data of rows and columns storing in matrix
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Data of rows and columns storing in matrix
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Display the data of the transpose matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //Data of rows and columns storing in matrix
                transpose[j][i] = matrix[i][j];

            }

        }
        System.out.println("Transpose matrix: ");
        for (int[] r : transpose) {
            System.out.println(Arrays.toString(r));
        }
    }

}


