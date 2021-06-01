package objectOrientedProgrammingLecture;

import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);

    public static void logIn(User u) {

        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if (userPassword.equals(u.getPassword())) {
            u.setLoggedIn(true);
            System.out.println("You have have successfully logged in!");
        } else {
            System.out.println("That password is incorrect.");
        }
    }

    public static void logOut(User u) {
        System.out.println("Are you sure you want to log out?");

        String userChoice = scanner.nextLine();

        if (userChoice.equals("y")) {
            System.out.println("You have have successfully logged out!");
        } else {
            System.out.println("We will keep you logged in");
        }
    }

    public static void changePassword(User u) {
        if (!u.isLoggedIn()) {
            System.out.println("Sorry you are logged out. Please log in");
            logIn(u);
        } else {
            System.out.println("Please enter your current password: ");
            String currentPassword = scanner.nextLine();
            if (u.getPassword().equals(currentPassword)) {
                System.out.println("Please enter a new password");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
                System.out.println("Congrats, your password is now " + newPassword);
            } else {
                System.out.println("Sorry that password is incorrect.");
            }
        }
    }

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "Cman";

        testUser.setPassword("password");
        testUser.email = "cjones2621@gmail.com";

        System.out.println(testUser.getPassword());

        UserTools.logIn(testUser);

        User user2 = new User("CodyTheDuck", "Codeup", "codeup@email.com");

        System.out.println("Username: " + user2.username);
        System.out.println("Password: " + user2.getPassword());
        System.out.println("Email: " + user2.email);

        changePassword(testUser);
    }
}