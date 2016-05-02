package Exceptions;

public class CastException {

    public static void main(String [] args ) {

        CastException cs = new CastException();

        try {
            cs.m1();
        } catch (Exception e) {
            try {
                cs.m1();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } finally {
            cs.m2();
        }

    }

    public void m1() throws Exception {
        throw new Exception();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}
