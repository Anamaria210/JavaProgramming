package day16_WhileLoop;
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */

import java.io.PrintStream;

public class Reverse {
    public static void main(String[] args) {
        String str ="I love Java Programming";
        String result="";// contain the reverse version of str
/*
        //index:0123456....
        result+=str.charAt(str.length()-1);//n(11)
        result+= str.charAt(10);//o
        result+= str.charAt(9);//o
        result+= str.charAt(8);//p
        result+=str.charAt(7);//S
        result+=str.charAt(5);//" "
        result+=str.charAt(4);
        result+=str.charAt(3);
        result+=str.charAt(2);
        result+=str.charAt(1);
        result+=str.charAt(0);
*/
        for (int i = str.length()-1; i >=0 ; i--) { //i:index numbers of str (starting last index
            //to index zero)
            result +=str.charAt(i); //adding each character to result




        }







        System.out.println(result);


    }
}
