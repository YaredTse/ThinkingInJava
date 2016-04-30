package PassByValue;

public class Application6 {

    public static String name;

    public static void main( String [] strings ){
        returnName("Foo");
        System.out.println( name );
    }

    public static void returnName( String name ){
        name = name;
        System.out.println( name );
    }

}
