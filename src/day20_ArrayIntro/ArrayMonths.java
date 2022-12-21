package day20_ArrayIntro;

import java.util.Arrays;

public class ArrayMonths {
    public static void main(String[] args) {
        // String[] months=new String[12];
        String months[] = {"January", "February", "March", "April","May", "June", "July", "August", "September", "October",
                "November", "December"};
        int num = 10;
        if(num<=1||num>12){
            System.out.println("Invalid number");
            System.exit(0);
        }


        System.out.println(months[num-1]);

        }
    }
