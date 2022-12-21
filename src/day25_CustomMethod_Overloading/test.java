package day25_CustomMethod_Overloading;

import utility.StringUtility;

public class test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);

        String s1= "Wooden Spoon";
        String result=StringUtility.reverse(s1);
        System.out.println(result);

        String word="Civic";
      boolean IsPalindrome  =StringUtility.isPalindrome(word);
        System.out.println(IsPalindrome);
        String[]names={"Anna","Java","Python","Racecar","Mom","Cydeo"};
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
        }

        }
        System.out.println(count);
        String s2="aaaabbbbbcccccc";
       s2= StringUtility.removeDuplicates(s2);
        System.out.println(s2);
    }


}
