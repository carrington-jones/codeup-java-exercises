package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> gradeArrayList;


    public Student(String studentName) {
        this.studentName = studentName;
        this.gradeArrayList = new ArrayList<>();
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
        ArrayList<Integer> carringtonGrades = new ArrayList<>();
        Student Carrington = new Student("Carrington");
        carringtonGrades.add(90);
        carringtonGrades.add(93);
        carringtonGrades.add(95);
        carringtonGrades.add(100);
        System.out.println(carringtonGrades);
        System.out.println(Carrington.getGradeAverage());

        ArrayList<Integer> markGrades = new ArrayList<>();
        Student Mark = new Student("Mark");
        markGrades.add(80);
        markGrades.add(82);
        markGrades.add(85);
        markGrades.add(89);
        System.out.println(markGrades);
        System.out.println(Mark.getGradeAverage());

        ArrayList<Integer> LeoGrades = new ArrayList<>();
        Student Leo = new Student("Leo");
        LeoGrades.add(70);
        LeoGrades.add(45);
        LeoGrades.add(81);
        LeoGrades.add(94);
        System.out.println(LeoGrades);
        System.out.println(Leo.getGradeAverage());
    }
}
