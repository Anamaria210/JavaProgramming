package day15_FoorLoopString;

import java.util.Scanner;

public class enterAWord {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word= new Scanner(System.in).next();//xcodex
        if(word.charAt(0)=='x'){
          word = word.replaceFirst("x","a");//acodex

        }
        System.out.println(word);


    }
}
