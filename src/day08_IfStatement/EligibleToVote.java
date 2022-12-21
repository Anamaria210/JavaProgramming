package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 38;
        String citizen = "USA";
       boolean isEligible = age>= 21&& citizen=="USA";//true

        // eligible
        if(isEligible){
            System.out.println("Eligible");//true
        }
        // not eligible
        if(!isEligible){  // !true ====> not true ===> false
            System.out.println("Eligible");
        }

    }


}
