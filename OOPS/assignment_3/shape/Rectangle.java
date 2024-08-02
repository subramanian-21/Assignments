package OOPS.assignment_3.shape;

public class Rectangle extends Shape {
    public int width;
    public int height;

    Rectangle(int width, int height){
        super("Rectangle",width,height);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return super.area();
    }
    @Override
    public double perimeter(){
        return super.perimeter();
    }

}
