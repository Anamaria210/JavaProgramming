package day40_FinalKeyword;

import java.io.PrintStream;

public class FinalVariable {
    final String birthday;
   final static String name ;

   static {
       name="Batch 25";
   }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
       final double pi=3.14;
        //pi=4.14; final variables can not be reassigned
       // pi= 5.20;
        final String name;
        name="Java";
       // name="WoodenSpoon";

        System.out.println(name);

        System.out.println("-----------------------------------------");
        FinalVariable obj = new FinalVariable("May/01");
        //obj.birthday="Jun/06";
        System.out.println(obj.birthday);

        System.out.println("---------------------------------------");
        System.out.println(FinalVariable.name);
    }

}
