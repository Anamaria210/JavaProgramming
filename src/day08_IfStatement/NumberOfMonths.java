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

public class NumberOfMonths {
    public static void main(String[] args) {
        int number= 5;
        boolean monthsHas28 = number==2,// for the months has 28 days
                monthsHas30 =number== 4||number==6||number==9||number==11,//for the months has 30 days
                monthsHas31 =!monthsHas28 &&!monthsHas30;//for the months has 31 days
        if(monthsHas28) {
            System.out.println("28 Days");
        }
        if(monthsHas30){
            System.out.println("30 Days");
        }
        if(monthsHas31){

            System.out.println("31 Days");
        }


    }
}
