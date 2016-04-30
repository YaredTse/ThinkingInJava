package PassByValue;

public class Application5 {

    static int a;

    static public String name = testF(" * * * * * * Static * * * * * * ");

    public static String testF(String a ){
        System.out.println(a);
        return a;
    }
    static {
        System.out.println(" FROM STATIC "  + a );
    }

    static {
        System.out.println(" Static Initializer  ");
    }

    {
        System.out.println(" Static Initializer  " + a );
    }

    {
        a++;
    }

    {
        System.out.println(" Second Static Initializer  " + a );
    }

    float s = 131232f % 100;

    public Application5() {
        System.out.println(" Constructor ");
    }

    public static void main( String [] args ) {
        new Application5();
    }

}
