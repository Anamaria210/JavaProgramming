package day12_Scanner;


/*
1. Ask the user to enter age (nextInt() )
2. Ask the user to enter full name (nextLine() )
 */

import java.util.Scanner;

public class nextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        System.out.println("Enter your name");
        input.nextLine();
       String name= input.nextLine();
        System.out.println("Enter your gpa");
        double gpa=input.nextDouble();
        input.nextLine();
        System.out.println("enter your school name");
        String school=input.nextLine();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);
        input.close();
    }
}
