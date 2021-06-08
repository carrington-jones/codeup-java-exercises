package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>(); //HashMap that takes in a string and student object.
        Student Carrington1 = new Student("Carrington1");
        Carrington1.addGrade(90); //grades from Student Class
        Carrington1.addGrade(93);
        Carrington1.addGrade(95);
        Carrington1.addGrade(100);
        students.put("CJ1234", Carrington1);

        Student David = new Student("David");
        David.addGrade(85);
        David.addGrade(83);
        David.addGrade(82);
        David.addGrade(89);
        students.put("DavidDavid5678", David);

        Student Jay = new Student("Jay");
        Jay.addGrade(79);
        Jay.addGrade(78);
        Jay.addGrade(77);
        Jay.addGrade(76);
        students.put("JA9876 ", Jay);

        Student Javier = new Student("Javier");
        Javier.addGrade(110);
        Javier.addGrade(108);
        Javier.addGrade(106);
        Javier.addGrade(100);
        students.put("Javier2468", Javier);

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:\n");
        for (String gitHubUserNames : students.keySet()) { //This for loop prints out the key names from the HashMap using keySet.
            System.out.print(gitHubUserNames + " ");
        }

        //Start of logic for asking user what Github info they would like to see
        boolean userconfirm = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n\nWhat student would you like to see more information on?");
            String userGitHub = scanner.nextLine();
            if(!students.containsKey(userGitHub)){
                System.out.println("We do not have this user in our system");
            }
            if (students.containsKey(userGitHub)) {
                System.out.println("Name: " + students.get(userGitHub).getStudentName() + " - GitHub Username: " + userGitHub + "\nCurrentAverage: " + students.get(userGitHub).getGradeAverage()); //This Sout uses methods from student class.
                System.out.println("Would you like to see all grades from this student? Yes/No");
                String userAnswerAllGrades = scanner.nextLine();
                if(userAnswerAllGrades.equalsIgnoreCase("yes")){
                    System.out.println("Grades\n" + students.get(userGitHub).getGrade());
                }
                System.out.println("Would you like to see another student? Yes/No");
                String userAnswer = scanner.nextLine();
                if(!userAnswer.equalsIgnoreCase("yes")) { //When user types no the while becomes false.
                    userconfirm = false;
                }
            }
        } while(userconfirm); //do while stops if user says they would not like to see another student.


          //Attempt at bonus//
//        System.out.println("Would you like to see the class average?");
//        String userAnswerClassAverage = scanner.nextLine();
//        if (userAnswerClassAverage.equalsIgnoreCase("yes") || userAnswerClassAverage.equalsIgnoreCase("y")){
//            for (double i = 0; i <= 4; i++){
//
//            }
//        }


    }
}
