import java.util.Scanner;

public class ConsoleRPG {
    public static void begin() { //method starts game
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to begin your adventure? Yes/No");
        String userInputBegin = scanner.nextLine();
        if (userInputBegin.equalsIgnoreCase("yes")) {
            getName();
            System.out.println("Your adventure has begun and you have made your start towards the castle. You have 3 potions in your inventory!");
            leftOrRight1();
        }
        if (userInputBegin.equalsIgnoreCase("no")) {
            System.out.println("Okay goodbye!");
        }
    }

    public static void getName() { //method gets users name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Great! What is your name?");
        String userName = scanner.nextLine();
        System.out.printf("Hello %s!%n", userName);
    }

    public static void leftOrRight1() { //1st user choice
        System.out.println("There is a fork in the road. Would you like to go left or right?");
        Scanner scanner = new Scanner(System.in);
        String userLeftOrRight1 = scanner.nextLine();
        if (userLeftOrRight1.equalsIgnoreCase("left")) {
            System.out.println("You have encountered an orc! Attack or run away?");
            String userOrcAttack = scanner.nextLine();
            //code for orc fight
            if (userOrcAttack.equalsIgnoreCase("attack")) {
                orcFight();
                System.out.println("Would you like to drink a potion to replenish your health?");
                String afterOrcPotionInput = scanner.next();
                if (afterOrcPotionInput.equalsIgnoreCase("Yes")) {
                    drinkPotion();
                }
            }
        }
        if (userLeftOrRight1.equalsIgnoreCase("right")) {
            System.out.println("You have encountered a rogue! Attack or run away?");
            String userRogueAttack = scanner.nextLine();
            //code for rogue fight
            if (userRogueAttack.equalsIgnoreCase("attack")) {

            }
        }

    }

    public static void orcFight() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 25; orcStartingHealth > 0; i -= 10) {
            System.out.println("You have attacked the Orc! You did 10 damage! The Orc now has " + (orcStartingHealth - 10) + " health!");
            orcStartingHealth -= 10;
            if (orcStartingHealth <= 0) {
                System.out.println("You have defeated the orc!");
                break;
            }
            System.out.println("The orc has attacked you! It did 10 damage! You now have " + (heroStartingHealth - 10) + " health!");
            heroStartingHealth -= 10;

        }
        System.out.println("Congrats on your victory! You currently have " + heroStartingHealth + " health.");
    }


    //this method replenishes hero's health
    public static int potionCountStart = 3;

    public static void drinkPotion() {
        if (potionCountStart == 0) {
            System.out.println("You do not have any potions left!");
        } else {
            potionCountStart--;
            System.out.println("You drank a potion! Your health is now " + (heroStartingHealth + 25) + " You have " + potionCountStart + " remaining");
            heroStartingHealth += 25;
        }

    }

    //Starting points for hero fights. Based on right and left choices of user
    public static int heroStartingHealth = 100;
    public static int orcStartingHealth = 25;
    public static int rogueStartingHealth = 25;
    public static int trollStartingHealth = 50;
    public static int wildMageStartingHealth = 50;
    public static int dragonStartingHealth = 75;
    public static int knightKingStartingHealth = 75;

    //main methods
    public static void main(String[] args) {
        begin();
//        drinkPotion();
    }
}
