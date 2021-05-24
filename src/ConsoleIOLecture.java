import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = "David";
        System.out.printf("Hello, %s", name);

        System.out.format("%d is %s's favorite number%n", 42, name);
        System.out.println("I'm on a new line");

        System.out.println("Hello, " + name);
        //Creates prompt for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, how is it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Give me a number!");
        int num = scanner.nextInt();

    }
}
