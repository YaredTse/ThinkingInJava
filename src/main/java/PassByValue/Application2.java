package PassByValue;

/**
 * Created by yaredtseghu on 24/04/2016.
 */
public class Application2 {


    public static Float testA( Double d, int i ) {

        Float retu = ( float ) ( d + i );
        ++d;
        ++i;
        System.out.println(d);
        System.out.println(i);
        return retu;
    }

    public static void main(String [] strings ){
        Double d = 10.0;
        float f = 10;

        Integer a = 12312;
        float fl = a + f ;

        float returnFromMethod = testA(d, (int)fl );
        System.out.println(returnFromMethod);
        System.out.println(a);
        System.out.println(fl);

        long fg = 120;
        System.out.println( fg );
     }
}
