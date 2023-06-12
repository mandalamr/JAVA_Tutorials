package ReadWriteData.properties;

import java.io.*;

public class ReadDataToTxtCsv {
    public static void main(String[] args) throws IOException {
        /*How to Read data to Txt and CSV files
        create  an object for file-reader class
        Change the type of the file to Txt from .properties in path
        File f= new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TextData1.txt");
        Write data to CSV-.csv
        3 classes: create File,FileReader bufferedReader
        read from txt file*/
        //File f = new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TextData1.txt");
        //Read from csv file

       File f = new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TextData1.csv");
        //cannot append in case of reader-just reading data
        FileReader fr = new FileReader(f);
        //step 2: create an object for Buffer reader class
        BufferedReader br = new BufferedReader(fr);


        System.out.println(br.readLine());
        System.out.println(br.readLine());


        //close the file
        System.out.println("Read Data successfully");
        br.close();


    }
}

