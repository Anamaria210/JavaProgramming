package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int num=7;
        String result = (num>=0&&num<=9)?
                (num==0)?"Zero":(num==1)?"one":(num==3)?"three":(num==4)?"four":
                        (num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"Eight":"Nine"
                        :"Invalid Number";

        System.out.println(result);
        }

    }
