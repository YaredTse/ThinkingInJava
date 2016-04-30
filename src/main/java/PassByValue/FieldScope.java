package PassByValue;

class FieldScope2 {
    public int testA = 100;
    public void methodA(){
        System.out.println(" - - - - - - - - - ");

        testA += 100;
    }
}

public class FieldScope extends FieldScope2 {

    public int testA = 200;

    public void methodA(){
        System.out.println(" * * * * * * * * *");
        testA += 100;
    }

    public static void main(String [] argv ){
        FieldScope fieldScope = new FieldScope();
        System.out.println( fieldScope.testA ); // => 100

        fieldScope.methodA();
        System.out.println( fieldScope.testA );   // => 200
    }
}
