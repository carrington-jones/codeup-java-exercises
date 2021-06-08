package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> gradeArrayList;


    public Student(String studentName) {
        this.studentName = studentName;
        this.gradeArrayList = new ArrayList<>();//Each student takes in array list
    }

    public String getStudentName() {
        return this.studentName;
    }

    public ArrayList<Integer> getGrade() {
        return this.gradeArrayList;
    }

    public void addGrade(int grade) {
        this.gradeArrayList.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;

        for (int grade : this.gradeArrayList)
            total += grade;
        return total / this.gradeArrayList.size();
    }

    public static void main(String[] args) {

        Student Carrington = new Student("Carrington");
        Carrington.addGrade(90);
        Carrington.addGrade(93);
        Carrington.addGrade(95);
        Carrington.addGrade(100);
        System.out.println(Carrington.getGrade());
        System.out.println(Carrington.getGradeAverage());

        Student Mark = new Student("Mark");
        Mark.addGrade(80);
        Mark.addGrade(82);
        Mark.addGrade(85);
        Mark.addGrade(89);
        System.out.println(Mark.getGrade());
        System.out.println(Mark.getGradeAverage());

        Student Leo = new Student("Leo");
        Leo.addGrade(70);
        Leo.addGrade(45);
        Leo.addGrade(81);
        Leo.addGrade(94);
        System.out.println(Leo.getGrade());
        System.out.println(Leo.getGradeAverage());
    }
}
