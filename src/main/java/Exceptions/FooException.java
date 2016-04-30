package Exceptions;

public class FooException {

    public static void main( String args [] ){

        new FooException().floatChecker("r");

    }

    public float floatChecker( String s ){
        float f = 0.0f;

        try {
            f = Float.valueOf(s).floatValue();
//            return f;
        } catch (Exception e) {
            System.out.println("Invalid input: " + s );
            f = Float.NaN;
//            return f;
        } finally {
            System.out.println("finally");
//            return f;
        }

        System.out.println("test");
        return f;
    }
}
