package day50_Collections;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);
        // Integer[] array = set.toArray(new Integer[0]);
        List<Integer> list =new ArrayList<Integer>(set);
        System.out.println(list);
        List<String> name= null;
       // System.out.println(name.size());

        System.out.println("---------------------------------");
        //pop()==> Last in First order(LIFO)
        List<Character> characters= new Stack<>();
        characters.addAll(Arrays.asList('A','B','C','D')); // [A,B,C,D]
        System.out.println(characters);
        ( (Stack)characters).pop(); // [A,B,C]
        System.out.println(characters);
       //poll()==>FIFO
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        ((LinkedList)names).poll(); // will remove the first element
        System.out.println(names);
        ((LinkedList)names).poll();
        System.out.println(names);
        ((LinkedList)names).poll();
        System.out.println(names);


    }
}
