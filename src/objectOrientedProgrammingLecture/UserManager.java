package objectOrientedProgrammingLecture;

import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void startMenu(User u) {
        System.out.println("Welcome!");
        System.out.println("1. Log in.\n2. Exit Program.");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            UserTools.logIn(u);
        } else {
            System.out.println("Thank you for your time goodbye!");
        }
    }

    public static void editPreferences(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("Sorry, you are currently logged out, please log in.");
            UserTools.logIn(u);
        } else {
            System.out.println("Welcome to your preferences. Would you like to:\n1.Change your password.\n2.Log out");
            int userChoice = scanner.nextInt();
            System.out.println("You chose to choice " + userChoice);
            switch (userChoice) {
                case 1:
                    UserTools.changePassword(u);
                    editPreferences(u);
                    break;
                case 2:
                    UserTools.logOut(u);
            }
        }
    }

        public static void main (String[]args){
//        User testUser = new User();
//        testUser.id = 1;
//        testUser.username = "Cman";
//
//        testUser.setPassword("password");
//        testUser.email = "cjones2621@gmail.com";
//
//        System.out.println(testUser.getPassword());
//
//        UserTools.logIn(testUser);
            User user2 = new User("codeup-dude", "gocodeup", "codeup@gmail.com");

            startMenu(user2);
        }
    }
