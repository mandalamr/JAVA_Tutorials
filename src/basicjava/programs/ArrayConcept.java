package basicjava.programs;

public class ArrayConcept {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays!************************");
        String[][] mDim = new String[3][4];
        System.out.println(mDim.length);// Total number of rows 3

        /*
         Total number of columns 4.4 Columns are same for all rows so mDim[0] first row
         has same columns as all rows
        */
        System.out.println(mDim[0].length);

        // First row
        mDim[0][0] = "A";
        mDim[0][1] = "B";
        mDim[0][2] = "C";
        mDim[0][3] = "D";

        // Second row
        mDim[1][0] = "A1";
        mDim[1][1] = "B1";
        mDim[1][2] = "C1";
        mDim[1][3] = "D1";

        // Third row
        mDim[2][0] = "A2";
        mDim[2][1] = "B2";
        mDim[2][2] = "C2";
        mDim[2][3] = "D2";

        // Fourth row


        //Print all values in 2D array: use for loop
        //row=0; col=0 to 4
        //row 1;col=0 to 4
        //row=2;col=0 to 4
        //row=3;col=0 to 4

        for (int row = 0; row < mDim.length; row++) {
            for (int col = 0; col < mDim[0].length; col++) {
                System.out.println(mDim[row][col]);
            }
        }
    }
}
