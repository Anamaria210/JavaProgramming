package day25_CustomMethod_Overloading;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
      int result1=  sumOf2Numbers(2,10);
        System.out.println(result1);
        int result2=sumOf3Numbers(12,15,40);
        System.out.println(result2);
        int result3=sumOf4Numbers(12,50,47,35);
        System.out.println(result3);

    }
    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }
    public static int sumOf3Numbers(int a, int b, int c ){
        return a+b+c;
    }
    public static int sumOf4Numbers(int a, int b, int c , int d){
        return a+b+c+d;
    }
    public static int sum(int a, int b){
        return a+b;
    }
}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers*/