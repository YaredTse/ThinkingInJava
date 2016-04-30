package polymorphism.shape;

public class Rectangle extends Shape{

    @Override
    public void erase() {
        System.out.println("Rectangle.erase");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }

}
