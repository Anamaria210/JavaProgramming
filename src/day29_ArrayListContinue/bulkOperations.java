package day29_ArrayListContinue;

import utility.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class bulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3,3,4,5));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        list.retainAll(Arrays.asList(1,2,3,4));
        System.out.println(list);

        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll( Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll( Arrays.asList("QA", "SDET") );

        System.out.println(jobTitles);
        System.out.println("-------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );
        System.out.println(nums);
        boolean r1= nums.contains(10);
        boolean r2= nums.contains(2) &&nums.contains(5) && nums.contains(10);
        boolean r3= nums.containsAll(Arrays.asList(2,5,10,100));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-------------------------------------------");
        String[]names ={"Josh","Jack","Daniel"," Shay","Breanna"};

       ArrayList<String> nameList= new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);
        //nameList.addAll(Arrays.asList(names));

        System.out.println("------------------------------------------------");
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> list2= new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("-------------------------------------------------");
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);







    }
    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }

    }

