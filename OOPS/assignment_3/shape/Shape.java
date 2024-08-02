package OOPS.assignment_3.shape;

public class Shape {
    public String name;
    int width;
    int height;
    Shape(String name,int width, int height){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return width*2+height*2;
    }
}
