package day15_FoorLoopString;

public class StringMethodes {
    public static void main(String[] args) {
        String str=" ";
        boolean str1=str.isBlank();
        System.out.println(str1);

        String str2= " ";
        boolean str3= str2.isBlank();
        System.out.println(str3);

        System.out.println("---------------------------------");
        String s1 ="cydeo";
        String s2= "CYDEO";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));

        System.out.println("-----------------------");
        String sentence= "My favorite programming language is Java";
    boolean HasCSharp=sentence.contains("C£");
    boolean hasJava = sentence.contains("Java");
    boolean hasJava2=sentence.toLowerCase().contains("java");
        System.out.println(HasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
    }
}
