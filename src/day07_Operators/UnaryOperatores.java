package day07_Operators;

public class UnaryOperatores {

    public static void main(String[] args) {
        int a = 5;
        ++a; //pre imprement : increases the value by 1

        System.out.println("a = " + a);

       --a; // pre decrement decrease the value buy 1

        System.out.println(--a);

        System.out.println("----------------------------------------");
        int b= 100;
        System.out.println(++b); //pre increment : increases the value by 1 right away
        int c = 100;
        System.out.println(c++); // post increment : first passes the current value then increase the value by 1
        System.out.println(c);


        System.out.println("----------------------------------------");

        int x = 200;
        int y = 200;
        System.out.println(--x); // pre decrement operator decrease the value by 1 right away
        System.out.println(y--);// post decrement  first passes the current value then decrease the value by 1
        System.out.println(y);








    }




}


