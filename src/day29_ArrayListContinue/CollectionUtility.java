package day29_ArrayListContinue;

import java.util.*;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list); // sort method
        System.out.println(list);
        System.out.println("-----------------------------------");
        Collections.reverse(list); // reverse method
        System.out.println(list);

        System.out.println("------------------------------");
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        Collections.reverse(list2);
        System.out.println(list2);


        System.out.println("-----------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        Collections.swap(list3,1,4);
        System.out.println(list3);
        System.out.println("------------------------------------");
       int max= Collections.max(list3);
        System.out.println(max);
        int min=Collections.min(list3);
        System.out.println(min);

        System.out.println("---------------------------------------");
        System.out.println("-----------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 = " + list4);
        System.out.println("----------------------------------------");
        
       int frequency= Collections.frequency(list4,1000);
        System.out.println(frequency);

        System.out.println("-------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#", "Java"));
       int countJava= Collections.frequency(words,"Java");
       int countPython = Collections.frequency(words,"Python");
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);




    }
}
