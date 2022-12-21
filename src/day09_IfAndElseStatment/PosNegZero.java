package day09_IfAndElseStatment;

public class PosNegZero {
    public static void main(String[] args) {
       int number = 100;
       boolean positive = number>0;
       boolean negative = number<0;
        if(number>0) {
            System.out.println("Positive");
        }
        if(number<0) {
            System.out.println("Negative");
        }
        if(number==0) {
            System.out.println("Zero");

            System.out.println("----------------------------------------------");

            if(positive){
                System.out.println("Positive");
            } else if (!negative) {
                System.out.println("Zero");
            } else {
                System.out.println("Negative");
            }
        }



    }
}
