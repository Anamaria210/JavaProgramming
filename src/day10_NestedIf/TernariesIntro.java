package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even");// string
        } else {
            System.out.println("Odd");// string
        }
        System.out.println("----------------------------");
        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);


        System.out.println("---------------------------------------");
        int age = 12;
        if (age >= 16) {
            System.out.println("Eligible"); // String
        } else {
            System.out.println("Not Eligible"); //String
        }

       String result2=(23>=21)?"Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("----------------------------------");
        int number = 100;
        if(number>0){
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else
            System.out.println("Zero");
        System.out.println("----------------------------------");
      String result3=  (number>0)? "Positive":(number<0)?"Negative":"Zero";
        System.out.println(result3);
    }
}
