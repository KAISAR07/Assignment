import java.util.Scanner;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    Scanner in = new Scanner(System.in);

    public Teacher() {
        super();
        System.out.print("Enter the subject: ");
        setSubject(in.next());
        System.out.print("Enter the years of experience: ");
        setYearsOfExperience(in.nextInt());
        System.out.print("Enter the salary: ");
        setSalary(in.nextInt());
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return super.toString() + "I teach " + getSubject();
    }
}