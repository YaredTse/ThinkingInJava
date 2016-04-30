package polymorphism.exercise_one;

public class Application {

    public void  tellMeYourName( Cycle cycle ){
        cycle.ride();
    }

    public void  tellMeYourName( Bicycle cycle ){
        cycle.ride();
    }

    public void  tellMeYourName( Tricycle cycle ){
        cycle.ride();
    }
    public void  tellMeYourName( Unicycle cycle ){
        cycle.ride();
    }

    public static void main(String[] strings ){
        Application application = new Application();
        application.tellMeYourName(new Cycle());
        application.tellMeYourName(new Bicycle());
        application.tellMeYourName(new Tricycle());
        application.tellMeYourName(new Unicycle());
    }

}
