package basicjava.programs;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        //ArrayList is resizable array and arraylist is not fixed in size like arrays
        //Can add any number of elements

        ArrayList <String> courses = new ArrayList<>();
        courses.add("Python");
        courses.add("C++");
        courses.add("Java");
        courses.add("SQL");
        courses.add("Selenium");

        System.out.println("ArrayList : " +courses);


          for(String e:courses){
              System.out.println(e);
      }










}
}
