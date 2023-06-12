package basicjava.programs;
public class DecisionMakingSwitch {
    public static void main(String[] args) {

        /*
         * switch(expression){ Case 1: statements break; Case 2: statements break; | | | | default:
         * statment } Ctrl Shift f to format the code
         *
         */

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None is correct");
        }
    }
}


