package polymorphism.shape;

public class Square extends Shape {

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

}
