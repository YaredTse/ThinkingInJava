package loops;


public class Foo {

    public static void main(String str [] ){

        int[] values = { 21, 200, 32 };

        for(int a : values ) {
            int i = 0;
            while ( i < values.length ) {
                System.out.println( i + " " + a );
                ++i;
            }

        }

    }

}
