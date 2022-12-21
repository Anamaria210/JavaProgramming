package day08_IfStatement;
/*
3. Create a class called NumberOfDays, Write a program that can print the number of days in a month
            Ex:
                number = 1;
            output:
                31 Days
            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */



public class NumberOfDays {

    public static void main(String[] args) {
        int number = 4;
        boolean day01 = number==1,
                day02  =number==2,
                day03  =number==3,
                day04  =number==4,
                day05  =number==5,
                day06  =number==6,
                day07  =number==7;
        if(day01){
            System.out.println("Monday");
        }
        if(day02){
            System.out.println("Tuesday");
        }
        if (day03){
            System.out.println("Wednesday");
        }
        if(day04){
            System.out.println("Thursday");

        }
        if(day05){
            System.out.println("Friday");
        }
        if(day06){
            System.out.println("Saturday");
        }
        if(day07){
            System.out.println("Sunday");
        }


    }
}
