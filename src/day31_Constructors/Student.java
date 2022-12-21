package day31_Constructors;

public class Student {
    public String student;
    public int age;
    public char gender ;
    public char grade;
    public int id;

    public String toString() {
        return "Student{" +
                "student='" + student + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }

    public Student(String student, int age, char gender, char grade, int id) {
        this.student = student;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;

    }

}
