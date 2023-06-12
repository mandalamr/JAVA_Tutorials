package basicjava.methods;

import java.util.Scanner;

public class Methods {


    //1.no input (Function not taking any parameter)no return(Use void in case of no return)
    //Function cannot return multiple values
    //Static methods belong to the class 'Methods' no need to create an object of the class.
    // Directly call the static method if you use static to the method
    static String name;

    public void doLogin() {
        System.out.println("Login successfully");
    }

    //2.no input but some return.Not static method so create an object to call the method
    public static String std() {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student name:");
        name = in.next();
        return name;

    }

    //Static method advantage is that no need to create object of the class to call the method
    //directly call the static method
    public static String chkName() {
        String name1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the name to be verified ");
        name1 = in.next();
        return name1;


    }


    public static void main(String[] args) {
        //To call all the class methods we have to create object of the class in main class
        Methods obj = new Methods();
        obj.doLogin();
        String name1 = std();
        System.out.println(name1 + " Printed name");

        System.out.println("Called Login method successfully");
        chkName();
    }

}
