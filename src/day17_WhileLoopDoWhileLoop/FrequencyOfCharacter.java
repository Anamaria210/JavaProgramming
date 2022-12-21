package day17_WhileLoopDoWhileLoop;
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str="AAABBBC";
        char ch='A';

        int frequency =0;//+1+1+1==>3
        for (int i = 0; i < str.length(); i++) {  //i: index of str
            char eachChar= str.charAt(i); // eachChar ; each char of Str
            //  'A'== 'A'
            if (ch==eachChar){ //if given ch is matching with eachChar,then ch is appeared in the string
                frequency++;
            }
        }
        System.out.println(frequency);

    }
}
