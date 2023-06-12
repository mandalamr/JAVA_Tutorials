package ReadWriteData.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class filewrite {
    public static void main(String[] args) throws IOException {
        //create  an object for filewriter class
       FileWriter fr = new FileWriter("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TestdataNew.properties",true);
        //Create an object for properties class
        //FileOutputStream fos =new FileOutputStream("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\filehandling\\properties\\TestdataNew.properties",true);
        //",true);

        Properties p = new Properties();


        //Step 3: Use set property/store method to set property

        p.setProperty("url","www.Google.com");
        p.store(fr,"SUPER OUTPUT STEAM Test");



    }
}
