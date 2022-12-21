package day15_FoorLoopString;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int minimumNum=2147483647;
        for (int i = 10; i <15 ; i++) {
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num<minimumNum){
                minimumNum=num;
            }


        }
        System.out.println(minimumNum);
    }
}
