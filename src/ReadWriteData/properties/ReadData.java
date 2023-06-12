package ReadWriteData.properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;

public class ReadData {
    public static void main(String[] args) throws IOException {
        //Difference between FileInputStream and FileReader
        // Both allows you to read data from File, but FileInputStream is used
        // to read binary data, while FileReader is used to read character data.
        //Stream classes are useful when you have small data or
        // if you are dealing with binary files like images.
        //create an object of file reader class
       FileReader fr =new FileReader("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\Testdata.properties");
        //Create file input streamer to read data
       // FileInputStream fis =new FileInputStream("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties");
        //Create an object for properties class
        Properties p=new Properties();
        //Step 3: Load the file
        p.load(fr);

        //Step 4: Use get property method to get property
        //use string as key and using get property method get the value
        System.out.println(p.getProperty("name"));
        //instead of using the path for the file we can use directory not hard code the location path
        System.out.println(System.getProperty("user.dir"));
    }
}
