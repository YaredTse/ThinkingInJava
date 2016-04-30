package Exceptions;


public class ExceptionPlayground {

    boolean aBoolean;

    public static void main( String args [] ) throws IllegalAccessException, Exception {
        System.out.println("This is a test");

        new ExceptionPlayground().methodA(true);


        try {
            System.out.println("Inside Try block");
            new ExceptionPlayground().methodA(false);
        } catch ( Exception e) {
            System.out.println("Inside catch block");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public void methodA( boolean b) throws IllegalAccessException, Exception {
        System.out.println(aBoolean);
        System.out.println(b);
        lableA:{
            do {
                System.out.println("test");
            } while ( aBoolean == b );
            break lableA;
        }
        System.out.println("This is another test");

        if(b){
            throw new Exception();
        }

        methodB(true);
    }

    public void methodB(boolean b ) throws Exception {
        if (b) {
            throw new Exception(" * * * * * * * From methodB  * * * * * * * ");
        } else {
        }
    }

}
