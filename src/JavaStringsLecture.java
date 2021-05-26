import java.util.Scanner;

public class JavaStringsLecture {
    public static void main(String[] args) {
    char character = 'd';
        System.out.println(character == 'd');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Hey David, who is your favorite uncle?");
        String maybeBob = scanner.nextLine();
        System.out.println(bob.equals(maybeBob));
        //equalsIgnoreCase()

        //Comparing start and end of strings
        String carrington = "Carrington";
        String car = "Car";
        String firstletterCarrington = "" + carrington.charAt(0);
        System.out.println("Carrington and car start with the same letter?: " + car.startsWith(firstletterCarrington));

        //Manipulation
        int locationOfAInCar = car.indexOf("a");
        System.out.println("The location of 'a' in the string of \"car\" is: " + locationOfAInCar);

        String coolCats = "Cool Cats are cool and we like that!";
        int coolCatsLength = coolCats.length();
        System.out.println(coolCatsLength);

        String hiDad = "Hello, Father!";
        String father = hiDad.substring(7);
        System.out.println(father); //Returns a new string at index that is the argument

        String  hasWhiteSpace = "        Oh that's a lot of white space, huh?      ";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.trim());//Trims white space
    }
}
