package day15_FoorLoopString;

public class ForLoopPractice {
    public static void main(String[] args) {
        // System.out.print(16);
        //System.out.print(16);

        for (int i = 15; i <= 45; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("Hello");

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");

            }
            System.out.println("------------------------------");
            for(i=2;i<=54;i+=2); //i :2 each time is increase by 2 , 4 , 6 ...54
            System.out.print(i+ " ");



        }
    }

}