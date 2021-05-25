import java.util.Scanner;

public class ControlFlowLecture {
    public static void main(String[] args) {
//        int x= 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, it means x is 5");
//        }
//        int y = 2;
//        if (y == 2) {
//            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y==2' is true");
//        } else {
//            System.out.println("I have tested to see if 'y==2' is true, and it is not. It is false.");
//        }
//        short y = -5;
//        y = 12;
//        y = 32000;
//        if (y < 0) {
//            System.out.println("The variable y contains a negative number value");
//        } else if ( y >= 0 && y < 30000){
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "chocolate";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One Vanilla coming right up!");
//                break;
//            case "chocolate":
//                System.out.println("Chocolate coming right up!");
//                break;
//            default:
//                System.out.println("We do not have that flavor");
//                break;
//        }
//        String myName = "Carrington";
//        String anotherCarrington = "Carrington";
//        String Carrington = new String("Carrington");
//
//        System.out.println(myName == anotherCarrington); //Evaluates to true
//        System.out.println(myName == Carrington); //Evaluates to false
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//        if (userInput == myName){
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me!");
//        }

//        if (userInput.equals(myName)) {
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me");
//        }


        /*----------LOOPS---------*/
//        int i = 1;
//        while(i < 10) {
//            System.out.println("Now I am in the loop");
//            increment. This prevents infinite loop.
//            i++;
//            System.out.println("I am still in the loop but I have incremented now and the value is " + i);
//        }
//        System.out.println("This is outside of the after it has executed.");

        for (int i = 0; i < 10; i++) {
            System.out.println("I am in the loop the value is " + i);
        }
    }
}


