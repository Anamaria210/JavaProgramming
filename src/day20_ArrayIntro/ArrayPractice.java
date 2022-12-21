package day20_ArrayIntro;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers would like to enter");//
        int length= scan.nextInt();
        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[] numbers=new int[length]; // array need to have enough capacity all the elemenets
        for (int i = 0; i <length ; i++) {
            System.out.println("Enter a number");
          numbers[i] = scan.nextInt();// each imput user provided during each execution of the loop , will be assigned to the indexes of the array

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();

        /*

         */

    }
}
