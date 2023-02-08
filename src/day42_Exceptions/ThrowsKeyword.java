package day42_Exceptions;

import java.sql.SQLOutput;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("------Test1---------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("----------Test 1 completed------------------");

        System.out.println("-------------Test 2 ----------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-----------------Test 2 completed");
    }
}
