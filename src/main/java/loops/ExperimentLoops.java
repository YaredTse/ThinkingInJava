package loops;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class ExperimentLoops {

    public static void main(String args [] ){

//        int a = 20;
//        int b = 40;
//
//        // Bitwise operator
//        if( ( a == 20 ) || ( b == ++b ) ){
//            System.out.println( "Successful");
//        } else {
//            System.out.println( "Not Successful");
//        }

        // Proof of how Bitwise Operator and Logical Operator differ
        // Observe how the value of - int a - is changed according to the logical operator used
        // If - | - is used then the value is incremented, whereas the use of - || - doesnt change anything,
        // Because it is unreachable
//
//        System.out.println( b );
//
//        FooEx n = new FooEx();
//        FooEx n2 = n ;
//
//        System.out.println( n == n2  );
//
//        int ab = 10
//        ab += 100;
//        // ab = ab + 100 => 110;
//        System.out.println( ab  );

        Boolean bool = Boolean.valueOf("faLsE");
        System.out.println( bool  );
        System.out.println( bool.getClass()  );
        System.out.println( Boolean.valueOf("faLsE") );

//        Boolean bool1 = Boolean.valueOf(true);
//        System.out.println( bool1  );
//        System.out.println( bool1.getClass()  );
//        System.out.println( Boolean.valueOf(true) );
//
//        Boolean bool2 = Boolean.parseBoolean("TRUE");
//        System.out.println( bool2  );
//        System.out.println( bool2.getClass()  );
//
//        Boolean bool3 = new Boolean("TRUE");
//        System.out.println( bool3  );
//        System.out.println( bool3.getClass()  );
//
//        Boolean bool4 = new Boolean(true);
//        System.out.println( bool4  );
//        System.out.println( bool4.getClass()  );

    }

    public static int  addNumver(int a ) {

        for( int i = 0; i < 2; ++i ) {
           a = a + i;
            System.out.println(a);
        }
        return a;
    }
}

class FooEx {
}
