package Exceptions;

public class ArrayException {

    public static void main( String [] args ){

//        int[] a = new int[0];
//        a[0] = 1;

        try {
            int[] a = new int[0];
            a[0] = 1;
        } catch ( Exception e ) {
            System.out.println(" Caught Exception ");
            System.out.println( e );

        }
        System.out.println(" - - - - - ");
    }

}
