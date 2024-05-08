import java.util.Scanner;
class Student {
    private String name;
    private int age;
    private String grade;
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();
        Student student = new Student(name, age, grade);
        System.out.println("\nStudent Information:");
        student.displayInfo();

        scanner.close();
    }
}
