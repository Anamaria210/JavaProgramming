package day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {
        String str= "123";
        int num= Integer.parseInt(str); // int
        System.out.println(num+1);
        System.out.println(str+1);

        String str1= "10.5";
        double num1 = Double.parseDouble("10.5"); //double
        System.out.println(num1+1);
        System.out.println(str1+1);

      int max  =Integer.MAX_VALUE;
      int min= Integer.MIN_VALUE;
        System.out.println(max);

       long max1 =Long.MAX_VALUE;
       long min1 = Long.MIN_VALUE;

        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);

        String s1="false";
      boolean r1 = Boolean.parseBoolean(s1);
        System.out.println("r1 = " + r1);
      boolean r2 = Boolean.TRUE;
        System.out.println("r2 = " + r2);
        System.out.println("---------------------------------");
        String s2= "123";
       Integer x =Integer.valueOf(s2); // Integer
        int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println("y = " + y);

        String s3= "1.5";
       Double z =Double.valueOf(s3); //Double
        System.out.println("z = " + z);

        System.out.println("------------------------------");


        //is digit
        char ch1= '!';
       boolean result =Character.isDigit(ch1);
       //is letter
       boolean result1=Character.isLetter(ch1);
        System.out.println(result);
        System.out.println(result1);
        //special char
       boolean result2= !Character.isLetterOrDigit(ch1);
        System.out.println(result2);

        // IsUpper Case
      boolean result3 = Character.isUpperCase(ch1);
      //lower case
       boolean result4= Character.isLowerCase(ch1);
        System.out.println(result4);


        System.out.println("-----------------------------");
        String s ="ab1cd3cfhg4";
        int sum=0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);

        }

        }
        System.out.println("sum = " + sum);
    }
}
