package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte  a = 100;
        short b = a;
        //short b =  (short)a;
        //         (short)a

        int c = b; // implicit casting
        // int c = (int)b

        long d = c ;
        //      (long)c

        float e = d;
        double f = e;

        System.out.println("------------------------------");

        int x = 55;
        short y = (short)x; // explicit casting

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k =  (short)j;

        System.out.println(j+" : "+k);


        double l = 2.5;
        float m =  (float)l;

        System.out.println(l + " : "+m);

        double n = 10.8;
        int s = (int)n; // 10

        System.out.println(n + " : "+s);

        System.out.println("------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1 +" : "+s1);


        float f1 = 30.5F;
        long l1 = (long) f1;

        double l2 = 2.5;
        float m2 = (float)l2 ;

        System.out.println(l2+ ":"+ m2);

        double n2 = 10.8;
        int s2 = (int)n2;

        System.out.println(n2 +":" +s2 );

        double d2 = 20.5;
        short s3 = (short) d2;
        System.out.println(d2 + ":" +s3);

        /*

        Primitives:

	double > float > long > int > short > byte

	smaller primitives can be directly assigned to larger primitive type
	larger primitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
         */


    }

}
