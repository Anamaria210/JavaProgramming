package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email="Cydeo.school@gmail.com";
        // domain:
       // int beginningIndex= email.indexOf("@")+1;
       // int lastIndex = email.lastIndexOf(".");
       // String email2= email.substring(beginningIndex,lastIndex);
        //System.out.println(email2);
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(domain);
        System.out.println("--------------------------------");
        String str1="Java is fun,Java is cool, I love Java";
        String s1 =str1.substring(0,10+1);
        System.out.println(s1);
        String s2= str1.substring(str1.indexOf(",J")+1, str1.lastIndexOf(","));
        System.out.println(s2);
        String s3 = str1.substring(str1.lastIndexOf("I "));
        System.out.println(s3);


    }
}
