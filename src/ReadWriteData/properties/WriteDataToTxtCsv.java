package ReadWriteData.properties;

import java.io.*;
import java.util.Properties;

public class WriteDataToTxtCsv {
    public static void main(String[] args) throws IOException {
        //How to write data to Txt and CSV files
        //create  an object for filewriter class
        //Change the type of the file to Txt from .properties in path
        //File f= new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TextData1.txt");
        //Write data to CSV-.csv
        //3 classes: File,Filewrter and buffered writer
        File f = new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TextData1.csv");
        FileWriter fw = new FileWriter(f, false);
        //step 2: create an object for Buffer class
        BufferedWriter br = new BufferedWriter(fw);
        //step3: To write the data
        //Display the txt 10 times using for loop
        for (int i = 1; i <= 10; i++) {


            br.write(+i + " Super Program CSV");
            br.newLine();
        }

        //close the file
        System.out.println("Write Data successfully");
        br.close();


    }
}

