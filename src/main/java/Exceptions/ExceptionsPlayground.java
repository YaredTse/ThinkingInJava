package Exceptions;


class CustomeException extends Exception{

    public CustomeException( String str ){
        super(str);
    }
}

class MyCu1 extends CustomeException {
    public MyCu1( String str ){
        super(str);
    }
}

class MyCu2 extends MyCu1{
    public MyCu2( String str ){
        super(str);
    }
}

class MyCu13 extends MyCu2 {
    public MyCu13( String str ){
        super(str);
    }
}


public class ExceptionsPlayground {

    public static void main(String [] str ){

        ExceptionsPlayground exp = new ExceptionsPlayground();

        try {
            exp.metho1();
        } catch ( MyCu13 myCu1) {
            try {
                exp.metho2();
            } catch (MyCu2 myCu2) {
                myCu2.printStackTrace();
            }
        } catch (MyCu1  myCu1) {
            try {
                exp.metho3();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            System.out.println("Test");
        }

    }

    public void metho1() throws MyCu1 {
        throw new MyCu13("MyCu13");
    }

    public void metho2() throws MyCu2 {
        throw new MyCu13("MyCu13");
    }

    public void metho3() throws Exception {
        throw new CustomeException("MyCu13");
    }
}
