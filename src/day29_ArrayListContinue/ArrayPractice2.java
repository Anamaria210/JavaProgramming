package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));
        employees.retainAll(Arrays.asList("David","Ahmed"));
        System.out.println(employees);
        System.out.println("-----------------------------------------------------");
        String[]names={"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        // Convert Array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p->p.startsWith("M"));
        System.out.println(list);
        //convert back to Array
       names =list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
