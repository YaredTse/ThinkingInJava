package PassByValue;

public class Application7 {

    static Application7 ref;
    String[] arguments;


    public static void main( String [] args ) {
        ref = new Application7();
        ref.func(args);
        System.out.println( args );
    }

    public void func( String[] args){
        ref.arguments = args;
    }

}
