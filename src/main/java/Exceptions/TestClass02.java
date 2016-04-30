package Exceptions;

class MyTestException extends Exception {
    public MyTestException( String str ){
        super(str);
    }
}

public class TestClass02 {

    public static void main( String [] args ) throws Exception {
        TestClass02 tc = new TestClass02();
        System.out.println("This is awesome");
        tc.testB();
    }

    public void testC() throws MyTestException {
        throw new MyTestException("This is test Exception");
    }

    public void testB() throws MyTestException {
        int i = 0;

        lable: {
            try {
                for ( ; true; i++ ){
                    System.out.println("It jumps out of the label" + i );
                    if(i < 5 ){
                        System.out.println(i);
                        break lable;
                    }
                }
            } catch ( Exception e) {
                System.out.println(" Catch block" );
            } finally {
                System.out.println(" Finally block" );
            }
        }
        System.out.println("It jumps out of the label");
    }

    public void testD(){

        int i = 0;

        test:{
            System.out.println("Entering the block ");

            for( ; true ; i++ ) {
                System.out.println("Inside loo" + i );
                if(i < 5 ){
                    System.out.println("Never reches here" + i );

                    break test;
                }
            }
        }
    }

    public void testD(String arg) throws NullPointerException {
        throw new NullPointerException();
    }
}
