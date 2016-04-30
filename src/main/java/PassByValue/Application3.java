package PassByValue;

public class Application3 {

    String a = "x";

    public static void testA( Application3 app ) {
        app.a = "o";
    }

    public static Integer testB( Integer intTest ) {
        System.out.println( intTest );
        return 1;
    }

    public static void main(String args [] ) {

        Application3 test = new Application3();
        System.out.println( test.a ); // => "o"

        testA(test);
        System.out.println( test.a ); // => "o"

    }

}
