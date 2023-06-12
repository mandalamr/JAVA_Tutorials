package Assessment2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\Assessment2\\ReadFile\\ReadData.txt"));

     String list1;
        //File file=new File("C:\\Users\\raji.mandalam\\Documents\\JAVA SELENIUM Training\\JAVA Tutorials\\src\\Assessment2\\ReadFile\\ReadData.txt");
        FileReader fileR=new FileReader(String.valueOf(s));
       try {
           BufferedReader bf = new BufferedReader(fileR);
          list1=bf.readLine();
          while(list1!=null){
              for(int i=0;i<)
           }
       } catch (Exception e) {
           e.printStackTrace();
       }

            }
        }








