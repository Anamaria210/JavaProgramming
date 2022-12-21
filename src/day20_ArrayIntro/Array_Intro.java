package day20_ArrayIntro;

import java.util.Arrays;

public class Array_Intro {
    //create a variable that`s capable enough to contain 5 names
    public static void main(String[] args) {
        String[] myGroup= new String[5];// 0~4 (index)
       // System.out.println(myGroup);//hashcode
        ;
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
        //myGroup[5]="Muhtar";
       // myGroup[-1]= "Adam"; no possible
        System.out.println(Arrays.toString(myGroup));

        System.out.println("---------------------------------------------");
        String []days={"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
              //index          0         1          2           3         4         5         6
        System.out.println(Arrays.toString(days));
        int number=5;
        if(number<=1||number>7){
            System.err.println("Invalid number");
            System.exit(0);


        }
        System.out.println(days[number-1]);

    }


}
