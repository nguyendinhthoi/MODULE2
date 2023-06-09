package ss5_access_static.exercise.student;

public class Student {
    private String name = "John";
    private String grade = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
