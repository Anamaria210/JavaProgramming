package day04_Variables;

import java.awt.image.DataBufferByte;

public class PrimitvesIntro {

    public static void main(String[] args) {
        //age :38 years old

        byte age = 38;
        //weight 160 pounds
       // byte  weight = 160 ; 160 is out of byte range
        short weight = 160 ; // is within the range of short
     //salary 100000$
    // short  salary = 100000; // the number is out of short range
        int salary = 100_000;// preferred data type fo integer numbers

        long asset = 3_333_333_333L;

        // tax : 0.26
        float tax = 0.26F ;
        double PI = 3.14;

        // #
        char ch1 ='#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3= 45000;
        System.out.println("ch3 = " + ch3);
        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);
        char gender = 'F';
        System.out.println("gender = " + gender);
        char grade = 'F';
        System.out.println("grade = " + grade);
        char yesNo= 'Y';
        System.out.println("yesNo = " + yesNo);

        boolean isEmployeed = true ;
        boolean isMarried = false ;
         boolean result = 100 > 300;
    }



}
