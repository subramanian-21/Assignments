package OOPS.assignment_3.shape;
//1. Write a hierarchy of geometric shape classes 'Circle', 'Rectangle', etc inherited from a common base class 'Shape'
public  class Square extends Shape{
    public int side;
    Square(int side){
        super("square",side,side);
        this.side = side;
    }
    @Override
    public double area(){
        return side*side;
    }
    @Override
    public  double perimeter(){
        return side*4;
    }
}
