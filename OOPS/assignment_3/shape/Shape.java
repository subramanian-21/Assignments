package OOPS.assignment_3.shape;

public abstract class Shape {
    public String color;
    Shape(String color){
        this.color = color;
    }
    public abstract double area();
    public abstract double perimeter();
}
