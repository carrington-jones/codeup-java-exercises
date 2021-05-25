import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is %.2f%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");
        int num = scanner.nextInt();
        System.out.printf("Your number is %d%n", num);

        System.out.println("Please Enter 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("Your words are %s, %s, and \"%s\".%n",word1, word2, word3);

        System.out.println("Please enter a sentence");
        scanner.nextLine();
        String sentence1 = scanner.nextLine();
        System.out.printf("Your sentence is %s%n", sentence1);

        System.out.println("Please the length, width, and height of the classroom");
        String classroomWidth = scanner.nextLine();
        double measurementsWidth = Double.parseDouble(classroomWidth);
        String classroomLength = scanner.nextLine();
        double measurementsLength = Double.parseDouble(classroomLength);
        String classroomHeight = scanner.nextLine();
        double measurementsHeight = Double.parseDouble(classroomHeight);
        Double classroomArea = measurementsWidth * measurementsLength;
        Double classroomPerimeter = (2 * measurementsWidth) + (2 * measurementsLength);
        Double classroomVolume = measurementsWidth * measurementsLength * measurementsHeight;
        System.out.printf("The area of the class room is %.2f,%n The perimeter of the classroom is %.2f,%n and the volume of the classroom is %.2f.%n", classroomArea, classroomPerimeter,classroomVolume);
    }
}
