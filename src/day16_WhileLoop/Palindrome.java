package day16_WhileLoop;

public class Palindrome {
    public static void main(String[] args) {
        String word="Level" ;
        String reversed ="";

        for (int i =word.length()-1; i >=0; i--) {
           reversed+= word.charAt(i);
            System.out.println(reversed);
        }
      boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + (isPalindrome));
        /*

        "Java"==>"avaJ"==>not palindrome
        "Ana"===> true
        "Level "
        "Dad"
        "Mom"

         */
    }
}
