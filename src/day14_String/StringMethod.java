package day14_String;

public class StringMethod {
    public static void main(String[] args) {
        String str1= "   batch 25    ";
        str1=str1.trim();
        System.out.println(str1);

        String str2 ="Cydeo School";
       int n1= str2.indexOf("h");
        System.out.println("str2 = " + str2);
        System.out.println("n1 = " + n1);

        int n2=str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 ="Java programming language";
      int n3 = str3.indexOf("ang");
        System.out.println("n3 = " + n3);
        int n4= str3.indexOf("ge");
        System.out.println("n4 = " + n4);
        int n5 =str3.lastIndexOf("g");
        System.out.println("n5= "+n5);
        System.out.println("---------------------------------");
        String s="Java Nova Cava Wawa orange";
      int n6 = s.indexOf("a");
        System.out.println("n6 = " + n6);
        int n7= s.indexOf("a C");
        System.out.println(n7);

    }
}
