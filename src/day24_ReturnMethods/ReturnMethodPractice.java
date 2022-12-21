package day24_ReturnMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {
      int maxNumberResult = maxNumber(100,200);
        System.out.println(maxNumberResult);
int multiplication = maxNumberResult*2;
        System.out.println("multiplication = " + multiplication);
    }

/// find the max number between 100 & 200
 public static int maxNumber(int a, int b){
     int result=0;
     if(a>b){
         result=a;
     }else{
         result=b;
     }
        return result;
 }
}
