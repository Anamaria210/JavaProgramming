package day09_IfAndElseStatment;

public class LeapYear {
    public static void main(String[] args) {


        int year = 2000;
        boolean leapYear = year % 4==0;

        if(leapYear){
            System.out.println("Year " + year + " Is a Leap Year");
        }

        if (!leapYear){
            System.out.println("Year " + year +" Is not a Leap Year");
        }

        if(leapYear){
            System.out.println("Year " + year + " Is a Leap Year");

        }else{
            System.out.println("Year " + year +" Is not a Leap Year");
        }



    }
}