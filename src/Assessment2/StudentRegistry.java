package Assessment2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistry {
    //static variables can be used throughout  the function

    public static ArrayList<String> name;
    public static int totalNames = 0;

    public ArrayList<String> addStudent() {

        Scanner in = new Scanner(System.in);
        name = new ArrayList<>();
        System.out.println("Enter the name to be added: ");
        name.add(in.next());
        System.out.print("Successfully added");
        totalNames++;
        return name;

    }
 /* public ArrayList<String> display() {
        name=new ArrayList<>();



            System.out.println("Student names:");
            for (int i = 0; i <=totalNames; i++) {
                System.out.println();
                System.out.println("Name " + name.get(i));
                return name;

            }*/


    public static void main(String[] args) {

        int value = 0;

        //create Object of the class
        StudentRegistry studReg = new StudentRegistry();
        //ArrayList<String> studName = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Student Registry. What would you like to do? ");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. Check if a student is registered ");
        System.out.println("4. Print all students ");
        System.out.println("5. Exit ");
        System.out.println();
        System.out.println("Enter the value : ");

        value = in.nextInt();

        switch (value) {
            case 1:
                studReg.addStudent();

                break;
            case 2:
                //removeStudent();
                break;
            case 3:
                //isStudentRegistered();
                break;
            case 4:
                //studReg.display();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid option, please select options from above: ");
        }


    }
}


