import java.util.Scanner;

public class MethodsExercises {
    //    Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition
//    Subtraction
//    Multiplication
//    Division
//
//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your methods and verify the output.
//    Add a modulus method that finds the modulus of two numbers.
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //Create your multiplication method without the * operator (Hint: a loop might be helpful).
    public static int multiply2(int num1, int num2) {
        int result = 0;
        while (num1 > 0) {
            result += num2;
            num1--;
        }
        return result;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //        Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Please try again!");
            getInteger(min, max);
        }
        return userInput;
    }

//    Calculate the factorial of a number.

    public static void Factorial(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: %n", min, max);
        long userInput2 = Long.parseLong(scanner.nextLine());
        System.out.printf("You entered %d. Do you wish to see the factorial? Yes/No%n", userInput2);
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.printf("Your number was %d! %d x", userInput2, userInput2);
            for (long i = userInput2 - 1; i > 1; i--) {
                System.out.printf(" %d x", i);
                userInput2 *= i;
            }
            System.out.printf(" 1 = %d", userInput2);
        }
    }

    //    Create an application that simulates dice rolling
    public static void diceGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%nWe are rolling two dice today!%nHow many side on the first dice?%n");
        int userInput3 = scanner.nextInt();
        System.out.printf("%nHow many side on the second dice?%n");
        int userInput4 = scanner.nextInt();
        System.out.println("When you are ready please type \"roll\" to roll the dice.");
        String userDiceConfirm = scanner.next();
        if (userDiceConfirm.equalsIgnoreCase("roll")) {
            int diceRoll1 = (int) (Math.random() * userInput3 + 1);
            int diceRoll2 = (int) (Math.random() * userInput4 + 1);
            System.out.printf("You rolled %d and %d!", diceRoll1, diceRoll2);
            System.out.println(" Would you like to roll the dice again?");
            String userConfirm2ndRoll = scanner.next();
            if (userConfirm2ndRoll.equalsIgnoreCase("yes")) {
                diceGame();
            } else {
                System.out.println("Okay. Goodbye!");
            }
        } else {
            System.out.println("Okay. Goodbye!");
        }
    }


    public static void main(String[] args) {
//        System.out.println(add(5, 10));
//        System.out.println(subtract(100, 50));
//        System.out.println(multiply(10, 10));
//        System.out.println(multiply2(10, 5));
//        System.out.println(divide(100, 10));
//        System.out.println(modulus(100, 10));
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        Factorial(1, 10);
        diceGame();

    }
}
