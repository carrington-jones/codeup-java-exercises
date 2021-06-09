import java.util.Scanner;

public class ExceptionsStudy {
    public String maybeAnInteger = "42";
    public String definitelyNotAnInteger = "Nope. I am not an integer. I am a string.";

    public void askForAnInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter and Integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is: " + userInputInteger);
        } catch (NumberFormatException e) {
            System.out.println("Oh no! " + e.getMessage() + " There is no integer");
        } finally {
            System.out.println("Thank you for using this complex and useful application");//This will run no matter what because of the finally
            System.out.println("Please come back soon");
        }
    }
    //You chain multiple "catch" as seen below 11111111111111111111111 would pass this test
//    public void aMoreComplexAskForInteger() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        String userInput = scanner.nextLine();
//        try {
//            int userInputInteger = Integer.parseInt(userInput, 10, 15, 10);
//        } catch (NumberFormatException nfe) {
//            System.out.println("No integer between characters 10 and 15");
//        } catch (IndexOutOfBoundsException iobe) {
//            System.out.println("Your string wasn't long enough");
//        } finally {
//            System.out.println("Thank you for visiting our application.");
//        }
//    }

    public void echoWord() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please say something and I will parrot you");
        String userInput = scanner.nextLine();
        if(userInput.equals("curse you!")) {
            throw new IllegalArgumentException();
        }
        System.out.println(userInput);
    }

}

