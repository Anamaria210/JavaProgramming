package day26_CustomMethodPractice;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
      int[]arr3 = merge2(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int [] merge2(int[]arr1,int[]arr2){
        int[]result=new int[arr1.length+arr2.length];
        int i =0;
        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }
}
