package OOPS.assignment_3.shape;

public class Rectangle extends Shape {
    public int width;
    public int height;

    Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width*height;
    }
    @Override
    public double perimeter(){
        return width*2+height*2;
    }

}
