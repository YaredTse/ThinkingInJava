package PassByValue;

public class Application4 {

    private double side = 0;

    Object o;

    public void setO( Object k){
        this.o = k;
        System.out.println( o );
    }

    public static void main( String [] strings ){

        Object obj  = new Object();
        Application4 app4 = new Application4();

        app4.setO(obj);

        obj = new Object();

        obj = null;

        app4.setO(obj);

        Integer in = new Integer(2);
        Long  ln = new Long(2);;


        System.out.println( in.equals(ln) );

        System.out.println( app4.side );

    }
}
