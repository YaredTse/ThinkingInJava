package polymorphism.shape;

public class Circle extends Shape {

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

}
