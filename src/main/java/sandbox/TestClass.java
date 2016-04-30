package sandbox;

public class TestClass {

    public static Integer wiggler( Integer x ){
        System.out.println(x);

        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] strings ){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println( dataWrapper + value );
        System.out.println( dataWrapper  );

    }
}
