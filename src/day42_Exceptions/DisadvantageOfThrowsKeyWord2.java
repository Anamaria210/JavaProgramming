package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyWord2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        method1();
        method2();
        method3();
        String str= null;
        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public static void method(){
        try {
            method1();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void method1() throws InterruptedException {
       Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException {
        method1();
    }
    public static void method3() throws  InterruptedException {

            method2();
            Thread.sleep(3000);

        }

        public static void method4() throws FileNotFoundException, InterruptedException {
        method3();
    }
}
