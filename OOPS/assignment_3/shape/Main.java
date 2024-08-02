package OOPS.assignment_3.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(10,20);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println();
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println();
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());


    }
}
