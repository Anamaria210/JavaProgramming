package utility;

import java.util.Arrays;

public class StringUtility {
    // print each character of the given String
  public static void printEachChar(String str){
      for (int i = 0; i <str.length() ; i++) {
          System.out.println(str.charAt(i));
}
    }
 // returns the given String and returns the reversed String
    public static String reverse(String str) { // "Java"
       String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
    // checks is the given String is Palindrome and return boolean
    public static boolean isPalindrome(String str){
     return reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given String is anagram, returns boolean
    public static boolean anagram(String str1,String str2){ //"acb", "bca"
      char [] ch1=str1.toCharArray();
      char []ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
         return Arrays.equals(ch1,ch2);

    }

    //remove the duplicates from given String , returns String "aaaabbbbbccccc"===>"abc"
    public static String removeDuplicates(String str){
      String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i); // aaaaabbbbbbcccccc
            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }
}
