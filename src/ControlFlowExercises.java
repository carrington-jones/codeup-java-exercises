import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
//        while (i <= 15) {
//            System.out.println("The current value of i is " + i);
//            i++;
//        }

//        do {
//            i += 2;
//            System.out.println(i);
//        } while(i < 100);
//        i = 100;
//        do {
//            i -= 5;
//            System.out.println(i);
//        } while(i > -10);

//        long i2 = 2;
//        do {
//            System.out.println(i2);
//            i2 *= i2;
//        } while(i2 < 1000000);
//FIZZBUZZ
//        int f = 1;
//        for (f = 1; f <= 100; f++){
//            if(f % 3 == 0 && f % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (f % 3 == 0){
//                System.out.println("Fizz");
//            } else if (f % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(f);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int num = scanner.nextInt();
        System.out.println("I have a table ready. Would you like to continue?");
        String tableAnswer = scanner.next().toLowerCase();
        if (tableAnswer.equals("yes")) {
            System.out.println("Here is your table!\nnumber | squared | cubed\n-----  |  -----  | -----\n");
            for (i = 1; i <= num; i++) {
                System.out.println(i + "      | " + (i * i) + "     |" + (i * i * i) + "    ");
            }
        } if (tableAnswer.equals("no")){
            System.out.println("Okay, goodbye!");
        }
//            System.out.println("Okay, goodbye!");
//        System.out.println("What was your grade?");
//        int grade = scanner.nextInt();
//        System.out.println("Your grade is " + grade);
//        System.out.println("Would you like to continue to see your grade?");
//        String gradeAnswer = scanner.next().toLowerCase();
//        if (gradeAnswer.equals("Yes")) {
//            if (grade >= 88) {
//                System.out.println("Congrats! You got an A!");
//            } else if (grade >= 80) {
//                System.out.println("Congrats! You got an B!");
//            } else if (grade >= 67) {
//                System.out.println("Congrats! You got an C!");
//            } else if (grade >= 60) {
//                System.out.println("Congrats! You got an D!");
//            } else {
//                System.out.println("Congrats! You got an F!");
//            }
//        } if (gradeAnswer.equals("No")){
//            System.out.println("Okay, goodbye!");
//        }

/*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
program Starts:
Please enter pin:
22132
Output:
Incorrect, try again.
Please enter pin:
23412
Output:
Incorrect, try again.
Please enter pin:
12345
Output:
Correct, welcome back.
 */
//        int correctpin = 12345;
//        for (int x = 3, y = 2; x > 0; x--) {
//            System.out.println("Please enter your pin");
//            int num = scanner.nextInt();
//            if (num == correctpin) {
//                System.out.println("Correct, welcome back!");
//                break;
//            } if (x == 1) {
//                System.out.println("Sorry you have been locked out!");
//            } else {
//                System.out.println("Incorrect, please try again! You have " + (y--) + " tries left");
//
//            }
//        }

    }
}
