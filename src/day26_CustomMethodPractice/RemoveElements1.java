package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] number={100,200,300,400,500,600};
       number =removeElement(number,1);//create a new array {100,300,400,500,600}
        number =removeElement(number,1); //{100,400,500,600}
        System.out.println(Arrays.toString(number));
    }
                                 //{1,2,3,4}      2
    // remove the index from Array ,returns new array
public static int[] removeElement(int[] arrays ,int index){
    if(index<0||index>= arrays.length-1){
        System.err.println("Invalid Index "+ index);
        System.exit(0);
    }
    int[] result= new int[arrays.length-1] ;
    int j=0;
    for (int i = 0; i < arrays.length; i++) {
        if(i==index){ // if the index of array is matching with the given index
            continue; // then we skip
    }
        result[j++]=arrays[i];
        }
        return result;
    }

}



/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}
			2.2 Create a method that passes two parameters: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.3 Create a method that passes two parameters: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
			2.4 Create a method that passes two parameters: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */
