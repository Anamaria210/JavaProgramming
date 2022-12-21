package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class shortVideo {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        for (Integer each : numbers) {
            System.out.println(each);
        }

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));
       /* for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>=5){
                list.remove(i);
            }
*/

        list.removeIf(each->each<5);
        System.out.println(list);

        }

    }

