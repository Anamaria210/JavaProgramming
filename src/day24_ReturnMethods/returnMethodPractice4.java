package day24_ReturnMethods;

public class returnMethodPractice4 {
    public static void main(String[] args) {
        String str = "cccccccddddaaaaaaabbbbbbbb";
      str = removeDublicates(str);

        System.out.println(str);

    }


    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDublicates(String str) { // aaabbcc===>abc
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;


            }

        }
        return result;
    }
    }
