package Exceptions;

public class Foo {

    public static void main( String [] argv ) throws Exception  {
        String[] s = {"a", "b", "c"};
        indexOf( s, "a");

        new Foo().testExceptions();

//
//        try {
//            new Foo().testExceptions();
//            System.out.println(" Try ");
//            throw new Exception();
//        } catch (Exception e ) {
//            System.out.println(e);
//            System.out.println(" Catch ");
//        } finally {
//            System.out.println(" finally ");
//        }

    }

    public static int indexOf( String[] names, String name  ) {
        for(int i = 0; i < names.length; i++ ){
            if (names[i].equals(name) ) {
                return i;
            }
        }
        return -1;
    }

    public void testExceptions() throws Exception {
        eatCarrot();
        System.out.println( );
        System.out.println("This method throws an exception");
    }

    private static void eatCarrot() {
        System.out.println(" Carrot ");
    }
}
