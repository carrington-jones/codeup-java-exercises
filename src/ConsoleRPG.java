import java.util.Scanner;

public class ConsoleRPG {
    public static void begin (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to begin your adventure? Yes/No");
        String userInputBegin = scanner.nextLine();
        if (userInputBegin.equalsIgnoreCase("yes")){
            getName();
            System.out.println("Your adventure has begun and you have made your start towards the castle");
        } if (userInputBegin.equalsIgnoreCase("no")){
            System.out.println("Okay goodbye!");
        }
    }public static void getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great! What is your name?");
        String userName = scanner.nextLine();
        System.out.printf("Hello %s!%n", userName);
    }

    public static void leftOrRight1(){
        System.out.println("There is a fork in the road. Would you like to go left or right?");
        Scanner scanner = new Scanner(System.in);
        String userLeftOrRight1 = scanner.nextLine();
        if (userLeftOrRight1.equalsIgnoreCase("left")){

        } if (userLeftOrRight1.equalsIgnoreCase("right")){

        }

    }
public static int heroStartingHealth = 100;
    public static int orcStartingHealth = 25;
    public static int rogueStartingHealth = 25;
    public static int trollStartingHealth = 50;
    public static int wildMageStartingHealth = 50;
    public static int dragonStartingHealth = 75;
    public static int knightKingStartingHealth = 75;


    public static void main(String[] args) {
    begin();
        System.out.println(heroStartingHealth);
    }
}
