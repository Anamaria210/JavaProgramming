package day19_LoopsPractice;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==3){
              //  break; // terminate the loop
              //  continue; // terminate the current iteration of the loop
                System.exit(0);// terminate the program
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");
    }
}
