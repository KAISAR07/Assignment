import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private static int studentID = 0;
    private int id;
    private ArrayList<Integer> grades;

    Scanner sc = new Scanner(System.in);

    public Student() {
        this.id = studentID++;

        System.out.println("Student Grades : ");
        grades = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            grades.add(sc.nextInt());
        }
        setGrades(grades);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        super.setName(name);
    }
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    private double calculateGPA() {
        double gpa = 0;
        int total = 100;
        for (Integer grade : grades) {
            gpa += grade;
        }
        double result = gpa / 100;

        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "I am a student with ID [" + studentID + "] and GPA " + calculateGPA();
    }
}