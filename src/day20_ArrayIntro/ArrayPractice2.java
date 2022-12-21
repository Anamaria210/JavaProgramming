package day20_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];
      /*  for (char i = 'A',j=0; i <='Z'&&j<letters.length ; i++,j++) {
            letters[j]=i;
*/
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }


        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]


        System.out.println("------------------------------");
        char[] letters2=new char[26];

        char ch1='Z';

        for (char i = 'Z';i >letters2.length; i--) {
            letters2[i]=ch--;

        }

        }

    }

