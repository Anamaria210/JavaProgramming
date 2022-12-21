package day14_String;

public class substring {
    public static void main(String[] args) {
        String word= "Cydeo School";
       String word1= word.substring(0,4+1);
        System.out.println("word= " + word1);
        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);
    String word2="Java Programming Language";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
