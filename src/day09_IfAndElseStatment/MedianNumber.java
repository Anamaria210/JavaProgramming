package day09_IfAndElseStatment;
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number

 */
public class MedianNumber {
    public static void main(String[] args) {


        int a = 10,
                b = 15,
                c = 20;
        // if we have three different numbers , one MUST be maximum and one must be minimum and one median number
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        1. if c is the maximum number & b is the minimum number, then a is the median number
        2. if b is the maximum number & c is the minimum number, then a is the median number
         */
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        // in order of b to be median number
        // (b > a && b < c ) || ( b > c && b < a )

        boolean cIsMedian = (c > a && c < b) || (c < a && c > b);

        if(aIsMedian){
            System.out.println(a + " could be median number");

        }
        if(bIsMedian){
            System.out.println(b+ " could be median number");
        }
        if(cIsMedian){
            System.out.println(c+ "could be median number");
        }

    }

}
