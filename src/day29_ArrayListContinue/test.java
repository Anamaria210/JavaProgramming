package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(list);

        int sum = 0;

        for (Integer each : list) {
            sum += each;
        }

        System.out.println(sum);


            List l = new ArrayList();
            l.add(100);
            l.add(200);
            l.add(309);

        System.out.println(l);


    }
}