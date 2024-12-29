import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> Studentslist = new ArrayList<>();

        Student student1 = new Student();
        Studentslist.add(student1.getName() + " " + student1.getSurname());
        System.out.println(student1);

        ArrayList<String> Teacherslist = new ArrayList<>();

        Teacher teacher1 = new Teacher();
        Teacherslist.add(teacher1.getName() + " " + teacher1.getSurname());
        System.out.println(teacher1);
    }
}