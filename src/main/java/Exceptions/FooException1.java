package Exceptions;

public class FooException1 {

    public static void main( String [] args ) throws Exception {

        try {
            new FooException1().methodA(-100);
        } catch (Exception e) {
            System.out.println( "Catch block been executed");
            e.printStackTrace();
        } finally {
            System.out.println( "Finally block been executed");

        }
        System.out.println( "Outside of catch block");
    }

    public int methodA(int a) throws Exception {
        lable1: {
            if (a < 0) {
                throw new Exception("You have passed a negative value");
            } else if(a == 10 ) {
                System.out.println( "Breaking out of the lable " + a );
                break lable1;
            } else {
                System.out.println( "You have entered a valid number " + a );
                System.out.println( a );
            }
        }
        return a;
    }
}
