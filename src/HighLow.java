import java.util.Scanner;

public class HighLow {

    public static void highLow() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        int numberOfTries = 10;
        System.out.println("Can you guess the random number? It is between 1 and 100.");
        Scanner scanner = new Scanner(System.in);
        int userguess1 = scanner.nextInt();
        System.out.printf("Your guess was %d%n", userguess1);
        for (int i = 100; i > 0; i--) {
            if (userguess1 > randomNumber) {
                System.out.println("The random number is LOWER!");
                System.out.printf("You have " + i + " tries left%nPlease enter another number%n");
                userguess1 = scanner.nextInt();
            } else if (userguess1 < randomNumber) {
                System.out.println("The random number is HIGHER");
                System.out.printf("You have " + i + " tries left%nPlease enter another number%n");
                userguess1 = scanner.nextInt();
            } else if (userguess1 == randomNumber) {
                System.out.println("Congrats you win!!");
                break;
            } if (i == 0){
                System.out.println("I am sorry you have run out of tries!");
            }
        }
    }


    public static void main(String[] args) {
        highLow();
    }
}
