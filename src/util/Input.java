package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("Say something!");
        String userInput1 = scanner.nextLine();
        System.out.println("You said " + userInput1);
        return userInput1;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        String userInputPrompt2 = scanner.nextLine();
        System.out.println("You entered " + userInputPrompt2);
        return userInputPrompt2;
    }
    public boolean yesNo(){
        System.out.println("Yes/No");
        String userInput2 = scanner.nextLine();
        System.out.println("You said " + userInput2);
        if (userInput2.equalsIgnoreCase("yes")){
          return true;
        } else {
            return false;
        }
    }

    public int getInt (int min, int max){
        System.out.printf("Please enter a number between %d and %d%n", min, max);
        while(true){
            int userInput3 = this.scanner.nextInt();
            if (userInput3 > min && userInput3 < max){
                return userInput3;
            }
            System.out.println("Please enter a number in the given range");
        }
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userInput4 = scanner.nextInt();
        System.out.println("You entered " + userInput4);
        return userInput4;
    }
}

