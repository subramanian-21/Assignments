package OOPS.assignment_3.shape;

public class Circle extends Shape{
    public  int radius;
    public double pi;
    Circle(int radius){
        super("circle" , 0,0);
        this.radius = radius;
        pi = Math.PI;
    }
    @Override
    public double area(){
        return pi*radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*pi*radius;
    }
}
