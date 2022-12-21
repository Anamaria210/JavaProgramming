package day09_IfAndElseStatment;

public class Eligible {

    public static void main(String[] args) {
        int age = 21;
        boolean eligible  = age>=18;

         if(eligible){
             System.out.println(age + " Eligible");
         }else
             System.out.println(age + "Not Eligible");
    }


}
