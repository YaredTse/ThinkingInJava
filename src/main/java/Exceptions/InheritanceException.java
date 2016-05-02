package Exceptions;


class MyFirstException extends Exception{}
class MySecondException extends MyFirstException{}
class MyThirdException extends MySecondException{}

public class InheritanceException {

    public static void main( String [] args ){

        try {
            mainTest();
        } catch (MyThirdException e) {
            System.out.println("First catch Raise Exceptions");
        } catch (MyFirstException e) {
            System.out.println("Second catch Raise Exceptions");
        } finally {
            System.out.println("Finally Raise Exceptions");
        }
    }

    public static void mainTest() throws MyFirstException {
        System.out.println("Raise Exceptions ");
        throw new MyThirdException();
    }

}
