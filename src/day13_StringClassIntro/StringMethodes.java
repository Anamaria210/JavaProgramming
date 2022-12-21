package day13_StringClassIntro;

public class StringMethodes {
    public static void main(String[] args) {
        String word ="Cydeo";
        char thirdChar =word.charAt(2);
        System.out.println(thirdChar);
       /* char tenthChar= word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);*/

        String s1 = "batch 25 is the best batch";
        int totalChar=s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastCharacter= s1.charAt(25);
        System.out.println("lastCharacter = " + lastCharacter);


        String str= "wooden spoon";
        str=str.toUpperCase();// "WOODEN SPOON"
        System.out.println(str);


    }
}
