import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    Scanner sc = new Scanner(System.in);

    public Person() {
        System.out.print("Enter your name: ");
        setName(sc.nextLine());
        System.out.print("Enter your surname: ");
        setSurname(sc.nextLine());
        System.out.print("Enter your age: ");
        setAge(sc.nextInt());
        System.out.print("Enter your gender: ");
        setGender(sc.next());
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        if (gender.equals("Male")) {
            this.gender = true;
        } else if (gender.equals("Female")) {
            this.gender = false;
        }
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        if (gender) {
            return "Male";
        }
        return "Female";
    }

    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + " year old " + getGender() + ".";
    }
}