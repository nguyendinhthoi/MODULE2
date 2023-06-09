package ss5_access_static.exercise.student;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("What your name?");
        String name = scanner.nextLine();
        System.out.println("What is your grade");
        String grade = scanner.nextLine();

        student.setName(name);
        student.setGrade(grade);

        System.out.println(student);
    }
}
