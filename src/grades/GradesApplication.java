package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        ArrayList<Integer> carringtonGrades1 = new ArrayList<>();
        Student Carrington1 = new Student("Carrington1");
        Carrington1.addGrade(90);
        Carrington1.addGrade(93);
        Carrington1.addGrade(95);
        Carrington1.addGrade(100);
        students.put("CJ1234", Carrington1);

        ArrayList<Integer> DavidGrades = new ArrayList<>();
        Student David = new Student("David");
        David.addGrade(85);
        David.addGrade(83);
        David.addGrade(82);
        David.addGrade(89);
        students.put("DavidDavid5678", David);

        ArrayList<Integer> JaysGrades = new ArrayList<>();
        Student Jay = new Student("Jay");
        Jay.addGrade(79);
        Jay.addGrade(78);
        Jay.addGrade(77);
        Jay.addGrade(76);
        students.put("JA9876 ", Jay);

        ArrayList<Integer> JavierGrades = new ArrayList<>();
        Student Javier = new Student("Javier");
        Javier.addGrade(110);
        Javier.addGrade(108);
        Javier.addGrade(106);
        Javier.addGrade(100);
        students.put("Javier2468", Javier);

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:\n");
    for(String gitHubUserNames : students.keySet()){
        System.out.print(gitHubUserNames+" ");
    }
        System.out.println("\n\nWhat student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String userGitHub = scanner.nextLine();
        if(students.containsKey(userGitHub)){
            System.out.println("Name: " + students.get(userGitHub).getStudentName() + " - GitHub Username: " + userGitHub + "\nCurrentAverage: " + students.get(userGitHub).getGradeAverage());

        }
    }
}
