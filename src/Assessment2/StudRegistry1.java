package Assessment2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudRegistry1 {
    public static void main(String[] args) {
        StudRegistry1 stdRegister = new StudRegistry1();
        ArrayList<String> list =new ArrayList<String>();
        String menu;
        stdRegister.addStudent();

        // removeStudent();

    }

    public ArrayList<String> addStudent() {

        Scanner in = new Scanner(System.in);
        ArrayList<String> studList =new ArrayList<String>();

        System.out.println("Please enter the name of the student to add: ");
        //hasNext() returns true if the iteration has more elements
for(int i=0;i< studList.size();i++) {
    while (in.hasNext()) {
        for (String s : studList) {

        }


        System.out.println(studList + " has been added to the registry successfully.");


    }
}


        return studList;
    }
}







            /*public ArrayList<String> removeStudent() {
        String name1 = String.valueOf(new ArrayList<String>());
        Scanner remove = new Scanner(System.in);
        System.out.println("Please enter the name of the student to remove: ");
        name1 = remove.next();
        System.out.println(name1 + " has been removed to the registry successfully.");
        return name1;
    }*/







