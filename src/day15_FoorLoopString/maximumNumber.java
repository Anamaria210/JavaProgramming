package day15_FoorLoopString;
/*
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int maximNum= -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
           int num= scan.nextInt();
           if(num>maximNum){
               maximNum=num;
           }


        }

        System.out.println(maximNum);

    }
}
