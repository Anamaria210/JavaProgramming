package day23CustomMethodVoidMethod;

public class CustomMethodWithParameters {
    // create a function that can check if a number is odd number or even number
    public static void main(String[] args) {
        OddOrEven(11);//  oddOrEven(); // the method demands additional info to complete its task
    }
    public static void OddOrEven(int number) {
           if(number%2==0){
               System.out.println(number+ " is Even Number");
}else{
               System.out.println(number+ " is Odd Number");
           }
    }
}