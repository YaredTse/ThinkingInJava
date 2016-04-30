package sandbox.staticinitializers;

public class Bar {

    static public int ntName = 200;

    static {
        System.out.println( ntName );
        ntName += 400;
        System.out.println( ntName );
    }

}
