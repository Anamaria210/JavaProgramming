package day20_ArrayIntro;

import javax.swing.plaf.metal.MetalBorders;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //26 ch
        char[] alphabet=new char[26]; //Z~A
                    //i  ch
        /* alphabet[0]='Z';//90
        alphabet[1]='Y';//89
        alphabet[2]='X';//88
        */
        char ch='Z';
        for (int i = 0; i < alphabet.length; i++,ch--) {
            alphabet[i]=ch;

        }
        System.out.println(Arrays.toString(alphabet));
    }
}
