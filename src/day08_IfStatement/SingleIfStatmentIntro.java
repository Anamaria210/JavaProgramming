package day08_IfStatement;

public class SingleIfStatmentIntro {

    public static void main(String[] args) {
        int number = 100;
        System.out.println("Odd Number");
        System.out.println("Even Number");

        boolean evenNumber = number %2==0;
        boolean oddNumber=!evenNumber;
        if(evenNumber){
            System.out.println(number+ " is even number ");

        }

        if(!evenNumber){  //not even number
            System.out.println(number + " is not even number ");
        }
        if(oddNumber){
            System.out.println(number+ " is odd number ");

        }

        System.out.println("-----------------------------------");
        int n = 200;
        // positive
        //negative
        //zero

        if(n>0){
            System.out.println(n+ " is positive ");// if the n is greater then 0
        }

        if (n<0){
            System.out.println(n + " is negative ");// if n is less than 0 , then is negative
        }

        if (n==0){
            System.out.println(n + "is Zero"); // if n is equal zero
        }

    }


}
