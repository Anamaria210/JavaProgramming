package day07_Operators;

public class RelationalOperatores {
    public static void main(String[] args) {
       //> ,>= , < , <=
       boolean result1 = 20>40; //false
        System.out.println("result1 = " + result1);
        result1 = 20<40;
        System.out.println("result1 = " + result1);

        result1= 20>=20;
        System.out.println("result1 = " + result1);
        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);
        boolean result3= 100>=100;
        System.out.println("result3 = " + result3);
        boolean result4 = 300>=500;
        System.out.println("result4 = " + result4);

        System.out.println("....................................");
        //

        int x= 100;
        int y =200;
         boolean equal = x==y; // false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Buy";
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';// false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java "== "Java ";
        System.out.println("result10 = " + result10);


        boolean result11= 100!=200;
        System.out.println("result11 = " + result11);

        boolean result12 = "java"!= "Break";
        System.out.println("result12 = " + result12);



    }


}
