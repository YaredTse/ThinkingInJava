//package Exceptions;
//
//public class TestClass03 {
//
//    public static void main( String [] args ) {
//
//        try {
//            doTest();
//        } catch ( MyException e) {
//            System.out.println("test");
//        }
//
//    }
//
//    static void doTest() throws MyException {
//        int[] array = new int[];
//        array[10] = 1000;
//        doAnotherTest();
//    }
//
//    static void doAnotherTest() throws MyException {
//        throw new MyException("ttetetetet");
//    }
//
//}
//
//class MyException extends Exception {
//    public MyException( String args ){
//        super( args );
//    }
//}