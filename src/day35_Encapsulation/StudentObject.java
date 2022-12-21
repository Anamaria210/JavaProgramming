package day35_Encapsulation;

import day36_Inheritance.Encapsulation.Student;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Daniel",29,'M','D','D');
        student1.setAge(35);
        System.out.println(student1);
    }
}
