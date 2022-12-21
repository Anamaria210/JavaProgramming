package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str= "Java is fun , i love learning Java";
       String str2= str.replace("Java","Python");//
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email= "johnsmith@yahoo.com";
        String email2=email.replace("yahoo","gmail");
        System.out.println("email2 = " + email2);
        System.out.println("email = " + email);

        String sentence="Java Java Python Python C? C? C++ C++ Python Python Python Python";
      String sentence2 = sentence.replace("Python","").replace("  ","");
        System.out.println("sentence2 = " + sentence2);

    }
}
