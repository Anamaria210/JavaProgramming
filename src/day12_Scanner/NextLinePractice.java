package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");

        int age=scan.nextInt();
        System.out.println("Enter Full name");

        scan.nextLine();
       String fullName =scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        System.out.println("Enter the gpa");
        double gpa =scan.nextDouble();//3.5
        scan.nextLine();

        System.out.println("enter school name ");
       String schoolName =scan.nextLine();

        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);



        /*
        1.Ask the user to enter age
        2.ask the user to enter full name

         */
    }
}
