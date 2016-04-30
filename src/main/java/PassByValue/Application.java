package PassByValue;

public class Application {

    public static void main(String [] args ){
        Integer te = 5;
        Integer te2 = testArgs(te);
        System.out.println(  te == te2 ); // => 5
    }

    public static int testArgs( Integer intArg ){
        System.out.println( intArg );
//        intArg += 10;
        System.out.println( intArg );  //=> 15
        return intArg;
    }
}
